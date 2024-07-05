
SET SERVEROUTPUT ON;

CREATE OR REPLACE FUNCTION findsquare (num IN NUMBER)
RETURN NUMBER IS
    sq NUMBER(10);
BEGIN
    sq := num*num;
    RETURN sq;
END findsquare;
/

CREATE TABLE squares (
    num NUMBER(3) ,
    square NUMBER(10)
);

BEGIN
    FOR i IN 1..10
    LOOP
        INSERT INTO squares VALUES(i, findsquare(i));
    END LOOP;
END;
/
