--UID:			FOCUS.20190718.106
--NAME:			FOCUS_SYSTEM_ZUP
--VERSION:		1.0.0
--DESCRIPTION:	Neue Regelwerkseinträge für den Scheduled Task TRANSMIT_ZUP in FOCUS_SYSTEM
--HOT: false

--  psql -f .\01.00.00.05_FOCUS-106.sql -U focus -d FOCUS_DEV_LOCAL

SET CLIENT_ENCODING TO 'UTF-8';

INSERT
INTO focus_system ( parameter, wert, beschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'INTERVALL_TRANSMIT_ZUP', '1-7;0-23;*;0', 'Intervall für die Durchführung der Batchverarbeitung ProtkollsätzeÜbermitteln (TRANSMIT_ZUP) im Format <wochentag>;<stunde>;<minute>;<sekunde>;',
         'FOCUS360', CURRENT_DATE, 'FOCUS360', CURRENT_DATE, 0 );

INSERT
INTO focus_system ( parameter, wert, beschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'PACKAGESIZE_TRANSMIT_ZUP', '160', 'Anzahl der Protkollsätze welche pro Webservice Aufruf an ZUP übergeben werden.', 'FOCUS360', CURRENT_DATE, 'FOCUS360', CURRENT_DATE, 0 );

INSERT
INTO focus_system ( parameter, wert, beschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'SCHEDULE_SECURITY_INTERVALL', '12', 'Sollte ein Task nicht mehr freigegeben werden können, erfolgt nach dieser Dauer (in Stunden) trotzdem ein erneuter Start.', 'FOCUS360', CURRENT_DATE,
         'FOCUS360', CURRENT_DATE, 0 );

COMMIT;
