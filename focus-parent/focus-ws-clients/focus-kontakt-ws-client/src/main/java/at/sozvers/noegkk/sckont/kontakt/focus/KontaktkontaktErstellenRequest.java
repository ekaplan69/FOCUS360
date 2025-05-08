package at.sozvers.noegkk.sckont.kontakt.focus;

import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für kontaktkontaktErstellenRequest complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="kontaktkontaktErstellenRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://focus.kontakt.sckont.noegkk.sozvers.at/}standardRequest">
 *       &lt;sequence>
 *         &lt;element name="abschlussartId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="agd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="agdFachschluessel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="agdName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="anmerkung" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="aufgabengebietId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="bundesland" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endeTs" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="externeGewalt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fachschluessel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fachschluesselArtKurz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fremdsystemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fremdsystemName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gemeinde" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gemeindeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="kontaktartId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="mitarbeiterName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mitarbeiterOe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mitarbeiterkennung" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nacherfassenGrund" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="nacherfassenText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ort" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="plz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="polBezirk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scIdMa" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="staatIsoa3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startTs" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="subAufgabengebietId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="themaId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="unterthemaId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="kontaktkontaktErstellenRequest",
		 propOrder={"abschlussartId", "agd", "agdFachschluessel", "agdName", "anmerkung", "aufgabengebietId", "bundesland", "externeGewalt", "fachschluessel", "fachschluesselArtKurz", "fremdsystemId",
				 "fremdsystemName", "gemeinde", "gemeindeCode", "kontaktartId", "mitarbeiterName", "mitarbeiterOe", "mitarbeiterkennung", "nacherfassenGrund", "nacherfassenText", "name", "ort", "plz",
				 "polBezirk", "scIdMa", "staatIsoa3", "subAufgabengebietId", "themaId", "unterthemaId"})
public class KontaktkontaktErstellenRequest extends StandardRequest {

  protected Long   abschlussartId;
  protected String agd;
  protected String agdFachschluessel;
  protected String agdName;
  protected String anmerkung;
  protected Long   aufgabengebietId;
  protected String bundesland;
  protected String externeGewalt;
  protected String fachschluessel;
  protected String fachschluesselArtKurz;
  protected String fremdsystemId;
  protected String fremdsystemName;
  protected String gemeinde;
  protected String gemeindeCode;
  protected Long   kontaktartId;
  @XmlElement(required=true)
  protected String mitarbeiterName;
  protected String mitarbeiterOe;
  @XmlElement(required=true)
  protected String mitarbeiterkennung;
  protected Long   nacherfassenGrund;
  protected String nacherfassenText;
  protected String name;
  protected String ort;
  protected String plz;
  protected String polBezirk;
  protected Long   scIdMa;
  protected String staatIsoa3;
  protected Long   subAufgabengebietId;
  protected Long   themaId;
  protected Long   unterthemaId;

  /**
   * Ruft den Wert der abschlussartId-Eigenschaft ab.
   *
   * @return possible object is {@link Long }
   */
  public Long getAbschlussartId() {
	return abschlussartId;
  }

  /**
   * Legt den Wert der abschlussartId-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link Long }
   */
  public void setAbschlussartId(Long value) {
	this.abschlussartId = value;
  }

  /**
   * Ruft den Wert der agd-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getAgd() {
	return agd;
  }

  /**
   * Legt den Wert der agd-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setAgd(String value) {
	this.agd = value;
  }

  /**
   * Ruft den Wert der agdFachschluessel-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getAgdFachschluessel() {
	return agdFachschluessel;
  }

  /**
   * Legt den Wert der agdFachschluessel-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setAgdFachschluessel(String value) {
	this.agdFachschluessel = value;
  }

  /**
   * Ruft den Wert der agdName-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getAgdName() {
	return agdName;
  }

  /**
   * Legt den Wert der agdName-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setAgdName(String value) {
	this.agdName = value;
  }

  /**
   * Ruft den Wert der anmerkung-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getAnmerkung() {
	return anmerkung;
  }

  /**
   * Legt den Wert der anmerkung-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setAnmerkung(String value) {
	this.anmerkung = value;
  }

  /**
   * Ruft den Wert der aufgabengebietId-Eigenschaft ab.
   *
   * @return possible object is {@link Long }
   */
  public Long getAufgabengebietId() {
	return aufgabengebietId;
  }

  /**
   * Legt den Wert der aufgabengebietId-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link Long }
   */
  public void setAufgabengebietId(Long value) {
	this.aufgabengebietId = value;
  }

  /**
   * Ruft den Wert der bundesland-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getBundesland() {
	return bundesland;
  }

  /**
   * Legt den Wert der bundesland-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setBundesland(String value) {
	this.bundesland = value;
  }

  /**
   * Ruft den Wert der externeGewalt-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getExterneGewalt() {
	return externeGewalt;
  }

  /**
   * Legt den Wert der externeGewalt-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setExterneGewalt(String value) {
	this.externeGewalt = value;
  }

  /**
   * Ruft den Wert der fachschluessel-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getFachschluessel() {
	return fachschluessel;
  }

  /**
   * Legt den Wert der fachschluessel-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setFachschluessel(String value) {
	this.fachschluessel = value;
  }

  /**
   * Ruft den Wert der fachschluesselArtKurz-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getFachschluesselArtKurz() {
	return fachschluesselArtKurz;
  }

  /**
   * Legt den Wert der fachschluesselArtKurz-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setFachschluesselArtKurz(String value) {
	this.fachschluesselArtKurz = value;
  }

  /**
   * Ruft den Wert der fremdsystemId-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getFremdsystemId() {
	return fremdsystemId;
  }

  /**
   * Legt den Wert der fremdsystemId-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setFremdsystemId(String value) {
	this.fremdsystemId = value;
  }

  /**
   * Ruft den Wert der fremdsystemName-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getFremdsystemName() {
	return fremdsystemName;
  }

  /**
   * Legt den Wert der fremdsystemName-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setFremdsystemName(String value) {
	this.fremdsystemName = value;
  }

  /**
   * Ruft den Wert der gemeinde-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getGemeinde() {
	return gemeinde;
  }

  /**
   * Legt den Wert der gemeinde-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setGemeinde(String value) {
	this.gemeinde = value;
  }

  /**
   * Ruft den Wert der gemeindeCode-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getGemeindeCode() {
	return gemeindeCode;
  }

  /**
   * Legt den Wert der gemeindeCode-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setGemeindeCode(String value) {
	this.gemeindeCode = value;
  }

  /**
   * Ruft den Wert der kontaktartId-Eigenschaft ab.
   *
   * @return possible object is {@link Long }
   */
  public Long getKontaktartId() {
	return kontaktartId;
  }

  /**
   * Legt den Wert der kontaktartId-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link Long }
   */
  public void setKontaktartId(Long value) {
	this.kontaktartId = value;
  }

  /**
   * Ruft den Wert der mitarbeiterName-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getMitarbeiterName() {
	return mitarbeiterName;
  }

  /**
   * Legt den Wert der mitarbeiterName-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setMitarbeiterName(String value) {
	this.mitarbeiterName = value;
  }

  /**
   * Ruft den Wert der mitarbeiterOe-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getMitarbeiterOe() {
	return mitarbeiterOe;
  }

  /**
   * Legt den Wert der mitarbeiterOe-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setMitarbeiterOe(String value) {
	this.mitarbeiterOe = value;
  }

  /**
   * Ruft den Wert der mitarbeiterkennung-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getMitarbeiterkennung() {
	return mitarbeiterkennung;
  }

  /**
   * Legt den Wert der mitarbeiterkennung-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setMitarbeiterkennung(String value) {
	this.mitarbeiterkennung = value;
  }

  /**
   * Ruft den Wert der nacherfassenGrund-Eigenschaft ab.
   *
   * @return possible object is {@link Long }
   */
  public Long getNacherfassenGrund() {
	return nacherfassenGrund;
  }

  /**
   * Legt den Wert der nacherfassenGrund-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link Long }
   */
  public void setNacherfassenGrund(Long value) {
	this.nacherfassenGrund = value;
  }

  /**
   * Ruft den Wert der nacherfassenText-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getNacherfassenText() {
	return nacherfassenText;
  }

  /**
   * Legt den Wert der nacherfassenText-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setNacherfassenText(String value) {
	this.nacherfassenText = value;
  }

  /**
   * Ruft den Wert der name-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getName() {
	return name;
  }

  /**
   * Legt den Wert der name-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setName(String value) {
	this.name = value;
  }

  /**
   * Ruft den Wert der ort-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getOrt() {
	return ort;
  }

  /**
   * Legt den Wert der ort-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setOrt(String value) {
	this.ort = value;
  }

  /**
   * Ruft den Wert der plz-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getPlz() {
	return plz;
  }

  /**
   * Legt den Wert der plz-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setPlz(String value) {
	this.plz = value;
  }

  /**
   * Ruft den Wert der polBezirk-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getPolBezirk() {
	return polBezirk;
  }

  /**
   * Legt den Wert der polBezirk-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setPolBezirk(String value) {
	this.polBezirk = value;
  }

  /**
   * Ruft den Wert der scIdMa-Eigenschaft ab.
   *
   * @return possible object is {@link Long }
   */
  public Long getScIdMa() {
	return scIdMa;
  }

  /**
   * Legt den Wert der scIdMa-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link Long }
   */
  public void setScIdMa(Long value) {
	this.scIdMa = value;
  }

  /**
   * Ruft den Wert der staatIsoa3-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getStaatIsoa3() {
	return staatIsoa3;
  }

  /**
   * Legt den Wert der staatIsoa3-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setStaatIsoa3(String value) {
	this.staatIsoa3 = value;
  }

  /**
   * Ruft den Wert der subAufgabengebietId-Eigenschaft ab.
   *
   * @return possible object is {@link Long }
   */
  public Long getSubAufgabengebietId() {
	return subAufgabengebietId;
  }

  /**
   * Legt den Wert der subAufgabengebietId-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link Long }
   */
  public void setSubAufgabengebietId(Long value) {
	this.subAufgabengebietId = value;
  }

  /**
   * Ruft den Wert der themaId-Eigenschaft ab.
   *
   * @return possible object is {@link Long }
   */
  public Long getThemaId() {
	return themaId;
  }

  /**
   * Legt den Wert der themaId-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link Long }
   */
  public void setThemaId(Long value) {
	this.themaId = value;
  }

  /**
   * Ruft den Wert der unterthemaId-Eigenschaft ab.
   *
   * @return possible object is {@link Long }
   */
  public Long getUnterthemaId() {
	return unterthemaId;
  }

  /**
   * Legt den Wert der unterthemaId-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link Long }
   */
  public void setUnterthemaId(Long value) {
	this.unterthemaId = value;
  }
}
