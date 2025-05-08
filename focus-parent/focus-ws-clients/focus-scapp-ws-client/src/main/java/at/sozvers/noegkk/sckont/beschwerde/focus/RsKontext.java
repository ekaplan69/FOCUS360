package at.sozvers.noegkk.sckont.beschwerde.focus;

import jakarta.xml.bind.annotation.*;

/**
 * <p>Java class for RsKontext complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="RsKontext">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transaktionsId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="RsKontext", propOrder={"transaktionsId"})
public class RsKontext {

  @XmlElement(required=true)
  protected String transaktionsId;

  /**
   * Gets the value of the transaktionsId property.
   *
   * @return possible object is {@link String }
   */
  public String getTransaktionsId() {
	return transaktionsId;
  }

  /**
   * Sets the value of the transaktionsId property.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setTransaktionsId(String value) {
	this.transaktionsId = value;
  }
}
