<#
.Synopsis
   Setup PostgreSQL Database for FOCUS360

.EXAMPLE
    Setzt die Datenbank auf einer lokalen PostgreSQL Installation auf
    setupPostgreSQL.ps1

.Parameter
#>
param ()

# An die jeweilige Umgebung anzupassen
$PostgreSQLPsql = "$env:ProgramFiles\PostgreSQL\16\bin\psql.exe"
$PostgreSQLPassword = "admin@123"
# Sollte grundsätzlich nicht verändert werden
$CurrentDirectory = pwd;
$PostgreSQLPAuthFileName = "pgpass.conf"
$PostgreSQLPAuthFileFolder = "$env:APPDATA\postgresql\"
$PostgreSQLPAuthFilePath = "$PostgreSQLPAuthFileFolder$PostgreSQLPAuthFileName"
$PostgreSQLAuthFileContent = "localhost:5432:postgres:postgres:$PostgreSQLPassword"
$FocusDatabaseConfig = "focus"
$FocusAuthFileContent = "localhost:5432`:$FocusDatabaseConfig`:$FocusDatabaseConfig`:$FocusDatabaseConfig"
$InitDBSkript = "$CurrentDirectory\init_db_local.sql"
$SFCSkriptsPath = "$CurrentDirectory\..\..\focus-parent\focus-db\deploy"

# Main
# .pgpass File erzeugen (%APPDATA%\postgresql\pgpass.conf) für Authentifizierung
# https://www.postgresql.org/docs/current/libpq-pgpass.html
if (!(Test-Path $PostgreSQLPAuthFileFolder))
{
    Write-Host "Create Folder for Auth-File [$PostgreSQLPAuthFileFolder]..."
    New-Item -Path "$PostgreSQLPAuthFileFolder" -ItemType Directory
}
if (!(Test-Path $PostgreSQLPAuthFilePath))
{
    Write-Host "Create Auth-File [$PostgreSQLPAuthFilePath]..."
    New-Item -Path "$PostgreSQLPAuthFilePath" -ItemType File
}
# .pgpass File ggf. erweitern
if (!(Select-String -Path $PostgreSQLPAuthFilePath -Pattern "$PostgreSQLAuthFileContent" -SimpleMatch -Quiet))
{
    Write-Host "Append Content for SuperUser to Auth-File [$PostgreSQLPAuthFilePath]..."
    Add-Content -Path $PostgreSQLPAuthFilePath -Value "$PostgreSQLAuthFileContent"
}
if (!(Select-String -Path $PostgreSQLPAuthFilePath -Pattern "$FocusAuthFileContent" -SimpleMatch -Quiet))
{
    Write-Host "Append Content for focus to Auth-File [$PostgreSQLPAuthFilePath]..."
    Add-Content -Path $PostgreSQLPAuthFilePath -Value "$FocusAuthFileContent"
}
# Datenbank und User erzeugen
Write-Host "Create Database and User with [$InitDBSkript]... "
& $PostgreSQLPsql -U postgres -h localhost -p 5432 -f "$InitDBSkript"
# SFC Skripts einspielen
Write-Host "Execute all SFC SQL-scripts from [$SFCSkriptsPath]... "
Get-ChildItem $SFCSkriptsPath -Filter *.sql | Foreach-Object {
    Write-Host "Execute $_.FullName..."
    & $PostgreSQLPsql -U $FocusDatabaseConfig -h localhost -p 5432 -d $FocusDatabaseConfig -f $_.FullName -v AUTOCOMMIT=off
}
Write-Host "Database setup finished!"