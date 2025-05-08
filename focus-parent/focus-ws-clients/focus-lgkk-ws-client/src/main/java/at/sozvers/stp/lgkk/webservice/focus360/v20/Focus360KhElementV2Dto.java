package at.sozvers.stp.lgkk.webservice.focus360.v20;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für Focus360KhElementV2Dto complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="Focus360KhElementV2Dto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="aufnahmeArt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lbisDat" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="leName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lvonDat" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="vpnr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="Focus360KhElementV2Dto", propOrder={"aufnahmeArt", "lbisDat", "leName", "lvonDat", "vpnr"})
public class Focus360KhElementV2Dto {

  protected String               aufnahmeArt;
  @XmlSchemaType(name="dateTime")
  protected XMLGregorianCalendar lbisDat;
  protected String               leName;
  @XmlSchemaType(name="dateTime")
  protected XMLGregorianCalendar lvonDat;
  protected String               vpnr;

  /**
   * Ruft den Wert der aufnahmeArt-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getAufnahmeArt() {
	return aufnahmeArt;
  }

  /**
   * Legt den Wert der aufnahmeArt-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setAufnahmeArt(String value) {
	this.aufnahmeArt = value;
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
   * Ruft den Wert der leName-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getLeName() {
	return leName;
  }

  /**
   * Legt den Wert der leName-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setLeName(String value) {
	this.leName = value;
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
   * Ruft den Wert der vpnr-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getVpnr() {
	return vpnr;
  }

  /**
   * Legt den Wert der vpnr-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setVpnr(String value) {
	this.vpnr = value;
  }
}
