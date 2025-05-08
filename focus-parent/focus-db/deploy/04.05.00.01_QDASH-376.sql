--UID:			QDASH.20230208.376.1
--NAME:			Angehoerigen-Dashlet
--VERSION:		4.5.0
--DESCRIPTION:	Hochziehen auf ZUP Version 5.0.0
--HOT: false

--  psql -f .\04.05.00.01_QDASH-376.sql -U focus -d FOCUS_DEV_LOCAL

SET CLIENT_ENCODING TO 'UTF-8';

ALTER TABLE zugriffsprotokoll
    DROP CONSTRAINT pk_zugriffsprotokoll;

ALTER TABLE zugriffsprotokoll
    RENAME TO zugriffsprotokoll_h;

CREATE TABLE zugriffsprotokoll
(
    zugriffsprotokoll_id     NUMERIC(12)         NOT NULL,
    zvst                     VARCHAR(2)          NOT NULL,
    idapp                    VARCHAR(8)          NOT NULL,
    quell_systemid           VARCHAR(64)         NOT NULL,
    systemmodus              VARCHAR(3)          NOT NULL,
    version                  NUMERIC(4)          NOT NULL,
    protokollierungspflicht  VARCHAR(1)          NOT NULL,
    logid                    VARCHAR(20)         NOT NULL,
    verarbeitungsmodus       VARCHAR(1)          NOT NULL,
    traegerid                VARCHAR(2)          NOT NULL,
    benutzerid               VARCHAR(128)        NOT NULL,
    berechtigungs_systemid   VARCHAR(64)         NOT NULL,
    benutzer_orgeinheit      VARCHAR(10)         NULL,
    bearbeitungsgrund        VARCHAR(250)        NULL,
    prot_datum               VARCHAR(8)          NOT NULL,
    prot_zeitpunkt           VARCHAR(8)          NOT NULL,
    transaktionskennung      VARCHAR(72)         NULL,
    transaktionskennung_kurz VARCHAR(13)         NULL,
    fehler                   VARCHAR(6)          NULL,
    kriterium1_typ           VARCHAR(50)         NOT NULL,
    kriterium1_wert          VARCHAR(20)         NOT NULL,
    kriterium2_typ           VARCHAR(30)         NULL,
    kriterium2_wert          VARCHAR(20)         NULL,
    kriterium3_typ           VARCHAR(30)         NULL,
    kriterium3_wert          VARCHAR(20)         NULL,
    zusatz1_10               VARCHAR(10)         NULL,
    zusatz2_10               VARCHAR(10)         NULL,
    zusatz3_10               VARCHAR(10)         NULL,
    zusatz4_10               VARCHAR(10)         NULL,
    zusatz5_10               VARCHAR(10)         NULL,
    zusatz6_10               VARCHAR(10)         NULL,
    zusatz7_10               VARCHAR(10)         NULL,
    zusatz8_10               VARCHAR(10)         NULL,
    zusatz9_10               VARCHAR(10)         NULL,
    zusatz10_10              VARCHAR(10)         NULL,
    zusatz11_10              VARCHAR(10)         NULL,
    zusatz12_30              VARCHAR(30)         NULL,
    zusatz13_50              VARCHAR(50)         NULL,
    zusatz14_60              VARCHAR(60)         NULL,
    zusatz15_130             VARCHAR(130)        NULL,
    verarbeitetjn            CHAR(1) DEFAULT 'N' NOT NULL,
    verarbdat                DATE                NULL,
    fehlertext               VARCHAR(150)        NULL
);

CREATE UNIQUE INDEX pk_zugriffsprotokoll ON zugriffsprotokoll (zugriffsprotokoll_id);

ALTER TABLE zugriffsprotokoll
    ADD CONSTRAINT pk_zugriffsprotokoll
        PRIMARY KEY USING INDEX pk_zugriffsprotokoll;

COMMIT;