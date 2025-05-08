package at.sozvers.noegkk.sckont.kundenfeedback.focus;

import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für parameter complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="parameter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wert" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="parameter", propOrder={"name", "wert"})
public class Parameter {

  protected String name;
  @XmlElement(required=true)
  protected String wert;

  /**
   * Ruft den Wert der name-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getName() {
	return name;
  }

  /**
   * Legt den Wert der name-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setName(String value) {
	this.name = value;
  }

  /**
   * Ruft den Wert der wert-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getWert() {
	return wert;
  }

  /**
   * Legt den Wert der wert-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setWert(String value) {
	this.wert = value;
  }
}
