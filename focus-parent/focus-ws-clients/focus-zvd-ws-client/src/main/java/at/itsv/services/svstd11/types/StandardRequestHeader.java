package at.itsv.services.svstd11.types;

import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für StandardRequestHeader complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="StandardRequestHeader">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ZielSystem" type="{http://types.svstd11.services.itsv.at/}ZielSystem" minOccurs="0"/>
 *         &lt;element name="QuellSystem" type="{http://types.svstd11.services.itsv.at/}QuellSystem"/>
 *         &lt;element name="Kontext" type="{http://types.svstd11.services.itsv.at/}RequestKontext"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="StandardRequestHeader", propOrder={"zielSystem", "quellSystem", "kontext"})
public class StandardRequestHeader {

  @XmlElement(name="Kontext", required=true)
  protected RequestKontext kontext;
  @XmlElement(name="QuellSystem", required=true)
  protected QuellSystem    quellSystem;
  @XmlElement(name="ZielSystem")
  protected ZielSystem     zielSystem;

  /**
   * Ruft den Wert der kontext-Eigenschaft ab.
   *
   * @return possible object is {@link RequestKontext }
   */
  public RequestKontext getKontext() {
	return kontext;
  }

  /**
   * Legt den Wert der kontext-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link RequestKontext }
   */
  public void setKontext(RequestKontext value) {
	this.kontext = value;
  }

  /**
   * Ruft den Wert der quellSystem-Eigenschaft ab.
   *
   * @return possible object is {@link QuellSystem }
   */
  public QuellSystem getQuellSystem() {
	return quellSystem;
  }

  /**
   * Legt den Wert der quellSystem-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link QuellSystem }
   */
  public void setQuellSystem(QuellSystem value) {
	this.quellSystem = value;
  }

  /**
   * Ruft den Wert der zielSystem-Eigenschaft ab.
   *
   * @return possible object is {@link ZielSystem }
   */
  public ZielSystem getZielSystem() {
	return zielSystem;
  }

  /**
   * Legt den Wert der zielSystem-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link ZielSystem }
   */
  public void setZielSystem(ZielSystem value) {
	this.zielSystem = value;
  }
}
