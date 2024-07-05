SET SERVEROUTPUT ON

DECLARE
	R int:=&radius;
	pi float:=3.14;
	AREA float;
	i int;
BEGIN
	if(R>0)THEN
		AREA:=pi;
		for i in 1..2
			LOOP
				AREA:=AREA*R;
			END LOOP;
	        DBMS_OUTPUT.PUT_LINE('AREA IS '|| AREA);
		
	ELSE
	        DBMS_OUTPUT.PUT_LINE('AREA CANNOT BE FOUND');
		
	END IF;
END;
/


