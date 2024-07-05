set serveroutput on;

create trigger t4 after insert or update on xy
begin
if inserting then 
     insert into testtable values('insert done', SYSDATE);
  else
      insert into testtable values('update done', SYSDATE);
end if;
end;
/

