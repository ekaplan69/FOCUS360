package at.sozvers.stp.lgkk.webservice.focus360.v20;

import javax.xml.datatype.XMLGregorianCalendar;
import at.itsv.services.lgkk.StandardRequest;
import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für Focus360DokumentRequest complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="Focus360DokumentRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://types.services.itsv.at/}standardRequest">
 *       &lt;sequence>
 *         &lt;element name="vonDatum" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="vsnr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="Focus360DokumentRequest", propOrder={"vonDatum", "vsnr"})
public class Focus360DokumentRequest extends StandardRequest {

  @XmlSchemaType(name="dateTime")
  protected XMLGregorianCalendar vonDatum;
  protected String               vsnr;

  /**
   * Ruft den Wert der vonDatum-Eigenschaft ab.
   *
   * @return possible object is {@link XMLGregorianCalendar }
   */
  public XMLGregorianCalendar getVonDatum() {
	return vonDatum;
  }

  /**
   * Legt den Wert der vonDatum-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link XMLGregorianCalendar }
   */
  public void setVonDatum(XMLGregorianCalendar value) {
	this.vonDatum = value;
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
