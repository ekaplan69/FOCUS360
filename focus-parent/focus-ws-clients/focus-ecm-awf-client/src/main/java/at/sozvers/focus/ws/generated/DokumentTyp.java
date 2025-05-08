package at.sozvers.focus.ws.generated;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.*;

/**
 * Ein Dokument enthält die notwendigen Informationen zu einem gefundenen Dokument im Suchergebnis.
 *
 *
 * <p>Java-Klasse für dokumentTyp complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="dokumentTyp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dokument-klasse" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="geschaeftszeichen" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dateiname" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="mimetype" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ersteller" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="erstelltAm" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="letzterBearbeiter" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="letzteBearbeitungAm" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="fachinfos" type="{http://awf.sozvers.at/schema/suchen}fachinfoTyp"/&gt;
 *         &lt;element name="gefundene-volltexte" type="{http://awf.sozvers.at/schema/suchen}gefundeneVolltexteTyp"/&gt;
 *         &lt;element name="relevanz" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="dokumentTyp", namespace="http://awf.sozvers.at/schema/suchen",
		 propOrder={"id", "dokumentKlasse", "geschaeftszeichen", "version", "dateiname", "mimetype", "ersteller", "erstelltAm", "letzterBearbeiter", "letzteBearbeitungAm", "fachinfos",
				 "gefundeneVolltexte", "relevanz"})
public class DokumentTyp {

  @XmlElement(namespace="http://awf.sozvers.at/schema/suchen", required=true)
  protected String                dateiname;
  @XmlElement(name="dokument-klasse", namespace="http://awf.sozvers.at/schema/suchen", required=true)
  protected String                dokumentKlasse;
  @XmlElement(namespace="http://awf.sozvers.at/schema/suchen", required=true)
  protected String                ersteller;
  @XmlElement(namespace="http://awf.sozvers.at/schema/suchen", required=true)
  @XmlSchemaType(name="date")
  protected XMLGregorianCalendar  erstelltAm;
  @XmlElement(namespace="http://awf.sozvers.at/schema/suchen", required=true)
  protected FachinfoTyp           fachinfos;
  @XmlElement(name="gefundene-volltexte", namespace="http://awf.sozvers.at/schema/suchen", required=true)
  protected GefundeneVolltexteTyp gefundeneVolltexte;
  @XmlElement(namespace="http://awf.sozvers.at/schema/suchen", required=true)
  protected String                geschaeftszeichen;
  @XmlElement(namespace="http://awf.sozvers.at/schema/suchen", required=true)
  protected String                id;
  @XmlElement(namespace="http://awf.sozvers.at/schema/suchen", required=true)
  @XmlSchemaType(name="date")
  protected XMLGregorianCalendar  letzteBearbeitungAm;
  @XmlElement(namespace="http://awf.sozvers.at/schema/suchen", required=true)
  protected String                letzterBearbeiter;
  @XmlElement(namespace="http://awf.sozvers.at/schema/suchen", required=true)
  protected String                mimetype;
  @XmlElement(namespace="http://awf.sozvers.at/schema/suchen")
  protected float                 relevanz;
  @XmlElement(namespace="http://awf.sozvers.at/schema/suchen", required=true)
  protected String                version;

  /**
   * Ruft den Wert der dateiname-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getDateiname() {
	return dateiname;
  }

  /**
   * Legt den Wert der dateiname-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setDateiname(String value) {
	this.dateiname = value;
  }

  /**
   * Ruft den Wert der dokumentKlasse-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getDokumentKlasse() {
	return dokumentKlasse;
  }

  /**
   * Legt den Wert der dokumentKlasse-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setDokumentKlasse(String value) {
	this.dokumentKlasse = value;
  }

  /**
   * Ruft den Wert der ersteller-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getErsteller() {
	return ersteller;
  }

  /**
   * Legt den Wert der ersteller-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setErsteller(String value) {
	this.ersteller = value;
  }

  /**
   * Ruft den Wert der erstelltAm-Eigenschaft ab.
   *
   * @return possible object is {@link XMLGregorianCalendar }
   */
  public XMLGregorianCalendar getErstelltAm() {
	return erstelltAm;
  }

  /**
   * Legt den Wert der erstelltAm-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link XMLGregorianCalendar }
   */
  public void setErstelltAm(XMLGregorianCalendar value) {
	this.erstelltAm = value;
  }

  /**
   * Ruft den Wert der fachinfos-Eigenschaft ab.
   *
   * @return possible object is {@link FachinfoTyp }
   */
  public FachinfoTyp getFachinfos() {
	return fachinfos;
  }

  /**
   * Legt den Wert der fachinfos-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link FachinfoTyp }
   */
  public void setFachinfos(FachinfoTyp value) {
	this.fachinfos = value;
  }

  /**
   * Ruft den Wert der gefundeneVolltexte-Eigenschaft ab.
   *
   * @return possible object is {@link GefundeneVolltexteTyp }
   */
  public GefundeneVolltexteTyp getGefundeneVolltexte() {
	return gefundeneVolltexte;
  }

  /**
   * Legt den Wert der gefundeneVolltexte-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link GefundeneVolltexteTyp }
   */
  public void setGefundeneVolltexte(GefundeneVolltexteTyp value) {
	this.gefundeneVolltexte = value;
  }

  /**
   * Ruft den Wert der geschaeftszeichen-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getGeschaeftszeichen() {
	return geschaeftszeichen;
  }

  /**
   * Legt den Wert der geschaeftszeichen-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setGeschaeftszeichen(String value) {
	this.geschaeftszeichen = value;
  }

  /**
   * Ruft den Wert der id-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getId() {
	return id;
  }

  /**
   * Legt den Wert der id-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setId(String value) {
	this.id = value;
  }

  /**
   * Ruft den Wert der letzteBearbeitungAm-Eigenschaft ab.
   *
   * @return possible object is {@link XMLGregorianCalendar }
   */
  public XMLGregorianCalendar getLetzteBearbeitungAm() {
	return letzteBearbeitungAm;
  }

  /**
   * Legt den Wert der letzteBearbeitungAm-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link XMLGregorianCalendar }
   */
  public void setLetzteBearbeitungAm(XMLGregorianCalendar value) {
	this.letzteBearbeitungAm = value;
  }

  /**
   * Ruft den Wert der letzterBearbeiter-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getLetzterBearbeiter() {
	return letzterBearbeiter;
  }

  /**
   * Legt den Wert der letzterBearbeiter-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setLetzterBearbeiter(String value) {
	this.letzterBearbeiter = value;
  }

  /**
   * Ruft den Wert der mimetype-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getMimetype() {
	return mimetype;
  }

  /**
   * Legt den Wert der mimetype-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setMimetype(String value) {
	this.mimetype = value;
  }

  /**
   * Ruft den Wert der relevanz-Eigenschaft ab.
   */
  public float getRelevanz() {
	return relevanz;
  }

  /**
   * Legt den Wert der relevanz-Eigenschaft fest.
   */
  public void setRelevanz(float value) {
	this.relevanz = value;
  }

  /**
   * Ruft den Wert der version-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getVersion() {
	return version;
  }

  /**
   * Legt den Wert der version-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setVersion(String value) {
	this.version = value;
  }
}
