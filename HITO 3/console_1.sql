create database defensa_hito3_2022;

use defensa_hito3_2022;

set @Ghoul = 'GHOUL';

CREATE OR REPLACE FUNCTION PREGUNTA1()
RETURNS VARCHAR (50)
BEGIN
    DECLARE res varchar(20) default'';
    if @Ghoul = 'GHOUL'
        then
        set res = 'Usuario GHOUL';
            else
            set res = 'Usuario Invitado';
        end if;
        return res;
end;

select PREGUNTA1();

CREATE OR REPLACE FUNCTION PREGUNTA2_COMPARE_STRINGS(DBA_I TEXT, DBA_II TEXT)
RETURNS TEXT
BEGIN
    DECLARE salida text default '';
    if DBA_I = DBA_II
    then
        SET salida = 'CADENAS IGUALES';
        ELSE
        SET salida = 'CADENAS DISTINTAS';
        END IF;
    RETURN salida;
end;

select PREGUNTA2_COMPARE_STRINGS('HOLAAAAAAA','HOLAAAAAA')

CREATE OR REPLACE FUNCTION PREGUNTA2_COMPARE_STRINGS_V2(DBA_I TEXT, DBA_II TEXT)
RETURNS TEXT
BEGIN
    DECLARE salida text default '';
    if STRCMP(DBA_I, DBA_II) = 0
    then
        SET salida = 'CADENAS IGUALES';
        ELSE
        SET salida = 'CADENAS DISTINTAS';
        END IF;
    RETURN salida;
end;

select PREGUNTA2_COMPARE_STRINGS_V2('HOLAAAAAAA','HOLAAAAAAA')


CREATE OR REPLACE TABLE CLIENTES
(
    id_client varchar(20) primary key,
    fullname varchar(20),
    lastname varchar (20),
    age int,
    genero char (1)
);

INSERT INTO CLIENTES (id_client, fullname, lastname, age, genero)
values ('PLAYER-710','JONATHAN', 'ALARCON', 18 , 'M');
INSERT INTO CLIENTES (id_client, fullname, lastname, age, genero)
values ('PLAYER-450', 'DIEGO', 'MARADONA', 24 , 'M');
INSERT INTO CLIENTES (id_client, fullname, lastname, age, genero)
values('PLAYER-100', 'LISA', '0RIBE', 37 ,'F');

DROP TABLE CLIENTES;
SELECT * FROM CLIENTES;

CREATE OR REPLACE FUNCTION MAX_EDAD()
RETURNS INT
BEGIN
    return (
    SELECT MAX(age)
    from CLIENTES
    );
end;

select MAX_EDAD();

create or replace function IMPAR_O_PAR(age int)
RETURNS TEXT
    BEGIN
         declare res text default '';
    declare z integer;
    IF age % 2 = 0
    THEN
        set z = 2;
        else
        set z = 1;
    END IF;
      while z <= age do
        set res = CONCAT(z,', ', res);
        set z = z + 2;
        end while;
    return res;
    end;

select IMPAR_O_PAR(18);


create or replace function SERIE_FIBONACCI(cont integer)
RETURNS INTEGER
DECLARE
BEGIN


end;


CREATE OR REPLACE FUNCTION fibonacci(num integer)
RETURNS integer
BEGIN
DECLARE i integer default 0;
declare j integer default 0;
declare k integer default 1;
IF (num < 1) THEN
    RETURN 0;
END IF;
set i < num;
LOOP
i = i+1;
SELECT k, j+k into j,k;
END LOOP;

RETURN j;
END;


