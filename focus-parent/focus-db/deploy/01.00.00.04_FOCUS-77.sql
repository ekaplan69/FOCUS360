--UID:			FOCUS.20190604.77.4
--NAME:			RW_FOCUS_MELDENDESTELLE
--VERSION:		1.0.0
--DESCRIPTION:	Regelwerk FOCUS_MELDENDESTELLE
--HOT: false

--  psql -f .\01.00.00_04_FOCUS-77.sql -U focus -d FOCUS_DEV_LOCAL

SET CLIENT_ENCODING TO 'UTF-8';

DELETE
FROM focus_meldendestelle;

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '01', 'PVA', 'Pensionsversicherungsanstalt', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '02', 'PVA', 'Pensionsversicherungsanstalt', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '03', 'SVS UV', 'SVS als UV-Träger', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '04', 'BVAEB-EB', 'BVAEB-Eisenbahn Bergbau', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '05', 'BVAEB-EB', 'BVAEB-Eisenbahn Bergbau', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '06', 'VA ö.Notariat', 'Vers.Anst.des ö.Notariates', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '07', 'BVAEB-OEB', 'BVAEB-Oeffentl. Bedienstete', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '08', 'AUVA', 'Allg. Unfallversicherungsanst.', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '09', 'BVAEB-OEB UV', 'BVAEB-Oeffentl. Bedienstete UV', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '0A', 'AUVA-Graz', 'AUVA - Landesstelle Graz', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '0B', 'AUVA-Wien', 'AUVA - Landesstelle Wien', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '0C', 'AUVA-Linz', 'AUVA - Landesstelle Linz', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '0D', 'AUVA-Salzburg', 'AUVA - Landesstelle Salzburg', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '0E', 'ASG', 'Arbeits- und Sozialgericht', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '0G', 'WIKA Österr.', 'Wirtschaftskammer Österreich', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '0I', 'IEF-Service', 'IEF-Service GmbH', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '0K', 'BVAEB-EB KV', 'BVAEB-Eisenbahn Bergbau KV', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '0S', 'Vertragspart.', 'Krankenhäuser', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '10', 'BVAEB-EB UV', 'BVAEB-Eisenbahn Bergbau UV', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '11', 'ÖGK-W', 'ÖGK-Wien', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '12', 'ÖGK-N', 'ÖGK-Niederösterreich', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '13', 'ÖGK-B', 'ÖGK-Burgenland', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '14', 'ÖGK-O', 'ÖGL-Oberösterreich', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '15', 'ÖGK-ST', 'ÖGK-Steiermark', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '16', 'ÖGK-K', 'ÖGK-Kärnten', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '17', 'ÖGK-S', 'ÖGK-Salzburg', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '18', 'ÖGK-T', 'ÖGK-Tirol', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '19', 'ÖGK-V', 'ÖGK-Vorarlberg', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '1A', 'KFA d. St.Wien', 'KFA der Stadt Wien', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '1B', 'BVAEB-OEB PS', 'BVAEB-Oeffentl. Bedienstete PS', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '1C', 'WSTW-Pers.', 'MD-Personalst. Wr.Stadtwerke', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '1D', 'B-U&Abf.Kasse', 'Bauarb.-Urlaub&Abfertigungsk.', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '1E', 'FMA', 'Finanzmarktaufsicht', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '1G', 'W.kammer Wien', 'Wirtschaftskammer Wien', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '1I', 'SM-Serv. Wien', 'Sozialministeriumservice Wien', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '1K', 'AEKWIEN', 'Ärztekammer für Wien', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '1L', 'Land Wien', 'Magistrat der Stadt Wien', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '1O', 'Öst.Postbus AG', 'Österreichische Postbus AG', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '1P', 'Österr.Post AG', 'Österreichische Post AG', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '1S', 'SSRWIEN', 'Stadtschulrat für Wien', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '1T', 'TELEKOM AG', 'Telekom Austria AG', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '1X', 'ÖGK', 'Österr. Gesundheitskasse', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '1Y', 'Land Wien', 'Mag. der Stadt Wien (Lehrer)', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '1Z', 'ZAEK Wien', 'Landeszahnärztekammer Wien', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '20', 'BKK Staatsdr.', 'BKK d.Öst.Staatsdr.(GKK Wien)', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '21', 'BKK Tabak', 'BKK Austria Tabak', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '22', 'BKK Verkehrsb.', 'BKK d. Wiener Verkehrsbetriebe', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '23', 'BKK Semperit', 'BKK Semperit', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '24', 'BKK Mondi', 'BKK Mondi', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '25', 'BKKVABS', 'BKK voestalpine Bahnsysteme', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '26', 'BKK Zeltweg', 'BKK Zeltweg', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '27', 'BKK Kindberg', 'BKK Kindberg', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '28', 'BKK Kapfenberg', 'BKK Kapfenberg', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '29', 'BKK Pengg', 'BKK Pengg', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '2A', 'KFA BADEN', 'KF d.pragm.Bed.d.Stadt Baden', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '2B', 'BPOL St.P.', 'BPOL St. Pölten', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '2C', 'BPOL Wr.Neust.', 'BPOL Wr. Neustadt', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '2D', 'BPOL Schwechat', 'BPOL Schwechat', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '2E', 'Mag. Krems', 'Magistrat Krems', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '2F', 'Mag. St.Pölten', 'Magistrat St. Pölten', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '2G', 'W.kammer NÖ', 'Wirtschaftskammer NÖ', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '2H', 'Mag. Waidh./Y.', 'Magistrat Waidhofen/Ybbs', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '2I', 'SM-Serv. NÖ', 'Sozialministeriumservice NÖ', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '2J', 'Mag. Wr.Neust.', 'Magistrat Wr. Neustadt', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '2K', 'AEKNOE', 'Ärztekammer f.Niederösterreich', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '2L', 'Land N.Ö.', 'Landesregierung Niederösterr.', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '2P', 'Österr.Bundesb', 'Österreichische Bundesbahnen', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '2S', 'LSRNOE', 'Landesschulrat f.Niederösterr.', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '2Y', 'Land N.Ö.', 'Landesregierung NÖ (Lehrer)', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '2Z', 'ZAEK NÖ', 'Landeszahnärztekammer NÖ', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '30', 'SVMM', 'SV-Managementmodell', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '31', 'ITSV GmbH', 'IT-Services d. Soz.vers. GmbH', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '32', 'SV-Rechenzent.', 'SV-Rechenzentrum', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '33', 'CustCareCenter', 'ITSV-RZ Customer Care Center', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '34', 'SVC, ChipkBetr', 'SVC, Chipkarten-Betreiber', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '35', 'DWH ITSV', 'HVB DWH in der ITSV', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '36', 'Entschl.Dienst', 'Entschl.Dienst in der ITSV', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '37', 'HVB DWH', 'Pers.bez. HVB DWH in der ITSV', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '38', 'DWHOÖGKK', 'Pers.bez. DWH in der OÖGKK', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '39', 'bPK', 'bPK Service', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '3A', 'BH Eisenst./U.', 'BH Eisenstadt Umgebung', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '3B', 'BH Mattersburg', 'BH Mattersburg', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '3C', 'BH Neus./See', 'BH Neusiedl am See', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '3D', 'Mag.Fr.Eisenst', 'Magistrat Freistadt Eisenstadt', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '3I', 'SM-Serv. BGLD', 'Sozialministeriumservice BGLD', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '3K', 'AEKBGLD', 'Ärztekammer für Burgenland', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '3L', 'Land Bgld.', 'Land Burgenland', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '3S', 'LSRBGLD', 'Landesschulrat für Burgenland', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '3X', 'SBI im HVB', 'Statistik u Business Intellig.', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '3Y', 'Land Bgld.', 'Landesregierung Bgld (Lehrer)', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '3Z', 'ZAEK Bgld.', 'Landeszahnärztekammer Bgld.', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '40', 'SVS-GW', 'SVS-gew.Wirtschaft', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '41', 'SVS-GW Wien', 'SVS-gew.Wirtschaft Lst. Wien', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '42', 'SVS-GW NÖ', 'SVS-gew.Wirtschaft Lst. NÖ', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '43', 'SVS-GW Bgld', 'SVS-gew.Wirtschaft Lst. Bgld', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '44', 'SVS-GW OÖ', 'SVS-gew.Wirtschaft Lst. OÖ', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '45', 'SVS-GW Stmk', 'SVS-gew.Wirtschaft Lst. Stmk', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '46', 'SVS-GW Ktn', 'SVS-gew.Wirtschaft Lst. Ktn', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '47', 'SVS-GW Sbg', 'SVS-gew.Wirtschaft Lst. Sbg', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '48', 'SVS-GW Tirol', 'SVS-gew.Wirtschaft Lst. Tirol', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '49', 'SVS-GW Vbg', 'SVS-gew.Wirtschaft Lst. Vbg', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '4A', 'KFA d.Lhs.Linz', 'KFA der Landeshauptstadt Linz', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '4B', 'KFA f.OÖ-Gmdb.', 'KFA für OÖ Gemeindebeamte', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '4C', 'KUF f.OÖ-Ldbd.', 'KUF für OÖ Landesbedienstete', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '4D', 'KF OÖ Lehrer', 'KF für Lehrer-Oberösterreich', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '4E', 'KFA Steyr', 'KFA der Beamten d Stadt Steyr', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '4F', 'KFA d.Std.Wels', 'KFA der Stadt Wels', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '4G', 'MAGSTEYR', 'Magistrat der Stadt Steyr', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '4H', 'MAGWELS', 'Magistrat der Stadt Wels', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '4I', 'SM-Serv. OÖ', 'Sozialministeriumservice OÖ', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '4J', 'BH Perg', 'BH Perg', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '4K', 'AEKOOE', 'Ärztekammer für Oberösterreich', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '4L', 'Land O.Ö.', 'Landesregierung Oberösterreich', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '4M', 'BH Vöcklabr.', 'BH Vöcklabruck', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '4N', 'MAGLINZ', 'Magistrat der Stadt Linz', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '4P', 'MAGLINZPS', 'Magistrat Linz Pensionsservice', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '4S', 'BDIOOE', 'Bildungsdirektion f. OÖ', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '4Y', 'Land OÖ', 'Landesregierung OÖ (Lehrer)', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '4Z', 'ZAEK OÖ', 'Landeszahnärztekammer OÖ', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '50', 'SVS-LW', 'SVS-Landwirtschaft', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '51', 'SVS-LW Wien', 'SVS-Landwirtschaft Lst. Wien', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '52', 'SVS-LW NÖ', 'SVS-Landwirtschaft Lst. NÖ', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '53', 'SVS-LW Bgld', 'SVS-Landwirtschaft Lst. Bgld', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '54', 'SVS-LW OÖ', 'SVS-Landwirtschaft Lst. OÖ', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '55', 'SVS-LW Stmk', 'SVS-Landwirtschaft Lst. Stmk', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '56', 'SVS-LW Ktn', 'SVS-Landwirtschaft Lst. Ktn', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '57', 'SVS-LW Sbg', 'SVS-Landwirtschaft Lst. Sbg', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '58', 'SVS-LW Tirol', 'SVS-Landwirtschaft Lst. Tirol', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '59', 'SVS-LW Vbg', 'SVS-Landwirtschaft Lst. Vbg', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '5A', 'KFA d.LHS.Graz', 'KFA der Landeshauptstadt Graz', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '5B', 'KFA Mürzzuschl', 'KFA der Stadtgem.Mürzzuschlag', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '5C', 'BH Bruck/Mürzz', 'BH Bruck-Mürzzuschlag', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '5D', 'BH Graz Umg.', 'BH Graz Umgebung', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '5E', 'BH Leibnitz', 'BH Leibnitz', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '5F', 'BH Mürzzuschl.', 'BH Mürzzuschlag', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '5G', 'BH Voitsberg', 'BH Voitsberg', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '5H', 'BH Weiz', 'BH Weiz', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '5I', 'SM-Serv. STMK', 'Sozialministeriumservice STMK', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '5J', 'Mag. Graz', 'Magistrat Graz', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '5K', 'AEKSTMK', 'Ärztekammer für Steiermark', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '5L', 'Land Stmk.', 'Landesregierung Steiermark', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '5S', 'LSRSTMK', 'Landesschulrat für Steiermark', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '5Y', 'Land Stmk.', 'Landesregierung Stmk (Lehrer)', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '5Z', 'ZAEK Stmk.', 'Landeszahnärztekammer Stmk.', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '62', 'SVD GmbH', 'SVD Büromanagement GmbH', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '63', 'SVD GmbH', 'SVD Büromanagement GmbH', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '6A', 'KFA St.Villach', 'KFA der Stadt Villach', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '6G', 'W.Kammer Ktn.', 'Wirtschaftskammer Kärnten', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '6I', 'SM-Serv. KTN', 'Sozialministeriumservice KTN', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '6K', 'AEKKTN', 'Ärztekammer für Kärnten', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '6L', 'Land Ktn.', 'Landesregierung Kärnten', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '6P', 'PFGEM', 'Pensionsfonds der Gemeinden', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '6S', 'LSRKTN', 'Landesschulrat für Kärnten', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '6Y', 'Land Ktn.', 'Landesregierung Ktn (Lehrer)', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '6Z', 'ZAEK Ktn.', 'Landeszahnärztekammer Kärnten', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '74', 'KFA f.OÖ-Gmdb.', 'KFA für OÖ Gemeindebeamte', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '79', 'Arb.Mkt.Serv.', 'Arbeitsmarktservice ', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '7A', 'KFA Bed.Slbg.', 'KFA d.MA-Beamt.-Stadt Salzburg', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '7B', 'KV-F. Badgast.', 'KV-Fonds d.Gem.Badgastein', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '7C', 'KF Hallein', 'KF d.pragm.Bed.d.Stadt Hallein', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '7D', 'BH Salzburg', 'BH Salzburg', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '7E', 'Mag. Salzburg', 'Magistrat Salzburg', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '7I', 'SM-Serv. SBG', 'Sozialministeriumservice SBG', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '7K', 'AEKSBG', 'Ärztekammer für Salzburg', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '7L', 'Land Sbg.', 'Landesregierung Salzburg', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '7S', 'LSRSBG', 'Landesschulrat für Salzburg', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '7X', 'BVAEB', 'BVAEB', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '7Y', 'Land Sbg.', 'Landesregierung Sbg (Lehrer)', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '7Z', 'ZAEK Slbg.', 'Landeszahnärztekammer Salzburg', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '80', 'AMS Österr.', 'AMS Österreich', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '81', 'AMS Bgld.', 'AMS Burgenland', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '82', 'AMS Kärnten', 'AMS Kärnten', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '83', 'AMS NÖ', 'AMS Niederösterreich', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '84', 'AMS OÖ', 'AMS Oberösterreich', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '85', 'AMS Slbg.', 'AMS Salzburg', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '86', 'AMS Stmk.', 'AMS Steiermark', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '87', 'AMS Tirol', 'AMS Tirol', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '88', 'AMS Vlbg.', 'AMS Vorarlberg', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '89', 'AMS Wien', 'AMS Wien', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '8A', 'KF-UF Innsbr.', 'KF u. UF d. Beamten Innsbruck', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '8B', 'KF T. Gem.Bea.', 'KF d.Tiroler Gemeindebeamten', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '8C', 'KF Tir.L.Bea.', 'KF der Tiroler Landesbeamten', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '8D', 'KF T. L.Lehr.', 'KF der Tiroler Landeslehrer', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '8E', 'PFSPAE', 'Pensionsfonds f. Sprengelärzte', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '8F', 'MAGIBK', 'Stadtmagistrat Innsbruck', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '8I', 'SM-Serv. Tirol', 'Sozialministeriumservice Tirol', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '8K', 'AEKTIROL', 'Ärztekammer für Tirol', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '8L', 'Land Tirol', 'Landesregierung Tirol', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '8M', 'LVWG Tirol', 'Landesverwaltungsgericht Tirol', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '8P', 'GVBPRTGB', 'Gem.VB.f.Pens.recht Tir.Gem.B.', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '8S', 'LSRTIROL', 'Landesschulrat für Tirol', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '8Y', 'Land Tirol', 'Landesregierung Tirol (Lehrer)', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '8Z', 'ZAEK Tirol', 'Landeszahnärztekammer Tirol', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '90', 'BM f. F. u. J', 'Bd.Min. für Familien u. Jugend', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '91', 'BM f. B.u.F.', 'Bd.Min. für Bildung und Frauen', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '92', 'BM f. Inneres', 'Bundesministerium für Inneres', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '93', 'BM f. U.K.u.K', 'Studienbeihilfenbehörde', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '94', 'BM f.Finanzen', 'Bundesministerium für Finanzen', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '95', 'BM f.L.V.u.Sp.', 'Bd.Min. für Landesvert.u.Sport', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '96', 'BM f.A.S.KonsS', 'Bd.Min.f.Arb.,Soz.,Kons.schutz', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '97', 'BM f. Justiz', 'Bd.Min. für Justiz', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '98', 'BM f. D. u. W.', 'Bd.Min.f.Digit.u.Wirtschaftsst', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '99', 'Dachverband', 'Dachverband der österr. SV', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '9A', 'KFA BeaBregenz', 'KFA d.Beamten d.Stadt Bregenz', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '9B', 'BH Bregenz', 'BH Bregenz', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '9C', 'BH Dornbirn', 'BH Dornbirn', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '9D', 'BH Feldkirch', 'BH Feldkirch', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '9E', 'BH Bludenz', 'BH Bludenz', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '9F', 'BM LF,Umw.u.Wa', 'BM Land-u.Frostw.,Umwelt u.Was', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '9G', 'BM f. Gesundh.', 'Bd.Min. f. Gesundheit', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '9I', 'SM-Serv. VLBG', 'Sozialministeriumservice VLBG', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '9K', 'AEKVBG', 'Ärztekammer für Vorarlberg', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '9L', 'Land Vlbg.', 'Landesregierung Vorarlberg', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '9M', 'Bd.kanzleramt', 'Bundeskanzleramt', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '9N', 'BM Eur.Integr.', 'BM f.Europa,Integrat.u.Äußeres', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '9S', 'LSRVBG', 'Landesschulrat für Vorarlberg', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '9V', 'BM Verk,Inn.Te', 'BM Verkehr, Innovation u.Techn', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '9W', 'BMDW', 'Bd.Min.Digit.Wirtschaftsstando', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '9Y', 'Land Vlbg.', 'Landesregierung Vlbg (Lehrer)', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( '9Z', 'ZAEK Vlb.', 'Landeszahnärztekammer Vlbg.', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'A0', 'BAK Öst.', 'Bundesarbeiterkammer', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'AD', 'Datenaust. AD', 'Andorra', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'AE', 'Wr.Ärztekammer', 'Ärztekammer Wien', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'AL', 'PRIKRAF', 'Privatkrankenanst.finanz.fonds', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'AN', 'ANKOE', 'Auftragnehmerkataster Österr.', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'AP', 'Apo.Verlag', 'Apotheker-Verlag', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'AT', 'Datenaust. AT', 'Datenaustausch mit Österreich', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'AU', 'Datenaust. AU', 'Datenaust. mit Australien', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'AW', 'AWS', 'Austria Wirtschaftsserv. GmbH', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'B ', 'I.N.A.M.I', 'Institut nat. d assurance mal.', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'B1', 'BVAEB-OEB W', 'BVAEB-Oeffentl. Bediensteter W', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'B4', 'BVAEB-OEB O', 'BVAEB-Oeffentl. Bediensteter O', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'B5', 'BVAEB-OEB St', 'BVAEB-Oeffentl. Bediensteter St', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'B6', 'BVAEB-OEB K', 'BVAEB-Oeffentl. Bediensteter K', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'B7', 'BVAEB-OEB S', 'BVAEB-Oeffentl. Bediensteter S', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'B8', 'BVAEB-OEB T', 'BVAEB-Oeffentl. Bediensteter T', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'B9', 'BVAEB-OEB V', 'BVAEB-Oeffentl. Bediensteter V', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'BA', 'Datenaust. BA', 'Bosnien-Herzegowina', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'BB', 'ÖBB Pens.Serv.', 'ÖBB Pensionsservice', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'BE', 'Datenaust. BE', 'Datenaustausch mit Belgien', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'BG', 'Datenaust. BG', 'Datenaust. mit Bulgarien', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'BH', 'Datenaust. BH', 'Vers.träger in Bosnien-H.', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'BL', 'IVFF', 'BMGF In-Vitro-Fertilis.-Fonds', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'BY', 'Datenaust. BY', 'Weißrussland', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'CA', 'Datenaust. CA', 'Datenaust. mit Kanada', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'CB', 'Chip-BE', 'Chip-BE', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'CH', 'Datenaust. CH', 'Datenaustausch mit der Schweiz', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'CS', 'Datenaust. CS', 'Serbien und Montenegro', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'CY', 'Datenaust. CY', 'Datenaust. mit Zypern', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'CZ', 'Datenaust. CZ', 'Datenaust. mit Tschech. Rep.', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'D1', 'BfA, Berlin', 'Bundesvers.Anstalt f.Ang.', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'D2', 'Seekasse', 'Seekasse-Hamburg', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'D3', 'AOK-Bundesverb', 'AOK-Bundesverb', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'D7', 'LVA Obb.', 'Landesvers.Anstalt Oberb.', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'D8', 'BBVA-Rosenheim', 'Bundesb.Vers.Anstalt Rosenh.', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'DA', 'DATAKOM', 'DATAKOM AUSTRIA GMBH', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'DE', 'Datenaust. DE', 'Datenaustausch mit Deutschland', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'DK', 'Datenaust. DK', 'Datenaustausch mit Dänemark', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'E ', 'I.N.S.S.', 'I.N.S.S.', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'ED', 'ELDA-O.Ö.GKK', 'ELDA-elektr. Datensammelsystem', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'EE', 'Datenaust. EE', 'Datenaust. mit Estland', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'EL', 'Datenaust. EL', 'Vers.träger in Griechenland', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'ES', 'Datenaust. ES', 'Datenaustausch mit Spanien', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'EV', 'STP eSV', 'STPelektr. Sozialversicherung', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'F ', 'C.S.S.T.M.', 'C.S.S.T.M.', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'FA', 'FA', 'Finanzämter', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'FB', 'Datenaust. FB', 'Vers.träger in Bosnien-H.', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'FI', 'Datenaust. FI', 'Datenaust. mit Finnland', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'FR', 'Datenaust. FR', 'Datenaustausch mit Frankreich', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'G1', 'M.T.Kaserne', 'Maria-Theresien-Kaserne', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'G2', 'Burst.Kaserne', 'Burstyn-Kaserne', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'G3', 'MILAK', 'Theres. Militärakademie', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'G4', 'Wallenst.Kas', 'Wallenstein Kaserne', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'G5', 'Langenlebarn', 'MKDO Langenlebarn', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'G6', 'Carl-Kaserne', 'Carl-Kaserne', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'G7', 'V-P-W Kaserne', 'Vega-Payer-Weyprecht-Kaserne', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'G8', 'Magdeb.Kas.', 'Magdeburg Kaserne', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'G9', 'MKDO Wien', 'Van-Swieten-Kaserne', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'GB', 'Datenaust. GB', 'Datenaust. mit Verein. Königr.', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'GG', 'GÖG', 'Gesundheit Österreich GmbH', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'GH', 'OGH', 'Oberster Gerichtshof', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'GR', 'I.K.A.', 'Datenaust. mit Griechenland', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'H ', 'Datenaust. H', 'Vers.träger in Ungarn', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'H1', 'MKDO NÖ', 'MKDO Niederösterreich', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'H2', 'MIKDO Wien', 'MKDO Wien', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'H3', 'Dabsch-Kaserne', 'Dabsch-Kaserne', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'H4', 'Martinkaserne', 'Martin-Kaserne', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'H5', 'Hinterstoisser', 'Kaserne Fh. Hinterstoisser', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'H6', 'Benedek-Kasern', 'Benedek-Kaserne', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'H7', 'Hörsching', 'Fliegerhorst Vogler', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'H8', 'Martinek Kas', 'Martinek-Kaserne', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'H9', 'Jansa-Kaserne', 'Jansa-Kaserne', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'HR', 'Datenaust. HR', 'Datenaust. mit Kroatien', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'HU', 'Datenaust. HU', 'Datenaust. mit Ungarn', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'I ', 'M.d.S.', 'M.d.S.', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'I0', 'SM_Serv.Zentr.', 'Sozialministeriumserv.Zentrale', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'I1', 'Bolfras', 'Bolfras-Kaserne', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'I2', 'Starhemberg-Ka', 'Starhemberg-Kaserne', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'I3', 'TurbaKas', 'Turba Kaserne', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'I4', 'JA Garsten', 'JA Garsten', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'I5', 'JA Eisenstadt', 'JA Eisenstadt', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'I6', 'JA Korneuburg', 'JA Korneuburg', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'I7', 'JA Mittersteig', 'JA Mittersteig', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'I8', 'JA Simmering', 'JA Simmering', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'I9', 'JA Josefstadt', 'JA Josefstadt', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'IE', 'Datenaust. IE', 'Datenaust. mit Irland', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'IF', 'Öst. Int.fonds', 'Österr. Integrationsfonds', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'IS', 'Datenaust. IS', 'Datenaust. mit Island', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'IT', 'Datenaust. IT', 'Datenaustausch mit Italien', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'J1', 'JUA Gerasdorf', 'Justizanst. Gerasdorf f. Jug.', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'J2', 'JUA Hirtenberg', 'Justizanstalt Hirtenberg', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'J3', 'JUA Krems', 'Justizanstalt Krems', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'J4', 'JUA Schwarzau', 'Justizanstalt Schwarzau', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'J5', 'JUA Sonnberg', 'Justizanstalt Sonnberg', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'J6', 'JUA St. Pölt.', 'Justizanstalt St. Pölten', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'J7', 'JUA Stein', 'Justizanstalt Stein', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'J8', 'JUA Wien-Fav.', 'Justizanstalt Wien-Favoriten', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'J9', 'JUA Wr. Neust.', 'Justizanstalt Wr. Neustadt', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'JF', 'Forens.Zentrum', 'Forensisches Zentrum Asten', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'JG', 'JA Göllersdorf', 'Justizanstalt Göllersdorf', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'JJ', 'JUA Wien-J.st.', 'Justizanstalt Wien-Josefstadt', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'JK', 'JA Karlau', 'Justizanstalt Graz-Karlau', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'JL', 'JUA Linz', 'Justizanstalt Linz', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'JS', 'JA Suben', 'Justizanstalt Suben', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'K1', 'LKF Wien', 'Wr.Krankenanst.Finanz.Fonds', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'K2', 'NÖGUS', 'Nö Gesundheits- u. Sozialfonds', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'K3', 'LKF Bgld.', 'Bgld.Krankenanst.Finanz.Fonds', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'K4', 'LKF O.Ö.', 'O.Ö. Krankenanst.Fonds', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'K5', 'LKF Stmk.', 'Stmk.Krankenanst.-Finanz.Fonds', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'K6', 'LKF Kärnten', 'Kärntner Krankenanstaltenfonds', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'K7', 'LKFSlbg.', 'Slbg.Krankenanst.-Finanz.Fonds', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'K8', 'LKF Tirol', 'Tir. Krankenanst.-Finanz.Fonds', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'K9', 'LKF Vlbg.', 'Vlbg. Spitalsfonds', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'KB', 'KIAB', 'K I A B', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'KG', 'KG-Fond', 'Kärntner Gesundheitsfond', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'KI', 'INVITFF', 'In-vitro-Fertilisations Fonds', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'KP', 'PRIKRAF', 'Priv.krankenanst.-Finanz.Fonds', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'KW', 'Wirtsch.treuh.', 'Kammer d.Wirtschaftstreuhänder', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'L ', 'C.N.A.M.O.', 'C.N.A.M.O.', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'L0', 'JA Ried', 'JA Ried', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'L1', 'JA Feldkirch', 'JA Feldkirch', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'L2', 'BPDWIEN', 'Bundespolizeidir. Wien', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'L3', 'MA 40', 'MA 40', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'L4', 'MA 15', 'MA 15', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'L5', 'Magistr.Dion', 'Magistr.Dion', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'L6', 'MA 11', 'MA 11', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'L7', 'MA 51', 'MA 51', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'L8', 'FSW', 'Fonds Soziales Wien', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'L9', 'MA 24', 'MA 24', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'LI', 'Datenaust. LI', 'Datenaust. mit Liechtenstein', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'LT', 'Datenaust. LT', 'Datenaust. mit Litauen', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'LU', 'Datenaust. LU', 'Datenaustausch mit Luxemburg', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'LV', 'Datenaust. LV', 'Datenaust. mit Lettland', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'M0', 'BH-Waidh./Th', 'BH Waidhofen/Thaya', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'M1', 'BH-Steyr', 'BH Steyr', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'M2', 'BH-Güssing', 'BH Güssing', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'M3', 'BH-Jennersdorf', 'BH Jennersdorf', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'M4', 'BH-Oberwart', 'BH Oberwart', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'M5', 'BH-Murtal', 'BH Murtal', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'M6', 'BH-Mattersburg', 'BH Mattersburg', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'M7', 'BH-Oberpulld.', 'BH Oberpullendorf', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'M8', 'BH-Linz-Land', 'BH Linz-Land', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'M9', 'BH-Grieskirch.', 'BH Grieskirchen', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'MA', 'Allianz', 'Allianz Vorsorgekasse AG', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'MB', 'APK VK AG', 'APK Vorsorgekasse AG', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'MC', 'BONUS VK AG', 'BONUS Vorsorgekasse AG', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'MD', 'NÖ VK AG', 'NÖ. Vorsorgekasse AG', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'ME', 'Valida Plus AG', 'Valida Plus AG', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'MF', 'Valida MVK AG', 'Valida MVK Plus AG', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'MG', 'VBV VK AG', 'VBV Vorsorgekasse AG', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'MH', 'Victoria VK', 'Victoria Volksb. Vorsorge AG', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'MI', 'fair finance', 'fair finance Vorsorgekasse AG', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'MJ', 'Merkur', 'Merkur Versicherung AG', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'MK', 'Datenaust. MK', 'Mazedonien', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'ML', 'BUAK Betr.VK', 'BUAK Betr. Vorsorgekasse GmbH', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'MO', 'Monopolverw.', 'Monopolverwaltung GMBH (Tabak)', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'MT', 'Datenaust. MT', 'Datenaust. mit Malta', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'MV', 'OMV AG', 'OMV Aktiengesellschaft', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'N0', 'BH-Wels-Land', 'BH Wels-Land', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'N1', 'BH-Deutschl.b.', 'BH Deutschlandsberg', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'N2', 'BH-Leoben', 'BH Leoben', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'N3', 'BH-Wolfsberg', 'BH Wolfsberg', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'N4', 'BH-Villach', 'BH Villach', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'N5', 'Mag.Villach', 'MA Villach', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'N6', 'BH-Zell/See', 'BH Zell/See', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'N7', 'MA Innsbruck', 'MA der Stadt Innsbruck', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'N8', 'BH-Kitzb.', 'BH Kitzbühel', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'N9', 'MA Wr.Neustadt', 'MA der Stadt Wiener Neustadt', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'NL', 'Datenaust. NL', 'Datenaust. mit Niederlande', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'NO', 'Datenaust. NO', 'Datenaust. mit Norwegen', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'NY', 'PST', 'Pseudonymisierungsstelle', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'NZ', 'Datenaust. NZ', 'Neuseeland', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'O0', 'LPDKAERNTEN', 'Landespolizeidirektion Kärnten', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'O1', 'BH-Schwechat', 'BH Schwechat', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'O2', 'LPDNÖ', 'Landespolizeidirektion NÖ', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'O3', 'Gr.Kreuz', 'Grünes Kreuz', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'O4', 'BH-Freistadt', 'BH Freistadt', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'O5', 'STDWELS', 'Stadtpolizeikommando Wels', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'O6', 'LPDTIROL', 'Landespolizeidirektion Tirol', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'O7', 'LPDOOE', 'Landespolizeidirektion OÖ', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'O8', 'LPDWien', 'Landespolizeidirektion Wien', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'O9', 'BFA WienDir', 'Bundesamt f. Fremdenw. u. Asyl', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'OA', 'Akad.d.Ärzte', 'Österr.Akademie d.Ärzte GmbH', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'OE', 'AGES, BA Ern.S', 'AGES, BA f. Ernährungssicherh.', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'OG', 'ÖG Gastr.u.Hep', 'Öst.Ges.f. Gastroent.u.Hepatol', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'OI', 'Med. Uni Graz', 'Med.Uni Graz-Inst.f.med.Inform', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'OM', 'ÖQMED', 'Ö.Ges.f.Qual.S.&-Mngm.id.Med.', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'OO', 'ÖRK OÖ', 'Ö. Rotes Kreuz - LV OÖ', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'OS', 'ÖRK STMK', 'Ö. Rotes Kreuz - LV STMK', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'P ', 'D.R.I.C.S.S.', 'D.R.I.C.S.S.', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'P1', 'Generali PK AG', 'Generali Pensionskasse AG', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'P2', 'Donau', 'Donau Allgemeine Vers.-AG', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'P3', 'OOE Vers.AG', 'Oberösterr. Versicherung AG', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'P4', 'Öst.Beamtenv.', 'Österr. Beamtenversicherung', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'P5', 'Raiffeisen AG', 'Raiffeisen-Versicherung AG', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'P6', 'Sparkassen AG', 'Sparkassen-Versicherung AG', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'P7', 'SV-Pens.K. AG', 'SV-Pensionskase AG', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'P8', 'Wr.Vers.Gr.', 'Vienna Insurance Group AG', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'P9', 'Generali AG', 'Generali Versicherung AG', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'PA', 'Allianz PK AG', 'Allianz Pensionskasse AG', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'PB', 'APK-Pensionsk.', 'APK-Pensionskasse AG', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'PC', 'VBV-Pensionsk.', 'VBV-Pensionskassen AG', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'PD', 'Valida Pens AG', 'Valida Pension AG', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'PE', 'Ver.Pensionsk.', 'Vereinigte Pensionskassen AG', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'PF', 'Vict.VB PK AG', 'Victoria-Volksbanken Pens.K.AG', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'PG', 'Pharm.Geh.K.', 'Pharmazeutische Gehaltskasse', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'PH', 'Bonus PK AG', 'Bonus Pensionskassen AG', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'PI', 'Bundes.Pens.K.', 'Bundespensionskasse AG', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'PJ', 'BMW Pens.K. AG', 'BMW Pensionskasse AG', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'PK', 'Fachverb.PK-en', 'Fachverband der Pensionskassen', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'PL', 'EVN-Pensionsk.', 'EVN-Pensionskasse AG', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'PM', 'IBM Pensionsk.', 'IBM Pensionskasse AG', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'PN', 'Pensionskasse', 'Porsche Pensionskasse AG', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'PO', 'Philips PK AG', 'Philips Pensionskasse AG', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'PP', 'Pensionskasse', 'Shell Austria Pensionskasse AG', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'PQ', 'Pensionskasse', 'Valida Industrie Pensionsk. AG', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'PR', 'Pensionskasse', 'Unilever Pensionskasse AG', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'PS', 'Pensionskasse', 'BAV Pensionskassen AG', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'PT', 'Datenaust. PT', 'Datenaustausch mit Portugal', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'PU', 'WK PK AG', 'Wirtschaftskammern Pens.K. AG', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'PV', 'Wüstenrot PKAG', 'Wüstenrot Pensionskasse AG', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'PW', 'Pens.I.Linz AG', 'Pensionsinstitut der Linz AG', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'PX', 'Stmk. Landesb.', 'Steiermärkische Landesbahnen', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'PY', 'Öst.Bundesf.AG', 'Österr.Bundesforste AG', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'PZ', 'TIKLI GmbH', 'Tirol Kliniken GmbH', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'Q0', 'BFA Wien', 'Bundesamt f. Fremdenw. u. Asyl', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'Q1', 'BFA NÖ', 'Bundesamt f. Fremdenw. u. Asyl', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'Q2', 'BFA BGLD', 'Bundesamt f. Fremdenw. u. Asyl', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'Q3', 'BFA STMK', 'Bundesamt f. Fremdenw. u. Asyl', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'Q4', 'BFA OOE', 'Bundesamt f. Fremdenw. u. Asyl', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'Q5', 'BFA SLZB', 'Bundesamt f. Fremdenw. u. Asyl', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'Q6', 'BFA KTN', 'Bundesamt f. Fremdenw. u. Asyl', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'Q7', 'A-Proksch-I', '1. Anton-Proksch-Institut', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'Q8', 'PAZ', 'Polizeianhaltezentrum', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'Q9', 'MilKdoST', 'Landwehr-Kaserne', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'R0', 'LWEGER', 'Labor für Path. Weger', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'R1', 'SMZ-OST', 'SMZ Ost', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'R2', 'KH Floridsd.', 'SMZ Floridsdorf', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'R3', 'Orth.Gersth.', 'Orthop. KH Gersthof', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'R4', 'SMZ-SÜD', 'SMZ Süd', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'R5', 'PWH Rudolfsh.', 'Pflegeheim Rudolfsheim', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'R6', 'KH Hietzing', 'KH Hietzing', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'R7', 'Rosenhügel', 'Neuro. Krankenhaus Rosenhügel', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'R8', 'Sophiensp.', 'SMZ Sophienspital', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'R9', 'Wilhelm.spital', 'Wilhelminenspital', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'RH', 'Rechnungshof', 'Rechnungshof', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'RO', 'Datenaust. RO', 'Datenaust. mit Rumänien', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'RS', 'Datenaust. RS', 'Vers.träger in Bosnien-H.', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'RU', 'Datenaust. RU', 'Russland', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'S0', 'Heeresspital', 'Heeresspital Wien', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'S1', 'försäkringsk.', 'Malmöhus läns allmänna', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'S2', 'O.Wagner Spita', 'SMZ Baumgartner Höhe', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'S3', 'AKH', 'Allgemeines Krankenhaus', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'S4', 'Herz Jesu', 'Herz Jesu Krankenhaus', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'S5', 'Hartmannspital', 'Hartmannspital', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'S6', 'Barmherz.Br.', 'KH der Barmherzigen Brüder', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'S7', 'Barmh.Schw.', 'KH der Barmherzigen Schwestern', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'S8', 'Göttl. Heiland', 'Krankhaus Göttlicher Heiland', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'S9', 'KH St. Elisab.', 'Krankenhaus Sankt Elisabeth', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'SE', 'Datenaust. SE', 'Datenaust. mit Schweden', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'SF', 'Datenaust. SF', 'Vers.träger in Finnland', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'SI', 'Datenaust. SI', 'Datenaust. mit Slowenien', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'SK', 'Datenaust. SK', 'Datenaust. mit Slowakei', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'SM', 'Datenaust. SM', 'San-Marino', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'ST', 'Stat.Austria', 'Statistik Austria', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'SU', 'Suchthilfe W', 'Suchthilfe Wien gemeinn. GmbH', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'SW', 'Soz./WBF', 'Sozial- u. Weiterbildungsfonds', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'T0', 'St.Josefs-KH', 'Sankt Josef-Krankenhaus', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'T1', 'Geriatrie WW', 'Geriatriezentrum am Wienerwald', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'T2', 'St.Anna', 'St. Anna Kinderspital', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'T3', 'San.Hera', 'Sanatorium Hera', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'T4', 'Evang.KH', 'Evangelisches Krankenhaus', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'T5', 'Rudolfstiftung', 'Krankenanstalt Rudolfstiftung', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'T6', 'Lorenz Böhler', 'UKH Lorenz Böhler', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'T7', 'Gold.Kreuz', 'Krankenanstalt Goldenes Kreuz', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'T8', 'Rudolfinerhaus', 'Privatklinik Rudolfinerhaus', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'T9', 'Priv.Klin.Döbl', 'Privatklinik Döbling', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'TK', 'Datenaust. TK', 'Vers.träger in Türkei', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'TR', 'S.S.K.', 'S.S.K.', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'U0', 'Priv.Klin.Jose', 'Privatklinik Josefstadt', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'U1', 'Paracelsusklin', 'Klinik Grinzingerberg', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'U2', 'UKH-Meidling', 'UKH Meidling', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'U3', 'KH Allentsteig', 'Landesklinikum Allentsteig', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'U4', 'KH Amstetten', 'Landesklinikum Amstetten', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'U5', 'KH Baden', 'Landesklinikum Baden', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'U6', 'KH Eggenburg', 'Psychosomat. Zentrum Eggenburg', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'U7', 'KH Gmünd', 'Landesklinikum Gmünd', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'U8', 'KH Hainburg', 'Landesklinikum Hainburg', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'U9', 'KH Hollabrunn', 'Landesklinikum Hollabrunn', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'UA', 'Datenaust. UA', 'Ukraine', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'UK', 'Datenaust. UK', 'Datenaust. mit Verein. Königr.', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'UQ', 'UNIQA Öster.', 'UNIQA Öster. Versicherungen AG', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'US', 'Datenaust. US', 'Datenaust. mit USA', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'V0', 'KH Horn', 'Landesklinikum Horn', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'V1', 'KH Klo.burg', 'Landesklinikum Klosterneuburg', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'V2', 'KH Korneuburg', 'Landesklinikum Korneuburg', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'V3', 'KH Krems/Donau', 'Landesklinikum Krems/Donau', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'V4', 'KH Lilienfeld', 'Landesklinikum Lilienfeld', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'V5', 'KH Melk', 'Landesklinikum Melk', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'V6', 'KH Mistelbach', 'Landesklinikum Weinviertel', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'V7', 'KH Mödling', 'Landesklinikum Mödling', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'V8', 'KH Neunkirchen', 'Krankenhaus Neunkirchen', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'V9', 'KH Scheibbs', 'Landesklinikum Scheibbs', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'VA', 'Datenaust. VA', 'Vatikan', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'VB', 'Volkskreditb.', 'Volkskreditbank AG Linz', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'VF', 'Verf.ger.hof', 'Verfassungsgerichtshof', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'VO', 'Volksanwaltsch', 'Volksanwaltschaft', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'VV', 'VV Österreichs', 'Verband d. Vers.unternehmen', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'VW', 'Verw.ger.hof', 'Verwaltungsgerichtshof', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'W0', 'KH St. Pölten', 'Landesklinikum St. Pölten', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'W1', 'KH Stockerau', 'Krankenhaus Stockerau', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'W2', 'LKH Tulln', 'Landesklinikum Tulln', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'W3', 'KH Waidh/Thaya', 'Landesklinikum Waidhofen/Thaya', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'W4', 'KH Waidh/Ybbs', 'Landesklinikum Waidhofen/Ybbs', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'W5', 'KH Wr.Neustadt', 'Landesklinikum Wr. Neustadt', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'W6', 'KH Zwettl', 'Landesklinikum Zwettl', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'W7', 'Speising', 'Orthopädisches Spital Speising', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'W8', 'RZ Laab/Walde', 'Rehab-Zentrum Laab im Walde', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'W9', 'San.Rekawinkel', 'Sanatorium Rekawinkel', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'WR', 'Wiener Städt.', 'Wiener Städtische Allg.Vers.AG', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'X1', 'BH Amstetten', 'BH Amstetten', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'X2', 'BH Baden', 'BH Baden', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'X3', 'BH Bruck/L.', 'BH Bruck an der Leitha', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'X4', 'BH Gänsernd.', 'BH Gänserndorf', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'X5', 'BH Gmünd', 'BH Gmünd', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'X6', 'BH Hollabrunn', 'BH Hollabrunn', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'X7', 'BH Horn', 'BH Horn', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'X8', 'BH Korneuburg', 'BH Korneuburg', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'X9', 'BH Krems', 'BH Krems', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'XA', 'BH Lilienfeld', 'BH Lilienfeld', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'XB', 'BH Melk', 'BH Melk', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'XC', 'BH Mistelbach', 'BH Mistelbach', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'XD', 'BH Mödling', 'BH Mödling', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'XE', 'BH Neunkirchen', 'BH Neunkirchen', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'XF', 'BH Scheibbs', 'BH Scheibbs', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'XG', 'BH St. Pölt.', 'BH St. Pölten', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'XH', 'BH Tulln', 'BH Tulln', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'XI', 'BH Wien-Umg.', 'BH Wien-Umgebung', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'XJ', 'BH Wr.Neustadt', 'BH Wiener Neustadt', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'XK', 'BH Zwettl', 'BH Zwettl', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'Y0', 'Pfl.Heim/Ybbs', 'Landespflegeheim Ybbs', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'Y1', 'Barm.Br/Eisens', 'KH der Barmherzigen Brüder', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'Y2', 'LKH Güssung', 'A.ö. KH Güssung', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'Y3', 'LKH Kittsee', 'A.ö. KH Kittsee', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'Y4', 'LKH Oberpullen', 'A.ö. KH Oberpullendorf', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'Y5', 'LKH Oberwart', 'A.ö. KH Oberwart', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'Y6', 'HKH', 'Hanusch-Krankenhaus', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'Y7', 'LK Hochegg', 'Landesklinikum Hochegg', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'Y8', 'Med.Univ.Innsb', 'Medizinische Univ. Innsbruck', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'Y9', 'KLWELSGR', 'Klinikum Wels-Grieskirchen', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'YU', 'S.Z.P.I.O.', 'S.Z.P.I.O.', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'YY', 'n. d. MST', 'nicht definierte meld. Stelle', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'Z1', 'LEA im HVB', 'LEA-Leistungserbr.anspr. HVB', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'Z2', 'HEMA in KGKK', 'HEMA - Heilmittelabrechnung', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'Z3', 'ALVA in TGKK', 'ALVA allg.Leist.Vertragsp.Abr.', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'Z4', 'LGKK', 'LGKK - Leistungswesen d. GKKs', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'Z5', 'PKV', 'PKV - Partnerkontenverwaltung', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'Z6', 'BEICON', 'BEICON - Beitragscontrolling', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'Z7', 'ALWE', 'ALWE-CC (AGH,LSDB,WEB)', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'ZA', 'AGH', 'AGH - Auftraggeberhaftung', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'ZB', 'STP BE', 'Standardprodukt BE', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'ZC', 'Hep-C Reg', 'Hepatitis C Register', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'ZD', 'DDSOL im HVB', 'Onlinepartner der DDS', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'ZE', 'EKO-BdB', 'Erstattungskodex-DB', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'ZF', 'STP FIWI', 'Standardprodukt FIWI', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'ZH', 'HONO im HVB', 'Zentrale Honorarordnung', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'ZK', 'KBG', 'KBG - Kind.Betr.Geld-CC', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'ZL', 'LIVE im HVB', 'Zentrale Leistungsinformation', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'ZM', 'STP MVB', 'Standardprodukt MVB', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'ZN', 'NOVA', 'NOVA - Neue Online VP-Abrechn.', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'ZP', 'ZPV im HVB', 'Zentrale Partnerverwaltung', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'ZR', 'REGO im HV', 'Zentrale REGO-Verarbeitung', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'ZU', 'TQL ZUP', 'Technischer Querlieger ZUP', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'ZX', 'UEBFA in SV', 'Übungsfirma in der SV', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );

INSERT
INTO focus_meldendestelle( meldendestelle, kurzbezeichnung, langbezeichnung, ersteller, erstell_ts, letztaend, letztaend_ts, updatecount )
VALUES ( 'ZZ', 'n. d. PVP', 'nicht definiertes Portal', 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 'FOCUS360', TO_DATE('01.08.2019', 'DD.MM.YYYY'), 0 );


COMMIT;
