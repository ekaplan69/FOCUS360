package at.sozvers.zvd.ws.versicherungsverhaeltnisselesenservice.v3.types;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für versicherungsverhaeltnis complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="versicherungsverhaeltnis">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hvbBeitragskontonummer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vvhKey" type="{http://sozvers.at/zvd/ws/VersicherungsverhaeltnisseLesenService/v3/types}vvhKey"/>
 *         &lt;element name="hvbBeitragskontonummerKennzeichen" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="laufnummer" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="meldendeStelle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="aenderungsdatum" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="bearbeiter" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="updateCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="versicherungszeiten" type="{http://sozvers.at/zvd/ws/VersicherungsverhaeltnisseLesenService/v3/types}versicherungszeiten"/>
 *         &lt;element name="beitragsgrundlagenJahr" type="{http://sozvers.at/zvd/ws/VersicherungsverhaeltnisseLesenService/v3/types}beitragsgrundlagenJahr"/>
 *         &lt;element name="beitragsgrundlagenMonat" type="{http://sozvers.at/zvd/ws/VersicherungsverhaeltnisseLesenService/v3/types}beitragsgrundlagenMonat"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="versicherungsverhaeltnis",
		 propOrder={"hvbBeitragskontonummer", "vvhKey", "hvbBeitragskontonummerKennzeichen", "laufnummer", "meldendeStelle", "aenderungsdatum", "bearbeiter", "updateCount", "versicherungszeiten",
				 "beitragsgrundlagenJahr", "beitragsgrundlagenMonat"})
public class Versicherungsverhaeltnis {

  @XmlElement(required=true)
  @XmlSchemaType(name="date")
  protected XMLGregorianCalendar    aenderungsdatum;
  @XmlElement(required=true)
  protected String                  bearbeiter;
  @XmlElement(required=true)
  protected BeitragsgrundlagenJahr  beitragsgrundlagenJahr;
  @XmlElement(required=true)
  protected BeitragsgrundlagenMonat beitragsgrundlagenMonat;
  @XmlElement(required=true)
  protected String                  hvbBeitragskontonummer;
  @XmlElement(required=true)
  protected String                  hvbBeitragskontonummerKennzeichen;
  protected int                     laufnummer;
  @XmlElement(required=true)
  protected String                  meldendeStelle;
  protected int                     updateCount;
  @XmlElement(required=true)
  protected Versicherungszeiten     versicherungszeiten;
  @XmlElement(required=true)
  protected VvhKey                  vvhKey;

  /**
   * Ruft den Wert der aenderungsdatum-Eigenschaft ab.
   *
   * @return possible object is {@link XMLGregorianCalendar }
   */
  public XMLGregorianCalendar getAenderungsdatum() {
	return aenderungsdatum;
  }

  /**
   * Legt den Wert der aenderungsdatum-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link XMLGregorianCalendar }
   */
  public void setAenderungsdatum(XMLGregorianCalendar value) {
	this.aenderungsdatum = value;
  }

  /**
   * Ruft den Wert der bearbeiter-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getBearbeiter() {
	return bearbeiter;
  }

  /**
   * Legt den Wert der bearbeiter-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setBearbeiter(String value) {
	this.bearbeiter = value;
  }

  /**
   * Ruft den Wert der beitragsgrundlagenJahr-Eigenschaft ab.
   *
   * @return possible object is {@link BeitragsgrundlagenJahr }
   */
  public BeitragsgrundlagenJahr getBeitragsgrundlagenJahr() {
	return beitragsgrundlagenJahr;
  }

  /**
   * Legt den Wert der beitragsgrundlagenJahr-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link BeitragsgrundlagenJahr }
   */
  public void setBeitragsgrundlagenJahr(BeitragsgrundlagenJahr value) {
	this.beitragsgrundlagenJahr = value;
  }

  /**
   * Ruft den Wert der beitragsgrundlagenMonat-Eigenschaft ab.
   *
   * @return possible object is {@link BeitragsgrundlagenMonat }
   */
  public BeitragsgrundlagenMonat getBeitragsgrundlagenMonat() {
	return beitragsgrundlagenMonat;
  }

  /**
   * Legt den Wert der beitragsgrundlagenMonat-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link BeitragsgrundlagenMonat }
   */
  public void setBeitragsgrundlagenMonat(BeitragsgrundlagenMonat value) {
	this.beitragsgrundlagenMonat = value;
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
   * Ruft den Wert der hvbBeitragskontonummerKennzeichen-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getHvbBeitragskontonummerKennzeichen() {
	return hvbBeitragskontonummerKennzeichen;
  }

  /**
   * Legt den Wert der hvbBeitragskontonummerKennzeichen-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setHvbBeitragskontonummerKennzeichen(String value) {
	this.hvbBeitragskontonummerKennzeichen = value;
  }

  /**
   * Ruft den Wert der laufnummer-Eigenschaft ab.
   */
  public int getLaufnummer() {
	return laufnummer;
  }

  /**
   * Legt den Wert der laufnummer-Eigenschaft fest.
   */
  public void setLaufnummer(int value) {
	this.laufnummer = value;
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
   * Ruft den Wert der updateCount-Eigenschaft ab.
   */
  public int getUpdateCount() {
	return updateCount;
  }

  /**
   * Legt den Wert der updateCount-Eigenschaft fest.
   */
  public void setUpdateCount(int value) {
	this.updateCount = value;
  }

  /**
   * Ruft den Wert der versicherungszeiten-Eigenschaft ab.
   *
   * @return possible object is {@link Versicherungszeiten }
   */
  public Versicherungszeiten getVersicherungszeiten() {
	return versicherungszeiten;
  }

  /**
   * Legt den Wert der versicherungszeiten-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link Versicherungszeiten }
   */
  public void setVersicherungszeiten(Versicherungszeiten value) {
	this.versicherungszeiten = value;
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
}
