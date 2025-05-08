package at.siemens.ecard.server.onlineservices.valueobject;

import jakarta.xml.bind.annotation.*;

/**
 * <p>Java class for ECardV2 complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ECardV2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vsNr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="eCard" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="versendeDatum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sperrDatum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sperrGrund" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="kartenStatus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bemerkung" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bemerkungsdatum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eCardZeile1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eCardZeile2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eCardZeile3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ekvk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ekvkBisDatum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ekvkZeile1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ekvkZeile2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="svZerfkEnde" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="meldendeStelle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="absender" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fotoinformationscode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="register" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ausstellungsdatumFotodokument" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="ECardV2",
		 propOrder={"vsNr", "eCard", "versendeDatum", "sperrDatum", "sperrGrund", "kartenStatus", "bemerkung", "bemerkungsdatum", "eCardZeile1", "eCardZeile2", "eCardZeile3", "ekvk", "ekvkBisDatum",
				 "ekvkZeile1", "ekvkZeile2", "svZerfkEnde", "meldendeStelle", "absender", "fotoinformationscode", "register", "ausstellungsdatumFotodokument"})
public class ECardV2 {

  @XmlElement(required=true)
  protected String absender;
  protected String ausstellungsdatumFotodokument;
  protected String bemerkung;
  protected String bemerkungsdatum;
  @XmlElement(required=true)
  protected String eCard;
  protected String eCardZeile1;
  protected String eCardZeile2;
  protected String eCardZeile3;
  protected String ekvk;
  protected String ekvkBisDatum;
  protected String ekvkZeile1;
  protected String ekvkZeile2;
  protected String fotoinformationscode;
  protected int    kartenStatus;
  @XmlElement(required=true)
  protected String meldendeStelle;
  protected String register;
  protected String sperrDatum;
  protected String sperrGrund;
  protected String svZerfkEnde;
  protected String versendeDatum;
  @XmlElement(required=true)
  protected String vsNr;

  /**
   * Gets the value of the absender property.
   *
   * @return possible object is {@link String }
   */
  public String getAbsender() {
	return absender;
  }

  /**
   * Sets the value of the absender property.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setAbsender(String value) {
	this.absender = value;
  }

  /**
   * Gets the value of the ausstellungsdatumFotodokument property.
   *
   * @return possible object is {@link String }
   */
  public String getAusstellungsdatumFotodokument() {
	return ausstellungsdatumFotodokument;
  }

  /**
   * Sets the value of the ausstellungsdatumFotodokument property.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setAusstellungsdatumFotodokument(String value) {
	this.ausstellungsdatumFotodokument = value;
  }

  /**
   * Gets the value of the bemerkung property.
   *
   * @return possible object is {@link String }
   */
  public String getBemerkung() {
	return bemerkung;
  }

  /**
   * Sets the value of the bemerkung property.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setBemerkung(String value) {
	this.bemerkung = value;
  }

  /**
   * Gets the value of the bemerkungsdatum property.
   *
   * @return possible object is {@link String }
   */
  public String getBemerkungsdatum() {
	return bemerkungsdatum;
  }

  /**
   * Sets the value of the bemerkungsdatum property.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setBemerkungsdatum(String value) {
	this.bemerkungsdatum = value;
  }

  /**
   * Gets the value of the eCard property.
   *
   * @return possible object is {@link String }
   */
  public String getECard() {
	return eCard;
  }

  /**
   * Sets the value of the eCard property.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setECard(String value) {
	this.eCard = value;
  }

  /**
   * Gets the value of the eCardZeile1 property.
   *
   * @return possible object is {@link String }
   */
  public String getECardZeile1() {
	return eCardZeile1;
  }

  /**
   * Sets the value of the eCardZeile1 property.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setECardZeile1(String value) {
	this.eCardZeile1 = value;
  }

  /**
   * Gets the value of the eCardZeile2 property.
   *
   * @return possible object is {@link String }
   */
  public String getECardZeile2() {
	return eCardZeile2;
  }

  /**
   * Sets the value of the eCardZeile2 property.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setECardZeile2(String value) {
	this.eCardZeile2 = value;
  }

  /**
   * Gets the value of the eCardZeile3 property.
   *
   * @return possible object is {@link String }
   */
  public String getECardZeile3() {
	return eCardZeile3;
  }

  /**
   * Sets the value of the eCardZeile3 property.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setECardZeile3(String value) {
	this.eCardZeile3 = value;
  }

  /**
   * Gets the value of the ekvk property.
   *
   * @return possible object is {@link String }
   */
  public String getEkvk() {
	return ekvk;
  }

  /**
   * Sets the value of the ekvk property.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setEkvk(String value) {
	this.ekvk = value;
  }

  /**
   * Gets the value of the ekvkBisDatum property.
   *
   * @return possible object is {@link String }
   */
  public String getEkvkBisDatum() {
	return ekvkBisDatum;
  }

  /**
   * Sets the value of the ekvkBisDatum property.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setEkvkBisDatum(String value) {
	this.ekvkBisDatum = value;
  }

  /**
   * Gets the value of the ekvkZeile1 property.
   *
   * @return possible object is {@link String }
   */
  public String getEkvkZeile1() {
	return ekvkZeile1;
  }

  /**
   * Sets the value of the ekvkZeile1 property.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setEkvkZeile1(String value) {
	this.ekvkZeile1 = value;
  }

  /**
   * Gets the value of the ekvkZeile2 property.
   *
   * @return possible object is {@link String }
   */
  public String getEkvkZeile2() {
	return ekvkZeile2;
  }

  /**
   * Sets the value of the ekvkZeile2 property.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setEkvkZeile2(String value) {
	this.ekvkZeile2 = value;
  }

  /**
   * Gets the value of the fotoinformationscode property.
   *
   * @return possible object is {@link String }
   */
  public String getFotoinformationscode() {
	return fotoinformationscode;
  }

  /**
   * Sets the value of the fotoinformationscode property.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setFotoinformationscode(String value) {
	this.fotoinformationscode = value;
  }

  /**
   * Gets the value of the kartenStatus property.
   */
  public int getKartenStatus() {
	return kartenStatus;
  }

  /**
   * Sets the value of the kartenStatus property.
   */
  public void setKartenStatus(int value) {
	this.kartenStatus = value;
  }

  /**
   * Gets the value of the meldendeStelle property.
   *
   * @return possible object is {@link String }
   */
  public String getMeldendeStelle() {
	return meldendeStelle;
  }

  /**
   * Sets the value of the meldendeStelle property.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setMeldendeStelle(String value) {
	this.meldendeStelle = value;
  }

  /**
   * Gets the value of the register property.
   *
   * @return possible object is {@link String }
   */
  public String getRegister() {
	return register;
  }

  /**
   * Sets the value of the register property.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setRegister(String value) {
	this.register = value;
  }

  /**
   * Gets the value of the sperrDatum property.
   *
   * @return possible object is {@link String }
   */
  public String getSperrDatum() {
	return sperrDatum;
  }

  /**
   * Sets the value of the sperrDatum property.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setSperrDatum(String value) {
	this.sperrDatum = value;
  }

  /**
   * Gets the value of the sperrGrund property.
   *
   * @return possible object is {@link String }
   */
  public String getSperrGrund() {
	return sperrGrund;
  }

  /**
   * Sets the value of the sperrGrund property.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setSperrGrund(String value) {
	this.sperrGrund = value;
  }

  /**
   * Gets the value of the svZerfkEnde property.
   *
   * @return possible object is {@link String }
   */
  public String getSvZerfkEnde() {
	return svZerfkEnde;
  }

  /**
   * Sets the value of the svZerfkEnde property.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setSvZerfkEnde(String value) {
	this.svZerfkEnde = value;
  }

  /**
   * Gets the value of the versendeDatum property.
   *
   * @return possible object is {@link String }
   */
  public String getVersendeDatum() {
	return versendeDatum;
  }

  /**
   * Sets the value of the versendeDatum property.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setVersendeDatum(String value) {
	this.versendeDatum = value;
  }

  /**
   * Gets the value of the vsNr property.
   *
   * @return possible object is {@link String }
   */
  public String getVsNr() {
	return vsNr;
  }

  /**
   * Sets the value of the vsNr property.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setVsNr(String value) {
	this.vsNr = value;
  }
}
