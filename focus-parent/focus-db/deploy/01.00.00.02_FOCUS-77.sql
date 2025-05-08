--UID:			FOCUS.20190603.77.2
--NAME:			RW_FOCUS_STEUERUNG
--VERSION:		1.0.0
--DESCRIPTION:	Regelwerk FOCUS_STEUERUNG
--HOT: false

--  psql -f .\01.00.00_02_FOCUS-77.sql -U focus -d FOCUS_DEV_LOCAL

SET CLIENT_ENCODING TO 'UTF-8';

DELETE
FROM focus_steuerung;

INSERT
INTO focus_steuerung( parameter, wert, beschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'ECARD_ERMITTLUNG_ZEITRAUM_START', '180',
         'Für die Ermittlung der letzten eCard-Konsultation wird der Zeitraum zwischen errechnetem Startdatum (Systemdatum - Anzahl der konfigurierten Tage) und aktuellem Tagesdatum herangezogen',
         'FOCUS360', TO_DATE('01.06.2018', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.06.2018', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_steuerung( parameter, wert, beschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'LEISTUNG_ERMITTLUNG_ZEITRAUM_START', '180',
         'Für die Ermittlung der jüngsten Leistungsfälle wird der Zeitraum zwischen errechnetem Startdatum (Systemdatum - Anzahl der konfigurierten Tage) und aktuellem Tagesdatum herangezogen.',
         'FOCUS360', TO_DATE('01.06.2018', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.06.2018', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_steuerung( parameter, wert, beschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'KONTAKT_ERMITTLUNG_ZEITRAUM_START', '180',
         'Für die Ermittlung der Kundenkontakte wird der Zeitraum zwischen errechnetem Startdatum (Systemdatum - Anzahl der konfigurierten Tage) und aktuellem Tagesdatum herangezogen.', 'FOCUS360',
         TO_DATE('01.06.2018', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.06.2018', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_steuerung( parameter, wert, beschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'BESCHWERDE_ERMITTLUNG_ZEITRAUM_START', '180',
         'Für die Ermittlung der Beschwerden wird der Zeitraum zwischen errechnetem Startdatum (Systemdatum - Anzahl der konfigurierten Tage) und aktuellem Tagesdatum herangezogen.', 'FOCUS360',
         TO_DATE('01.06.2018', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.06.2018', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_steuerung( parameter, wert, beschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'VERSICHERUNG_BEENDET_ZEITRAUM_START', '180',
         'Für die Ermittlung der Verischerungsverhältnisse werden sowohl laufende Versicherungsverhältnisse, als auch Versicherungsverhältnisse herangezogen, welche nach dem errechnetem Beendigungszeitpunkt (Systemdatum - Anzahl der konfigurierten Tage) beendet wurden.',
         'FOCUS360', TO_DATE('01.06.2018', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.06.2018', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_steuerung( parameter, wert, beschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'ANGEHORIGE_BEENDET_ZEITRAUM_START', '180',
         'Für die Ermittlung der Angehörigen werden sowohl laufende Angehörigenbeziehugen, als auch Beziehungen herangezogen, welche nach dem errechnetem Beendigungszeitpunkt (Systemdatum - Anzahl der konfigurierten Tage) beendet wurden.',
         'FOCUS360', TO_DATE('01.06.2018', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.06.2018', 'DD.MM.YYYY'), 0 );


COMMIT;
