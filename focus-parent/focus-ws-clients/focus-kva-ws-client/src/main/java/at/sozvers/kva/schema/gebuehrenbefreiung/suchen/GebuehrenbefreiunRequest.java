package at.sozvers.kva.schema.gebuehrenbefreiung.suchen;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für gebuehrenbefreiunRequest complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="gebuehrenbefreiunRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="vondat" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="vsnr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="gebuehrenbefreiunRequest", propOrder={"vondat", "vsnr"})
public class GebuehrenbefreiunRequest {

  @XmlElement(required=true)
  @XmlSchemaType(name="dateTime")
  protected XMLGregorianCalendar vondat;
  @XmlElement(required=true)
  protected String               vsnr;

  /**
   * Ruft den Wert der vondat-Eigenschaft ab.
   *
   * @return possible object is {@link XMLGregorianCalendar }
   */
  public XMLGregorianCalendar getVondat() {
	return vondat;
  }

  /**
   * Legt den Wert der vondat-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link XMLGregorianCalendar }
   */
  public void setVondat(XMLGregorianCalendar value) {
	this.vondat = value;
  }

  /**
   * Ruft den Wert der vsnr-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getVsnr() {
	return vsnr;
  }

  /**
   * Legt den Wert der vsnr-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setVsnr(String value) {
	this.vsnr = value;
  }
}
