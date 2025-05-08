package at.sozvers.kva.schema.ermittle_krankenversicherungsanspruch;

import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für krankenversicherungsanspruch complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="krankenversicherungsanspruch"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="kvTraegerKurz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vorname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nachname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gebuehrenbefreiung" type="{http://kva.sozvers.at/schema/ermittle-krankenversicherungsanspruch}gebuehrenbefreiung" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="geburtsdatumVersicherter" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="kvAnspruch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="kvaOnline" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="kvaEcs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="anspruchZusatzInformation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="kvanspruchBezeichnung" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="kvanspruchKurz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="meldendeStelle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="wurdeGeburtsdatumErmittelt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="qualifikation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="versichertenartBezeichnung" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="versichertenart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="versichertenkategorie" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="versichertenkategoriebezeichnung" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="versicherungsnummerVers" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="erstellungsphaseBezeichnung" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="krankenversicherungsanspruch",
		 propOrder={"kvTraegerKurz", "vorname", "nachname", "gebuehrenbefreiung", "geburtsdatumVersicherter", "kvAnspruch", "kvaOnline", "kvaEcs", "anspruchZusatzInformation", "kvanspruchBezeichnung",
				 "kvanspruchKurz", "meldendeStelle", "wurdeGeburtsdatumErmittelt", "qualifikation", "versichertenartBezeichnung", "versichertenart", "versichertenkategorie",
				 "versichertenkategoriebezeichnung", "versicherungsnummerVers", "erstellungsphaseBezeichnung"})
public class Krankenversicherungsanspruch {

  protected String                   anspruchZusatzInformation;
  protected String                   erstellungsphaseBezeichnung;
  @XmlElement(nillable=true)
  protected List<Gebuehrenbefreiung> gebuehrenbefreiung;
  @XmlSchemaType(name="date")
  protected XMLGregorianCalendar     geburtsdatumVersicherter;
  protected String                   kvAnspruch;
  protected String                   kvTraegerKurz;
  protected String                   kvaEcs;
  protected Boolean                  kvaOnline;
  protected String                   kvanspruchBezeichnung;
  protected String                   kvanspruchKurz;
  protected String                   meldendeStelle;
  protected String                   nachname;
  protected String                   qualifikation;
  protected String                   versichertenart;
  protected String                   versichertenartBezeichnung;
  protected Integer                  versichertenkategorie;
  protected String                   versichertenkategoriebezeichnung;
  protected String                   versicherungsnummerVers;
  protected String                   vorname;
  protected Boolean                  wurdeGeburtsdatumErmittelt;

  /**
   * Ruft den Wert der anspruchZusatzInformation-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getAnspruchZusatzInformation() {
	return anspruchZusatzInformation;
  }

  /**
   * Legt den Wert der anspruchZusatzInformation-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setAnspruchZusatzInformation(String value) {
	this.anspruchZusatzInformation = value;
  }

  /**
   * Ruft den Wert der erstellungsphaseBezeichnung-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getErstellungsphaseBezeichnung() {
	return erstellungsphaseBezeichnung;
  }

  /**
   * Legt den Wert der erstellungsphaseBezeichnung-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setErstellungsphaseBezeichnung(String value) {
	this.erstellungsphaseBezeichnung = value;
  }

  /**
   * Gets the value of the gebuehrenbefreiung property.
   *
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object. This is why there is
   * not a <CODE>set</CODE> method for the gebuehrenbefreiung property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getGebuehrenbefreiung().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list {@link Gebuehrenbefreiung }
   */
  public List<Gebuehrenbefreiung> getGebuehrenbefreiung() {
	if(gebuehrenbefreiung == null) {
	  gebuehrenbefreiung = new ArrayList<Gebuehrenbefreiung>();
	}
	return this.gebuehrenbefreiung;
  }

  /**
   * Ruft den Wert der geburtsdatumVersicherter-Eigenschaft ab.
   *
   * @return possible object is {@link XMLGregorianCalendar }
   */
  public XMLGregorianCalendar getGeburtsdatumVersicherter() {
	return geburtsdatumVersicherter;
  }

  /**
   * Legt den Wert der geburtsdatumVersicherter-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link XMLGregorianCalendar }
   */
  public void setGeburtsdatumVersicherter(XMLGregorianCalendar value) {
	this.geburtsdatumVersicherter = value;
  }

  /**
   * Ruft den Wert der kvAnspruch-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getKvAnspruch() {
	return kvAnspruch;
  }

  /**
   * Legt den Wert der kvAnspruch-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setKvAnspruch(String value) {
	this.kvAnspruch = value;
  }

  /**
   * Ruft den Wert der kvTraegerKurz-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getKvTraegerKurz() {
	return kvTraegerKurz;
  }

  /**
   * Legt den Wert der kvTraegerKurz-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setKvTraegerKurz(String value) {
	this.kvTraegerKurz = value;
  }

  /**
   * Ruft den Wert der kvaEcs-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getKvaEcs() {
	return kvaEcs;
  }

  /**
   * Legt den Wert der kvaEcs-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setKvaEcs(String value) {
	this.kvaEcs = value;
  }

  /**
   * Ruft den Wert der kvanspruchBezeichnung-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getKvanspruchBezeichnung() {
	return kvanspruchBezeichnung;
  }

  /**
   * Legt den Wert der kvanspruchBezeichnung-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setKvanspruchBezeichnung(String value) {
	this.kvanspruchBezeichnung = value;
  }

  /**
   * Ruft den Wert der kvanspruchKurz-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getKvanspruchKurz() {
	return kvanspruchKurz;
  }

  /**
   * Legt den Wert der kvanspruchKurz-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setKvanspruchKurz(String value) {
	this.kvanspruchKurz = value;
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
   * Ruft den Wert der nachname-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getNachname() {
	return nachname;
  }

  /**
   * Legt den Wert der nachname-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setNachname(String value) {
	this.nachname = value;
  }

  /**
   * Ruft den Wert der qualifikation-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getQualifikation() {
	return qualifikation;
  }

  /**
   * Legt den Wert der qualifikation-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setQualifikation(String value) {
	this.qualifikation = value;
  }

  /**
   * Ruft den Wert der versichertenart-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getVersichertenart() {
	return versichertenart;
  }

  /**
   * Legt den Wert der versichertenart-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setVersichertenart(String value) {
	this.versichertenart = value;
  }

  /**
   * Ruft den Wert der versichertenartBezeichnung-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getVersichertenartBezeichnung() {
	return versichertenartBezeichnung;
  }

  /**
   * Legt den Wert der versichertenartBezeichnung-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setVersichertenartBezeichnung(String value) {
	this.versichertenartBezeichnung = value;
  }

  /**
   * Ruft den Wert der versichertenkategorie-Eigenschaft ab.
   *
   * @return possible object is {@link Integer }
   */
  public Integer getVersichertenkategorie() {
	return versichertenkategorie;
  }

  /**
   * Legt den Wert der versichertenkategorie-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link Integer }
   */
  public void setVersichertenkategorie(Integer value) {
	this.versichertenkategorie = value;
  }

  /**
   * Ruft den Wert der versichertenkategoriebezeichnung-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getVersichertenkategoriebezeichnung() {
	return versichertenkategoriebezeichnung;
  }

  /**
   * Legt den Wert der versichertenkategoriebezeichnung-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setVersichertenkategoriebezeichnung(String value) {
	this.versichertenkategoriebezeichnung = value;
  }

  /**
   * Ruft den Wert der versicherungsnummerVers-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getVersicherungsnummerVers() {
	return versicherungsnummerVers;
  }

  /**
   * Legt den Wert der versicherungsnummerVers-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setVersicherungsnummerVers(String value) {
	this.versicherungsnummerVers = value;
  }

  /**
   * Ruft den Wert der vorname-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getVorname() {
	return vorname;
  }

  /**
   * Legt den Wert der vorname-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setVorname(String value) {
	this.vorname = value;
  }

  /**
   * Ruft den Wert der kvaOnline-Eigenschaft ab.
   *
   * @return possible object is {@link Boolean }
   */
  public Boolean isKvaOnline() {
	return kvaOnline;
  }

  /**
   * Ruft den Wert der wurdeGeburtsdatumErmittelt-Eigenschaft ab.
   *
   * @return possible object is {@link Boolean }
   */
  public Boolean isWurdeGeburtsdatumErmittelt() {
	return wurdeGeburtsdatumErmittelt;
  }

  /**
   * Legt den Wert der kvaOnline-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link Boolean }
   */
  public void setKvaOnline(Boolean value) {
	this.kvaOnline = value;
  }

  /**
   * Legt den Wert der wurdeGeburtsdatumErmittelt-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link Boolean }
   */
  public void setWurdeGeburtsdatumErmittelt(Boolean value) {
	this.wurdeGeburtsdatumErmittelt = value;
  }
}
