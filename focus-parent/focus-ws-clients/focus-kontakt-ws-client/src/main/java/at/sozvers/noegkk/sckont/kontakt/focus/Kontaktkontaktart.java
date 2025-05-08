package at.sozvers.noegkk.sckont.kontakt.focus;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für kontaktkontaktart complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="kontaktkontaktart">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gueltigBis" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="gueltigVon" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="kontaktartBezeichnung" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="kontaktartHilfetext" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="kontaktartId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="kontaktkontaktart", propOrder={"gueltigBis", "gueltigVon", "kontaktartBezeichnung", "kontaktartHilfetext", "kontaktartId"})
public class Kontaktkontaktart {

  @XmlElement(required=true)
  @XmlSchemaType(name="dateTime")
  protected XMLGregorianCalendar gueltigBis;
  @XmlElement(required=true)
  @XmlSchemaType(name="dateTime")
  protected XMLGregorianCalendar gueltigVon;
  @XmlElement(required=true)
  protected String               kontaktartBezeichnung;
  protected String               kontaktartHilfetext;
  protected long                 kontaktartId;

  /**
   * Ruft den Wert der gueltigBis-Eigenschaft ab.
   *
   * @return possible object is {@link XMLGregorianCalendar }
   */
  public XMLGregorianCalendar getGueltigBis() {
	return gueltigBis;
  }

  /**
   * Legt den Wert der gueltigBis-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link XMLGregorianCalendar }
   */
  public void setGueltigBis(XMLGregorianCalendar value) {
	this.gueltigBis = value;
  }

  /**
   * Ruft den Wert der gueltigVon-Eigenschaft ab.
   *
   * @return possible object is {@link XMLGregorianCalendar }
   */
  public XMLGregorianCalendar getGueltigVon() {
	return gueltigVon;
  }

  /**
   * Legt den Wert der gueltigVon-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link XMLGregorianCalendar }
   */
  public void setGueltigVon(XMLGregorianCalendar value) {
	this.gueltigVon = value;
  }

  /**
   * Ruft den Wert der kontaktartBezeichnung-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getKontaktartBezeichnung() {
	return kontaktartBezeichnung;
  }

  /**
   * Legt den Wert der kontaktartBezeichnung-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setKontaktartBezeichnung(String value) {
	this.kontaktartBezeichnung = value;
  }

  /**
   * Ruft den Wert der kontaktartHilfetext-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getKontaktartHilfetext() {
	return kontaktartHilfetext;
  }

  /**
   * Legt den Wert der kontaktartHilfetext-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setKontaktartHilfetext(String value) {
	this.kontaktartHilfetext = value;
  }

  /**
   * Ruft den Wert der kontaktartId-Eigenschaft ab.
   */
  public long getKontaktartId() {
	return kontaktartId;
  }

  /**
   * Legt den Wert der kontaktartId-Eigenschaft fest.
   */
  public void setKontaktartId(long value) {
	this.kontaktartId = value;
  }
}
