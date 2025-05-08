package at.sozvers.stp.lgkk.webservice.focus360.v20;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für Focus360BetreuungszeitenElementV2Dto complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="Focus360BetreuungszeitenElementV2Dto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="betreuungBis" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="betreuungVon" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="landesstellen" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="Focus360BetreuungszeitenElementV2Dto", propOrder={"betreuungBis", "betreuungVon", "landesstellen", "status"})
public class Focus360BetreuungszeitenElementV2Dto {

  @XmlSchemaType(name="dateTime")
  protected XMLGregorianCalendar betreuungBis;
  @XmlSchemaType(name="dateTime")
  protected XMLGregorianCalendar betreuungVon;
  protected Integer              landesstellen;
  protected String               status;

  /**
   * Ruft den Wert der betreuungBis-Eigenschaft ab.
   *
   * @return possible object is {@link XMLGregorianCalendar }
   */
  public XMLGregorianCalendar getBetreuungBis() {
	return betreuungBis;
  }

  /**
   * Legt den Wert der betreuungBis-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link XMLGregorianCalendar }
   */
  public void setBetreuungBis(XMLGregorianCalendar value) {
	this.betreuungBis = value;
  }

  /**
   * Ruft den Wert der betreuungVon-Eigenschaft ab.
   *
   * @return possible object is {@link XMLGregorianCalendar }
   */
  public XMLGregorianCalendar getBetreuungVon() {
	return betreuungVon;
  }

  /**
   * Legt den Wert der betreuungVon-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link XMLGregorianCalendar }
   */
  public void setBetreuungVon(XMLGregorianCalendar value) {
	this.betreuungVon = value;
  }

  /**
   * Ruft den Wert der landesstellen-Eigenschaft ab.
   *
   * @return possible object is {@link Integer }
   */
  public Integer getLandesstellen() {
	return landesstellen;
  }

  /**
   * Legt den Wert der landesstellen-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link Integer }
   */
  public void setLandesstellen(Integer value) {
	this.landesstellen = value;
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
