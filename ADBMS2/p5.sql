Set Serveroutput ON
Create or replace function addnum (val1 in number,val2 in number)
return number is
Total number;
Begin
Total := val1+val2;
Return(total);
End addnum;
After compiling this function we can use this in our SQL query
Select addnum(3,4) from dual;

