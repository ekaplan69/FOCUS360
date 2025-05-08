package at.siemens.ecard.server.onlineservices.valueobject;

import jakarta.xml.bind.annotation.*;

/**
 * <p>Java class for Zustelladresse complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Zustelladresse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="zuakz" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="staatIsoA3" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="postleitzahl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="postort" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="strasse" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="postfach" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="anschriftserwtrg" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="anrede" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="famName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vorName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="titelVorne" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="titelHinten" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="Zustelladresse", propOrder={"zuakz", "staatIsoA3", "postleitzahl", "postort", "strasse", "postfach", "anschriftserwtrg", "anrede", "famName", "vorName", "titelVorne", "titelHinten"})
public class Zustelladresse {

  @XmlElement(required=true, type=Integer.class, nillable=true)
  protected Integer anrede;
  @XmlElement(required=true, nillable=true)
  protected String  anschriftserwtrg;
  @XmlElement(required=true, nillable=true)
  protected String  famName;
  @XmlElement(required=true, nillable=true)
  protected String  postfach;
  @XmlElement(required=true, nillable=true)
  protected String  postleitzahl;
  @XmlElement(required=true, nillable=true)
  protected String  postort;
  @XmlElement(required=true, nillable=true)
  protected String  staatIsoA3;
  @XmlElement(required=true, nillable=true)
  protected String  strasse;
  @XmlElement(required=true, nillable=true)
  protected String  titelHinten;
  @XmlElement(required=true, nillable=true)
  protected String  titelVorne;
  @XmlElement(required=true, nillable=true)
  protected String  vorName;
  @XmlElement(required=true, nillable=true)
  protected String  zuakz;

  /**
   * Gets the value of the anrede property.
   *
   * @return possible object is {@link Integer }
   */
  public Integer getAnrede() {
	return anrede;
  }

  /**
   * Sets the value of the anrede property.
   *
   * @param value
   * 		allowed object is {@link Integer }
   */
  public void setAnrede(Integer value) {
	this.anrede = value;
  }

  /**
   * Gets the value of the anschriftserwtrg property.
   *
   * @return possible object is {@link String }
   */
  public String getAnschriftserwtrg() {
	return anschriftserwtrg;
  }

  /**
   * Sets the value of the anschriftserwtrg property.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setAnschriftserwtrg(String value) {
	this.anschriftserwtrg = value;
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
   * Gets the value of the postfach property.
   *
   * @return possible object is {@link String }
   */
  public String getPostfach() {
	return postfach;
  }

  /**
   * Sets the value of the postfach property.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setPostfach(String value) {
	this.postfach = value;
  }

  /**
   * Gets the value of the postleitzahl property.
   *
   * @return possible object is {@link String }
   */
  public String getPostleitzahl() {
	return postleitzahl;
  }

  /**
   * Sets the value of the postleitzahl property.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setPostleitzahl(String value) {
	this.postleitzahl = value;
  }

  /**
   * Gets the value of the postort property.
   *
   * @return possible object is {@link String }
   */
  public String getPostort() {
	return postort;
  }

  /**
   * Sets the value of the postort property.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setPostort(String value) {
	this.postort = value;
  }

  /**
   * Gets the value of the staatIsoA3 property.
   *
   * @return possible object is {@link String }
   */
  public String getStaatIsoA3() {
	return staatIsoA3;
  }

  /**
   * Sets the value of the staatIsoA3 property.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setStaatIsoA3(String value) {
	this.staatIsoA3 = value;
  }

  /**
   * Gets the value of the strasse property.
   *
   * @return possible object is {@link String }
   */
  public String getStrasse() {
	return strasse;
  }

  /**
   * Sets the value of the strasse property.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setStrasse(String value) {
	this.strasse = value;
  }

  /**
   * Gets the value of the titelHinten property.
   *
   * @return possible object is {@link String }
   */
  public String getTitelHinten() {
	return titelHinten;
  }

  /**
   * Sets the value of the titelHinten property.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setTitelHinten(String value) {
	this.titelHinten = value;
  }

  /**
   * Gets the value of the titelVorne property.
   *
   * @return possible object is {@link String }
   */
  public String getTitelVorne() {
	return titelVorne;
  }

  /**
   * Sets the value of the titelVorne property.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setTitelVorne(String value) {
	this.titelVorne = value;
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
   * Gets the value of the zuakz property.
   *
   * @return possible object is {@link String }
   */
  public String getZuakz() {
	return zuakz;
  }

  /**
   * Sets the value of the zuakz property.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setZuakz(String value) {
	this.zuakz = value;
  }
}
