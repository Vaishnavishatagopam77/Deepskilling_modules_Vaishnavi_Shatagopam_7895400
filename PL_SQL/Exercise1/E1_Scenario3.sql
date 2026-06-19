SET SERVEROUTPUT ON;

BEGIN
   FOR rec IN (
      SELECT c.Name, l.LoanID
      FROM Customers c
      JOIN Loans l
      ON c.CustomerID = l.CustomerID
   )
   LOOP
      DBMS_OUTPUT.PUT_LINE(
         'Reminder sent to ' || rec.Name ||
         ' for Loan ID ' || rec.LoanID
      );
   END LOOP;
END;
/