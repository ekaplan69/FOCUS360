package at.itsv.services.svstd11.types;

import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für Bearbeiter complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="Bearbeiter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BerechtigungsSystemId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BearbeiterId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MeldendeStelle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="Bearbeiter", propOrder={"berechtigungsSystemId", "bearbeiterId", "meldendeStelle"})
public class Bearbeiter {

  @XmlElement(name="BearbeiterId", required=true)
  protected String bearbeiterId;
  @XmlElement(name="BerechtigungsSystemId", required=true)
  protected String berechtigungsSystemId;
  @XmlElement(name="MeldendeStelle", required=true)
  protected String meldendeStelle;

  /**
   * Ruft den Wert der bearbeiterId-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getBearbeiterId() {
	return bearbeiterId;
  }

  /**
   * Legt den Wert der bearbeiterId-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setBearbeiterId(String value) {
	this.bearbeiterId = value;
  }

  /**
   * Ruft den Wert der berechtigungsSystemId-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getBerechtigungsSystemId() {
	return berechtigungsSystemId;
  }

  /**
   * Legt den Wert der berechtigungsSystemId-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setBerechtigungsSystemId(String value) {
	this.berechtigungsSystemId = value;
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
}
