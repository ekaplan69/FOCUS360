package at.sozvers.noegkk.sckont.kundenfeedback.focus;

import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für RqKontext complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="RqKontext">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bearbeiter" type="{http://focus.kundenfeedback.sckont.noegkk.sozvers.at/}bearbeiter"/>
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
   * Ruft den Wert der verarbeitungsModus-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getVerarbeitungsModus() {
	return verarbeitungsModus;
  }

  /**
   * Legt den Wert der verarbeitungsModus-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setVerarbeitungsModus(String value) {
	this.verarbeitungsModus = value;
  }
}
