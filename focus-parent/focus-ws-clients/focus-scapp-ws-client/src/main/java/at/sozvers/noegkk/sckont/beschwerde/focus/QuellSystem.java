package at.sozvers.noegkk.sckont.beschwerde.focus;

import jakarta.xml.bind.annotation.*;

/**
 * <p>Java class for quellSystem complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="quellSystem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="applikationsId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="systemId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="quellSystem", propOrder={"applikationsId", "systemId"})
public class QuellSystem {

  @XmlElement(required=true)
  protected String applikationsId;
  @XmlElement(required=true)
  protected String systemId;

  /**
   * Gets the value of the applikationsId property.
   *
   * @return possible object is {@link String }
   */
  public String getApplikationsId() {
	return applikationsId;
  }

  /**
   * Sets the value of the applikationsId property.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setApplikationsId(String value) {
	this.applikationsId = value;
  }

  /**
   * Gets the value of the systemId property.
   *
   * @return possible object is {@link String }
   */
  public String getSystemId() {
	return systemId;
  }

  /**
   * Sets the value of the systemId property.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setSystemId(String value) {
	this.systemId = value;
  }
}
