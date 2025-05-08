package at.sozvers.stp.lgkk.webservice.focus360.v20;

import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für bearbeiter complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="bearbeiter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bearbeiterID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bearbeitungsgrund" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="meldendeStelle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="orgeinheitID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="traegerID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="bearbeiter", propOrder={"bearbeiterID", "bearbeitungsgrund", "meldendeStelle", "orgeinheitID", "traegerID"})
public class Bearbeiter {

  @XmlElement(required=true)
  protected String bearbeiterID;
  protected String bearbeitungsgrund;
  @XmlElement(required=true)
  protected String meldendeStelle;
  @XmlElement(required=true)
  protected String orgeinheitID;
  @XmlElement(required=true)
  protected String traegerID;

  /**
   * Ruft den Wert der bearbeiterID-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getBearbeiterID() {
	return bearbeiterID;
  }

  /**
   * Legt den Wert der bearbeiterID-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setBearbeiterID(String value) {
	this.bearbeiterID = value;
  }

  /**
   * Ruft den Wert der bearbeitungsgrund-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getBearbeitungsgrund() {
	return bearbeitungsgrund;
  }

  /**
   * Legt den Wert der bearbeitungsgrund-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setBearbeitungsgrund(String value) {
	this.bearbeitungsgrund = value;
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
   * Ruft den Wert der orgeinheitID-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getOrgeinheitID() {
	return orgeinheitID;
  }

  /**
   * Legt den Wert der orgeinheitID-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setOrgeinheitID(String value) {
	this.orgeinheitID = value;
  }

  /**
   * Ruft den Wert der traegerID-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getTraegerID() {
	return traegerID;
  }

  /**
   * Legt den Wert der traegerID-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setTraegerID(String value) {
	this.traegerID = value;
  }
}
