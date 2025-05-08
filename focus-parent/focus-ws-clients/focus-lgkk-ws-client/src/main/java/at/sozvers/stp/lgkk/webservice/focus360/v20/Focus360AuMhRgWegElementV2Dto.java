package at.sozvers.stp.lgkk.webservice.focus360.v20;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für Focus360AuMhRgWegElementV2Dto complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="Focus360AuMhRgWegElementV2Dto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="anweisungDat" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="lbisDat" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="lgebiet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lvonDat" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="Focus360AuMhRgWegElementV2Dto", propOrder={"anweisungDat", "lbisDat", "lgebiet", "lvonDat", "status"})
public class Focus360AuMhRgWegElementV2Dto {

  @XmlSchemaType(name="dateTime")
  protected XMLGregorianCalendar anweisungDat;
  @XmlSchemaType(name="dateTime")
  protected XMLGregorianCalendar lbisDat;
  protected String               lgebiet;
  @XmlSchemaType(name="dateTime")
  protected XMLGregorianCalendar lvonDat;
  protected String               status;

  /**
   * Ruft den Wert der anweisungDat-Eigenschaft ab.
   *
   * @return possible object is {@link XMLGregorianCalendar }
   */
  public XMLGregorianCalendar getAnweisungDat() {
	return anweisungDat;
  }

  /**
   * Legt den Wert der anweisungDat-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link XMLGregorianCalendar }
   */
  public void setAnweisungDat(XMLGregorianCalendar value) {
	this.anweisungDat = value;
  }

  /**
   * Ruft den Wert der lbisDat-Eigenschaft ab.
   *
   * @return possible object is {@link XMLGregorianCalendar }
   */
  public XMLGregorianCalendar getLbisDat() {
	return lbisDat;
  }

  /**
   * Legt den Wert der lbisDat-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link XMLGregorianCalendar }
   */
  public void setLbisDat(XMLGregorianCalendar value) {
	this.lbisDat = value;
  }

  /**
   * Ruft den Wert der lgebiet-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getLgebiet() {
	return lgebiet;
  }

  /**
   * Legt den Wert der lgebiet-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setLgebiet(String value) {
	this.lgebiet = value;
  }

  /**
   * Ruft den Wert der lvonDat-Eigenschaft ab.
   *
   * @return possible object is {@link XMLGregorianCalendar }
   */
  public XMLGregorianCalendar getLvonDat() {
	return lvonDat;
  }

  /**
   * Legt den Wert der lvonDat-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link XMLGregorianCalendar }
   */
  public void setLvonDat(XMLGregorianCalendar value) {
	this.lvonDat = value;
  }

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
}
