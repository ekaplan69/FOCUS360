package at.itsv.services.lgkk;

import at.sozvers.stp.lgkk.webservice.focus360.v20.Bearbeiter;
import at.sozvers.stp.lgkk.webservice.focus360.v20.Verarbeitungsmodus;
import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für standardRequestHeader complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="standardRequestHeader">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="applikationsID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://types.services.itsv.at/}bearbeiter"/>
 *         &lt;element name="systemmodus" type="{http://v20.focus360.webservice.lgkk.stp.sozvers.at/}systemmodus"/>
 *         &lt;element name="transaktionsID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="verarbeitungsmodus" type="{http://v20.focus360.webservice.lgkk.stp.sozvers.at/}verarbeitungsmodus"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="standardRequestHeader", propOrder={"applikationsID", "bearbeiter", "systemmodus", "transaktionsID", "verarbeitungsmodus"})
public class StandardRequestHeader {

  @XmlElement(required=true)
  protected String             applikationsID;
  @XmlElement(namespace="http://types.services.itsv.at/", required=true)
  protected Bearbeiter         bearbeiter;
  @XmlElement(required=true)
  protected String             systemmodus;
  @XmlElement(required=true)
  protected String             transaktionsID;
  @XmlElement(required=true)
  protected Verarbeitungsmodus verarbeitungsmodus;

  /**
   * Ruft den Wert der applikationsID-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getApplikationsID() {
	return applikationsID;
  }

  /**
   * Legt den Wert der applikationsID-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setApplikationsID(String value) {
	this.applikationsID = value;
  }

  /**
   * Ruft den Wert der bearbeiter-Eigenschaft ab.
   *
   * @return possible object is {@link Bearbeiter }
   */
  public Bearbeiter getBearbeiter() {
	return bearbeiter;
  }

  /**
   * Legt den Wert der bearbeiter-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link Bearbeiter }
   */
  public void setBearbeiter(Bearbeiter value) {
	this.bearbeiter = value;
  }

  /**
   * Ruft den Wert der systemmodus-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getSystemmodus() {
	return systemmodus;
  }

  /**
   * Legt den Wert der systemmodus-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setSystemmodus(String value) {
	this.systemmodus = value;
  }

  /**
   * Ruft den Wert der transaktionsID-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getTransaktionsID() {
	return transaktionsID;
  }

  /**
   * Legt den Wert der transaktionsID-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setTransaktionsID(String value) {
	this.transaktionsID = value;
  }

  /**
   * Ruft den Wert der verarbeitungsmodus-Eigenschaft ab.
   *
   * @return possible object is {@link Verarbeitungsmodus }
   */
  public Verarbeitungsmodus getVerarbeitungsmodus() {
	return verarbeitungsmodus;
  }

  /**
   * Legt den Wert der verarbeitungsmodus-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link Verarbeitungsmodus }
   */
  public void setVerarbeitungsmodus(Verarbeitungsmodus value) {
	this.verarbeitungsmodus = value;
  }
}
