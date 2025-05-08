package at.siemens.ecard.server.onlineservices.valueobject;

import jakarta.xml.bind.annotation.*;

/**
 * <p>Java class for StdRequest complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="StdRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mxOriginatorId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bearbGrund" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="traegerId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="orgEinheitID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idApp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="StdRequest", propOrder={"mxOriginatorId", "bearbGrund", "traegerId", "version", "orgEinheitID", "idApp"})
@XmlSeeAlso({ECardAuskunftV2Req.class, SVPersonKonsultationenAuskunftV4Req.class})
public class StdRequest {

  @XmlElement(required=true, nillable=true)
  protected String bearbGrund;
  protected String idApp;
  @XmlElement(required=true, nillable=true)
  protected String mxOriginatorId;
  protected String orgEinheitID;
  @XmlElement(required=true, nillable=true)
  protected String traegerId;
  @XmlElement(required=true, nillable=true)
  protected String version;

  /**
   * Gets the value of the bearbGrund property.
   *
   * @return possible object is {@link String }
   */
  public String getBearbGrund() {
	return bearbGrund;
  }

  /**
   * Sets the value of the bearbGrund property.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setBearbGrund(String value) {
	this.bearbGrund = value;
  }

  /**
   * Gets the value of the idApp property.
   *
   * @return possible object is {@link String }
   */
  public String getIdApp() {
	return idApp;
  }

  /**
   * Sets the value of the idApp property.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setIdApp(String value) {
	this.idApp = value;
  }

  /**
   * Gets the value of the mxOriginatorId property.
   *
   * @return possible object is {@link String }
   */
  public String getMxOriginatorId() {
	return mxOriginatorId;
  }

  /**
   * Sets the value of the mxOriginatorId property.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setMxOriginatorId(String value) {
	this.mxOriginatorId = value;
  }

  /**
   * Gets the value of the orgEinheitID property.
   *
   * @return possible object is {@link String }
   */
  public String getOrgEinheitID() {
	return orgEinheitID;
  }

  /**
   * Sets the value of the orgEinheitID property.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setOrgEinheitID(String value) {
	this.orgEinheitID = value;
  }

  /**
   * Gets the value of the traegerId property.
   *
   * @return possible object is {@link String }
   */
  public String getTraegerId() {
	return traegerId;
  }

  /**
   * Sets the value of the traegerId property.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setTraegerId(String value) {
	this.traegerId = value;
  }

  /**
   * Gets the value of the version property.
   *
   * @return possible object is {@link String }
   */
  public String getVersion() {
	return version;
  }

  /**
   * Sets the value of the version property.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setVersion(String value) {
	this.version = value;
  }
}
