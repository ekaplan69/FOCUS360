package at.sozvers.focus.ws.generated;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.*;

/**
 * GefundeneAufgabeTyp beinhaltet alle Informationen zu einer gefundenen Aufgabe.
 *
 *
 * <p>Java-Klasse für gefundeneAufgabeTyp complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="gefundeneAufgabeTyp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="geschaeftsfall-id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="prozessname" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="objektklasse" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="geschaeftszeichen" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="aufgabe-id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="aufgabe-name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="aufgabe-definition-id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="erstelldatum" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="info" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="gefundeneAufgabeTyp", namespace="http://awf.sozvers.at/schema/geschaeftsfall",
		 propOrder={"geschaeftsfallId", "prozessname", "objektklasse", "geschaeftszeichen", "aufgabeId", "aufgabeName", "aufgabeDefinitionId", "erstelldatum", "info", "status"})
@XmlSeeAlso({Aufgabe.class})
public class GefundeneAufgabeTyp {

  @XmlElement(name="aufgabe-definition-id", namespace="http://awf.sozvers.at/schema/geschaeftsfall", required=true)
  protected String               aufgabeDefinitionId;
  @XmlElement(name="aufgabe-id", namespace="http://awf.sozvers.at/schema/geschaeftsfall", required=true)
  protected String               aufgabeId;
  @XmlElement(name="aufgabe-name", namespace="http://awf.sozvers.at/schema/geschaeftsfall", required=true)
  protected String               aufgabeName;
  @XmlElement(namespace="http://awf.sozvers.at/schema/geschaeftsfall", required=true)
  @XmlSchemaType(name="date")
  protected XMLGregorianCalendar erstelldatum;
  @XmlElement(name="geschaeftsfall-id", namespace="http://awf.sozvers.at/schema/geschaeftsfall", required=true)
  protected String               geschaeftsfallId;
  @XmlElement(namespace="http://awf.sozvers.at/schema/geschaeftsfall", required=true)
  protected String               geschaeftszeichen;
  @XmlElement(namespace="http://awf.sozvers.at/schema/geschaeftsfall", required=true)
  protected String               info;
  @XmlElement(namespace="http://awf.sozvers.at/schema/geschaeftsfall", required=true)
  protected String               objektklasse;
  @XmlElement(namespace="http://awf.sozvers.at/schema/geschaeftsfall", required=true)
  protected String               prozessname;
  @XmlElement(namespace="http://awf.sozvers.at/schema/geschaeftsfall", required=true)
  protected String               status;

  /**
   * Ruft den Wert der aufgabeDefinitionId-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getAufgabeDefinitionId() {
	return aufgabeDefinitionId;
  }

  /**
   * Legt den Wert der aufgabeDefinitionId-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setAufgabeDefinitionId(String value) {
	this.aufgabeDefinitionId = value;
  }

  /**
   * Ruft den Wert der aufgabeId-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getAufgabeId() {
	return aufgabeId;
  }

  /**
   * Legt den Wert der aufgabeId-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setAufgabeId(String value) {
	this.aufgabeId = value;
  }

  /**
   * Ruft den Wert der aufgabeName-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getAufgabeName() {
	return aufgabeName;
  }

  /**
   * Legt den Wert der aufgabeName-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setAufgabeName(String value) {
	this.aufgabeName = value;
  }

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
   * Ruft den Wert der geschaeftsfallId-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getGeschaeftsfallId() {
	return geschaeftsfallId;
  }

  /**
   * Legt den Wert der geschaeftsfallId-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setGeschaeftsfallId(String value) {
	this.geschaeftsfallId = value;
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
   * Ruft den Wert der info-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getInfo() {
	return info;
  }

  /**
   * Legt den Wert der info-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setInfo(String value) {
	this.info = value;
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
