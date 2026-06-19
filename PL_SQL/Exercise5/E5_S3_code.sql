CREATE OR REPLACE TRIGGER CheckTransactionRules
BEFORE INSERT ON Transactions
FOR EACH ROW
DECLARE
    v_balance NUMBER;
BEGIN
    SELECT Balance
    INTO v_balance
    FROM Accounts
    WHERE AccountID = :NEW.AccountID;
    IF :NEW.TransactionType = 'Withdrawal'
       AND :NEW.Amount > v_balance THEN
       RAISE_APPLICATION_ERROR(
       -20001,
       'Insufficient Balance');
    ELSIF :NEW.TransactionType = 'Deposit'
          AND :NEW.Amount <= 0 THEN
       RAISE_APPLICATION_ERROR(
       -20002,
       'Deposit Amount Must Be Positive');
    END IF;
END;
/
INSERT INTO Transactions
VALUES (11,1,SYSDATE,-100,'Deposit');