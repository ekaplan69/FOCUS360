SET POSTGRESQL_HOME=C:\ta30\progs\PostgreSQL
SET POSTGRES_DATA=C:\ta30\postgres_data
SET TS_FOCUS=C:\ta30\server\Postgres_DB
SET TS_FOCUS_PAYLOAD=C:\ta30\server\Postgres_DB_Payload
SET SCRIPT_DIR=%~dp0
SET INVOCATION_DIR=%CD%
SET DB_SCRIPTS_DIR=%SCRIPT_DIR%..\..\..\focus-db

C:

cd %POSTGRESQL_HOME%\bin
if not errorlevel 0 goto errortart

pg_ctl -D "%POSTGRES_DATA%" -l "%POSTGRES_DATA%\logfile" stop

echo "Deleting directories ..."
RD /Q/S %POSTGRES_DATA%
RD /Q/S %TS_FOCUS%
RD /Q/S %TS_FOCUS_PAYLOAD%

echo "Creating directories ..."
mkdir %TS_FOCUS%
mkdir %TS_FOCUS_PAYLOAD%

initdb -E Unicode "%POSTGRES_DATA%"

pg_ctl -D "%POSTGRES_DATA%" -l "%POSTGRES_DATA%\logfile.txt" start 

timeout 20

createuser --interactive -s postgres

cd %DB_SCRIPTS_DIR%\misc\local_setup
if not errorlevel 0 goto error

FORFILES /M *.sql /c "cmd /c %POSTGRESQL_HOME%\bin\psql -f @file -U postgres"

cd %DB_SCRIPTS_DIR%\deploy
if not errorlevel 0 goto error

FORFILES /M *.sql /c "cmd /c %POSTGRESQL_HOME%\bin\psql -f @file -v AUTOCOMMIT=off -U focus FOCUS_DEV_LOCAL"

cd %INVOCATION_DIR%
if not errorlevel 0 goto error

goto end

:ERROR
echo "something went wrong"

:END
PAUSE
