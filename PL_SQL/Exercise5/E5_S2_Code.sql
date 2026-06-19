CREATE TABLE AuditLog(
   AuditID NUMBER,
   TransactionID NUMBER,
   AuditDate DATE
);

CREATE OR REPLACE TRIGGER LogTransaction
AFTER INSERT ON Transactions
FOR EACH ROW
BEGIN
   INSERT INTO AuditLog
   VALUES(
      :NEW.TransactionID,
      :NEW.TransactionID,
      SYSDATE
   );
END;
/
INSERT INTO Transactions
VALUES(3,1,SYSDATE,500,'Deposit');