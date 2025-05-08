--UID:			FOCUS.20190524.77.1
--NAME:			FOCUS-77
--VERSION:		1.0.0
--DESCRIPTION:	Initial DB Script
--HOT: false

--  psql -f .\01.00.00_01_FOCUS-77.sql -U focus -d FOCUS_DEV_LOCAL

SET CLIENT_ENCODING TO 'UTF-8';

/* Create Tables */

CREATE TABLE focus_notiz
(
    id                    NUMERIC(12)   NOT NULL,
    fachschluesselartkurz VARCHAR(5)    NOT NULL,
    fachschluessel        VARCHAR(30)   NOT NULL,
    text                  VARCHAR(1000) NULL,
    ersteller             VARCHAR(8)    NOT NULL,
    erstell_ts            TIMESTAMP     NOT NULL,
    letztaend             VARCHAR(8)    NOT NULL,
    letztaend_ts          TIMESTAMP     NOT NULL,
    updatecount           NUMERIC(5)    NOT NULL
)
;

CREATE TABLE focus_system
(
    parameter    VARCHAR(100) NOT NULL,
    wert         VARCHAR(100) NOT NULL,
    beschreibung VARCHAR(300) NULL,
    ersteller    VARCHAR(8)   NOT NULL,
    erstell_ts   DATE         NOT NULL,
    letztaend    VARCHAR(8)   NOT NULL,
    letztaend_ts DATE         NOT NULL,
    updatecount  NUMERIC(5)   NOT NULL
)
;

CREATE TABLE focus_steuerung
(
    parameter    VARCHAR(100) NOT NULL,
    wert         VARCHAR(100) NOT NULL,
    beschreibung VARCHAR(300) NULL,
    ersteller    VARCHAR(8)   NOT NULL,
    erstell_ts   DATE         NOT NULL,
    letztaend    VARCHAR(8)   NOT NULL,
    letztaend_ts DATE         NOT NULL,
    updatecount  NUMERIC(5)   NOT NULL
)
;

CREATE TABLE focus_qualifikation
(
    qualifikation    VARCHAR(4)  NOT NULL,
    kurzbeschreibung VARCHAR(50) NOT NULL,
    ersteller        VARCHAR(8)  NOT NULL,
    erstell_ts       DATE        NOT NULL,
    letztaend        VARCHAR(8)  NOT NULL,
    letztaend_ts     DATE        NOT NULL,
    updatecount      NUMERIC(5)  NOT NULL
)
;

CREATE TABLE focus_meldendestelle
(
    meldendestelle  VARCHAR(4)  NOT NULL,
    kurzbezeichnung VARCHAR(20) NOT NULL,
    langbezeichnung VARCHAR(50) NOT NULL,
    ersteller       VARCHAR(8)  NOT NULL,
    erstell_ts      DATE        NOT NULL,
    letztaend       VARCHAR(8)  NOT NULL,
    letztaend_ts    DATE        NOT NULL,
    updatecount     NUMERIC(5)  NOT NULL
);

CREATE TABLE zugriffsprotokoll
(
    zugriffsprotokoll_id NUMERIC(12)  NOT NULL,
    zvst                 VARCHAR(2)   NOT NULL,
    idapp                VARCHAR(8)   NOT NULL,
    systemmodus          VARCHAR(1)   NOT NULL,
    version              NUMERIC(4)   NOT NULL,
    logid                VARCHAR(20)  NOT NULL,
    verarbeitungsmodus   VARCHAR(1)   NOT NULL,
    traegerid            VARCHAR(2)   NOT NULL,
    benutzerid           VARCHAR(128) NOT NULL,
    benutzer_orgeinheit  VARCHAR(10)  NULL,
    bearbeitungsgrund    VARCHAR(250) NULL,
    prot_datum           VARCHAR(8)   NOT NULL,
    prot_zeitpunkt       VARCHAR(8)   NOT NULL,
    transaktionskennung  VARCHAR(72)  NULL,
    fehler               VARCHAR(6)   NULL,
    kriterium1_typ       VARCHAR(30)  NOT NULL,
    kriterium1_wert      VARCHAR(20)  NOT NULL,
    kriterium2_typ       VARCHAR(30)  NULL,
    kriterium2_wert      VARCHAR(20)  NULL,
    kriterium3_typ       VARCHAR(30)  NULL,
    kriterium3_wert      VARCHAR(20)  NULL,
    zusatz1_10           VARCHAR(10)  NULL,
    zusatz2_10           VARCHAR(10)  NULL,
    zusatz3_10           VARCHAR(10)  NULL,
    zusatz4_10           VARCHAR(10)  NULL,
    zusatz5_10           VARCHAR(10)  NULL,
    zusatz6_10           VARCHAR(10)  NULL,
    zusatz7_10           VARCHAR(10)  NULL,
    zusatz8_10           VARCHAR(10)  NULL,
    zusatz9_10           VARCHAR(10)  NULL,
    zusatz10_10          VARCHAR(10)  NULL,
    zusatz11_10          VARCHAR(10)  NULL,
    zusatz12_30          VARCHAR(30)  NULL,
    zusatz13_50          VARCHAR(50)  NULL,
    zusatz14_60          VARCHAR(60)  NULL,
    zusatz15_130         VARCHAR(130) NULL
);

ALTER TABLE
    zugriffsprotokoll
    ADD verarbeitetjn CHAR(1) DEFAULT 'N' NOT NULL;

ALTER TABLE
    zugriffsprotokoll
    ADD verarbdat DATE;

ALTER TABLE
    zugriffsprotokoll
    ADD fehlertext VARCHAR(150);

/* Create Primary Keys, Indexes, Uniques, Checks */

/* Create Primary Keys, Indexes, Uniques, Checks */

ALTER TABLE focus_notiz
    ADD CONSTRAINT pk_focus_notiz
        PRIMARY KEY (id)
;

CREATE INDEX i_focus_notiz_fs ON focus_notiz (fachschluesselartkurz ASC, fachschluessel ASC);

CREATE UNIQUE INDEX pk_zugriffsprotokoll ON zugriffsprotokoll (zugriffsprotokoll_id);

ALTER TABLE zugriffsprotokoll
    ADD CONSTRAINT pk_zugriffsprotokoll PRIMARY KEY USING INDEX pk_zugriffsprotokoll;

ALTER TABLE focus_system
    ADD CONSTRAINT pk_focus_system
        PRIMARY KEY (parameter)
;

ALTER TABLE focus_steuerung
    ADD CONSTRAINT pk_focus_steuerung
        PRIMARY KEY (parameter)
;

ALTER TABLE focus_qualifikation
    ADD CONSTRAINT pk_focus_qualifikation
        PRIMARY KEY (qualifikation)
;


ALTER TABLE focus_meldendestelle
    ADD CONSTRAINT pk_focus_meldendestelle
        PRIMARY KEY (meldendestelle)
;


CREATE SEQUENCE zugriffsprotokoll_s
    CYCLE
    CACHE 1
    MAXVALUE 999999999999
    MINVALUE 0
    INCREMENT BY 1
    START WITH 0
;

CREATE SEQUENCE focus_notiz_s
    CYCLE
    CACHE 1
    MAXVALUE 999999999999
    MINVALUE 0
    INCREMENT BY 1
    START WITH 0
;

ALTER TABLE zugriffsprotokoll
    ADD CONSTRAINT systemmoduscheck CHECK (systemmodus IN ('P', 'T', 'E', 'V'));

COMMIT;
