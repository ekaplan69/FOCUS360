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
 *         &lt;element name="prozessname" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="objektklasse" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="geschaeftszeichen" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="erstelldatum" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="ersteller" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="kategorie" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="metadaten" type="{http://awf.sozvers.at/schema/dokument}metadatenTyp" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="", propOrder={"prozessname", "objektklasse", "geschaeftszeichen", "erstelldatum", "ersteller", "status", "kategorie", "metadaten"})
@XmlRootElement(name="geschaeftsfall", namespace="http://awf.sozvers.at/schema/geschaeftsfall")
public class Geschaeftsfall {

  @XmlElement(namespace="http://awf.sozvers.at/schema/geschaeftsfall", required=true)
  @XmlSchemaType(name="date")
  protected XMLGregorianCalendar erstelldatum;
  @XmlElement(namespace="http://awf.sozvers.at/schema/geschaeftsfall", required=true)
  protected String               ersteller;
  @XmlElement(namespace="http://awf.sozvers.at/schema/geschaeftsfall", required=true)
  protected String               geschaeftszeichen;
  @XmlElement(namespace="http://awf.sozvers.at/schema/geschaeftsfall", required=true)
  protected String               kategorie;
  @XmlElement(namespace="http://awf.sozvers.at/schema/geschaeftsfall")
  protected MetadatenTyp         metadaten;
  @XmlElement(namespace="http://awf.sozvers.at/schema/geschaeftsfall", required=true)
  protected String               objektklasse;
  @XmlElement(namespace="http://awf.sozvers.at/schema/geschaeftsfall", required=true)
  protected String               prozessname;
  @XmlElement(namespace="http://awf.sozvers.at/schema/geschaeftsfall", required=true)
  protected String               status;

  /**
   * Ruft den Wert der erstelldatum-Eigenschaft ab.
   *
   * @return possible object is {@link XMLGregorianCalendar }
   */
  public XMLGregorianCalendar getErstelldatum() {
	return erstelldatum;
  }

  /**
   * Legt den Wert der erstelldatum-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link XMLGregorianCalendar }
   */
  public void setErstelldatum(XMLGregorianCalendar value) {
	this.erstelldatum = value;
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
   * Ruft den Wert der kategorie-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getKategorie() {
	return kategorie;
  }

  /**
   * Legt den Wert der kategorie-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setKategorie(String value) {
	this.kategorie = value;
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
   * Ruft den Wert der objektklasse-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getObjektklasse() {
	return objektklasse;
  }

  /**
   * Legt den Wert der objektklasse-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setObjektklasse(String value) {
	this.objektklasse = value;
  }

  /**
   * Ruft den Wert der prozessname-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getProzessname() {
	return prozessname;
  }

  /**
   * Legt den Wert der prozessname-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setProzessname(String value) {
	this.prozessname = value;
  }

  /**
   * Ruft den Wert der status-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getStatus() {
	return status;
  }

  /**
   * Legt den Wert der status-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setStatus(String value) {
	this.status = value;
  }
}
