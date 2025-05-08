--UID:			FOCUS.20191219.236
--NAME:			FOCUS_LOCK_TASK
--VERSION:		3.0.0
--DESCRIPTION:	Erweiterung der Spalte Updatecount von Precision 5 auf Precision 12
--HOT: false

ALTER TABLE focus_lock_task
    ALTER COLUMN updatecount TYPE NUMERIC(12, 0);

COMMIT;
