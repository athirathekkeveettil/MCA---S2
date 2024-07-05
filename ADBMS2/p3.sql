create or replace function findMax(x in number,y in number)
return number IS
  z number;
begin
  if x>y then
     z:=x;
   else
     z:=y;
   end if;
   return z;
end findMax;
/
declare 
   a number; 
   b number; 
   c number; 
begin 
   a:= 23; 
   b:= 45;  
   c:=findMax(a,b); 
   dbms_output.put_line(' Maximum of (23,45): '||c);
   end;
/
