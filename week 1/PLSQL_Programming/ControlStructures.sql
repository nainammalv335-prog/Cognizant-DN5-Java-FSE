
DECLARE
    num NUMBER := 10;
BEGIN
    IF num > 0 THEN
        DBMS_OUTPUT.PUT_LINE('Number is Positive');
    ELSIF num < 0 THEN
        DBMS_OUTPUT.PUT_LINE('Number is Negative');
    ELSE
        DBMS_OUTPUT.PUT_LINE('Number is Zero');
    END IF;
END;
/
