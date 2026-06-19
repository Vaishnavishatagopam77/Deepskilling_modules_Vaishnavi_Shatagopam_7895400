SET SERVEROUTPUT ON;
BEGIN
   FOR rec IN (
      SELECT c.CustomerID, l.LoanID
      FROM Customers c
      JOIN Loans l
      ON c.CustomerID = l.CustomerID
      WHERE TRUNC(MONTHS_BETWEEN(SYSDATE,c.DOB)/12) > 60
   )
   LOOP
      UPDATE Loans
      SET InterestRate = InterestRate - 1
      WHERE LoanID = rec.LoanID;
      DBMS_OUTPUT.PUT_LINE('Discount applied for CustomerID: ' || rec.CustomerID);
   END LOOP;
   COMMIT;
END;
/