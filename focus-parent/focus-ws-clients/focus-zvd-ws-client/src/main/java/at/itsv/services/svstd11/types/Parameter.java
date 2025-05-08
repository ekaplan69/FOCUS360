package at.itsv.services.svstd11.types;

import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für Parameter complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="Parameter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Wert" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="Parameter", propOrder={"name", "wert"})
public class Parameter {

  @XmlElement(name="Name")
  protected String name;
  @XmlElement(name="Wert", required=true)
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
