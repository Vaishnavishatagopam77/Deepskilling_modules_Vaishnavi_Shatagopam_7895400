SET SERVEROUTPUT ON;

BEGIN
   FOR rec IN (
      SELECT CustomerID, Name
      FROM Customers
      WHERE Balance > 10000
   )
   LOOP
      DBMS_OUTPUT.PUT_LINE(
         'Customer ' || rec.Name ||
         ' (ID: ' || rec.CustomerID ||
         ') is eligible for VIP status'
      );
   END LOOP;
END;
/