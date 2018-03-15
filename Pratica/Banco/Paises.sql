-- a. Crie uma tabela Pais com os atributos id (int autoincrement) , nome(varchar 100),
-- populacao (bigint) e area (number 15,2). Carregue alguns países. Consulte a Wikipedia para
-- obter as informações de população e área. 

CREATE DATABASE Paises;  -- DROP DATABASE 81727834PratProg_Trab02;
USE Paises;

CREATE TABLE Pais (
   id 			INT		(4)     NOT NULL AUTO_INCREMENT,
   nome 		VARCHAR (100)    NOT NULL,
   populacao 	bigint    NOT NULL,
   area 		DECIMAL (15,2) 	 NOT NULL,
  PRIMARY KEY (id));

DESCRIBE Pais;

-- Inserts
INSERT INTO Pais VALUES (	1	, '	África do Sul	' ,	54956920	, 	1221040	);
INSERT INTO Pais VALUES (	2	, '	Angola	' ,	25021974	, 	1246700	);
INSERT INTO Pais VALUES (	3	, '	Argélia	' ,	39666519	, 	2381740	);
INSERT INTO Pais VALUES (	4	, '	Benim	' ,	10879829	, 	114763	);
INSERT INTO Pais VALUES (	5	, '	Botsuana	' ,	2262485	, 	582000	);
INSERT INTO Pais VALUES (	6	, '	Burquina Faso	' ,	18105570	, 	272967	);
INSERT INTO Pais VALUES (	7	, '	Burúndi	' ,	11178921	, 	27834	);
INSERT INTO Pais VALUES (	8	, '	Cabo Verde	' ,	520502	, 	4033	);
INSERT INTO Pais VALUES (	9	, '	Camarões	' ,	23344179	, 	475442	);
INSERT INTO Pais VALUES (	10	, '	Chade	' ,	14037472	, 	1284000	);
INSERT INTO Pais VALUES (	11	, '	Comores	' ,	788474	, 	2170	);
INSERT INTO Pais VALUES (	12	, '	Congo-Brazzaville	' ,	4620330	, 	342000	);
INSERT INTO Pais VALUES (	13	, '	Costa do Marfim	' ,	22701556	, 	322463	);
INSERT INTO Pais VALUES (	14	, '	Egito	' ,	91508084	, 	1002450	);
INSERT INTO Pais VALUES (	15	, '	Eritreia	' ,	6233682	, 	117600	);
INSERT INTO Pais VALUES (	16	, '	Etiópia	' ,	99390750	, 	1104300	);
INSERT INTO Pais VALUES (	17	, '	Gabão	' ,	1725292	, 	267668	);
INSERT INTO Pais VALUES (	18	, '	Gâmbia	' ,	1990924	, 	11295	);
INSERT INTO Pais VALUES (	19	, '	Gana	' ,	1990924	, 	11295	);
INSERT INTO Pais VALUES (	20	, '	Guiné	' ,	12608590	, 	245857	);
INSERT INTO Pais VALUES (	21	, '	Guiné Equatorial	' ,	845060	, 	28051	);
INSERT INTO Pais VALUES (	22	, '	Guiné-Bissau	' ,	1844325	, 	36125	);
INSERT INTO Pais VALUES (	23	, '	Jibuti	' ,	887861	, 	23200	);
INSERT INTO Pais VALUES (	24	, '	Lesoto	' ,	2135022	, 	30355	);
INSERT INTO Pais VALUES (	25	, '	Libéria	' ,	6278438	, 	1759540	);

SELECT * FROM Pais;

-- DROP DATABASE Pais;
