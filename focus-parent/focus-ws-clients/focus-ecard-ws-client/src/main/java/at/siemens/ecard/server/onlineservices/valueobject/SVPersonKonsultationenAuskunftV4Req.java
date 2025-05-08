package at.siemens.ecard.server.onlineservices.valueobject;

import jakarta.xml.bind.annotation.*;

/**
 * <p>Java class for SVPersonKonsultationenAuskunftV4Req complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="SVPersonKonsultationenAuskunftV4Req">
 *   &lt;complexContent>
 *     &lt;extension base="{http://valueobject.onlineservices.server.ecard.siemens.at}StdRequest">
 *       &lt;sequence>
 *         &lt;element name="vsNr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="behandlungAb" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="behandlungBis" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="SVPersonKonsultationenAuskunftV4Req", propOrder={"vsNr", "behandlungAb", "behandlungBis"})
public class SVPersonKonsultationenAuskunftV4Req extends StdRequest {

  @XmlElement(required=true, nillable=true)
  protected String behandlungAb;
  @XmlElement(required=true, nillable=true)
  protected String behandlungBis;
  @XmlElement(required=true, nillable=true)
  protected String vsNr;

  /**
   * Gets the value of the behandlungAb property.
   *
   * @return possible object is {@link String }
   */
  public String getBehandlungAb() {
	return behandlungAb;
  }

  /**
   * Sets the value of the behandlungAb property.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setBehandlungAb(String value) {
	this.behandlungAb = value;
  }

  /**
   * Gets the value of the behandlungBis property.
   *
   * @return possible object is {@link String }
   */
  public String getBehandlungBis() {
	return behandlungBis;
  }

  /**
   * Sets the value of the behandlungBis property.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setBehandlungBis(String value) {
	this.behandlungBis = value;
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
