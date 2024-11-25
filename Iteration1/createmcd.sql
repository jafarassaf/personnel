alter table UTILISATEUR
drop foreign key fk_idType;
alter table UTILISATEUR
drop foreign key fk_numLigue;


DROP TABLE IF EXISTS UTILISATEUR;
DROP TABLE IF EXISTS TYPE_UTILISATEUR;
DROP TABLE IF EXISTS LIGUE;

CREATE TABLE UTILISATEUR ( 
    idUtilisateur INT PRIMARY KEY NOT NULL,
    nomUtil VARCHAR(50),
    prenomUtil VARCHAR(50),
    mailUtil VARCHAR(250),
    passwordUtil VARCHAR(50),
    date_arrivee date,
    date_depart date,
    idType INT,
    numLigue INT null
);

CREATE TABLE TYPE_UTILISATEUR ( 
    idType INT PRIMARY KEY NOT NULL,
    libelleType VARCHAR(50) 
);

CREATE TABLE LIGUE ( 
    numLigue INT PRIMARY KEY NOT NULL,
    nomLigue VARCHAR(50) 
);