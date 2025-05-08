--UID:			FOCUS.20190604.77.3
--NAME:			RW_FOCUS_QUALIFIKATION
--VERSION:		1.0.0
--DESCRIPTION:	Regelwerk FOCUS_QUALIFIKATION
--HOT: false

--  psql -f .\01.00.00_03_FOCUS-77.sql -U focus -d FOCUS_DEV_LOCAL

SET CLIENT_ENCODING TO 'UTF-8';

DELETE
FROM focus_qualifikation;

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'AA', 'Beitragsz. gem. §§564 u. 314a ASVG (Ang)', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'AP', 'KV-Beitrag aufgrund e. Auslandspension', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'AQ', 'KV-Beitrag wg. Ausl.Pens bei inl. Pens.', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'AR', 'DiffKV-Beitrag aufgrund e. Auslandspens.', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'A1', 'Beihilfe § 20 Abs. 2 AMFG Arbeiter', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'A2', 'nur Arbeitslosen-Pflichtversicherung', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'A3', 'Teilzeitbeihilfebezug § 1 Z 2 KGG', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'A4', 'Beihilfe § 20 Abs. 2 AMFG Angestellter', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'A5', 'Teilvers. §§ 471f - 471h ASVG Arbeiter', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'A6', 'Teilvers. §§ 471f - 471h ASVG Angest.', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'A7', 'Beitragszeit gem. §§ 564 u. 314a ASVG', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'A8', 'selbst. Land(Forst)wirt Angehöriger', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'A9', 'selbst. Land(Forst)wirt Angehöriger', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'BA', 'Arb.Lehrling (bergm. Tätigkeit) - NSchG', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'BB', 'Mehrfach geringfügig besch.-Beamter/in', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'BD', 'Mehrf. geringfügig Beschäftigte(r) (DLS)', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'BE', 'PV Pflichtversicherung wegen DLS', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'BF', 'Bes. Formalvers. gem.§471g ASVG - Arb.', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'BG', 'Bes. Formalvers. gem.§471g ASVG - Ang.', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'BK', 'Bezug von Kombilohn', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'BT', 'Bezug von Bildungsteilzeitgeld', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'BV', 'BUAK-Schwerarbeiterbeschäftigungszeiten', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'BX', 'Vollvers. und geringf. Besch. - Arb.', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'BY', 'Vollvers. und geringf. Besch. - Ang.', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'B1', 'Arbeiterlehrling', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'B2', 'Arbeiterlehrling (bergmänn. Tätigkeit)', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'B3', 'Arbeiterlehrling (NSchG)', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'B4', 'Angestelltenlehrling', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'B5', 'Angestelltenlehrling (NSchG)', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'B6', 'Vers.zeit f. Lehrling in Arb.dienstverh.', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'B7', 'Vers.zeit f. Lehrling in Ang.dienstverh.', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'B8', 'mehrfach geringfügig besch. Arbeiter', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'B9', 'mehrfach geringfügig besch. Angestellter', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'CA', 'Beitragsrückerstattung §70 (PVd.Ang.)', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'CS', 'Überträger einer Teilgutschrift', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'CU', 'Übernehmer einer Teilgutschrift', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'CX', 'Beitragsrückerstattung Arbeitslosenvers.', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'C1', 'Hausgehilfe', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'C2', 'Beitragserstattung Anrechnungsbetrag', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'C3', 'Beitragsrückerstattung Krankenvers.', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'C4', 'Hausangestellter', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'C5', 'Notstandshilfe, Überbrückungshilfe', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'C6', 'Arbeiter in knapp. PV', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'C7', 'Angestellter in knapp. PV', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'C8', 'Beitragsrückerstattung', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'C9', 'nicht vorgeschriebene Beiträge', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'DA', 'Urlaubsentschädigung gem. §136b BDG', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'DB', 'Kündigungsentschädigung (§136b BDG)', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'DU', 'Überbrückungsgeldbez. gem. §13l BUAG', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'D1', 'Hausbesorger', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'D2', 'Urlaubsabfindung, Urlaubsentschädigung', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'D3', 'Kündigungsentschädigung', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'D4', 'Winterfeiertagsentschädigung', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'D5', 'vorz. Alterspension lange Vers.dauer', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'D6', 'vorz. Alterspension Arbeitslosigkeit', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'D7', 'vorz. Alterspension gemind. Erwerbsf.', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'D8', 'Teilpension', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'D9', 'Gleitpension', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'EA', 'Selbstvers. gem. §18a ASVG (knappsch.PV)', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'EB', 'Selbstversicherung gemäß § 18b ASVG', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'EC', 'Selbstvers. §18b ASVG (knappschaftl. PV)', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'ED', 'Selbstversicherung gem. § 18a ASVG (ANG)', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'EE', 'Selbstversicherung gem. §16a ASVG (ANG)', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'EF', 'nachtr. Zeiteneinkauf Kindererz. - ANG', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'EG', 'Selbstversicherung gem. §18b ASVG ANG', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'EH', 'Selbstvers. PV - mittlere Schule', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'EI', 'Selbstvers. PV - höhere Schule', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'EJ', 'Selbstvers. PV - Hochschule', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'EK', 'Selbstvers. PV - HS-Studium', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'EL', 'Selbstvers. PV - Dentistenausbildung', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'EM', 'Entwicklungshelfer (neue Rechtslage)', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'EX', 'Vorläuf. Vers.Zeit wg. Kindererziehung', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'E1', 'Selbstversicherung gemäß § 18a ASVG', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'E2', 'Selbstversicherung gemäß § 16a ASVG', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'E3', 'Versicherungszeit wegen Kindererziehung', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'E4', 'Entwicklungshelfer (alte Rechtslage)', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'E5', 'nachträgl. Zeiteneinkauf Kindererziehung', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'E6', 'Weitervers., Kindererziehung (Arb.)', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'E7', 'Weitervers. Kindererziehung (Ang.)', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'E8', 'Selbstvers. Kindererziehung (Arb.)', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'E9', 'Selbstvers. Kindererziehung (Ang.)', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'FA', 'Bes.Pens.Leistung als Alterspens. (FSVG)', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'FE', 'Bes.Pens.Leist. als Erw.Unf.Pens. (FSVG)', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'FH', 'Bes.Pens.Leist. als Witwen(r)pens (FSVG)', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'FI', 'Freiwilliges Integrationsjahr', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'FJ', 'Freiw. Integrationsj. bei vorlieg. KV', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'FK', 'Bes.Pens.Leist. als Waisenpens. (FSVG)', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'FS', 'Fachkräftestipendium', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'FW', 'Freiwilliges Sozialjahr', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'FX', 'PV-Pfl.Vers. f. Tierärzte u. Wirt.Treuh.', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'FY', 'freiw.Vers.Ziviltechniker b. 2012 (FSVG)', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'FZ', 'Pfl.Vers.Ziviltechniker b. 2012 (FSVG)', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'F1', 'freiberufliche Tätigkeit', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'F2', 'gewerbl. selbst. + freiberufl. Tätigk.', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'F3', 'Pflichtversicherung § 2 Abs. 1 Z 4 GSVG', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'F4', 'Pflichtv. § 2/1/4 GSVG + freib.Tätigkeit', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'F5', 'nachtr. Zeiteneinkauf freiber. Tätigk.', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'F6', 'Weitervers. Land/Forstw. Angehöriger', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'F7', 'Weitervers. Land/Forstw. Ehepartner', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'F8', 'Weitervers. Land/Forstw. Betriebsführer', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'F9', 'Weitervers. Land/Forstw. Ehepartner', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'GD', 'geringfügige Beschäftigung wegen DLS', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'GE', '§2Abs.1Z4 GSVG ohne GSVG-PV-Pfl.Vers.', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'GF', '§2Abs.1Z4 GSVG ohne GSVG-KV-Pfl.Vers.', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'GG', '§2Abs.1Z1 GSVG ohne GSVG-PV-Pfl.Vers.', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'GH', '§2Abs.1Z1 GSVG ohne GSVG-KV-Pfl.Vers.', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'GI', '§2Abs.2 FSVG ohne FSVG-Pfl.Vers.', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'GT', 'geringfügig beschäftigter Beamter', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'GU', 'Geringf. Beschäft. kürzer 1 Monat Arb.', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'GV', 'Geringf. Beschäft. kürzer 1 Monat Ang.', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'GW', 'GB + freier DV und kürzer 1 Monat Arb.', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'GX', 'GB + freier DV und kürzer 1 Monat Ang.', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'GY', 'PV-Pfl.Vers.-NSCHG in d.knapp. PV -Arb.', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'GZ', 'PV-Pfl.Vers.-NSCHG in d.knapp. PV -Ang.', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'G1', 'Arbeiter Nachtschicht/Schwerarbeit', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'G2', 'Arbeiter bergmänn. Tätigkeit NSchG', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'G3', 'Arbeiter Gewinnungshauer NSchG', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'G4', 'Angestellter Nachtschicht/Schwerarb.', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'G5', 'Angestellter bergm.Tätigkeit NSchG', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'G6', 'Angestellter Gewinnungshauer NSchG', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'G7', 'Krankenpflegeschüler', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'G8', 'geringfügig beschäftigter Arbeiter', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'G9', 'geringfügig beschäftigter Angestellter', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'HA', 'Mittlere Schule-anrb.Beamt.Vordienstzeit', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'HB', 'Höhere Schule-Beitragszahlung(Beamte)', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'HC', 'Hochschule-Beitragszahlung (Beamte)', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'HD', 'Berufsausbildung - Beitragszahlung', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'HE', 'Besuch mittl. Schule (Beitragsz.)-2011', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'HF', 'Besuch höh. Schule (Beitragsz.) - 2011', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'HG', 'Hochschulstudium (Beitragszahlung) -2011', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'HH', 'Ausbildung n.Hochschule(Beitragsz.)-2011', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'HI', 'Dentistenausbildung, Beitr.Zahlng. 2011', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'HM', 'Höherversicherung monatlich', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'H1', 'Besuch einer mittl. Schule (Beitragsz.)', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'H2', 'Besuch einer höh. Schule (Beitragsz.)', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'H3', 'Hochschulstudium (Beitragszahlung)', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'H4', 'Ausbildung nach Hochschule (Beitragsz.)', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'H5', 'Dentistenausbildung, Beiträge entrichtet', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'IA', 'KV-Pflichtvers. wegen KBG, SachL GSVG', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'IB', 'KV-Pfllichtvers. wegen KBG, GeldL GSVG', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'IC', 'Familienzeitbonus', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'ID', 'Familienzeitbonus - nur KV (Beamte)', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'IE', 'Bezug von eink.abh. Kinderbetreuungsgeld', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'IF', 'Familienzeitbonus - nur PV (Vertragbed.)', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'IG', 'KV-/PV-Pfl.Vers. a. Gesellschafter -BSVG', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'I1', 'Selbstversicherung § 16 Abs. 1 ASVG', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'I2', 'Selbstversicherung § 16 Abs. 2 ASVG', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'I3', 'Selbstvers. § 16 Abs. 1 ASVG Wartezeit', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'I4', 'Krankenversicherung bei Pensionsbezug', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'I5', 'Bezug/Anspruch von/auf pauschalem(s) KBG', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'I7', 'Anspruch auf Kinderbetreuungsgeld', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'I8', 'Krankenvers. bei Pension (DG-KtoNr.)', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'I9', 'Pflichtvers. in der Krankenvers. BSVG', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'JA', 'PV-Pflichtvers. wg. Vers.Zeit beim Bund', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'JB', 'PV-Pflichtvers. als Landeslehrer', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'JC', 'PV-Pflichtvers. wg. Vers.Zt. bei d. Post', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'JD', 'PV-Pflichtvers.wg. Vers.Zt. b.d.Telekom', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'JE', 'PV-Pflichtvers.wg. Vers.Zt. beim Postbus', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'JF', 'PV-Pflichtvers.beim Bundestheaterverband', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'JG', 'PV-Pflichtvers. als Parlamentarier, etc.', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'JH', 'PV-Pflichtvers.wg.Vers.Zt. als Ld.Beamt.', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'JI', 'PV-Pflichtvers. als Gemeindebeamter', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'JJ', 'PV-Pflichtvers. als Verfassungsrichter', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'JK', 'Anerk. Ersatzzeiten im Beamtenbereich', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'JL', 'Nachgekaufte Zeiten im Beamtenbereich', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'JM', 'Geprüfte Beamtennullzeit', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'JN', 'PV-Pflichtvers. als Beamter b.d. ÖBB', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'JO', 'Wochengeld für weibl. Beamte der ÖBB', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'JP', 'PV-Pflichtvers.wg.Besch.b. EU-Körpersch.', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'JQ', 'PV-Pflichtvers. als Oberstes Organ', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'JR', 'Ruhegenuss nach Tätigkeit als Mandatar', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'JS', 'Versorgungsgenuss Witwe(r) nach Mandatar', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'JT', 'Versorgungsgenuss - Waise nach Mandatar', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'JU', 'Überträger einer Beamtenteilgutschrift', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'JV', 'PV-Pfl.Vers. als Antragsbeamt. gem.§136b', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'JW', 'Übernehmer einer Beamtenteilgutschrift', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'JX', 'KV B-KUVG - Dienstverhältnis ohne Bezüge', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'JY', 'Öffentl.Bed. (PV d. Arb. nach dem ASVG)', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'JZ', 'Öffentl.Bed. (PV d. Ang. nach dem ASVG)', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'J1', 'öffentlich Bediensteter', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'J2', 'Karenzurlaub, Beiträge entrichtet B-KUVG', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'J3', 'Vertragsbed. B-KUVG geringfügig besch.', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'J4', 'KV-Pfl.Vers. als Antragsbeamt. gem.§136b', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'J5', 'Ruhegenuss nach öffentl. Beschäftigung', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'J6', 'Witwerversorgungsgenuss', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'J7', 'Waisenversorgungsgenuss', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'J8', 'Pflichtvers. § 4 B-KUVG', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'J9', 'Pflichtvers. § 1 Abs. 1 Z 8 - 11 B-KUVG', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'KA', 'Selbstvers. gem. § 7a B-KUVG, Arbeiter', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'KB', 'Selbstvers. § 7a B-KUVG, Angestellter', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'KC', 'Selbstvers. § 7a Abs.2 Z2 B-KUVG Beamter', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'K1', 'Selbstvers. Krankenvers. § 16 ASVG', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'K2', 'Selbstvers. § 19a ASVG Arbeiter', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'K3', 'Selbstvers. § 19a ASVG Angestellter', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'K4', 'Weitervers. PV-Arb. § 77 Abs. 6 ASVG', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'K5', 'Weitervers. PV-Ang. § 77 Abs. 6 ASVG', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'K6', 'Weitervers.Pensionsvers. § 33 Abs.9 GSVG', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'K7', 'Weitervers.Pensionsvers. § 28 Abs.6 BSVG', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'K8', 'Weitervers. Krankenvers. § 8 GSVG', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'K9', 'Weitervers. Krankenvers. § 8 BSVG', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'L1', 'nicht bezahlte Beiträge BSVG', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'L2', 'nicht bezahlte Beiträge BSVG', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'L3', 'nicht bezahlte Beiträge BSVG', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'L4', 'nicht bezahlte Beiträge BSVG', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'L5', 'nicht bezahlte Beiträge BSVG', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'L6', 'nicht bezahlte Beiträge BSVG', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'L7', 'nicht bezahlte Beiträge BSVG', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'L8', 'Verjährung/Schuldenerlass GSVG', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'L9', 'Nicht vorgeschrieb. KV-Beitragsgrundlage', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'M1', 'unwirksame Beitragszahlung BSVG', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'M2', 'unwirksame Beitragszahlung BSVG', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'M3', 'unwirksame Beitragszahlung BSVG', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'M4', 'unwirksame Beitragszahlung BSVG', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'M5', 'unwirksame Beitragszahlung BSVG', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'M6', 'unwirksame Beitragszahlung BSVG', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'M7', 'unwirksame Beitragszahlung BSVG', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'M8', 'hauptberuflich beschäftigte Eltern BSVG', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'M9', 'Beitragserstattung gem. § 70 Abs. 5 ASVG', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'NU', 'Weiterbildungsgeld vor dem 45. Lebensj.', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'NW', 'Weiterbildungsgeld nach dem ALVG 1977', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'N1', 'Bezug einer Unfallrente kleiner 50%', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'N2', 'Bezug einer Vollrente', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'N3', 'Bezug einer UV-Hinterbliebenenrente', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'N4', 'Weiterbildungsgeld nach 45. Lebensjahr', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'N5', 'Sachleistungszuständigkeit bei mehrf. KV', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'N6', 'Sicherung § 5d AMPFG - beitragsfrei ASVG', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'N7', 'Sicherung § 5d AMPFG - beitragsfrei GSVG', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'N8', 'Sicherung § 5d AMPFG - beitragsfrei BSVG', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'N9', 'Bezug einer Gleitpension 300 Vers.monate', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'OA', 'Fam.Hosp.Teilz.Karenz - nur PV-Schutz', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'OB', 'Fam.Hosp.Vollzeitkarenz - nur KV-Schutz', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'OC', 'Fam.Hosp.Vollzeitkarenz - nur PV-Schutz', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'OJ', 'Fam.Hospizkarenz-kein od. ger. Eink.(KV)', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'OK', 'Keine EKVK für diese Person', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'OR', 'Ruhen von KG wegen Übergangsgeld', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'OV', 'Sachleistungsanspruch Verbrechensopfer', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'OX', 'Pflegeteilzeitkarenz §14d AVRAG - nur PV', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'OY', 'Pflegevollzeitkarenz §14c -nur KV-Schutz', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'OZ', 'Pflegevollzeitkarenz §14c -nur PV-Schutz', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'O1', 'KV - Mitversicherung ASVG + B-KUVG', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'O2', 'KV - Mitversicherung GSVG + BSVG', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'O3', 'Auslandsbetreuter Wohnsitz in Österreich', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'O4', 'Asylwerber bzw. Flüchtlinge', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'O5', 'Zugeteilter nach OFG ohne Leist.Einschr.', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'O6', 'Kriegshinterbl./Rente lt. §§ 68, 69 KOVG', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'O7', 'Ruhen des KV-Anspruches f. Hauptvers.', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'O8', 'Fam.Hospizkarenz-kein od. geringf. Eink.', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'O9', 'Fam. Hospizkarenz - nur PV-Schutz', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'PA', 'Anrechnungsbetrag gem. § 13 BBG ANG', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'PB', 'Überweisungsbetr.gem. §49h Abs.3 BBG ANG', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'PC', 'Überweisungsbetr. f. Geistliche (Arb.)', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'PD', 'Überweisungsbetr. f. Geistliche (Ang.)', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'P1', 'PflVers. Werkvertr. § 4 Abs. 5 ASVG Arb.', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'P2', 'PflVers. Werkvertr. § 4 Abs. 5 ASVG Ang.', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'P3', 'Freier Dienstvertr. §4 Abs.4 ASVG - Arb.', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'P4', 'Freier Dienstvertr. §4 Abs.4 ASVG - Ang.', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'P5', 'Anrechnungsbetrag gem. § 13 BBG', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'P6', 'Überweisungsbetrag gem. § 49h Abs. 3 BBG', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'P7', 'geringfügig besch. § 4 Abs. 4 ASVG Arb.', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'P8', 'geringfügig besch. § 4 Abs. 4 ASVG Ang.', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'P9', 'Beiträge nicht bezahlt', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'QA', 'Vormerkung zur KV und PV', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'QB', 'Pflichtvers. in der KV, UV und ALV', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'QC', 'Freiw. Weitervers. in der KV', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'QD', 'Schutzfristanspr. b. AMS-Sperre §10 AIVG', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'QE', 'KV-Pflichtversicherung bei KFA Wien', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'Q1', 'Krankenversicherung gem. § 43 Abs. 2 KGG', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'Q2', 'Pflichtversicherung in der KV', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'Q3', 'Pflichtversicherung in der KV', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'Q4', 'kein Leistungsanspruch in der KV', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'Q5', 'Selbstversicherung § 16 ASVG - Wartezeit', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'Q6', 'Sicherungsbeitrag gem. § 5d AMPFG ASVG', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'Q7', 'Sicherungsbeitrag gem. § 5d AMPFG GSVG', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'Q8', 'Sicherungsbeitrag gem. § 5d AMPFG BSVG', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'Q9', 'Erntehelfer gem. § 18 Abs.3 Z 2 FremdenG', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'RA', 'Beitr.Zt. nicht für Bem.Zt (U-Verf.)', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'R1', 'Neutrale Zeit (techn.Qual)', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'R2', 'Rehabilitationszeiten (techn.Qual)', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'R3', 'Freiw.Weiterversicherung (techn.Qual)', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'R4', 'Pfl.Vers. als Ersatzzeit (techn. Qual)', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'R5', 'Beitr.Zt. nicht für Bem.Zt (tech.Qual)', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'R6', 'Besch.vor Vers.Pflicht (BESO-tech.Qual)', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'R7', 'Freiw.WV deckt sich mit Ers.Mt.(tech.Qu)', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'R8', 'PAU - nicht zuordbare Qual 80 -techn.Qu.', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'R9', 'PAU, nicht zuordbare Qual 77 -techn.Qual', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'SA', 'Festgest. Schwerarbeit gem. §1 Abs.1 Z1', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'SB', 'Festgest. Schwerarbeit gem. §1 Abs.1 Z2', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'SC', 'Festgest. Schwerarbeit gem. §1 Abs.1 Z3', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'SD', 'Festgest. Schwerarbeit gem. §1 Abs.1 Z4', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'SE', 'Festgest. Schwerarbeit gem. §1 Abs.1 Z5', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'SF', 'Festgest. Schwerarbeit gem. §1 Abs.1 Z6', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'SH', 'KV-Pflichtvers. bedarfs. Mindestsich.', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'VA', 'Abgelehnte Schwerarbeit gem. §1 Abs.1 Z1', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'VB', 'Abgelehnte Schwerarbeit gem. §1 Abs.1 Z2', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'VC', 'Abgelehnte Schwerarbeit gem. §1 Abs.1 Z3', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'VD', 'Abgelehnte Schwerarbeit gem. §1 Abs.1 Z4', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'VE', 'Abgelehnte Schwerarbeit gem. §1 Abs.1 Z5', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'VF', 'Abgelehnte Schwerarbeit gem. §1 Abs.1 Z6', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'VV', 'Vorl. Schwerarb. gem.§1Abs.1Z1 (DGKTONR)', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'VW', 'Vorl. Schwerarb. gem.§1Abs.1Z2 (DGKTONR)', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'VX', 'Vorl. Schwerarb. gem.§1Abs.1Z4 (DGKTONR)', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'VY', 'Vorl. Schwerarb. gem.§1Abs.1Z5 (DGKTONR)', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'VZ', 'Vorl. Schwerarb. gem.§1Abs.1Z6 (DGKTONR)', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'V1', 'Vorläufige Schwerarbeit gem. §1 Abs.1 Z1', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'V2', 'Vorläufige Schwerarbeit gem. §1 Abs.1 Z2', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'V4', 'Vorläufige Schwerarbeit gem. §1 Abs.1 Z4', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'V5', 'Vorläufige Schwerarbeit gem. §1 Abs.1 Z5', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'V6', 'Vorläufige Schwerarbeit gem. §1 Abs.1 Z6', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'WI', 'Wiedereingliederungsgeld', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'Y1', 'Arbeiter (Knappschaftszweig)', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'Y2', 'Überweisungsbetrag v. Dienstgeb.-Bergbau', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'Y3', 'strafrechtl. Entschädigung Beitragszeit', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'Y4', 'Angestellter (Knappschaftszweig)', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'Y5', 'Sonderruhegeldbezug gem. NSCHG (Bergbau)', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'Y6', 'vorz. Altersp. Arbeitslosigk. knapp. PV', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'Y7', 'Bezug einer Knappschaftsvollpension', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'Y8', 'vorz. Altersp. lg.VersDauer knapp. PV', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'Y9', 'Knappschaftsalterspensionsbezug', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'ZA', 'Selbstvers. gem. § 18a ASVG knapp.PV', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'ZB', 'Selbstvers. gem. § 16a ASVG knapp. PV', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'ZC', 'Arbeiter NSchG-Schwerarbeit knapp. PV', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'ZD', 'Angestellter NSchG-Schwerarbeit knapp.PV', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'ZE', 'Weitervers. knapp. PV § 77 Abs. 6 ASVG', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'ZF', 'Gleitpension i. d. knapp.PV 300 VersMon.', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'ZG', 'Bes.Pens.Beitrag(knappsch) - SRÄG 2010', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'ZI', 'PflVers. freier DV § 4 Abs. 4 ASVG Arb.', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'ZJ', 'PflVers. freier DV § 4 Abs. 4 ASVG Ang.', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'ZK', 'Anrechnungsbetrag gem. § 13 BBG', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'ZL', 'Überweisungsbetrag gem. § 49h Abs. 3 BBG', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'ZM', 'vorz.Altersp. gemind. Erwerbsf. knapp.PV', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'Z1', 'Arbeiterlehrling knappschaftliche PV', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'Z2', 'Teilpension in der knappschaftl. PV', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'Z3', 'Gleitpension knappschaftliche PV', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'Z4', 'Angestelltenlehrling knappschaftl. PV', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'Z5', 'Weitervers. knappschaftl. Arbeiter', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'Z6', 'Weitervers. knappschaftl. Angestellter', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'Z7', 'bes.Pensionsbeitrag knappsch. entrichtet', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '00AE', 'verdichtete BG, Ersatzzeit, ASVG, REV', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '00AF', 'verdichtete BG, Weitervers., ASVG, REV', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '00AG', 'halbverdichtete BG, inkl. SZ, ASVG, REV', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '00AN', 'nominelle BG, ASVG, REV', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '00AP', 'verdichtete BG, ASVG, REV', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '00BE', 'verdichtete BG, Ersatzzeit, BSVG, REV', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '00BF', 'verdichtete BG, Weitervers., BSVG, REV', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '00BP', 'verdichtete BG, BSVG, REV', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '00GE', 'verdichtete BG, Ersatzzeit, GSVG, REV', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '00GF', 'verdichtete BG, Weitervers., GSVG, REV', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '00GP', 'verdichtete BG, GSVG, REV', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '00X0', 'Höherversicherung ohne BESO, REV', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '00X1', 'Höherversicherung mit BESO 1, REV', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '00X2', 'Höherversicherung mit BESO 2, REV', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '00X3', 'Höherversicherung mit BESO 3, REV', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '01', 'keine Versicherungszeit', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '02', 'ALG-Geldleistung, schuldlos unberechtigt', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '03', 'Höherversicherung', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '05', 'Sonderruhegeldbezug nach NSCHG', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '06', 'Knappschaftssoldbezug', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '07', 'Pensionsbezug gemind. Arbeitsfähigkeit', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '08', 'Pensionsbezug Erwerbs(Dienst)unfähigkeit', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '09', 'Alterspensionsbezug', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '1A', 'vorgeschr. Beitragsgrundlagenteil GSVG', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '1B', 'vorgeschr. Beitragsgrundlagenteil FSVG', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '1C', 'Vers.Zeit o. Notstandsh. §34/1 AlVG (PV)', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '1D', 'Pfl.Vers.BSVG Gesellschafter', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '1E', 'PV-Pfl.Vers. NVG (Unselbst. Erw.)', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '1F', 'PV-Pfl.Vers. NVG Selbst. Erw.)', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '1G', 'Vers.Zeit o. Notstandsh.§34/1 AlVG KV/PV', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '1Y', 'GB Aushilfe § 53a Abs. 3b ASVG-Arbeiter', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '1Z', 'GB Aushilfe § 53a Abs. 3b ASVG-Ang.', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '10', 'Arbeiter', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '11', 'Arbeiter, bergmännische Tätigkeit', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '12', 'Arbeiter Gewinnungshauertätigkeit', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '13', 'Ersatzzeit ohne Notstandsh. § 34/1 AlVG', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '14', 'Angestellter', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '15', 'Angestellter bergmännische Tätigkeit', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '16', 'Angestellter Gewinnungshauertätigkeit', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '17', 'nicht bezahlte Beiträge BSVG, GSVG, FSVG', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '18', 'gewerbl.selbständig Erwerbstätiger', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '19', 'selbst. Land(Forst)wirt Betriebsführer', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '2A', 'Verjährter Beitragsgrundlagenteil', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '2B', 'Stichtagsunwirksame Beitragszeit', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '2D', 'Überweisungsbetrag vom Dienstgeber (Ang)', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '2F', 'Weiterversicherung (OMV-PV Arbeiter)', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '2G', 'Weiterversicherung (OMV-PV Angestellter)', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '2P', 'Selbstv. i.d. ALV n. §3 AIVG-1/4 HBG/ bp', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '2Q', 'Selbstv. i.d. ALV n. §3 AIVG-1/4 HBG/ bf', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '2R', 'Selbstv. i.d. ALV n. §3 AIVG-1/2 HBG/ bp', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '2S', 'Selbstv. i.d. ALV n. §3 AIVG-1/2 HBG/ bf', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '2T', 'Selbstv. i.d. ALV n. §3 AIVG-3/4 HBG/ bp', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '2U', 'Selbstv. i.d. ALV n. §3 AIVG-3/4 HBG/ bf', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '20', 'selbst. Land(Forst)wirt Angehöriger', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '21', 'Überweisungsbetrag an den Dienstgeber', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '22', 'Überweisungsbetrag vom Dienstgeber', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '23', 'Strafrechtl. Entschädigung (Beitragsz.)', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '24', 'Beiträge wurden unwirksam entrichtet', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '25', 'Weiterversicherung (PV Arbeiter)', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '26', 'Weiterversicherung (PV Angestellte)', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '27', 'Weiterversicherung (gewerbl.selbst. PV)', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '28', 'Weitervers. Land/Forstw. Betriebsführer', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '29', 'Weitervers. Land/Forstw. Angehöriger', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '3A', 'Präsenzdienst aus kv-rechtl. Sicht', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '3B', 'Zeitsoldat b. Ö.BH aus kv-rechtl. Sicht', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '3C', 'Zeitsoldat b. Ö.BH aus pv-rechtl. Sicht', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '3D', 'Strafrechtl. Entschäd. (Beitragsz.), Ang', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '3E', 'Beitragsgrundlage für Wochengeldbezug', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '3G', 'Beitragsgrundlage für Krankengeldbezug', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '3J', 'Beitragsgrundlage für Arbeitslosenbezug', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '3R', 'KV-Anspr. b. Versagung/Verwirkung KG 25%', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '3S', 'KV-Anspr. bei Versagung/Verwirkung d. KG', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '3T', 'Beitragsgrundlage für Teilentgelttage', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '3U', 'Beitr.Grdlg. f. TE bei Antragsbeamte', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '3V', 'Beitr.Grdlg. f. Wochengeld (§ 136b BDG)', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '3W', 'Beitr.Grdlg. f. Krankengeld (§ 136b BDG)', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '30', 'Besuch einer mittleren Schule', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '31', 'Besuch einer höheren Schule', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '32', 'Studium an einer Hochschule', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '33', 'Präsenzdienst aus pv-rechtl. Sicht', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '34', 'Wochengeldbezug (DGKTONR-bezogen)', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '35', 'Wochengeldbezug, Sonderfall', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '36', 'Krankengeldbezug (DGKTONR-bezogen)', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '37', 'Krankengeldbezug, Sonderfall', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '38', 'Arbeitslosengeldbezug', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '39', 'Arbeitssuchend', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '4A', 'KV-PflVers. § 2/1/1 - § 2/1/3 GSVG SachL', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '4B', 'KV-PflVers. § 2/1/1 - § 2/1/3 GSVG GeldL', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '4C', 'KV-PflVers. § 2/1/4 GSVG Sachleistung', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '4D', 'KV-PflVers. § 2/1/4 GSVG Geldleistung', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '4E', 'KV-PflVers. §§ 14a,14b GSVG Sachleistung', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '4F', 'KV-PflVers. §§ 14a,14b GSVG Geldleistung', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '4G', 'KV-Weitervers. GSVG Sachleistung', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '4H', 'KV-Weitervers. GSVG Geldleistung', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '4I', 'KV-Pensionist GSVG Sachleistung', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '4J', 'KV-Pensionist GSVG Geldleistung', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '4K', 'KV-Pens./Reh./Übergangsg. GSVG - SL', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '4L', 'KV-Pens./Reh./Übergangsg. GSVG - GL', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '4M', 'KV-PflVers. §2/1/4GSVG o.Leist.anspr.-SL', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '4N', 'KV-PflVers. §2/1/4GSVG o.Leist.anspr.-GL', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '4P', 'KV-Pfl.v.§§ 14a, 14b GSVG o. L.Anspr.-SL', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '4R', 'KV-Pfl.v.§§ 14a, 14b GSVG o. L.Anspr.-GL', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '4S', 'KV-Pfl.Vers. wg. vorl. KV (GSVG) - Sachl', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '4T', 'KV-Pfl.Vers. wg. vorl. KV (GSVG) - Geldl', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '4U', 'KV-Leist.Anspr. w. GSVG-WG-Bez. (Sachl.)', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '4V', 'KV-Leist.Anspr. w. GSVG-WG-Bez. (Geldl.)', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '4Z', 'Verjährung/Schuldenerlass FSVG', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '40', 'Pensionsvorschussbezug', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '41', 'Karenzurlaubsgeldbezug', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '42', 'Versehrtenrentenbezug Schwerversehrter', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '43', 'Karenzurlaubsgeldbezug Kindesannahme', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '44', 'unentgeltliche Berufsausbildung KOVG', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '45', 'U-Haft mit Verf.Einst. od. Freispruch', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '46', 'Straferlass kraft neuer Gesetzeslage', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '47', 'Beschädigtenrentenbezug KOVG', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '48', 'Sonderunterstützung Arbeitsmarktverw.', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '49', 'Anzeige einer Lebendgeburt', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '5A', 'Nachtr.Einkauf v. Vers.Zeiten (Ang)', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '5B', 'Bes. Pensionsbeiträge im PV-Zweig d. Ang', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '5C', 'Besond. Pens.Beiträge nach dem SRÄG 2010', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '5D', 'Bes.Pens.Beitr.(PV-Zweig d. Ang) - SRÄG', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '5W', 'Teilpfl. in der GSVG-PV wg. WG-Bezug', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '50', 'nachtr. eingekaufte Versicherungszeit', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '51', 'Karenzurlaubsgeldbezug des Kindesvaters', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '52', 'Rückerstattung von PV-Beiträgen', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '53', 'Zivildienst', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '54', 'Ausgedinge nach dem BSVG', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '55', 'Beschäftigung bei IAEO, UNIDO u.ä.', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '56', 'Ersatzzeit Urlaubsentsch./Urlaubsabfind.', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '57', 'besonderer Pensionsbeitrag entrichtet', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '58', 'Pflichtversicherung durch HKAG-Beiträge', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '59', 'Monat einer Verhinderungszeit', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '6A', 'Übergangsgeldbezug im PV-Zweig d. Ang.', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '6R', 'Bezug von Rehabgeld + KV-Sachl.anspruch', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '6S', 'Rehabilitationsgeld Antragsbeamte', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '6T', 'Bezug v Rehabgeld ohne KV-Sachl.anspruch', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '6U', 'Bezug von Umschulungsgeld', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '60', 'Keine österr. Versicherungszeit', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '61', 'Beitragszeit gem.§ 506b ASVG', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '62', 'Überweisungsbetrag § 308 Abs. 4 ASVG', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '63', 'Witwerpensionsbezug', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '64', 'selbst. Land/Forstwirt Betriebsführer', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '65', 'Waisenpensionsbezug', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '66', 'Übergangsgeldbezug', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '67', 'Ersatzzeit gem.§502 ASVG', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '68', 'berufliche Rehabilitation', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '69', 'Rehabilitationsmaßnahmen BSVG, GSVG', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '7A', 'Bezug einer Berufsunfähigkeitspension', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '7B', 'Bezug eines Berufsunfähigkeitsgeldes', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '7E', 'Beschäftigung vor Versicherungspflicht', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '70', 'Ausbildungszeit nach Hochschulstudium', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '71', 'Wehr- bzw. Arbeitsdienst', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '72', 'Kriegsdienstleistung, Gefangenschaft u.a', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '73', 'Zivilinternierung', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '74', 'Freiheitsbeschränkung', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '75', 'besondere Beitragsentr. § 31 Abs. 1 SVNG', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '76', 'allgemeine Pauschalabgeltung', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '77', 'Pauschalspeicherung Versicherungspflicht', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '78', 'Beschäftigung als Ordensangehöriger', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '79', 'Beschäftigung vor Versicherungspflicht', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '8A', 'Angemeldet als Arbeiter(in) nach ASVG', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '8B', 'Angemeldet als Angestellte(r) nach ASVG', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '8C', 'Angemeldet als geringf. Beschäft. (Arb.)', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '8D', 'Angemeldet als geringf. Beschäft. (Ang.)', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '8E', 'Angemeldet als freier Dienstnehmer (Arb)', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '8F', 'Angemeldet als freier Dienstnehmer (Ang)', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '8G', 'Angemeldet geringfügig Freier DN (Arb.)', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '8H', 'Angemeldet geringfügig Freier DN (Ang.)', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '8J', 'Angemeldet als Lehrling nach ASVG (Arb.)', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '8K', 'Angemeldet als Lehrling nach ASVG (Ang.)', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '8L', 'Angemeldet als Mindestsicherungsbezieher', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '8M', 'Angemeldet für Urlaubsabf./entschädigung', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '8N', 'Angemeldet für Kündigungsentschädigung', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '80', 'Dentistenausbildung', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '81', 'Sondernotstandshilfebezug', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '82', 'Versicherungsfreier Monat', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '83', 'strafrechtl. Entschädigung (Ersatzzeit)', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '84', 'Wochengeldbezug als neutrale Zeit', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '85', 'Versicherungspflicht noch strittig', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '86', 'neutrale Zeit wegen Krankheit', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '87', 'neutr. Zeit Kindererziehung/Kinderpflege', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '88', 'Anstaltspflege n. Kriegsd./Kriegsgefsch.', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '89', 'Anstaltspflege nach 9. Mai 1945', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '96', 'selbst. Land(Forst)wirt Ehepartner', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '97', 'selbst. Land(Forst)wirt Ehepartner', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_qualifikation( qualifikation, kurzbeschreibung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '99', 'selbst. Land(Forst)wirt Angehöriger', 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('17.06.2019', 'DD.MM.YYYY'), 0 );


COMMIT;
