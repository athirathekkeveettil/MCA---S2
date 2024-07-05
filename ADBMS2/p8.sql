Set Serveroutput ON;
Create or Replace PROCEDURE squareNum(x IN OUT number) IS 
BEGIN 
  x := x * x; 
END;  
/
DECLARE 
   a number; 
BEGIN 
   a:= &a; 
   squareNum(a); 
   dbms_output.put_line(' Square is: ' || a); 
END; 
/
