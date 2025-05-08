# FOCUS360

FOCUS360 (First Overview Central User Service) ist ein völlig neues Element in der STP-Landschaft und das zentrale Element in der landesstellenübergreifenden Darstellung von Versichertendaten der
Österreichischen Gesundheitskasse. Der Sachbearbeiterin bzw. dem Sachbearbeiter werden auf einen Blick Daten aus einer Vielzahl von SV Fachapplikationen im Überblick dargestellt.

## Development

### Erste Schritte

#### Voraussetzung

* **OEGKClient4Entwickler**
* **IntelliJ** - in der höchsten, im Softwarecenter zur Verfügung gestellten, Version
* **IntelliJ Plugins**
  * Powershell
  * zusätzlich empfohlen
    * AsciiDoc
    * JPA Buddy
    * NX Console
    * .ignore
    * Markdown Editor
* **Apache Maven**
* **Java JDK**

Die einzusetzenden Versionen, der JDK und von Maven, sind einerseits von der Projekt-Version und andererseits von den im Softwarecenter verfügbaren Versionen abhängig.

#### Kompatibilitätsmatrix


|  FOCUS360  |  Java  | Maven | ePortal jBoss Archetype |
| :---------: | :----: | :---: | :---------------------: |
| ab 2023.2.0 | JDK 17 | 3.9.9 |         8.0.11         |

#### Projektstruktur

Um nahezu sämtliche zur Verfügung gestellte Funktionalitäten im Bereich der runConfigurations "*OutOfTheBox*" nutzen zu können ist es notwendig den Sourcecode in einem Project-Verzeichnis abzulegen.
IntelliJ geht in den Konfigurationen in den meisten Fällen vom `$PROJECT_DIR$` aus und navigiert dann zu den gewählten Verzeichnissen.
z.B.:
`$PROJECT_DIR$/focus-config-dev`

Wird ein Verzeichnis außerhalb vom Project-Verzeichnis gewählt, ändert IntelliJ im Hintergrund den Pfad, sodass wieder vom Project-Verzeichnis weg navigiert wird.
z.B.:`$PROJECT_DIR$\..\..\..\..\progs\nodejs` - ausgehend vom Verzeichnis `C:\DEV\workspaces\intellij\projects\FOCUS360`

##### Empfehlung

**Basisverzeichnis**

`C:\DEV\workspaces\intellij\projects`

**Project-Verzeichnis**

`C:\DEV\workspaces\intellij\projects\FOCUS360`

Mit "new Project" oder "Clone from VCS"

`C:\DEV\workspaces\intellij\projects\FOCUS360` - für den "FB KSL"-Teil
`C:\DEV\workspaces\intellij\projects\ORGANIZATIONAL` - für den organisatorischen Bereich
`C:\DEV\workspaces\intellij\projects\FRONTEND` - für den "FB MD"-Teil
`C:\DEV\workspaces\intellij\projects\BACKEND` - für die Services

Da in den runConfigurations `$PROJECT_DIR$` verwendet wird spielt die Bezeichnung des Project-Verzeihnisses eine untergeordnete Rolle.

#### runConfigurations


|  Präfix  |         Type         |     Bezeichnung     |                                                                                                            Beschreibung                                                                                                            | Abhängigkeit (Before Launch) |
| :-------: | :------------------: | :------------------: | :---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: | :---------------------------: |
| focus360_ |        Maven        |   cleanInstallOnly   |                                                                                         Baut die Applikation mit Ausnahme der Dokumentation                                                                                         |               -               |
| focus360_ |        Maven        |     cleanInstall     |                                                                                                        Baut die Applikation                                                                                                        |               -               |
| focus360_ |        Maven        |    cleanInstallIT    |                                                                                      Baut die Applikation und führt die Integrationstests aus                                                                                      |               -               |
| focus360_ |        Maven        |   cleanInstallTest   |                                                                                          Baut die Applikation und führt die Unittests aus                                                                                          |               -               |
| focus360_ |        Maven        |  deleteEPortalJBoss  |                                                                                             Löscht den lokalen ePortal jBoss komplett                                                                                             |                              |
| focus360_ |        Maven        |  setupEPortalJBoss  | Setzt auf Basis des ePortal-jboss-archetypes einen lokalen Entwicklungsserver auf und deployed, auf Basis des RZ-Standards für Deploymentautomatisierung, die applikationsrelevanten Komponenten (bis auf das *.war für Focus360) | focus360_installEPortalJBoss |
| focus360_ |      Powershell      | installEPortalJBoss |                                                                          Setzt auf Basis des ePortal-jboss-archetypes einen lokalen Entwicklungsserver auf                                                                          |  focus360_deleteEPortalJBoss  |
| focus360_ |      Powershell      |    setupDatabase    |                           Erstellt im lokalen PostgreSQL-RDBMS einen User(focus:focus), sowie eine Datenbank(focus) und setzt alle SFC-Skripts entsprechend der Benamung in aufsteigender Reihenfolge ab.                           |               -               |
| focus360_ |         NPM         |      start-dev      |                                                                           baut das Angular-Frontend und startet den Entwicklungsserver auf localhost:4200                                                                           |               -               |
|          | JBoss/Wildfly Server | FOCUS360 jBoss EAP 8 |                                                                                 Starten/Stoppen/Debuggenen des lokalen ePortal Entwicklungsservers                                                                                 |               -               |

#### Coding Conventions

Um eine einheitliche Formatierung des Sourcecodes zu gewährleisten und die zusammenarbeit zu erleichtern sollte der im Projekt abgelegt CodeStyle für IntelliJ verwendet werden.

[CodeStyle_IntelliJ_USS.xml](intellij/CodeStyle_IntelliJ_USS.xml)
"# FOCUS360" 
