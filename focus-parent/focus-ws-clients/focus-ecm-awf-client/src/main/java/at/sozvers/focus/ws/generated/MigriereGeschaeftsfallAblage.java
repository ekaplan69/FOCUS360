package at.sozvers.focus.ws.generated;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für anonymous complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="objekt-klasse" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="geschaeftszeichen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ersteller" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="erstelltAm" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="metadaten" type="{http://awf.sozvers.at/schema/dokument}metadatenTyp" minOccurs="0"/&gt;
 *         &lt;element name="berechtigungen" type="{http://awf.sozvers.at/schema/dokument}migBerechtigungTyp" minOccurs="0"/&gt;
 *         &lt;element name="abgeschlossen" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="", propOrder={"objektKlasse", "geschaeftszeichen", "ersteller", "erstelltAm", "metadaten", "berechtigungen", "abgeschlossen"})
@XmlRootElement(name="migriereGeschaeftsfallAblage", namespace="http://awf.sozvers.at/schema/geschaeftsfall")
public class MigriereGeschaeftsfallAblage {

  @XmlElement(namespace="http://awf.sozvers.at/schema/geschaeftsfall")
  protected boolean              abgeschlossen;
  @XmlElement(namespace="http://awf.sozvers.at/schema/geschaeftsfall")
  protected MigBerechtigungTyp   berechtigungen;
  @XmlElement(namespace="http://awf.sozvers.at/schema/geschaeftsfall")
  protected String               ersteller;
  @XmlElement(namespace="http://awf.sozvers.at/schema/geschaeftsfall")
  @XmlSchemaType(name="date")
  protected XMLGregorianCalendar erstelltAm;
  @XmlElement(namespace="http://awf.sozvers.at/schema/geschaeftsfall")
  protected String               geschaeftszeichen;
  @XmlElement(namespace="http://awf.sozvers.at/schema/geschaeftsfall")
  protected MetadatenTyp         metadaten;
  @XmlElement(name="objekt-klasse", namespace="http://awf.sozvers.at/schema/geschaeftsfall", required=true)
  protected String               objektKlasse;

  /**
   * Ruft den Wert der berechtigungen-Eigenschaft ab.
   *
   * @return possible object is {@link MigBerechtigungTyp }
   */
  public MigBerechtigungTyp getBerechtigungen() {
	return berechtigungen;
  }

  /**
   * Legt den Wert der berechtigungen-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link MigBerechtigungTyp }
   */
  public void setBerechtigungen(MigBerechtigungTyp value) {
	this.berechtigungen = value;
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
   * Ruft den Wert der metadaten-Eigenschaft ab.
   *
   * @return possible object is {@link MetadatenTyp }
   */
  public MetadatenTyp getMetadaten() {
	return metadaten;
  }

  /**
   * Legt den Wert der metadaten-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link MetadatenTyp }
   */
  public void setMetadaten(MetadatenTyp value) {
	this.metadaten = value;
  }

  /**
   * Ruft den Wert der objektKlasse-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getObjektKlasse() {
	return objektKlasse;
  }

  /**
   * Legt den Wert der objektKlasse-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setObjektKlasse(String value) {
	this.objektKlasse = value;
  }

  /**
   * Ruft den Wert der abgeschlossen-Eigenschaft ab.
   */
  public boolean isAbgeschlossen() {
	return abgeschlossen;
  }

  /**
   * Legt den Wert der abgeschlossen-Eigenschaft fest.
   */
  public void setAbgeschlossen(boolean value) {
	this.abgeschlossen = value;
  }
}
