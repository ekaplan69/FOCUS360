package at.sozvers.stp.lgkk.webservice.focus360.v20;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für Focus360VwstElementV2Dto complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="Focus360VwstElementV2Dto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gueltigBisDat" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="leistungsType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="Focus360VwstElementV2Dto", propOrder={"gueltigBisDat", "leistungsType"})
public class Focus360VwstElementV2Dto {

  @XmlSchemaType(name="dateTime")
  protected XMLGregorianCalendar gueltigBisDat;
  protected String               leistungsType;

  /**
   * Ruft den Wert der gueltigBisDat-Eigenschaft ab.
   *
   * @return possible object is {@link XMLGregorianCalendar }
   */
  public XMLGregorianCalendar getGueltigBisDat() {
	return gueltigBisDat;
  }

  /**
   * Legt den Wert der gueltigBisDat-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link XMLGregorianCalendar }
   */
  public void setGueltigBisDat(XMLGregorianCalendar value) {
	this.gueltigBisDat = value;
  }

  /**
   * Ruft den Wert der leistungsType-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getLeistungsType() {
	return leistungsType;
  }

  /**
   * Legt den Wert der leistungsType-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setLeistungsType(String value) {
	this.leistungsType = value;
  }
}
