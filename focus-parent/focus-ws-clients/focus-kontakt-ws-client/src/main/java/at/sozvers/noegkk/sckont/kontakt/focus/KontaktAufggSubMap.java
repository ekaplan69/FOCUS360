package at.sozvers.noegkk.sckont.kontakt.focus;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für kontaktAufggSubMap complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="kontaktAufggSubMap">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="aufgabengebietId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="subAufgabengebietId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="gueltigVon" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="gueltigBis" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="kontaktAufggSubMap", propOrder={"id", "aufgabengebietId", "subAufgabengebietId", "gueltigVon", "gueltigBis"})
public class KontaktAufggSubMap {
  private Long                 aufgabengebietId;
  @XmlElement(required=true)
  @XmlSchemaType(name="dateTime")
  private XMLGregorianCalendar gueltigBis;
  @XmlElement(required=true)
  @XmlSchemaType(name="dateTime")
  private XMLGregorianCalendar gueltigVon;
  private Long                 id;
  private Long                 subAufgabengebietId;

  /**
   * Ruft den Wert der aufgabengebietId-Eigenschaft ab.
   */
  public Long getAufgabengebietId() {
	return aufgabengebietId;
  }

  /**
   * Legt den Wert der aufgabengebietId-Eigenschaft fest.
   */
  public void setAufgabengebietId(Long aufgabengebietId) {
	this.aufgabengebietId = aufgabengebietId;
  }

  /**
   * Ruft den Wert der gueltigBis-Eigenschaft ab.
   */
  public XMLGregorianCalendar getGueltigBis() {
	return gueltigBis;
  }

  /**
   * Legt den Wert der gueltigBis-Eigenschaft fest.
   */
  public void setGueltigBis(XMLGregorianCalendar gueltigBis) {
	this.gueltigBis = gueltigBis;
  }

  /**
   * Ruft den Wert der gueltigVon-Eigenschaft ab.
   */
  public XMLGregorianCalendar getGueltigVon() {
	return gueltigVon;
  }

  /**
   * Legt den Wert der gueltigVon-Eigenschaft fest.
   */
  public void setGueltigVon(XMLGregorianCalendar gueltigVon) {
	this.gueltigVon = gueltigVon;
  }

  /**
   * Ruft den Wert der id-Eigenschaft ab.
   */
  public Long getId() {
	return id;
  }

  /**
   * Legt den Wert der id-Eigenschaft fest.
   */
  public void setId(Long id) {
	this.id = id;
  }

  /**
   * Ruft den Wert der subAufgabengebietId-Eigenschaft ab.
   */
  public Long getSubAufgabengebietId() {
	return subAufgabengebietId;
  }

  /**
   * Legt den Wert der subAufgabengebietId-Eigenschaft fest.
   */
  public void setSubAufgabengebietId(Long subAufgabengebietId) {
	this.subAufgabengebietId = subAufgabengebietId;
  }
}
