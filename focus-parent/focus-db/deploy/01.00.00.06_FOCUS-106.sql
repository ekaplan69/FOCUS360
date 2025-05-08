--UID:			FOCUS.20190719.106
--NAME:			FOCUS_LOCK_TASK
--VERSION:		1.0.0
--DESCRIPTION:	Neue Tabelle zur Verwaltung des Lockings der Scheduled Tasks
--HOT: false

--  psql -f .\01.00.00.06_FOCUS-106.sql -U focus -d FOCUS_DEV_LOCAL

SET CLIENT_ENCODING TO 'UTF-8';

/* Create Table */

CREATE TABLE focus_lock_task
(
    lock_task    VARCHAR(50) NOT NULL,
    lock_owner   VARCHAR(64),
    ersteller    VARCHAR(8)  NOT NULL,
    erstell_ts   DATE        NOT NULL,
    letztaend    VARCHAR(8)  NOT NULL,
    letztaend_ts DATE        NOT NULL,
    updatecount  NUMERIC(5)  NOT NULL
)
;

/* Create Primary Keys, Indexes, Uniques, Checks */

ALTER TABLE focus_lock_task
    ADD CONSTRAINT pk_focus_lock_task
        PRIMARY KEY (lock_task)
;

COMMIT;
