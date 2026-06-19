CREATE OR REPLACE FUNCTION CalculateMonthlyInstallment(
   p_loan_amount NUMBER,
   p_interest_rate NUMBER,
   p_years NUMBER
)
RETURN NUMBER
IS
   v_installment NUMBER;
BEGIN
   v_installment :=
      (p_loan_amount +
      (p_loan_amount * p_interest_rate * p_years/100))
      / (p_years * 12);

   RETURN v_installment;
END;
/
SELECT CalculateMonthlyInstallment(
       5000,5,5
) AS EMI
FROM DUAL;