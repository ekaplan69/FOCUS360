package at.siemens.ecard.server.onlineservices.valueobject;

import jakarta.xml.bind.annotation.*;

/**
 * <p>Java class for SVPersonKonsultationV2 complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="SVPersonKonsultationV2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="versicherungsTraegerCodeL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fachgebietCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="konDatum" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="konsultationsID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nr" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="art" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="konErfassungDatum" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="behandlung" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="limit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vvnr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="famName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="versichertenkat" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="kab" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="rebf" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vpnr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="famNameArzt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vorNameArzt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ordination" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="versicherungsTraegerCodeV" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="konStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="limitPruef" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ersatzbelegCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="SVPersonKonsultationV2",
		 propOrder={"versicherungsTraegerCodeL", "fachgebietCode", "konDatum", "konsultationsID", "nr", "art", "konErfassungDatum", "behandlung", "limit", "vvnr", "vorName", "famName",
				 "versichertenkat", "kab", "rebf", "vpnr", "famNameArzt", "vorNameArzt", "ordination", "versicherungsTraegerCodeV", "konStatus", "limitPruef", "ersatzbelegCode"})
public class SVPersonKonsultationV2 {

  @XmlElement(required=true, nillable=true)
  protected String  art;
  @XmlElement(required=true, nillable=true)
  protected String  behandlung;
  protected String  ersatzbelegCode;
  @XmlElement(required=true, nillable=true)
  protected String  fachgebietCode;
  protected String  famName;
  protected String  famNameArzt;
  @XmlElement(required=true, nillable=true)
  protected String  kab;
  @XmlElement(required=true, nillable=true)
  protected String  konDatum;
  @XmlElement(required=true, nillable=true)
  protected String  konErfassungDatum;
  @XmlElement(required=true, nillable=true)
  protected String  konStatus;
  protected long    konsultationsID;
  @XmlElement(required=true, nillable=true)
  protected String  limit;
  @XmlElement(required=true, nillable=true)
  protected String  limitPruef;
  protected int     nr;
  @XmlElement(required=true, nillable=true)
  protected String  ordination;
  @XmlElement(required=true, nillable=true)
  protected String  rebf;
  protected Integer versichertenkat;
  @XmlElement(required=true, nillable=true)
  protected String  versicherungsTraegerCodeL;
  @XmlElement(required=true, nillable=true)
  protected String  versicherungsTraegerCodeV;
  protected String  vorName;
  protected String  vorNameArzt;
  @XmlElement(required=true, nillable=true)
  protected String  vpnr;
  @XmlElement(required=true, nillable=true)
  protected String  vvnr;

  /**
   * Gets the value of the art property.
   *
   * @return possible object is {@link String }
   */
  public String getArt() {
	return art;
  }

  /**
   * Sets the value of the art property.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setArt(String value) {
	this.art = value;
  }

  /**
   * Gets the value of the behandlung property.
   *
   * @return possible object is {@link String }
   */
  public String getBehandlung() {
	return behandlung;
  }

  /**
   * Sets the value of the behandlung property.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setBehandlung(String value) {
	this.behandlung = value;
  }

  /**
   * Gets the value of the ersatzbelegCode property.
   *
   * @return possible object is {@link String }
   */
  public String getErsatzbelegCode() {
	return ersatzbelegCode;
  }

  /**
   * Sets the value of the ersatzbelegCode property.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setErsatzbelegCode(String value) {
	this.ersatzbelegCode = value;
  }

  /**
   * Gets the value of the fachgebietCode property.
   *
   * @return possible object is {@link String }
   */
  public String getFachgebietCode() {
	return fachgebietCode;
  }

  /**
   * Sets the value of the fachgebietCode property.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setFachgebietCode(String value) {
	this.fachgebietCode = value;
  }

  /**
   * Gets the value of the famName property.
   *
   * @return possible object is {@link String }
   */
  public String getFamName() {
	return famName;
  }

  /**
   * Sets the value of the famName property.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setFamName(String value) {
	this.famName = value;
  }

  /**
   * Gets the value of the famNameArzt property.
   *
   * @return possible object is {@link String }
   */
  public String getFamNameArzt() {
	return famNameArzt;
  }

  /**
   * Sets the value of the famNameArzt property.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setFamNameArzt(String value) {
	this.famNameArzt = value;
  }

  /**
   * Gets the value of the kab property.
   *
   * @return possible object is {@link String }
   */
  public String getKab() {
	return kab;
  }

  /**
   * Sets the value of the kab property.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setKab(String value) {
	this.kab = value;
  }

  /**
   * Gets the value of the konDatum property.
   *
   * @return possible object is {@link String }
   */
  public String getKonDatum() {
	return konDatum;
  }

  /**
   * Sets the value of the konDatum property.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setKonDatum(String value) {
	this.konDatum = value;
  }

  /**
   * Gets the value of the konErfassungDatum property.
   *
   * @return possible object is {@link String }
   */
  public String getKonErfassungDatum() {
	return konErfassungDatum;
  }

  /**
   * Sets the value of the konErfassungDatum property.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setKonErfassungDatum(String value) {
	this.konErfassungDatum = value;
  }

  /**
   * Gets the value of the konStatus property.
   *
   * @return possible object is {@link String }
   */
  public String getKonStatus() {
	return konStatus;
  }

  /**
   * Sets the value of the konStatus property.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setKonStatus(String value) {
	this.konStatus = value;
  }

  /**
   * Gets the value of the konsultationsID property.
   */
  public long getKonsultationsID() {
	return konsultationsID;
  }

  /**
   * Sets the value of the konsultationsID property.
   */
  public void setKonsultationsID(long value) {
	this.konsultationsID = value;
  }

  /**
   * Gets the value of the limit property.
   *
   * @return possible object is {@link String }
   */
  public String getLimit() {
	return limit;
  }

  /**
   * Sets the value of the limit property.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setLimit(String value) {
	this.limit = value;
  }

  /**
   * Gets the value of the limitPruef property.
   *
   * @return possible object is {@link String }
   */
  public String getLimitPruef() {
	return limitPruef;
  }

  /**
   * Sets the value of the limitPruef property.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setLimitPruef(String value) {
	this.limitPruef = value;
  }

  /**
   * Gets the value of the nr property.
   */
  public int getNr() {
	return nr;
  }

  /**
   * Sets the value of the nr property.
   */
  public void setNr(int value) {
	this.nr = value;
  }

  /**
   * Gets the value of the ordination property.
   *
   * @return possible object is {@link String }
   */
  public String getOrdination() {
	return ordination;
  }

  /**
   * Sets the value of the ordination property.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setOrdination(String value) {
	this.ordination = value;
  }

  /**
   * Gets the value of the rebf property.
   *
   * @return possible object is {@link String }
   */
  public String getRebf() {
	return rebf;
  }

  /**
   * Sets the value of the rebf property.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setRebf(String value) {
	this.rebf = value;
  }

  /**
   * Gets the value of the versichertenkat property.
   *
   * @return possible object is {@link Integer }
   */
  public Integer getVersichertenkat() {
	return versichertenkat;
  }

  /**
   * Sets the value of the versichertenkat property.
   *
   * @param value
   * 		allowed object is {@link Integer }
   */
  public void setVersichertenkat(Integer value) {
	this.versichertenkat = value;
  }

  /**
   * Gets the value of the versicherungsTraegerCodeL property.
   *
   * @return possible object is {@link String }
   */
  public String getVersicherungsTraegerCodeL() {
	return versicherungsTraegerCodeL;
  }

  /**
   * Sets the value of the versicherungsTraegerCodeL property.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setVersicherungsTraegerCodeL(String value) {
	this.versicherungsTraegerCodeL = value;
  }

  /**
   * Gets the value of the versicherungsTraegerCodeV property.
   *
   * @return possible object is {@link String }
   */
  public String getVersicherungsTraegerCodeV() {
	return versicherungsTraegerCodeV;
  }

  /**
   * Sets the value of the versicherungsTraegerCodeV property.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setVersicherungsTraegerCodeV(String value) {
	this.versicherungsTraegerCodeV = value;
  }

  /**
   * Gets the value of the vorName property.
   *
   * @return possible object is {@link String }
   */
  public String getVorName() {
	return vorName;
  }

  /**
   * Sets the value of the vorName property.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setVorName(String value) {
	this.vorName = value;
  }

  /**
   * Gets the value of the vorNameArzt property.
   *
   * @return possible object is {@link String }
   */
  public String getVorNameArzt() {
	return vorNameArzt;
  }

  /**
   * Sets the value of the vorNameArzt property.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setVorNameArzt(String value) {
	this.vorNameArzt = value;
  }

  /**
   * Gets the value of the vpnr property.
   *
   * @return possible object is {@link String }
   */
  public String getVpnr() {
	return vpnr;
  }

  /**
   * Sets the value of the vpnr property.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setVpnr(String value) {
	this.vpnr = value;
  }

  /**
   * Gets the value of the vvnr property.
   *
   * @return possible object is {@link String }
   */
  public String getVvnr() {
	return vvnr;
  }

  /**
   * Sets the value of the vvnr property.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setVvnr(String value) {
	this.vvnr = value;
  }
}
