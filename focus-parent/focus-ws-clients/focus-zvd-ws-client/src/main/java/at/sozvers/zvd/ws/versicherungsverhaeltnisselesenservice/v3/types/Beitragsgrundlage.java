package at.sozvers.zvd.ws.versicherungsverhaeltnisselesenservice.v3.types;

import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;
import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für beitragsgrundlage complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="beitragsgrundlage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bgWert" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="vonDatum" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="bisDatum" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="durchschnittlicheWochenarbeitszeit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="vvhKey" type="{http://sozvers.at/zvd/ws/VersicherungsverhaeltnisseLesenService/v3/types}vvhKey"/>
 *         &lt;element name="waehrungKennzeichen" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="steuerfeld" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="teilentgeltTage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="beitragsgrundlage", propOrder={"bgWert", "vonDatum", "bisDatum", "durchschnittlicheWochenarbeitszeit", "vvhKey", "waehrungKennzeichen", "steuerfeld", "teilentgeltTage"})
@XmlSeeAlso({BeitragsgrundlageJahr.class, BeitragsgrundlageMonat.class})
public class Beitragsgrundlage {

  @XmlElement(required=true)
  protected BigDecimal           bgWert;
  @XmlElement(required=true)
  @XmlSchemaType(name="date")
  protected XMLGregorianCalendar bisDatum;
  protected BigDecimal           durchschnittlicheWochenarbeitszeit;
  @XmlElement(required=true)
  protected String               steuerfeld;
  protected Integer              teilentgeltTage;
  @XmlElement(required=true)
  @XmlSchemaType(name="date")
  protected XMLGregorianCalendar vonDatum;
  @XmlElement(required=true)
  protected VvhKey               vvhKey;
  @XmlElement(required=true)
  protected String               waehrungKennzeichen;

  /**
   * Ruft den Wert der bgWert-Eigenschaft ab.
   *
   * @return possible object is {@link BigDecimal }
   */
  public BigDecimal getBgWert() {
	return bgWert;
  }

  /**
   * Legt den Wert der bgWert-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link BigDecimal }
   */
  public void setBgWert(BigDecimal value) {
	this.bgWert = value;
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
   * Ruft den Wert der durchschnittlicheWochenarbeitszeit-Eigenschaft ab.
   *
   * @return possible object is {@link BigDecimal }
   */
  public BigDecimal getDurchschnittlicheWochenarbeitszeit() {
	return durchschnittlicheWochenarbeitszeit;
  }

  /**
   * Legt den Wert der durchschnittlicheWochenarbeitszeit-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link BigDecimal }
   */
  public void setDurchschnittlicheWochenarbeitszeit(BigDecimal value) {
	this.durchschnittlicheWochenarbeitszeit = value;
  }

  /**
   * Ruft den Wert der steuerfeld-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getSteuerfeld() {
	return steuerfeld;
  }

  /**
   * Legt den Wert der steuerfeld-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setSteuerfeld(String value) {
	this.steuerfeld = value;
  }

  /**
   * Ruft den Wert der teilentgeltTage-Eigenschaft ab.
   *
   * @return possible object is {@link Integer }
   */
  public Integer getTeilentgeltTage() {
	return teilentgeltTage;
  }

  /**
   * Legt den Wert der teilentgeltTage-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link Integer }
   */
  public void setTeilentgeltTage(Integer value) {
	this.teilentgeltTage = value;
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
   * Ruft den Wert der vvhKey-Eigenschaft ab.
   *
   * @return possible object is {@link VvhKey }
   */
  public VvhKey getVvhKey() {
	return vvhKey;
  }

  /**
   * Legt den Wert der vvhKey-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link VvhKey }
   */
  public void setVvhKey(VvhKey value) {
	this.vvhKey = value;
  }

  /**
   * Ruft den Wert der waehrungKennzeichen-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getWaehrungKennzeichen() {
	return waehrungKennzeichen;
  }

  /**
   * Legt den Wert der waehrungKennzeichen-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setWaehrungKennzeichen(String value) {
	this.waehrungKennzeichen = value;
  }
}
