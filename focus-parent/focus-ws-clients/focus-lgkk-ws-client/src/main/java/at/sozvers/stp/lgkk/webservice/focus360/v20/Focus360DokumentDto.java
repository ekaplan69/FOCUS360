package at.sozvers.stp.lgkk.webservice.focus360.v20;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für Focus360DokumentDto complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="Focus360DokumentDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dokumentklasse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dokumentreferenz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="einlangdatum" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="kategorie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="thema" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="versendungsart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="Focus360DokumentDto", propOrder={"dokumentklasse", "dokumentreferenz", "einlangdatum", "kategorie", "thema", "versendungsart"})
public class Focus360DokumentDto {

  protected String               dokumentklasse;
  protected String               dokumentreferenz;
  @XmlSchemaType(name="dateTime")
  protected XMLGregorianCalendar einlangdatum;
  protected String               kategorie;
  protected String               thema;
  protected String               versendungsart;

  /**
   * Ruft den Wert der dokumentklasse-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getDokumentklasse() {
	return dokumentklasse;
  }

  /**
   * Legt den Wert der dokumentklasse-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setDokumentklasse(String value) {
	this.dokumentklasse = value;
  }

  /**
   * Ruft den Wert der dokumentreferenz-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getDokumentreferenz() {
	return dokumentreferenz;
  }

  /**
   * Legt den Wert der dokumentreferenz-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setDokumentreferenz(String value) {
	this.dokumentreferenz = value;
  }

  /**
   * Ruft den Wert der einlangdatum-Eigenschaft ab.
   *
   * @return possible object is {@link XMLGregorianCalendar }
   */
  public XMLGregorianCalendar getEinlangdatum() {
	return einlangdatum;
  }

  /**
   * Legt den Wert der einlangdatum-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link XMLGregorianCalendar }
   */
  public void setEinlangdatum(XMLGregorianCalendar value) {
	this.einlangdatum = value;
  }

  /**
   * Ruft den Wert der kategorie-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getKategorie() {
	return kategorie;
  }

  /**
   * Legt den Wert der kategorie-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setKategorie(String value) {
	this.kategorie = value;
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

  /**
   * Ruft den Wert der versendungsart-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getVersendungsart() {
	return versendungsart;
  }

  /**
   * Legt den Wert der versendungsart-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setVersendungsart(String value) {
	this.versendungsart = value;
  }
}
