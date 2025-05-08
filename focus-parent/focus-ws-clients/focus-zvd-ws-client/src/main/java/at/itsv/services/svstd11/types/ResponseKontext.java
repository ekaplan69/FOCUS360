package at.itsv.services.svstd11.types;

import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für ResponseKontext complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="ResponseKontext">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TransaktionsId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="ResponseKontext", propOrder={"transaktionsId"})
public class ResponseKontext {

  @XmlElement(name="TransaktionsId", required=true)
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
