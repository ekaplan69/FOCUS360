<#
.Synopsis
   Install ePortal jBoss for project from Archetype (eportal-jboss-archetype)

.EXAMPLE
    Setzt einen ePortal jBoss mit der Archetype Version 7.4.6 auf
    servicecenter_installEPortalJBoss.ps1 -EPortalJBossArchetypeVersion 7.4.6

.Parameter EPortalJBossArchetypeVersion
    Version des ePortal jBoss Archetypes die für die Installatioon verwendet werden soll
#>
param (
    [string]$EPortalJBossArchetypeVersion
)

# Sollte grundsätzlich nicht verändert werden
$CurrentDirectory = pwd;
$ArtifactId = "eportal"
$EPortalConfigPath = "$CurrentDirectory\config"
$mvn = "$Env:MAVEN_HOME\bin\mvn.cmd"

# Main
Write-Host "Aktuelles Verzeichnis/WorkingDir: $CurrentDirectory"
Write-Host "MAVEN_HOME=$Env:MAVEN_HOME"
Write-Host "mvn=$mvn"
Write-Host "Delete existing jBoss-directory... "
# Das Verzeichnis wird bereits zuvor, gesteuert über die runConfiguration, mit dem maven-clean-plugin geleert
# Notwendig weil Remove-Item ein Problem beim löschen der temp Files im jBoss hat!
Remove-Item -LiteralPath "$CurrentDirectory\$ArtifactId" -Force -Recurse
Write-Host "Setup ePortal jBoss via archetype..."
& $mvn archetype:generate -DarchetypeGroupId="at.itsv.eportal" `
-DarchetypeArtifactId="eportal-jboss-archetype" -DarchetypeVersion="$EPortalJBossArchetypeVersion" `
-DartifactId="$ArtifactId" -DinteractiveMode="false" `
-Dgoals="process-resources -Ditsv.config.directory=$EPortalConfigPath"
Write-Host "Finished installing ePortal jBoss for FOCUS360!"