package at.sozvers.focus.ws.generated;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.*;

/**
 * VerlinkteDokumenteTyp beinhaltet die Informationen zu einem verlinkten Dokument.
 *
 *
 * <p>Java-Klasse für verlinktesDokumentTyp complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="verlinktesDokumentTyp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dokumentklasse-name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="objektklasse" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dokumentzeichen" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="info" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="erstelldatum" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="verlinktesDokumentTyp", namespace="http://awf.sozvers.at/schema/geschaeftsfall", propOrder={"id", "dokumentklasseName", "objektklasse", "dokumentzeichen", "info", "erstelldatum"})
public class VerlinktesDokumentTyp {

  @XmlElement(name="dokumentklasse-name", namespace="http://awf.sozvers.at/schema/geschaeftsfall", required=true)
  protected String               dokumentklasseName;
  @XmlElement(namespace="http://awf.sozvers.at/schema/geschaeftsfall", required=true)
  protected String               dokumentzeichen;
  @XmlElement(namespace="http://awf.sozvers.at/schema/geschaeftsfall", required=true)
  @XmlSchemaType(name="date")
  protected XMLGregorianCalendar erstelldatum;
  @XmlElement(namespace="http://awf.sozvers.at/schema/geschaeftsfall", required=true)
  protected String               id;
  @XmlElement(namespace="http://awf.sozvers.at/schema/geschaeftsfall", required=true)
  protected String               info;
  @XmlElement(namespace="http://awf.sozvers.at/schema/geschaeftsfall", required=true)
  protected String               objektklasse;

  /**
   * Ruft den Wert der dokumentklasseName-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getDokumentklasseName() {
	return dokumentklasseName;
  }

  /**
   * Legt den Wert der dokumentklasseName-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setDokumentklasseName(String value) {
	this.dokumentklasseName = value;
  }

  /**
   * Ruft den Wert der dokumentzeichen-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getDokumentzeichen() {
	return dokumentzeichen;
  }

  /**
   * Legt den Wert der dokumentzeichen-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setDokumentzeichen(String value) {
	this.dokumentzeichen = value;
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
}
