package at.sozvers.noegkk.sckont.beschwerde.focus;

import jakarta.xml.bind.annotation.*;

/**
 * <p>Java class for bearbeiter complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="bearbeiter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bearbeiterId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="berechtigungsSystemId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="meldendeStelle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="bearbeiter", propOrder={"bearbeiterId", "berechtigungsSystemId", "meldendeStelle"})
public class Bearbeiter {

  @XmlElement(required=true)
  protected String bearbeiterId;
  @XmlElement(required=true)
  protected String berechtigungsSystemId;
  @XmlElement(required=true)
  protected String meldendeStelle;

  /**
   * Gets the value of the bearbeiterId property.
   *
   * @return possible object is {@link String }
   */
  public String getBearbeiterId() {
	return bearbeiterId;
  }

  /**
   * Sets the value of the bearbeiterId property.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setBearbeiterId(String value) {
	this.bearbeiterId = value;
  }

  /**
   * Gets the value of the berechtigungsSystemId property.
   *
   * @return possible object is {@link String }
   */
  public String getBerechtigungsSystemId() {
	return berechtigungsSystemId;
  }

  /**
   * Sets the value of the berechtigungsSystemId property.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setBerechtigungsSystemId(String value) {
	this.berechtigungsSystemId = value;
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
}
