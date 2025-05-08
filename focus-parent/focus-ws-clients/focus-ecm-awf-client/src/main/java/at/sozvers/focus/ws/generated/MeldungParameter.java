package at.sozvers.focus.ws.generated;

import jakarta.xml.bind.annotation.*;

/**
 * Ein MeldungParamter besteht aus seinem Namen und dem Wert des Parameters.
 *
 *
 * <p>Java-Klasse für MeldungParameter complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="MeldungParameter"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *       &lt;attribute name="name" type="{http://awf.sozvers.at/schema/meldungen}MeldungParamterName" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="MeldungParameter", namespace="http://awf.sozvers.at/schema/meldungen", propOrder={"value"})
public class MeldungParameter {

  @XmlAttribute(name="name")
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
