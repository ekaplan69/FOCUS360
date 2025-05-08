package com.oracle.xmlns.zupws;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für anonymous complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="status" type="{http://xmlns.oracle.com/Zupws}ResponseStatusEnum" form="qualified"/&gt;
 *         &lt;element name="fehlerCode" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/&gt;
 *         &lt;element name="fehlerMessage" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/&gt;
 *         &lt;element name="TrackingID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0" form="qualified"/&gt;
 *         &lt;element name="MessageID" type="{http://xmlns.oracle.com/Zupws}S32" minOccurs="0" form="qualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="", propOrder={"status", "fehlerCode", "fehlerMessage", "trackingID", "messageID"})
@XmlRootElement(name="ZupwsProcessResponse")
public class ZupwsProcessResponse {

  @XmlElement(required=true)
  protected String              fehlerCode;
  @XmlElement(required=true)
  protected String              fehlerMessage;
  @XmlElementRef(name="MessageID", namespace="http://xmlns.oracle.com/Zupws", type=JAXBElement.class, required=false)
  protected JAXBElement<String> messageID;
  @XmlElement(required=true)
  @XmlSchemaType(name="string")
  protected ResponseStatusEnum  status;
  @XmlElementRef(name="TrackingID", namespace="http://xmlns.oracle.com/Zupws", type=JAXBElement.class, required=false)
  protected JAXBElement<Long>   trackingID;

  /**
   * Ruft den Wert der fehlerCode-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getFehlerCode() {
	return fehlerCode;
  }

  /**
   * Legt den Wert der fehlerCode-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setFehlerCode(String value) {
	this.fehlerCode = value;
  }

  /**
   * Ruft den Wert der fehlerMessage-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getFehlerMessage() {
	return fehlerMessage;
  }

  /**
   * Legt den Wert der fehlerMessage-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setFehlerMessage(String value) {
	this.fehlerMessage = value;
  }

  /**
   * Ruft den Wert der messageID-Eigenschaft ab.
   *
   * @return possible object is {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getMessageID() {
	return messageID;
  }

  /**
   * Legt den Wert der messageID-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setMessageID(JAXBElement<String> value) {
	this.messageID = value;
  }

  /**
   * Ruft den Wert der status-Eigenschaft ab.
   *
   * @return possible object is {@link ResponseStatusEnum }
   */
  public ResponseStatusEnum getStatus() {
	return status;
  }

  /**
   * Legt den Wert der status-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link ResponseStatusEnum }
   */
  public void setStatus(ResponseStatusEnum value) {
	this.status = value;
  }

  /**
   * Ruft den Wert der trackingID-Eigenschaft ab.
   *
   * @return possible object is {@link JAXBElement }{@code <}{@link Long }{@code >}
   */
  public JAXBElement<Long> getTrackingID() {
	return trackingID;
  }

  /**
   * Legt den Wert der trackingID-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link JAXBElement }{@code <}{@link Long }{@code >}
   */
  public void setTrackingID(JAXBElement<Long> value) {
	this.trackingID = value;
  }
}
