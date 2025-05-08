package at.itsv.services.svstd11.types;

import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für RequestKontext complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="RequestKontext">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TransaktionsId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Verarbeitungsmodus" type="{http://types.svstd11.services.itsv.at/}Verarbeitungsmodus"/>
 *         &lt;element name="PrimaerSystemId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BearbeitungsGrund" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Bearbeiter" type="{http://types.svstd11.services.itsv.at/}Bearbeiter"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="RequestKontext", propOrder={"transaktionsId", "verarbeitungsmodus", "primaerSystemId", "bearbeitungsGrund", "bearbeiter"})
public class RequestKontext {

  @XmlElement(name="Bearbeiter", required=true)
  protected Bearbeiter         bearbeiter;
  @XmlElement(name="BearbeitungsGrund", required=true)
  protected String             bearbeitungsGrund;
  @XmlElement(name="PrimaerSystemId", required=true)
  protected String             primaerSystemId;
  @XmlElement(name="TransaktionsId", required=true)
  protected String             transaktionsId;
  @XmlElement(name="Verarbeitungsmodus", required=true)
  protected Verarbeitungsmodus verarbeitungsmodus;

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
   * Ruft den Wert der bearbeitungsGrund-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getBearbeitungsGrund() {
	return bearbeitungsGrund;
  }

  /**
   * Legt den Wert der bearbeitungsGrund-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setBearbeitungsGrund(String value) {
	this.bearbeitungsGrund = value;
  }

  /**
   * Ruft den Wert der primaerSystemId-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getPrimaerSystemId() {
	return primaerSystemId;
  }

  /**
   * Legt den Wert der primaerSystemId-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setPrimaerSystemId(String value) {
	this.primaerSystemId = value;
  }

  /**
   * Ruft den Wert der transaktionsId-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getTransaktionsId() {
	return transaktionsId;
  }

  /**
   * Legt den Wert der transaktionsId-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setTransaktionsId(String value) {
	this.transaktionsId = value;
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
