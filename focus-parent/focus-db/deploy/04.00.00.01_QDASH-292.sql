--UID:			FOCUS.20220209.292.1
--NAME:			RW_FOCUS_STEUERUNG_DSGVO
--VERSION:		4.0.0
--DESCRIPTION:	Regelwerk FOCUS_STEUERUNG für DSGVO
--HOT: false

--  psql -f .\04.00.00_01_QDASH-292.sql -U focus -d FOCUS_DEV_LOCAL

SET CLIENT_ENCODING TO 'UTF-8';

INSERT
INTO focus_steuerung( parameter, wert, beschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'DSGVO_ERMITTLUNG_ZEITRAUM_START', '2557',
         'Für die Ermittlung der Daten für den DSGVO-Report wird der Zeitraum zwischen errechnetem Startdatum (Systemdatum - Anzahl der konfigurierten Tage) und aktuellem Tagesdatum herangezogen',
         'FOCUS360', TO_DATE('09.02.2022', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('09.02.2022', 'DD.MM.YYYY'), 0 );

COMMIT;
