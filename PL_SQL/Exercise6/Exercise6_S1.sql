SET SERVEROUTPUT ON;
DECLARE
   CURSOR GenerateMonthlyStatements IS
      SELECT TransactionID,
             AccountID,
             Amount,
             TransactionType,
             TransactionDate
      FROM Transactions
      WHERE EXTRACT(MONTH FROM TransactionDate) =
            EXTRACT(MONTH FROM SYSDATE)
      AND EXTRACT(YEAR FROM TransactionDate) =
            EXTRACT(YEAR FROM SYSDATE);
BEGIN
   FOR rec IN GenerateMonthlyStatements LOOP
      DBMS_OUTPUT.PUT_LINE(
         'Transaction ID: ' || rec.TransactionID ||
         ', Account ID: ' || rec.AccountID ||
         ', Amount: ' || rec.Amount ||
         ', Type: ' || rec.TransactionType
      );
   END LOOP;
END;
/