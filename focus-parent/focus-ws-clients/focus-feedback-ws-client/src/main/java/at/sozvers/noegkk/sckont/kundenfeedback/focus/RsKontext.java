package at.sozvers.noegkk.sckont.kundenfeedback.focus;

import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für RsKontext complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
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
}
