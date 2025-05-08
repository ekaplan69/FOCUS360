package at.sozvers.stp.lgkk.webservice.focus360.v20;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für Focus360EkosElementV2Dto complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="Focus360EkosElementV2Dto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="antragStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eingelangtDat" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="Focus360EkosElementV2Dto", propOrder={"antragStatus", "eingelangtDat"})
public class Focus360EkosElementV2Dto {

  protected String               antragStatus;
  @XmlSchemaType(name="dateTime")
  protected XMLGregorianCalendar eingelangtDat;

  /**
   * Ruft den Wert der antragStatus-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getAntragStatus() {
	return antragStatus;
  }

  /**
   * Legt den Wert der antragStatus-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setAntragStatus(String value) {
	this.antragStatus = value;
  }

  /**
   * Ruft den Wert der eingelangtDat-Eigenschaft ab.
   *
   * @return possible object is {@link XMLGregorianCalendar }
   */
  public XMLGregorianCalendar getEingelangtDat() {
	return eingelangtDat;
  }

  /**
   * Legt den Wert der eingelangtDat-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link XMLGregorianCalendar }
   */
  public void setEingelangtDat(XMLGregorianCalendar value) {
	this.eingelangtDat = value;
  }
}
