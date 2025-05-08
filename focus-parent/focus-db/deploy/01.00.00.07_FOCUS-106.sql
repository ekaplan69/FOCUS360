--UID:			FOCUS.20190720.106
--NAME:			FOCUS_LOCK_TASK
--VERSION:		1.0.0
--DESCRIPTION:	Neuer Scheduled Task TRANSMIT_ZUP
--HOT: false

--  psql -f .\01.00.00.07_FOCUS-106.sql -U focus -d FOCUS_DEV_LOCAL

SET CLIENT_ENCODING TO 'UTF-8';

INSERT
INTO focus_lock_task ( lock_task, lock_owner, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'TRANSMIT_ZUP', NULL, 'FOCUS360', CURRENT_DATE, 'FOCUS360', CURRENT_DATE, 0 );

COMMIT;
