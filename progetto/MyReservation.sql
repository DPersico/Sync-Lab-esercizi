CREATE DATABASE MyReservation;

CREATE TABLE Account
(
	Email		varchar(40) primary key not null,
    Password	varchar(20) not null,
    Ruolo 		varchar(20) not null
);

CREATE TABLE Prenotazione
(
	Codice				Integer primary key not null auto_increment,
    Cognome				varchar(20) not null,
    Nome 				varchar(20),
    Email				varchar(40) not null
						references Account(Email),
    Data_arrivo			date not null,
    Ora_arrivo			time default '8:30:00',
    Data_partenza		date not null,
    Numero_tel			numeric(10) not null, 
    Numero_persone		Integer not null,
    Ruolo				varchar(20) not null,
    Tipo_camera			varchar(20) not null,
    Camera_assegnata	numeric(3) not null
						references Camera(Numero_camera),
	Numero_fattura		Integer not null
						references Fattura(Numero_fattura),
    Note 				varchar(400)
);
    
CREATE TABLE Fattura
(
	Numero_fattura	Integer primary key not null auto_increment,
	Extra			Integer,
	Sconto			Boolean
);
	
CREATE TABLE Camera
(
	Numero_camera	numeric(3) primary key not null,
    Prezzo_a_notte 	Integer not null,
    Descrizione		varchar(200) not null,
    Tipologia		varchar(20) not null,
    Mq				float
);

INSERT INTO Account(Email, Password, Ruolo) VALUES
('davide@live.it', 'password', 'privato'),
('colombo@gmail.com', 'password', 'dipendente'),
('agenzia@agenzia.com', 'password', 'agenzia');

INSERT INTO Camera(Numero_camera, Prezzo_a_notte, Descrizione, Tipologia, Mq) VALUES
(101, 28, '...' , 'Economy uso singola', 19),
(102, 28, '...' , 'Economy uso singola', 19),
(103, 28, '...' , 'Economy uso singola', 19),
(104, 41, '...' , 'Economy doppia', 24),
(105, 41, '...' , 'Economy doppia', 24),
(206, 43, '...' , 'Standard uso singola', 26),
(207, 43, '...' , 'Standard uso singola', 26),
(208, 51, '...' , 'Standard doppia', 31),
(209, 51, '...' , 'Standard doppia', 31),
(210, 43, '...' , 'Standard uso singola', 26),
(211, 43, '...' , 'Standard uso singola', 26),
(312, 62, '...' , 'Delux uso singola', 28),
(313, 62, '...' , 'Delux uso singola', 28),
(314, 62, '...' , 'Delux uso singola', 28),
(315, 75, '...' , 'Delux doppia', 34),
(316, 75, '...' , 'Delux doppia', 34),
(317, 75, '...' , 'Delux doppia', 34),
(318, 75, '...' , 'Delux doppia', 34),
(319, 75, '...' , 'Delux doppia', 34),
(501, 120, '...' , 'Suite', 67),
(502, 120, '...' , 'Suite', 67),
(503, 120, '...' , 'Suite', 67);
    
INSERT INTO Prenotazione(Cognome, Nome, Email, Data_arrivo, Ora_arrivo, Data_partenza, Numero_tel, Numero_persone, Ruolo, Tipo_camera, Camera_assegnata, Note, Numero_fattura) VALUES
('Persico', 'Davide', 'davide@live.it', '2020-11-11 ', '8:30', '2020-11-14', 3809878923, 1, 'privato', 'Standard uso singolo', 206, 'stanza pulita perfavore', '1000'),
('Rossi', 'Fabio', 'colombo@gmail.com', '2020-12-11', '16:00:00', '2020-12-17', 3478926378, 2, 'privato', 'Economy doppia', 105, '', '1001'),
('Bianchi', null , 'agenzia@agenzia.com', '2020-10-31', '19:45:00', '2020-11-01', 3338974562, 1, 'agenzia', 'Suite', 502, '', '1002'),
('Verdi', 'Daniele', 'daniele@live.it', '2020-11-11 ', '10:00', '2020-11-13', 3806782546, 1, 'privato', 'Standard uso singolo', 207, '', '1003');

INSERT INTO Fattura(Numero_fattura, Extra, Sconto) VALUES
(1000, 10, false),
(1001, 0, false),
(1002, 0, true),
(1003, 20, false);

# query che restituisce ora arrivo, cognome, email, numero camera e numero della fattura per chi arriva in un giorno scelto
SELECT Prenotazione.Ora_arrivo, Prenotazione.Cognome, Account.Email, Camera.Numero_camera, Fattura.Numero_fattura
FROM Prenotazione INNER JOIN Account
INNER JOIN Camera ON Camera_assegnata
INNER JOIN Fattura 
WHERE Data_arrivo = '2020-11-11'
and Camera.Numero_camera = Prenotazione.Camera_assegnata 
and Account.Email = Prenotazione.Email 
and Fattura.Numero_fattura = Prenotazione.Numero_fattura;

# query che restituisce il cognome, email, numero camera e il numero della fattura per chi è in partenza in un giorno scelto
SELECT Prenotazione.Cognome, Account.Email, Camera.Numero_camera, Fattura.Numero_fattura
FROM Prenotazione INNER JOIN Account
INNER JOIN Camera ON Camera_assegnata
INNER JOIN Fattura 
WHERE Data_partenza= '2020-12-17'
and Camera.Numero_camera = Prenotazione.Camera_assegnata 
and Account.Email = Prenotazione.Email 
and Fattura.Numero_fattura = Prenotazione.Numero_fattura;

# query che restituisce le camere prenotate in un periodo scelto (Esempio: dal 30/10/20 al 31/12/20) e il periodo in cui lo sono
SELECT Camera_assegnata, Data_arrivo, Data_partenza from Prenotazione
WHERE Data_arrivo < '2020-12-31' and Data_partenza > '2020-10-30';

# query che restituisce le camere libere in un periodo scelto
CREATE TEMPORARY TABLE IF NOT EXISTS Occupate SELECT DISTINCT Camera_assegnata FROM
Prenotazione WHERE Data_arrivo <'2020-11-14' and Data_partenza > '2020-11-11';

SELECT Numero_camera, Prezzo_a_notte, Descrizione, Tipologia, Mq FROM Camera LEFT JOIN Occupate ON
(Numero_camera = Camera_assegnata) WHERE Camera_assegnata IS NULL;

DROP TABLE Occupate;
