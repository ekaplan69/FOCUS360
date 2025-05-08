package at.sozvers.noegkk.sckont.kontakt.focus;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für kontaktAufggAaMstMap complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="kontaktAufggAaMstMap">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="abschlussartId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="anzeigenAls" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="aufgabengebietId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="aufggAaMstMapId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="gueltigBis" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="gueltigVon" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="mstCode" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="kontaktAufggAaMstMap", propOrder={"abschlussartId", "anzeigenAls", "aufgabengebietId", "aufggAaMstMapId", "gueltigBis", "gueltigVon", "mstCode"})
public class KontaktAufggAaMstMap {

  protected long                 abschlussartId;
  protected String               anzeigenAls;
  protected long                 aufgabengebietId;
  protected long                 aufggAaMstMapId;
  @XmlElement(required=true)
  @XmlSchemaType(name="dateTime")
  protected XMLGregorianCalendar gueltigBis;
  @XmlElement(required=true)
  @XmlSchemaType(name="dateTime")
  protected XMLGregorianCalendar gueltigVon;
  protected long                 mstCode;

  /**
   * Ruft den Wert der abschlussartId-Eigenschaft ab.
   */
  public long getAbschlussartId() {
	return abschlussartId;
  }

  /**
   * Legt den Wert der abschlussartId-Eigenschaft fest.
   */
  public void setAbschlussartId(long value) {
	this.abschlussartId = value;
  }

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
   * Ruft den Wert der aufggAaMstMapId-Eigenschaft ab.
   */
  public long getAufggAaMstMapId() {
	return aufggAaMstMapId;
  }

  /**
   * Legt den Wert der aufggAaMstMapId-Eigenschaft fest.
   */
  public void setAufggAaMstMapId(long value) {
	this.aufggAaMstMapId = value;
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
}
