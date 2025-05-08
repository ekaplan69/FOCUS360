package at.sozvers.zvd.ws.versicherungsverhaeltnisselesenservice.v3.types;

import javax.xml.datatype.XMLGregorianCalendar;
import at.itsv.services.svstd11.types.StandardRequest;
import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für VersicherungsverhaeltnisseLesenRequest complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="VersicherungsverhaeltnisseLesenRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://types.svstd11.services.itsv.at/}StandardRequest">
 *       &lt;sequence>
 *         &lt;element name="versicherungsnummer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vonDatum" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="bisDatum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="hvbBeitragskontonummer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="meldendeStelle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="kontonummerKennzeichen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bgErmitteln" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="beitragsgrundlageFilter" type="{http://sozvers.at/zvd/ws/VersicherungsverhaeltnisseLesenService/v3/types}beitragsgrundlageFilter" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="VersicherungsverhaeltnisseLesenRequest",
		 propOrder={"versicherungsnummer", "vonDatum", "bisDatum", "hvbBeitragskontonummer", "meldendeStelle", "kontonummerKennzeichen", "bgErmitteln", "beitragsgrundlageFilter"})
public class VersicherungsverhaeltnisseLesenRequest extends StandardRequest {

  protected BeitragsgrundlageFilter beitragsgrundlageFilter;
  protected boolean                 bgErmitteln;
  @XmlSchemaType(name="date")
  protected XMLGregorianCalendar    bisDatum;
  protected String                  hvbBeitragskontonummer;
  protected String                  kontonummerKennzeichen;
  protected String                  meldendeStelle;
  @XmlElement(required=true)
  protected String                  versicherungsnummer;
  @XmlElement(required=true)
  @XmlSchemaType(name="date")
  protected XMLGregorianCalendar    vonDatum;

  /**
   * Ruft den Wert der beitragsgrundlageFilter-Eigenschaft ab.
   *
   * @return possible object is {@link BeitragsgrundlageFilter }
   */
  public BeitragsgrundlageFilter getBeitragsgrundlageFilter() {
	return beitragsgrundlageFilter;
  }

  /**
   * Legt den Wert der beitragsgrundlageFilter-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link BeitragsgrundlageFilter }
   */
  public void setBeitragsgrundlageFilter(BeitragsgrundlageFilter value) {
	this.beitragsgrundlageFilter = value;
  }

  /**
   * Ruft den Wert der bisDatum-Eigenschaft ab.
   *
   * @return possible object is {@link XMLGregorianCalendar }
   */
  public XMLGregorianCalendar getBisDatum() {
	return bisDatum;
  }

  /**
   * Legt den Wert der bisDatum-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link XMLGregorianCalendar }
   */
  public void setBisDatum(XMLGregorianCalendar value) {
	this.bisDatum = value;
  }

  /**
   * Ruft den Wert der hvbBeitragskontonummer-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getHvbBeitragskontonummer() {
	return hvbBeitragskontonummer;
  }

  /**
   * Legt den Wert der hvbBeitragskontonummer-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setHvbBeitragskontonummer(String value) {
	this.hvbBeitragskontonummer = value;
  }

  /**
   * Ruft den Wert der kontonummerKennzeichen-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getKontonummerKennzeichen() {
	return kontonummerKennzeichen;
  }

  /**
   * Legt den Wert der kontonummerKennzeichen-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setKontonummerKennzeichen(String value) {
	this.kontonummerKennzeichen = value;
  }

  /**
   * Ruft den Wert der meldendeStelle-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getMeldendeStelle() {
	return meldendeStelle;
  }

  /**
   * Legt den Wert der meldendeStelle-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setMeldendeStelle(String value) {
	this.meldendeStelle = value;
  }

  /**
   * Ruft den Wert der versicherungsnummer-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getVersicherungsnummer() {
	return versicherungsnummer;
  }

  /**
   * Legt den Wert der versicherungsnummer-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setVersicherungsnummer(String value) {
	this.versicherungsnummer = value;
  }

  /**
   * Ruft den Wert der vonDatum-Eigenschaft ab.
   *
   * @return possible object is {@link XMLGregorianCalendar }
   */
  public XMLGregorianCalendar getVonDatum() {
	return vonDatum;
  }

  /**
   * Legt den Wert der vonDatum-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link XMLGregorianCalendar }
   */
  public void setVonDatum(XMLGregorianCalendar value) {
	this.vonDatum = value;
  }

  /**
   * Ruft den Wert der bgErmitteln-Eigenschaft ab.
   */
  public boolean isBgErmitteln() {
	return bgErmitteln;
  }

  /**
   * Legt den Wert der bgErmitteln-Eigenschaft fest.
   */
  public void setBgErmitteln(boolean value) {
	this.bgErmitteln = value;
  }
}
