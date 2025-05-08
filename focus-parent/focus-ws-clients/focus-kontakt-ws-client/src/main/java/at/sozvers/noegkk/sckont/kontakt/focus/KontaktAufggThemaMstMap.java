package at.sozvers.noegkk.sckont.kontakt.focus;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für kontaktAufggThemaMstMap complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="kontaktAufggThemaMstMap">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="anzeigenAls" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="aufgabengebietId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="aufggThemaMstMapId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="gueltigBis" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="gueltigVon" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="mstCode" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="themaId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="kontaktAufggThemaMstMap", propOrder={"anzeigenAls", "aufgabengebietId", "aufggThemaMstMapId", "gueltigBis", "gueltigVon", "mstCode", "themaId"})
public class KontaktAufggThemaMstMap {

  protected String               anzeigenAls;
  protected long                 aufgabengebietId;
  protected long                 aufggThemaMstMapId;
  @XmlElement(required=true)
  @XmlSchemaType(name="dateTime")
  protected XMLGregorianCalendar gueltigBis;
  @XmlElement(required=true)
  @XmlSchemaType(name="dateTime")
  protected XMLGregorianCalendar gueltigVon;
  protected long                 mstCode;
  protected long                 themaId;

  /**
   * Ruft den Wert der anzeigenAls-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getAnzeigenAls() {
	return anzeigenAls;
  }

  /**
   * Legt den Wert der anzeigenAls-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setAnzeigenAls(String value) {
	this.anzeigenAls = value;
  }

  /**
   * Ruft den Wert der aufgabengebietId-Eigenschaft ab.
   */
  public long getAufgabengebietId() {
	return aufgabengebietId;
  }

  /**
   * Legt den Wert der aufgabengebietId-Eigenschaft fest.
   */
  public void setAufgabengebietId(long value) {
	this.aufgabengebietId = value;
  }

  /**
   * Ruft den Wert der aufggThemaMstMapId-Eigenschaft ab.
   */
  public long getAufggThemaMstMapId() {
	return aufggThemaMstMapId;
  }

  /**
   * Legt den Wert der aufggThemaMstMapId-Eigenschaft fest.
   */
  public void setAufggThemaMstMapId(long value) {
	this.aufggThemaMstMapId = value;
  }

  /**
   * Ruft den Wert der gueltigBis-Eigenschaft ab.
   *
   * @return possible object is {@link XMLGregorianCalendar }
   */
  public XMLGregorianCalendar getGueltigBis() {
	return gueltigBis;
  }

  /**
   * Legt den Wert der gueltigBis-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link XMLGregorianCalendar }
   */
  public void setGueltigBis(XMLGregorianCalendar value) {
	this.gueltigBis = value;
  }

  /**
   * Ruft den Wert der gueltigVon-Eigenschaft ab.
   *
   * @return possible object is {@link XMLGregorianCalendar }
   */
  public XMLGregorianCalendar getGueltigVon() {
	return gueltigVon;
  }

  /**
   * Legt den Wert der gueltigVon-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link XMLGregorianCalendar }
   */
  public void setGueltigVon(XMLGregorianCalendar value) {
	this.gueltigVon = value;
  }

  /**
   * Ruft den Wert der mstCode-Eigenschaft ab.
   */
  public long getMstCode() {
	return mstCode;
  }

  /**
   * Legt den Wert der mstCode-Eigenschaft fest.
   */
  public void setMstCode(long value) {
	this.mstCode = value;
  }

  /**
   * Ruft den Wert der themaId-Eigenschaft ab.
   */
  public long getThemaId() {
	return themaId;
  }

  /**
   * Legt den Wert der themaId-Eigenschaft fest.
   */
  public void setThemaId(long value) {
	this.themaId = value;
  }
}
