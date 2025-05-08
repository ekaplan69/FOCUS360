package at.sozvers.stp.lgkk.webservice.focus360.v20;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für Focus360UnfallerhElementV2Dto complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="Focus360UnfallerhElementV2Dto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="eingelangtDat" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="erstellDat" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="urgenz1Dat" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="urgenz2Dat" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="Focus360UnfallerhElementV2Dto", propOrder={"eingelangtDat", "erstellDat", "urgenz1Dat", "urgenz2Dat"})
public class Focus360UnfallerhElementV2Dto {

  @XmlSchemaType(name="dateTime")
  protected XMLGregorianCalendar eingelangtDat;
  @XmlSchemaType(name="dateTime")
  protected XMLGregorianCalendar erstellDat;
  @XmlSchemaType(name="dateTime")
  protected XMLGregorianCalendar urgenz1Dat;
  @XmlSchemaType(name="dateTime")
  protected XMLGregorianCalendar urgenz2Dat;

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

  /**
   * Ruft den Wert der erstellDat-Eigenschaft ab.
   *
   * @return possible object is {@link XMLGregorianCalendar }
   */
  public XMLGregorianCalendar getErstellDat() {
	return erstellDat;
  }

  /**
   * Legt den Wert der erstellDat-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link XMLGregorianCalendar }
   */
  public void setErstellDat(XMLGregorianCalendar value) {
	this.erstellDat = value;
  }

  /**
   * Ruft den Wert der urgenz1Dat-Eigenschaft ab.
   *
   * @return possible object is {@link XMLGregorianCalendar }
   */
  public XMLGregorianCalendar getUrgenz1Dat() {
	return urgenz1Dat;
  }

  /**
   * Legt den Wert der urgenz1Dat-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link XMLGregorianCalendar }
   */
  public void setUrgenz1Dat(XMLGregorianCalendar value) {
	this.urgenz1Dat = value;
  }

  /**
   * Ruft den Wert der urgenz2Dat-Eigenschaft ab.
   *
   * @return possible object is {@link XMLGregorianCalendar }
   */
  public XMLGregorianCalendar getUrgenz2Dat() {
	return urgenz2Dat;
  }

  /**
   * Legt den Wert der urgenz2Dat-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link XMLGregorianCalendar }
   */
  public void setUrgenz2Dat(XMLGregorianCalendar value) {
	this.urgenz2Dat = value;
  }
}
