package at.sozvers.stp.lgkk.webservice.focus360.v20;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für Focus360FrtElementV2Dto complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="Focus360FrtElementV2Dto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transportDat" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="Focus360FrtElementV2Dto", propOrder={"status", "transportDat"})
public class Focus360FrtElementV2Dto {

  protected String               status;
  @XmlSchemaType(name="dateTime")
  protected XMLGregorianCalendar transportDat;

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

  /**
   * Ruft den Wert der transportDat-Eigenschaft ab.
   *
   * @return possible object is {@link XMLGregorianCalendar }
   */
  public XMLGregorianCalendar getTransportDat() {
	return transportDat;
  }

  /**
   * Legt den Wert der transportDat-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link XMLGregorianCalendar }
   */
  public void setTransportDat(XMLGregorianCalendar value) {
	this.transportDat = value;
  }
}
