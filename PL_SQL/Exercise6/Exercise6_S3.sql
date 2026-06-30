SET SERVEROUTPUT ON;
DECLARE
   CURSOR UpdateLoanInterestRates IS
      SELECT LoanID, InterestRate
      FROM Loans;
BEGIN
   FOR rec IN UpdateLoanInterestRates LOOP
      UPDATE Loans
      SET InterestRate = InterestRate + 1
      WHERE LoanID = rec.LoanID;
      DBMS_OUTPUT.PUT_LINE(
         'Interest Rate Updated for Loan ID: '
         || rec.LoanID
      );
   END LOOP;
   COMMIT;
END;
/