package at.sozvers.noegkk.sckont.kontakt.focus;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für kontaktaufgabengebiet complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="kontaktaufgabengebiet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="anzeigeAls" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="aufgabengebietBezeichnung" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="aufgabengebietHilfetext" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="aufgabengebietId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="gueltigBis" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="gueltigVon" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="subAufgabengebietJN" type="{http://www.w3.org/2001/XMLSchema}character"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="kontaktaufgabengebiet", propOrder={"anzeigeAls", "aufgabengebietBezeichnung", "aufgabengebietHilfetext", "aufgabengebietId", "gueltigBis", "gueltigVon", "subAufgabengebietJN"})
public class Kontaktaufgabengebiet {

  protected String               anzeigeAls;
  @XmlElement(required=true)
  protected String               aufgabengebietBezeichnung;
  protected String               aufgabengebietHilfetext;
  protected long                 aufgabengebietId;
  @XmlElement(required=true)
  @XmlSchemaType(name="dateTime")
  protected XMLGregorianCalendar gueltigBis;
  @XmlElement(required=true)
  @XmlSchemaType(name="dateTime")
  protected XMLGregorianCalendar gueltigVon;
  @XmlSchemaType(name="subAufgabengebietJN")
  protected Character            subAufgabengebietJN;

  /**
   * Ruft den Wert der anzeigeAls-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getAnzeigeAls() {
	return anzeigeAls;
  }

  /**
   * Legt den Wert der anzeigeAls-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setAnzeigeAls(String value) {
	this.anzeigeAls = value;
  }

  /**
   * Ruft den Wert der aufgabengebietBezeichnung-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getAufgabengebietBezeichnung() {
	return aufgabengebietBezeichnung;
  }

  /**
   * Legt den Wert der aufgabengebietBezeichnung-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setAufgabengebietBezeichnung(String value) {
	this.aufgabengebietBezeichnung = value;
  }

  /**
   * Ruft den Wert der aufgabengebietHilfetext-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getAufgabengebietHilfetext() {
	return aufgabengebietHilfetext;
  }

  /**
   * Legt den Wert der aufgabengebietHilfetext-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setAufgabengebietHilfetext(String value) {
	this.aufgabengebietHilfetext = value;
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
   * Ruft den Wert der subAufgabengebietJN-Eigenschaft ab.
   *
   * @return possible object is {@link Character }
   */
  public Character getSubAufgabengebietJN() {
	return subAufgabengebietJN;
  }

  /**
   * Legt den Wert der subAufgabengebietJN-Eigenschaft fest.
   *
   * @param subAufgabengebietJN
   * 		allowed object is {@link Character }
   */
  public void setSubAufgabengebietJN(Character subAufgabengebietJN) {
	this.subAufgabengebietJN = subAufgabengebietJN;
  }
}
