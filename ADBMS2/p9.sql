Create table customer(A/c no,balance)
Insert some values
Select * from customer
Set serveroutput ON
Create or replace procedure deposit(id in number, amt in number)is
Begin
Update customer set balance=balance + amt where A/c no=id;
End;
/
Declare
Accno number(2);
Amount number(10,2);
Begin
Accno:= &Accno;
Amount:=&amount;
Deposit(Acc no, amount);
Commit;
End;
/
