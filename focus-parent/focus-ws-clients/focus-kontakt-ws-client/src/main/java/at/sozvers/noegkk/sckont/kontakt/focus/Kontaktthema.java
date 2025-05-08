package at.sozvers.noegkk.sckont.kontakt.focus;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für kontaktthema complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="kontaktthema">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gueltigBis" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="gueltigVon" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="themaBezeichnung" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="themaHilfetext" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="themaId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="kontaktthema", propOrder={"gueltigBis", "gueltigVon", "themaBezeichnung", "themaHilfetext", "themaId"})
public class Kontaktthema {

  @XmlElement(required=true)
  @XmlSchemaType(name="dateTime")
  protected XMLGregorianCalendar gueltigBis;
  @XmlElement(required=true)
  @XmlSchemaType(name="dateTime")
  protected XMLGregorianCalendar gueltigVon;
  @XmlElement(required=true)
  protected String               themaBezeichnung;
  protected String               themaHilfetext;
  protected long                 themaId;

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
   * Ruft den Wert der themaBezeichnung-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getThemaBezeichnung() {
	return themaBezeichnung;
  }

  /**
   * Legt den Wert der themaBezeichnung-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setThemaBezeichnung(String value) {
	this.themaBezeichnung = value;
  }

  /**
   * Ruft den Wert der themaHilfetext-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getThemaHilfetext() {
	return themaHilfetext;
  }

  /**
   * Legt den Wert der themaHilfetext-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setThemaHilfetext(String value) {
	this.themaHilfetext = value;
  }

  /**
   * Ruft den Wert der themaId-Eigenschaft ab.
   */
  public long getThemaId() {
	return themaId;
  }

  /**
   * Legt den Wert der themaId-Eigenschaft fest.
   */
  public void setThemaId(long value) {
	this.themaId = value;
  }
}
