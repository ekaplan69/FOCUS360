package at.sozvers.kva.schema.types;

import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für meldungenParameter complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="meldungenParameter"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="meldungenParameter", propOrder={"value"})
public class MeldungenParameter {

  @XmlAttribute(name="name", required=true)
  protected String name;
  @XmlValue
  protected String value;

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
   * Ruft den Wert der value-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getValue() {
	return value;
  }

  /**
   * Legt den Wert der value-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setValue(String value) {
	this.value = value;
  }
}
