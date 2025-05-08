package at.sozvers.focus.ws.geschaeftsfall.starten;

import jakarta.xml.bind.annotation.*;

/**
 * FeldTyp beschreibt ein Metadatenfeld mit Name und Wert.
 *
 *
 * <p>Java-Klasse für feldTyp complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="feldTyp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="wert" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="feldTyp", namespace="http://awf.sozvers.at/schema/dokument", propOrder={"name", "wert"})
public class FeldTyp {

  @XmlElement(namespace="http://awf.sozvers.at/schema/dokument", required=true)
  protected String name;
  @XmlElement(namespace="http://awf.sozvers.at/schema/dokument", required=true)
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
