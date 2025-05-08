package at.sozvers.noegkk.sckont.kontakt.focus;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für kontaktkontaktKurz complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="kontaktkontaktKurz">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="abschlussart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="aufgabengebiet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endeTs" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="kontaktart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mitarbeiterOe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scBezeichnung" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startTs" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="thema" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="kontaktkontaktKurz", propOrder={"abschlussart", "aufgabengebiet", "endeTs", "id", "kontaktart", "mitarbeiterOe", "scBezeichnung", "startTs", "thema"})
public class KontaktkontaktKurz {

  protected String               abschlussart;
  protected String               aufgabengebiet;
  @XmlSchemaType(name="dateTime")
  protected XMLGregorianCalendar endeTs;
  protected Long                 id;
  protected String               kontaktart;
  protected String               mitarbeiterOe;
  protected String               scBezeichnung;
  @XmlSchemaType(name="dateTime")
  protected XMLGregorianCalendar startTs;
  protected String               thema;

  /**
   * Ruft den Wert der abschlussart-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getAbschlussart() {
	return abschlussart;
  }

  /**
   * Legt den Wert der abschlussart-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setAbschlussart(String value) {
	this.abschlussart = value;
  }

  /**
   * Ruft den Wert der aufgabengebiet-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getAufgabengebiet() {
	return aufgabengebiet;
  }

  /**
   * Legt den Wert der aufgabengebiet-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setAufgabengebiet(String value) {
	this.aufgabengebiet = value;
  }

  /**
   * Ruft den Wert der endeTs-Eigenschaft ab.
   *
   * @return possible object is {@link XMLGregorianCalendar }
   */
  public XMLGregorianCalendar getEndeTs() {
	return endeTs;
  }

  /**
   * Legt den Wert der endeTs-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link XMLGregorianCalendar }
   */
  public void setEndeTs(XMLGregorianCalendar value) {
	this.endeTs = value;
  }

  /**
   * Ruft den Wert der id-Eigenschaft ab.
   *
   * @return possible object is {@link Long }
   */
  public Long getId() {
	return id;
  }

  /**
   * Legt den Wert der id-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link Long }
   */
  public void setId(Long value) {
	this.id = value;
  }

  /**
   * Ruft den Wert der kontaktart-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getKontaktart() {
	return kontaktart;
  }

  /**
   * Legt den Wert der kontaktart-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setKontaktart(String value) {
	this.kontaktart = value;
  }

  /**
   * Ruft den Wert der mitarbeiterOe-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getMitarbeiterOe() {
	return mitarbeiterOe;
  }

  /**
   * Legt den Wert der mitarbeiterOe-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setMitarbeiterOe(String value) {
	this.mitarbeiterOe = value;
  }

  /**
   * Ruft den Wert der scBezeichnung-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getScBezeichnung() {
	return scBezeichnung;
  }

  /**
   * Legt den Wert der scBezeichnung-Eigenschaft fest.
   *
   * @return possible object is {@link String }
   */
  public void setScBezeichnung(String scBezeichnung) {
	this.scBezeichnung = scBezeichnung;
  }

  /**
   * Ruft den Wert der startTs-Eigenschaft ab.
   *
   * @return possible object is {@link XMLGregorianCalendar }
   */
  public XMLGregorianCalendar getStartTs() {
	return startTs;
  }

  /**
   * Legt den Wert der startTs-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link XMLGregorianCalendar }
   */
  public void setStartTs(XMLGregorianCalendar value) {
	this.startTs = value;
  }

  /**
   * Ruft den Wert der thema-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getThema() {
	return thema;
  }

  /**
   * Legt den Wert der thema-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setThema(String value) {
	this.thema = value;
  }
}
