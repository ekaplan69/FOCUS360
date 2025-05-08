package at.sozvers.focus.ws.generated;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.*;

/**
 * MigNotiz beinhaltet die Informationen einer Notiz zu einem migrierten Dokument.
 *
 *
 * <p>Java-Klasse für migNotiz complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="migNotiz"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="datum" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ersteller" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="migNotiz", namespace="http://awf.sozvers.at/schema/dokument", propOrder={"text", "datum", "ersteller"})
public class MigNotiz {

  @XmlElement(namespace="http://awf.sozvers.at/schema/dokument")
  @XmlSchemaType(name="dateTime")
  protected XMLGregorianCalendar datum;
  @XmlElement(namespace="http://awf.sozvers.at/schema/dokument", required=true)
  protected String               ersteller;
  @XmlElement(namespace="http://awf.sozvers.at/schema/dokument", required=true)
  protected String               text;

  /**
   * Ruft den Wert der datum-Eigenschaft ab.
   *
   * @return possible object is {@link XMLGregorianCalendar }
   */
  public XMLGregorianCalendar getDatum() {
	return datum;
  }

  /**
   * Legt den Wert der datum-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link XMLGregorianCalendar }
   */
  public void setDatum(XMLGregorianCalendar value) {
	this.datum = value;
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
   * Ruft den Wert der text-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getText() {
	return text;
  }

  /**
   * Legt den Wert der text-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setText(String value) {
	this.text = value;
  }
}
