CREATE OR REPLACE PROCEDURE AddNewCustomer(
    p_customerid IN NUMBER,
    p_name IN VARCHAR2,
    p_dob IN DATE,
    p_balance IN NUMBER
)
IS
BEGIN
    INSERT INTO Customers
    VALUES (
        p_customerid,
        p_name,
        p_dob,
        p_balance,
        SYSDATE
    );
    COMMIT;
    DBMS_OUTPUT.PUT_LINE('Customer Added Successfully');
EXCEPTION
    WHEN DUP_VAL_ON_INDEX THEN
        DBMS_OUTPUT.PUT_LINE('Customer ID already exists');
    WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE('Error: ' || SQLERRM);
END;
/
BEGIN
   AddNewCustomer(
      3,
      'Ramesh',
      TO_DATE('1950-01-01','YYYY-MM-DD'),
      20000
   );
END;
/