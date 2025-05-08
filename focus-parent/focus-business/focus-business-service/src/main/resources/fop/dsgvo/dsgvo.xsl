<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:fo="http://www.w3.org/1999/XSL/Format" version="1.0">
  <xsl:output method="xml" version="1.0" omit-xml-declaration="no" indent="yes" />
  <xsl:attribute-set name="mainHeaderText">
	<xsl:attribute name="font-size">14pt</xsl:attribute>
	<xsl:attribute name="font-weight">bold</xsl:attribute>
	<xsl:attribute name="margin-bottom">28pt</xsl:attribute>
  </xsl:attribute-set>
  <xsl:attribute-set name="headerText">
	<xsl:attribute name="font-size">14pt</xsl:attribute>
	<xsl:attribute name="font-weight">bold</xsl:attribute>
	<xsl:attribute name="margin-top">14pt</xsl:attribute>
	<xsl:attribute name="margin-bottom">7pt</xsl:attribute>
	<xsl:attribute name="keep-with-next">always</xsl:attribute>
  </xsl:attribute-set>
  <xsl:attribute-set name="smallHeaderText">
	<xsl:attribute name="font-size">11pt</xsl:attribute>
	<xsl:attribute name="font-weight">bold</xsl:attribute>
	<xsl:attribute name="margin-top">11pt</xsl:attribute>
	<xsl:attribute name="margin-bottom">6pt</xsl:attribute>
  </xsl:attribute-set>
  <xsl:attribute-set name="errorText">
	<xsl:attribute name="color">red</xsl:attribute>
	<xsl:attribute name="font-style">italic</xsl:attribute>
	<xsl:attribute name="text-align">left</xsl:attribute>
	<xsl:attribute name="padding-bottom">14pt</xsl:attribute>
  </xsl:attribute-set>
  <xsl:attribute-set name="infoText">
	<xsl:attribute name="font-style">italic</xsl:attribute>
	<xsl:attribute name="text-align">left</xsl:attribute>
	<xsl:attribute name="margin-bottom">14pt</xsl:attribute>
  </xsl:attribute-set>
  <xsl:attribute-set name="labelStyle">
	<xsl:attribute name="font-weight">bold</xsl:attribute>
  </xsl:attribute-set>
  <xsl:attribute-set name="valueStyle"></xsl:attribute-set>
  <xsl:attribute-set name="emptyStyle">
	<xsl:attribute name="font-style">italic</xsl:attribute>
  </xsl:attribute-set>
  <xsl:attribute-set name="indentStyle">
	<xsl:attribute name="margin-left">0.6cm</xsl:attribute>
  </xsl:attribute-set>
  <xsl:attribute-set name="abkuerzungenHeaderText">
	<xsl:attribute name="font-size">11pt</xsl:attribute>
	<xsl:attribute name="font-weight">bold</xsl:attribute>
	<xsl:attribute name="margin-top">9pt</xsl:attribute>
  </xsl:attribute-set>
  <xsl:attribute-set name="abkuerzungenTable">
	<xsl:attribute name="table-layout">fixed</xsl:attribute>
	<xsl:attribute name="font-size">9pt</xsl:attribute>
	<xsl:attribute name="keep-together">always</xsl:attribute>
  </xsl:attribute-set>
  <xsl:attribute-set name="abkuerzungenTableRow">
	<xsl:attribute name="border-bottom">dotted 1pt black</xsl:attribute>
  </xsl:attribute-set>
  <xsl:decimal-format name="zahlenFormat" decimal-separator="," grouping-separator="." />
  <xsl:template match="dsgvoReport">
	<fo:root>
	  <fo:layout-master-set>
		<fo:simple-page-master master-name="simpleA4" page-height="29.7cm" page-width="21cm" margin-top="1cm" margin-bottom="1cm" margin-left="2.5cm" margin-right="2cm">
		  <!--fo:region-body margin-top="3.5cm" margin-bottom="2.0cm" /-->
		  <fo:region-body margin-top="2.5cm" margin-bottom="1cm" />
		  <fo:region-before extent="2.5cm" />
		  <fo:region-after extent="1cm" />
		</fo:simple-page-master>
	  </fo:layout-master-set>
	  <fo:page-sequence master-reference="simpleA4">
		<fo:static-content flow-name="xsl-region-before">
		  <fo:block></fo:block>
		</fo:static-content>
		<fo:flow flow-name="xsl-region-body" font-size="11pt">
		  <fo:block xsl:use-attribute-sets="mainHeaderText">
			Personenbezogene Daten
			<xsl:value-of select="stammdaten/nameOhneAnrede" />
		  </fo:block>
		  <xsl:call-template name="formatKeyValue">
			<xsl:with-param name="key" select="fachschluessel/fachschluesselArt" />
			<xsl:with-param name="value" select="fachschluessel/fachschluessel" />
		  </xsl:call-template>
		  <!-- Stammdaten - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -->
		  <fo:block xsl:use-attribute-sets="headerText">
			Stammdaten
		  </fo:block>
		  <xsl:choose>
			<xsl:when test="stammdatenError">
			  <fo:block xsl:use-attribute-sets="errorText">
				<xsl:value-of select="stammdatenError" />
			  </fo:block>
			</xsl:when>
			<xsl:otherwise>
			  <xsl:call-template name="formatKeyValue">
				<xsl:with-param name="key" select="'Name'" />
				<xsl:with-param name="value" select="stammdaten/nameOhneAnrede" />
			  </xsl:call-template>
			  <xsl:call-template name="formatKeyValue">
				<xsl:with-param name="key" select="'Geschlecht'" />
				<xsl:with-param name="value" select="stammdaten/geschlecht" />
			  </xsl:call-template>
			  <xsl:if test="stammdaten/geburtsDatum">
				<xsl:call-template name="formatKeyValue">
				  <xsl:with-param name="key" select="'Geburtsdatum'" />
				  <xsl:with-param name="value" select="stammdaten/geburtsDatum" />
				</xsl:call-template>
			  </xsl:if>
			  <xsl:call-template name="formatKeyValue">
				<xsl:with-param name="key" select="'Auskunftssperre'" />
				<xsl:with-param name="value" select="stammdaten/auskunftsSperre" />
			  </xsl:call-template>
			  <xsl:call-template name="formatKeyValue">
				<xsl:with-param name="key" select="'Gesetzlich vertreten'" />
				<xsl:with-param name="value" select="stammdaten/gesetzlichVertreten" />
			  </xsl:call-template>
			  <xsl:call-template name="formatKeyValue">
				<xsl:with-param name="key" select="'Zustimmung SUEN'" />
				<xsl:with-param name="value" select="stammdaten/zustimmungSuen" />
			  </xsl:call-template>
			</xsl:otherwise>
		  </xsl:choose>
		  <!-- Adressen - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -->
		  <xsl:choose>
			<xsl:when test="adressenError">
			  <fo:block xsl:use-attribute-sets="errorText">
				<xsl:value-of select="adressenError" />
			  </fo:block>
			</xsl:when>
			<xsl:otherwise>
			  <xsl:for-each select="adressen">
				<xsl:variable name="type" select="@xsi:type" />
				<xsl:choose>
				  <xsl:when test="$type='adresseAnschriftBTO'">
					<fo:block>
					  <xsl:call-template name="formatLabel">
						<xsl:with-param name="value" select="'Anschrift'" />
					  </xsl:call-template>
					</fo:block>
					<fo:block xsl:use-attribute-sets="indentStyle">
					  <fo:block>
						<xsl:call-template name="formatValue">
						  <xsl:with-param name="value" select="anschrift" />
						</xsl:call-template>
					  </fo:block>
					  <fo:block>
						<xsl:call-template name="formatValue">
						  <xsl:with-param name="value">
							<xsl:value-of select="plz" />&#160;<xsl:value-of select="ort" />
						  </xsl:with-param>
						</xsl:call-template>
					  </fo:block>
					</fo:block>
				  </xsl:when>
				  <xsl:when test="$type='kontaktTelefonBTO'">
					<xsl:call-template name="formatKeyValue">
					  <xsl:with-param name="key" select="'Telefon'" />
					  <xsl:with-param name="value" select="telefonNummer" />
					</xsl:call-template>
				  </xsl:when>
				  <xsl:when test="$type='kontaktEmailBTO'">
					<xsl:call-template name="formatKeyValue">
					  <xsl:with-param name="key" select="'E-Mail'" />
					  <xsl:with-param name="value" select="mailAdresse" />
					</xsl:call-template>
				  </xsl:when>
				  <xsl:when test="$type='geldadresseBTO'">
					<fo:block>
					  <xsl:call-template name="formatLabel">
						<xsl:with-param name="value">
						  <xsl:choose>
							<xsl:when test="verwendungsartKurz='HAUPT'">Haupt-Bankverbindung</xsl:when>
							<xsl:otherwise>Weitere Bankverbindung</xsl:otherwise>
						  </xsl:choose>
						</xsl:with-param>
					  </xsl:call-template>
					</fo:block>
					<fo:block xsl:use-attribute-sets="indentStyle">
					  <xsl:call-template name="formatKeyValue">
						<xsl:with-param name="key" select="'IBAN'" />
						<xsl:with-param name="value" select="iban" />
					  </xsl:call-template>
					  <xsl:call-template name="formatKeyValue">
						<xsl:with-param name="key" select="'BIC'" />
						<xsl:with-param name="value" select="bic" />
					  </xsl:call-template>
					</fo:block>
				  </xsl:when>
				</xsl:choose>
			  </xsl:for-each>
			</xsl:otherwise>
		  </xsl:choose>
		  <!-- Angehörige - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -->
		  <fo:block xsl:use-attribute-sets="headerText">
			Angehörige
		  </fo:block>
		  <xsl:choose>
			<xsl:when test="versicherteError">
			  <fo:block xsl:use-attribute-sets="errorText">
				<xsl:value-of select="versicherteError" />
			  </fo:block>
			</xsl:when>
			<xsl:when test="versicherte">
			  <xsl:call-template name="angehoerigeTemplate">
				<xsl:with-param name="angehoerige" select="versicherte" />
				<xsl:with-param name="typ" select="'Versicherte(r) Angehörige(r)'" />
			  </xsl:call-template>
			</xsl:when>
		  </xsl:choose>
		  <xsl:choose>
			<xsl:when test="angehoerigeError">
			  <fo:block xsl:use-attribute-sets="errorText">
				<xsl:value-of select="versicherteError" />
			  </fo:block>
			</xsl:when>
			<xsl:when test="angehoerige">
			  <xsl:call-template name="angehoerigeTemplate">
				<xsl:with-param name="angehoerige" select="angehoerige" />
				<xsl:with-param name="typ" select="'Angehörige(r)'" />
			  </xsl:call-template>
			</xsl:when>
		  </xsl:choose>
		  <xsl:if test="not(versicherte) and not(angehoerige) and not(versicherteError) and not(angehoerigeError)">
			<fo:block xsl:use-attribute-sets="infoText">
			  Keine Angehörigen gespeichert.
			</fo:block>
		  </xsl:if>
		  <!-- Ecard - - - - -->
		  <fo:block xsl:use-attribute-sets="headerText">
			ECard
		  </fo:block>
		  <xsl:choose>
			<xsl:when test="ecardError">
			  <fo:block xsl:use-attribute-sets="errorText">
				<xsl:value-of select="ecardError" />
			  </fo:block>
			</xsl:when>
			<xsl:otherwise>
			  <xsl:choose>
				<xsl:when test="ecard and ecard/laufnummer">
				  <xsl:call-template name="formatKeyValue">
					<xsl:with-param name="key" select="'Laufnummer'" />
					<xsl:with-param name="value" select="ecard/laufnummer" />
				  </xsl:call-template>
				  <xsl:call-template name="formatKeyValue">
					<xsl:with-param name="key" select="'Ausstellungsdatum'" />
					<xsl:with-param name="value" select="ecard/ausstellungsDatum" />
				  </xsl:call-template>
				  <xsl:call-template name="formatKeyValue">
					<xsl:with-param name="key" select="'Enddatum'" />
					<xsl:with-param name="value" select="ecard/endeDatum" />
				  </xsl:call-template>
				  <xsl:call-template name="formatKeyValue">
					<xsl:with-param name="key" select="'Letzte Konsultation'" />
					<xsl:with-param name="value" select="ecard/letzteKonsultation" />
				  </xsl:call-template>
				</xsl:when>
				<xsl:otherwise>
				  <fo:block xsl:use-attribute-sets="infoText">
					Keine eCard-Daten gespeichert.
				  </fo:block>
				</xsl:otherwise>
			  </xsl:choose>
			</xsl:otherwise>
		  </xsl:choose>
		  <!-- Gebührenbefreiung - - - - -->
		  <fo:block xsl:use-attribute-sets="headerText">
			Gebührenbefreiung
		  </fo:block>
		  <xsl:choose>
			<xsl:when test="gebuehrenbefreiungError">
			  <fo:block xsl:use-attribute-sets="errorText">
				<xsl:value-of select="gebuehrenbefreiungError" />
			  </fo:block>
			</xsl:when>
			<xsl:when test="gebuehrenbefreiung">
			  <xsl:for-each select="gebuehrenbefreiung">
				<fo:block xsl:use-attribute-sets="smallHeaderText">
				  <xsl:value-of select="befreiung" />
				</fo:block>
				<xsl:call-template name="formatKeyValue">
				  <xsl:with-param name="key" select="'Befreiungsgrund'" />
				  <xsl:with-param name="value" select="befreiungsgrund" />
				</xsl:call-template>
				<xsl:call-template name="formatKeyValue">
				  <xsl:with-param name="key" select="'Von'" />
				  <xsl:with-param name="value" select="vonDate" />
				</xsl:call-template>
				<xsl:call-template name="formatKeyValue">
				  <xsl:with-param name="key" select="'Bis'" />
				  <xsl:with-param name="value" select="bisDate" />
				</xsl:call-template>
			  </xsl:for-each>
			</xsl:when>
			<xsl:otherwise>
			  <fo:block xsl:use-attribute-sets="infoText">
				Keine Gebührenbefreiung gespeichert.
			  </fo:block>
			</xsl:otherwise>
		  </xsl:choose>
		  <!-- Leistungen - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -->
		  <fo:block xsl:use-attribute-sets="headerText">
			Leistungen
		  </fo:block>
		  <xsl:choose>
			<xsl:when test="leistungenError">
			  <fo:block xsl:use-attribute-sets="errorText">
				<xsl:value-of select="leistungenError" />
			  </fo:block>
			</xsl:when>
			<xsl:when test="leistungen">
			  <xsl:for-each select="leistungen">
				<xsl:for-each select="vwst">
				  <fo:block xsl:use-attribute-sets="smallHeaderText">
					Verwaltungsstellungnahme
				  </fo:block>
				  <xsl:call-template name="formatKeyValue">
					<xsl:with-param name="key" select="'Leistungstype'" />
					<xsl:with-param name="value" select="leistungsType" />
				  </xsl:call-template>
				  <xsl:call-template name="formatKeyValue">
					<xsl:with-param name="key" select="'Gueltig bis'" />
					<xsl:with-param name="value" select="gueltigBisDat" />
				  </xsl:call-template>
				</xsl:for-each>
				<fo:block xsl:use-attribute-sets="smallHeaderText">
				  Vorfallerhebung
				</fo:block>
				<xsl:call-template name="formatKeyValue">
				  <xsl:with-param name="key" select="'Eingelangt'" />
				  <xsl:with-param name="value" select="unfallerh/eingelagtDat" />
				</xsl:call-template>
				<xsl:call-template name="formatKeyValue">
				  <xsl:with-param name="key" select="'Erstellt'" />
				  <xsl:with-param name="value" select="unfallerh/erstellDat" />
				</xsl:call-template>
				<xsl:call-template name="formatKeyValue">
				  <xsl:with-param name="key" select="'Datum 1. Urgenz'" />
				  <xsl:with-param name="value" select="unfallerh/urgenz1Dat" />
				</xsl:call-template>
				<xsl:call-template name="formatKeyValue">
				  <xsl:with-param name="key" select="'Datum 2. Urgenz'" />
				  <xsl:with-param name="value" select="unfallerh/urgenz2Dat" />
				</xsl:call-template>
				<fo:block xsl:use-attribute-sets="smallHeaderText">
				  elektronisches Kommunikationsservice (eKOS)
				</fo:block>
				<xsl:call-template name="formatKeyValue">
				  <xsl:with-param name="key" select="'Eingelangt'" />
				  <xsl:with-param name="value" select="ekos/eingelangtDat" />
				</xsl:call-template>
				<xsl:call-template name="formatKeyValue">
				  <xsl:with-param name="key" select="'Antrag-Status'" />
				  <xsl:with-param name="value" select="ekos/antragStatus" />
				</xsl:call-template>
				<xsl:for-each select="medSt">
				  <fo:block xsl:use-attribute-sets="smallHeaderText">
					Medizinische Stellungnahme
				  </fo:block>
				  <xsl:call-template name="formatKeyValue">
					<xsl:with-param name="key" select="'Gültig bis'" />
					<xsl:with-param name="value" select="gueltigBisDat" />
				  </xsl:call-template>
				  <xsl:call-template name="formatKeyValue">
					<xsl:with-param name="key" select="'Leistungsgebiet'" />
					<xsl:with-param name="value" select="lgebiet" />
				  </xsl:call-template>
				  <xsl:call-template name="formatKeyValue">
					<xsl:with-param name="key" select="'Stellungnahme'" />
					<xsl:with-param name="value" select="stellungnahme" />
				  </xsl:call-template>
				</xsl:for-each>
				<fo:block xsl:use-attribute-sets="smallHeaderText">
				  Transporte
				</fo:block>
				<xsl:call-template name="formatKeyValue">
				  <xsl:with-param name="key" select="'Transport-Datum'" />
				  <xsl:with-param name="value" select="frt/transportDat" />
				</xsl:call-template>
				<xsl:call-template name="formatKeyValue">
				  <xsl:with-param name="key" select="'Status'" />
				  <xsl:with-param name="value" select="frt/status" />
				</xsl:call-template>
				<fo:block xsl:use-attribute-sets="smallHeaderText">
				  Wahlzahnarzt-Kostenübernahme
				</fo:block>
				<xsl:call-template name="formatKeyValue">
				  <xsl:with-param name="key" select="'Antragsdatum'" />
				  <xsl:with-param name="value" select="wazaKo/antragDat" />
				</xsl:call-template>
				<xsl:call-template name="formatKeyValue">
				  <xsl:with-param name="key" select="'Status'" />
				  <xsl:with-param name="value" select="wazaKo/status" />
				</xsl:call-template>
				<fo:block xsl:use-attribute-sets="smallHeaderText">
				  Arbeitsunfähigkeit / Mutterschaftshilfe / Rehabilitationsgeld / Wiedereingliederungsgeld (letzter Eintrag)
				</fo:block>
				<xsl:call-template name="formatKeyValue">
				  <xsl:with-param name="key" select="'Leistungsgebiet'" />
				  <xsl:with-param name="value" select="auMhRgWeg/lgebiet" />
				</xsl:call-template>
				<xsl:call-template name="formatKeyValue">
				  <xsl:with-param name="key" select="'Anweisungsdatum'" />
				  <xsl:with-param name="value" select="auMhRgWeg/anweisungDat" />
				</xsl:call-template>
				<xsl:call-template name="formatKeyValue">
				  <xsl:with-param name="key" select="'Leistungs-von-Datum'" />
				  <xsl:with-param name="value" select="auMhRgWeg/lvonDat" />
				</xsl:call-template>
				<xsl:call-template name="formatKeyValue">
				  <xsl:with-param name="key" select="'Leistungs-bis-Datum'" />
				  <xsl:with-param name="value" select="auMhRgWeg/lbisDat" />
				</xsl:call-template>
				<fo:block xsl:use-attribute-sets="smallHeaderText">
				  Krankenhausaufenthalt
				</fo:block>
				<xsl:call-template name="formatKeyValue">
				  <xsl:with-param name="key" select="'Aufnahmeart'" />
				  <xsl:with-param name="value" select="kh/aufnahmeArt" />
				</xsl:call-template>
				<xsl:call-template name="formatKeyValue">
				  <xsl:with-param name="key" select="'Leistungserbringer-Name'" />
				  <xsl:with-param name="value" select="kh/leName" />
				</xsl:call-template>
				<xsl:call-template name="formatKeyValue">
				  <xsl:with-param name="key" select="'Leistungs-von-Datum'" />
				  <xsl:with-param name="value" select="kh/lvonDat" />
				</xsl:call-template>
				<xsl:call-template name="formatKeyValue">
				  <xsl:with-param name="key" select="'Leistungs-bis-Datum'" />
				  <xsl:with-param name="value" select="kh/lbisDat" />
				</xsl:call-template>
				<xsl:call-template name="formatKeyValue">
				  <xsl:with-param name="key" select="'Vertragspartnernummer'" />
				  <xsl:with-param name="value" select="kh/vpnr" />
				</xsl:call-template>
				<fo:block xsl:use-attribute-sets="smallHeaderText">
				  Wahlarzt/Wahlzahnarzt
				</fo:block>
				<xsl:call-template name="formatKeyValue">
				  <xsl:with-param name="key" select="'Behandlungsdatum'" />
				  <xsl:with-param name="value" select="wahWaza/behDat" />
				</xsl:call-template>
				<xsl:call-template name="formatKeyValue">
				  <xsl:with-param name="key" select="'Leistungsgebiet'" />
				  <xsl:with-param name="value" select="wahWaza/lgebiet" />
				</xsl:call-template>
				<xsl:call-template name="formatKeyValue">
				  <xsl:with-param name="key" select="'Status'" />
				  <xsl:with-param name="value" select="wahWaza/status" />
				</xsl:call-template>
				<fo:block xsl:use-attribute-sets="smallHeaderText">
				  Lohnpfändung
				</fo:block>
				<xsl:call-template name="formatKeyValue">
				  <xsl:with-param name="key" select="'Lohnpfändung'" />
				  <xsl:with-param name="value" select="lohnpf/lohnpfaendung" />
				</xsl:call-template>
				<xsl:for-each select="betreute">
				  <fo:block xsl:use-attribute-sets="smallHeaderText">
					Betreuungszeit
				  </fo:block>
				  <xsl:call-template name="formatKeyValue">
					<xsl:with-param name="key" select="'Von-Datum'" />
					<xsl:with-param name="value" select="betreuungVon" />
				  </xsl:call-template>
				  <xsl:call-template name="formatKeyValue">
					<xsl:with-param name="key" select="'Bis-Datum'" />
					<xsl:with-param name="value" select="betreuungBis" />
				  </xsl:call-template>
				  <xsl:call-template name="formatKeyValue">
					<xsl:with-param name="type" select="'LANDESSTELLE'" />
					<xsl:with-param name="key" select="'Landesstelle'" />
					<xsl:with-param name="value" select="landesstelle" />
				  </xsl:call-template>
				  <xsl:call-template name="formatKeyValue">
					<xsl:with-param name="key" select="'Status'" />
					<xsl:with-param name="value" select="status" />
				  </xsl:call-template>
				</xsl:for-each>
			  </xsl:for-each>
			</xsl:when>
			<xsl:otherwise>
			  <fo:block xsl:use-attribute-sets="infoText">
				Keine Leistungen gespeichert.
			  </fo:block>
			</xsl:otherwise>
		  </xsl:choose>
		  <xsl:call-template name="abkuerzungen" />
		</fo:flow>
	  </fo:page-sequence>
	</fo:root>
  </xsl:template>
  <xsl:template name="angehoerigeTemplate">
	<xsl:param name="angehoerige" />
	<xsl:param name="typ" />
	<xsl:for-each select="$angehoerige">
	  <fo:block xsl:use-attribute-sets="smallHeaderText">
		<xsl:value-of select="$typ" />
	  </fo:block>
	  <xsl:call-template name="formatKeyValue">
		<xsl:with-param name="key" select="'Name'" />
		<xsl:with-param name="value">
		  <xsl:value-of select="vorname" />&#160;<xsl:value-of select="nachname" />
		</xsl:with-param>
	  </xsl:call-template>
	  <xsl:call-template name="formatKeyValue">
		<xsl:with-param name="key" select="'Typ'" />
		<xsl:with-param name="value" select="typ" />
	  </xsl:call-template>
	  <xsl:call-template name="formatKeyValue">
		<xsl:with-param name="key" select="'Versicherungsnummer'" />
		<xsl:with-param name="value" select="versicherungsnummer" />
	  </xsl:call-template>
	  <xsl:call-template name="formatKeyValue">
		<xsl:with-param name="key" select="'Gültig von'" />
		<xsl:with-param name="value" select="gueltigVon" />
	  </xsl:call-template>
	  <xsl:call-template name="formatKeyValue">
		<xsl:with-param name="key" select="'Gültig bis'" />
		<xsl:with-param name="value" select="gueltigBis" />
	  </xsl:call-template>
	  <xsl:call-template name="formatKeyValue">
		<xsl:with-param name="key" select="'Anspruchsprüfung'" />
		<xsl:with-param name="value" select="anspruchspruefung" />
	  </xsl:call-template>
	  <xsl:call-template name="formatKeyValue">
		<xsl:with-param name="key" select="'Meldende Stelle'" />
		<xsl:with-param name="value" select="meldendeStelle" />
	  </xsl:call-template>
	</xsl:for-each>
  </xsl:template>
  <xsl:template name="formatKeyValue">
	<xsl:param name="type" select="'STANDARD'" />
	<xsl:param name="key" />
	<xsl:param name="value" />
	<xsl:param name="showEmptyEntry" select="true()" />
	<xsl:if test="($value and $value!='') or $showEmptyEntry">
	  <fo:block>
		<xsl:call-template name="formatLabel">
		  <xsl:with-param name="value" select="$key" />
		</xsl:call-template>
		<xsl:call-template name="formatValue">
		  <xsl:with-param name="type" select="$type" />
		  <xsl:with-param name="value" select="$value" />
		</xsl:call-template>
	  </fo:block>
	</xsl:if>
  </xsl:template>
  <xsl:template name="formatLabel">
	<xsl:param name="value" />
	<fo:inline xsl:use-attribute-sets="labelStyle">
	  <xsl:choose>
		<xsl:when test="$value='VSNR'">Versicherungsnummer</xsl:when>
		<xsl:when test="$value='BTNR'">Betreutennummer</xsl:when>
		<xsl:when test="$value='DGNR'">Dienstgebernummer</xsl:when>
		<xsl:otherwise>
		  <xsl:value-of select="$value" />
		</xsl:otherwise>
	  </xsl:choose>
	  :
	</fo:inline>
  </xsl:template>
  <xsl:template name="formatValue">
	<xsl:param name="type" select="'STANDARD'" />
	<xsl:param name="value" />
	<xsl:choose>
	  <xsl:when test="not($value) or $value=''">
		<fo:inline xsl:use-attribute-sets="emptyStyle">(leer)</fo:inline>
	  </xsl:when>
	  <xsl:when test="$type='FACHSCHLUESSEL_ART'">
		<fo:inline xsl:use-attribute-sets="valueStyle">
		  <xsl:choose>
			<xsl:when test="$value='VSNR'">Versicherungsnummer</xsl:when>
			<xsl:when test="$value='BTNR'">Betreutennummer</xsl:when>
			<xsl:when test="$value='DGNR'">Dienstgebernummer</xsl:when>
			<xsl:otherwise>
			  <xsl:value-of select="$value" />
			</xsl:otherwise>
		  </xsl:choose>
		</fo:inline>
	  </xsl:when>
	  <xsl:when test="$type='LANDESSTELLE'">
		<fo:inline xsl:use-attribute-sets="valueStyle">
		  <xsl:choose>
			<xsl:when test="$value='00'">Niederösterreich</xsl:when><!-- TODO -->
			<xsl:otherwise>
			  <xsl:value-of select="$value" />
			</xsl:otherwise>
		  </xsl:choose>
		</fo:inline>
	  </xsl:when>
	  <xsl:otherwise>
		<fo:inline xsl:use-attribute-sets="valueStyle">
		  <xsl:choose>
			<xsl:when test="not($value) or $value=''">
			  <fo:inline xsl:use-attribute-sets="emptyStyle">(leer)</fo:inline>
			</xsl:when>
			<xsl:when test="$value='true'">Ja</xsl:when>
			<xsl:when test="$value='false'">Nein</xsl:when>
			<xsl:when test="$value='W'">weiblich</xsl:when>
			<xsl:when test="$value='M'">männlich</xsl:when>
			<xsl:when test="$value='Ehegatte'">Ehegatte/Ehegattin</xsl:when>
			<xsl:otherwise>
			  <xsl:value-of select="$value" />
			</xsl:otherwise>
		  </xsl:choose>
		</fo:inline>
	  </xsl:otherwise>
	</xsl:choose>
  </xsl:template>
  <xsl:template mode="content" name="abkuerzungen">
	<fo:block xsl:use-attribute-sets="headerText">
	  Abkürzungsverzeichnis
	</fo:block>
	<fo:table xsl:use-attribute-sets="abkuerzungenTable">
	  <fo:table-column column-width="proportional-column-width(1)" />
	  <fo:table-column column-width="proportional-column-width(2)" />
	  <fo:table-header>
		<fo:table-row xsl:use-attribute-sets="abkuerzungenTableRow">
		  <fo:table-cell>
			<fo:block xsl:use-attribute-sets="abkuerzungenHeaderText">
			  Abkürzung
			</fo:block>
		  </fo:table-cell>
		  <fo:table-cell>
			<fo:block xsl:use-attribute-sets="abkuerzungenHeaderText">
			  Langbezeichnung
			</fo:block>
		  </fo:table-cell>
		</fo:table-row>
	  </fo:table-header>
	  <fo:table-body>
		<fo:table-row xsl:use-attribute-sets="abkuerzungenTableRow">
		  <fo:table-cell>
			<fo:block>
			  ALLE LGEB
			</fo:block>
		  </fo:table-cell>
		  <fo:table-cell>
			<fo:block>
			  Alle Leistungsgebiete
			</fo:block>
		  </fo:table-cell>
		</fo:table-row>
		<fo:table-row xsl:use-attribute-sets="abkuerzungenTableRow">
		  <fo:table-cell>
			<fo:block>
			  AU
			</fo:block>
		  </fo:table-cell>
		  <fo:table-cell>
			<fo:block>
			  Arbeitsunfähigkeit
			</fo:block>
		  </fo:table-cell>
		</fo:table-row>
		<fo:table-row xsl:use-attribute-sets="abkuerzungenTableRow">
		  <fo:table-cell>
			<fo:block>
			  MH
			</fo:block>
		  </fo:table-cell>
		  <fo:table-cell>
			<fo:block>
			  Mutterschaftshilfe
			</fo:block>
		  </fo:table-cell>
		</fo:table-row>
		<fo:table-row xsl:use-attribute-sets="abkuerzungenTableRow">
		  <fo:table-cell>
			<fo:block>
			  KAST-KO
			</fo:block>
		  </fo:table-cell>
		  <fo:table-cell>
			<fo:block>
			  Krankenhausaufenth. stat. Kostenzusich.
			</fo:block>
		  </fo:table-cell>
		</fo:table-row>
		<fo:table-row xsl:use-attribute-sets="abkuerzungenTableRow">
		  <fo:table-cell>
			<fo:block>
			  FRT
			</fo:block>
		  </fo:table-cell>
		  <fo:table-cell>
			<fo:block>
			  Fahrt-, Reise- und Transportkosten
			</fo:block>
		  </fo:table-cell>
		</fo:table-row>
		<fo:table-row xsl:use-attribute-sets="abkuerzungenTableRow">
		  <fo:table-cell>
			<fo:block>
			  KAST-KE
			</fo:block>
		  </fo:table-cell>
		  <fo:table-cell>
			<fo:block>
			  Krankenhausaufenthalt stat. Kostenerstatt.
			</fo:block>
		  </fo:table-cell>
		</fo:table-row>
		<fo:table-row xsl:use-attribute-sets="abkuerzungenTableRow">
		  <fo:table-cell>
			<fo:block>
			  GF/REHAST-KE
			</fo:block>
		  </fo:table-cell>
		  <fo:table-cell>
			<fo:block>
			  Gesundheitsförd./Reha Kostenerstatt.
			</fo:block>
		  </fo:table-cell>
		</fo:table-row>
		<fo:table-row xsl:use-attribute-sets="abkuerzungenTableRow">
		  <fo:table-cell>
			<fo:block>
			  AoA
			</fo:block>
		  </fo:table-cell>
		  <fo:table-cell>
			<fo:block>
			  Anw. ohne Anspruchsprüfung
			</fo:block>
		  </fo:table-cell>
		</fo:table-row>
		<fo:table-row xsl:use-attribute-sets="abkuerzungenTableRow">
		  <fo:table-cell>
			<fo:block>
			  UFONDS
			</fo:block>
		  </fo:table-cell>
		  <fo:table-cell>
			<fo:block>
			  Unterstützungsfonds
			</fo:block>
		  </fo:table-cell>
		</fo:table-row>
		<fo:table-row xsl:use-attribute-sets="abkuerzungenTableRow">
		  <fo:table-cell>
			<fo:block>
			  SONST-KE
			</fo:block>
		  </fo:table-cell>
		  <fo:table-cell>
			<fo:block>
			  Sonstige Kostenerstattung
			</fo:block>
		  </fo:table-cell>
		</fo:table-row>
		<fo:table-row xsl:use-attribute-sets="abkuerzungenTableRow">
		  <fo:table-cell>
			<fo:block>
			  HBHM
			</fo:block>
		  </fo:table-cell>
		  <fo:table-cell>
			<fo:block>
			  Heilbehelfe/Hilfsmittel
			</fo:block>
		  </fo:table-cell>
		</fo:table-row>
		<fo:table-row xsl:use-attribute-sets="abkuerzungenTableRow">
		  <fo:table-cell>
			<fo:block>
			  WAH-KE
			</fo:block>
		  </fo:table-cell>
		  <fo:table-cell>
			<fo:block>
			  Wahlarzthilfe Kostenerstattung
			</fo:block>
		  </fo:table-cell>
		</fo:table-row>
		<fo:table-row xsl:use-attribute-sets="abkuerzungenTableRow">
		  <fo:table-cell>
			<fo:block>
			  WAZA-KE
			</fo:block>
		  </fo:table-cell>
		  <fo:table-cell>
			<fo:block>
			  Wahlzahnarzt Kostenerstattung
			</fo:block>
		  </fo:table-cell>
		</fo:table-row>
		<fo:table-row xsl:use-attribute-sets="abkuerzungenTableRow">
		  <fo:table-cell>
			<fo:block>
			  WAZA-KO
			</fo:block>
		  </fo:table-cell>
		  <fo:table-cell>
			<fo:block>
			  Wahlzahnarzt Kostenzusicherung
			</fo:block>
		  </fo:table-cell>
		</fo:table-row>
		<fo:table-row xsl:use-attribute-sets="abkuerzungenTableRow">
		  <fo:table-cell>
			<fo:block>
			  KRK
			</fo:block>
		  </fo:table-cell>
		  <fo:table-cell>
			<fo:block>
			  Krankenkontrolle
			</fo:block>
		  </fo:table-cell>
		</fo:table-row>
		<fo:table-row xsl:use-attribute-sets="abkuerzungenTableRow">
		  <fo:table-cell>
			<fo:block>
			  KAAMB-KO
			</fo:block>
		  </fo:table-cell>
		  <fo:table-cell>
			<fo:block>
			  Krankenhausaufenth. amb. Kostenzusich.
			</fo:block>
		  </fo:table-cell>
		</fo:table-row>
		<fo:table-row xsl:use-attribute-sets="abkuerzungenTableRow">
		  <fo:table-cell>
			<fo:block>
			  GF/REHAST-KO
			</fo:block>
		  </fo:table-cell>
		  <fo:table-cell>
			<fo:block>
			  Gesundheitsförd./Reha Kostenzusicherung
			</fo:block>
		  </fo:table-cell>
		</fo:table-row>
		<fo:table-row xsl:use-attribute-sets="abkuerzungenTableRow">
		  <fo:table-cell>
			<fo:block>
			  VZA-KO
			</fo:block>
		  </fo:table-cell>
		  <fo:table-cell>
			<fo:block>
			  Vertragszahnarzt Kostenzusicherung
			</fo:block>
		  </fo:table-cell>
		</fo:table-row>
		<fo:table-row xsl:use-attribute-sets="abkuerzungenTableRow">
		  <fo:table-cell>
			<fo:block>
			  RÖK-KO
			</fo:block>
		  </fo:table-cell>
		  <fo:table-cell>
			<fo:block>
			  Richtlinien ökonomische Verschreibungsweise
			</fo:block>
		  </fo:table-cell>
		</fo:table-row>
		<fo:table-row xsl:use-attribute-sets="abkuerzungenTableRow">
		  <fo:table-cell>
			<fo:block>
			  PARTNER
			</fo:block>
		  </fo:table-cell>
		  <fo:table-cell>
			<fo:block>
			  Partnerverwaltung
			</fo:block>
		  </fo:table-cell>
		</fo:table-row>
		<fo:table-row xsl:use-attribute-sets="abkuerzungenTableRow">
		  <fo:table-cell>
			<fo:block>
			  F/G
			</fo:block>
		  </fo:table-cell>
		  <fo:table-cell>
			<fo:block>
			  Forderung/Guthaben
			</fo:block>
		  </fo:table-cell>
		</fo:table-row>
		<fo:table-row xsl:use-attribute-sets="abkuerzungenTableRow">
		  <fo:table-cell>
			<fo:block>
			  LOHNPFÄNDUNG
			</fo:block>
		  </fo:table-cell>
		  <fo:table-cell>
			<fo:block>
			  Lohnpfändung
			</fo:block>
		  </fo:table-cell>
		</fo:table-row>
		<fo:table-row xsl:use-attribute-sets="abkuerzungenTableRow">
		  <fo:table-cell>
			<fo:block>
			  FREMDLEIST
			</fo:block>
		  </fo:table-cell>
		  <fo:table-cell>
			<fo:block>
			  Fremdleistung
			</fo:block>
		  </fo:table-cell>
		</fo:table-row>
		<fo:table-row xsl:use-attribute-sets="abkuerzungenTableRow">
		  <fo:table-cell>
			<fo:block>
			  TERMIN
			</fo:block>
		  </fo:table-cell>
		  <fo:table-cell>
			<fo:block>
			  Terminverwaltung
			</fo:block>
		  </fo:table-cell>
		</fo:table-row>
		<fo:table-row xsl:use-attribute-sets="abkuerzungenTableRow">
		  <fo:table-cell>
			<fo:block>
			  SAMM-ANW
			</fo:block>
		  </fo:table-cell>
		  <fo:table-cell>
			<fo:block>
			  Sammelanweisung
			</fo:block>
		  </fo:table-cell>
		</fo:table-row>
		<fo:table-row xsl:use-attribute-sets="abkuerzungenTableRow">
		  <fo:table-cell>
			<fo:block>
			  SUEN
			</fo:block>
		  </fo:table-cell>
		  <fo:table-cell>
			<fo:block>
			  Sichere Übertragung von Nachrichten
			</fo:block>
		  </fo:table-cell>
		</fo:table-row>
		<fo:table-row xsl:use-attribute-sets="abkuerzungenTableRow">
		  <fo:table-cell>
			<fo:block>
			  LKM
			</fo:block>
		  </fo:table-cell>
		  <fo:table-cell>
			<fo:block>
			  Lohnkontenmeldung
			</fo:block>
		  </fo:table-cell>
		</fo:table-row>
		<fo:table-row xsl:use-attribute-sets="abkuerzungenTableRow">
		  <fo:table-cell>
			<fo:block>
			  LPRÜFUNG
			</fo:block>
		  </fo:table-cell>
		  <fo:table-cell>
			<fo:block>
			  Leistungsprüfung
			</fo:block>
		  </fo:table-cell>
		</fo:table-row>
		<fo:table-row xsl:use-attribute-sets="abkuerzungenTableRow">
		  <fo:table-cell>
			<fo:block>
			  KUND-KONT
			</fo:block>
		  </fo:table-cell>
		  <fo:table-cell>
			<fo:block>
			  Kunden Kontakte
			</fo:block>
		  </fo:table-cell>
		</fo:table-row>
	  </fo:table-body>
	</fo:table>
  </xsl:template>
</xsl:stylesheet>
