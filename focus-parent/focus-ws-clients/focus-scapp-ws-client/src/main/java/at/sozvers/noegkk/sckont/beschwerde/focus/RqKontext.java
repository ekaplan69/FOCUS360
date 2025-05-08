package at.sozvers.noegkk.sckont.beschwerde.focus;

import jakarta.xml.bind.annotation.*;

/**
 * <p>Java class for RqKontext complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="RqKontext">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bearbeiter" type="{http://focus.beschwerde.sckont.noegkk.sozvers.at/}bearbeiter"/>
 *         &lt;element name="bearbeitungsGrund" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="primaerSystemId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="transaktionsId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="verarbeitungsModus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="RqKontext", propOrder={"bearbeiter", "bearbeitungsGrund", "primaerSystemId", "transaktionsId", "verarbeitungsModus"})
public class RqKontext {

  @XmlElement(required=true)
  protected Bearbeiter bearbeiter;
  protected String     bearbeitungsGrund;
  @XmlElement(required=true)
  protected String     primaerSystemId;
  @XmlElement(required=true)
  protected String     transaktionsId;
  @XmlElement(required=true)
  protected String     verarbeitungsModus;

  /**
   * Gets the value of the bearbeiter property.
   *
   * @return possible object is {@link Bearbeiter }
   */
  public Bearbeiter getBearbeiter() {
	return bearbeiter;
  }

  /**
   * Sets the value of the bearbeiter property.
   *
   * @param value
   * 		allowed object is {@link Bearbeiter }
   */
  public void setBearbeiter(Bearbeiter value) {
	this.bearbeiter = value;
  }

  /**
   * Gets the value of the bearbeitungsGrund property.
   *
   * @return possible object is {@link String }
   */
  public String getBearbeitungsGrund() {
	return bearbeitungsGrund;
  }

  /**
   * Sets the value of the bearbeitungsGrund property.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setBearbeitungsGrund(String value) {
	this.bearbeitungsGrund = value;
  }

  /**
   * Gets the value of the primaerSystemId property.
   *
   * @return possible object is {@link String }
   */
  public String getPrimaerSystemId() {
	return primaerSystemId;
  }

  /**
   * Sets the value of the primaerSystemId property.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setPrimaerSystemId(String value) {
	this.primaerSystemId = value;
  }

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

  /**
   * Gets the value of the verarbeitungsModus property.
   *
   * @return possible object is {@link String }
   */
  public String getVerarbeitungsModus() {
	return verarbeitungsModus;
  }

  /**
   * Sets the value of the verarbeitungsModus property.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setVerarbeitungsModus(String value) {
	this.verarbeitungsModus = value;
  }
}
