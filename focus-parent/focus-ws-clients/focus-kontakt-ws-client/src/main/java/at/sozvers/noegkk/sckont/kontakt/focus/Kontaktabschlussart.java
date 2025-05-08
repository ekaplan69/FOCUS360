package at.sozvers.noegkk.sckont.kontakt.focus;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für kontaktabschlussart complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="kontaktabschlussart">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="abschlussartBezeichnung" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="abschlussartHilfetext" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="abschlussartId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="gueltigBis" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="gueltigVon" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="kontaktabschlussart", propOrder={"abschlussartBezeichnung", "abschlussartHilfetext", "abschlussartId", "gueltigBis", "gueltigVon"})
public class Kontaktabschlussart {

  @XmlElement(required=true)
  protected String               abschlussartBezeichnung;
  protected String               abschlussartHilfetext;
  protected long                 abschlussartId;
  @XmlElement(required=true)
  @XmlSchemaType(name="dateTime")
  protected XMLGregorianCalendar gueltigBis;
  @XmlElement(required=true)
  @XmlSchemaType(name="dateTime")
  protected XMLGregorianCalendar gueltigVon;

  /**
   * Ruft den Wert der abschlussartBezeichnung-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getAbschlussartBezeichnung() {
	return abschlussartBezeichnung;
  }

  /**
   * Legt den Wert der abschlussartBezeichnung-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setAbschlussartBezeichnung(String value) {
	this.abschlussartBezeichnung = value;
  }

  /**
   * Ruft den Wert der abschlussartHilfetext-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getAbschlussartHilfetext() {
	return abschlussartHilfetext;
  }

  /**
   * Legt den Wert der abschlussartHilfetext-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setAbschlussartHilfetext(String value) {
	this.abschlussartHilfetext = value;
  }

  /**
   * Ruft den Wert der abschlussartId-Eigenschaft ab.
   */
  public long getAbschlussartId() {
	return abschlussartId;
  }

  /**
   * Legt den Wert der abschlussartId-Eigenschaft fest.
   */
  public void setAbschlussartId(long value) {
	this.abschlussartId = value;
  }

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
}
