package at.sozvers.focus.ws.generated;

import jakarta.xml.bind.annotation.*;

/**
 * GeschaeftsfallLinkTyp beinhaltet die Informationen zu einer Verlinkung zwischen zwei Geschäftsfällen.
 *
 *
 * <p>Java-Klasse für geschaeftsfallLinkTyp complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="geschaeftsfallLinkTyp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="quelle" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ziel" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="linkTyp" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="istQuelle" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="geschaeftsfallLinkTyp", namespace="http://awf.sozvers.at/schema/geschaeftsfall", propOrder={"quelle", "ziel", "linkTyp", "istQuelle"})
public class GeschaeftsfallLinkTyp {

  @XmlElement(namespace="http://awf.sozvers.at/schema/geschaeftsfall")
  protected boolean istQuelle;
  @XmlElement(namespace="http://awf.sozvers.at/schema/geschaeftsfall", required=true)
  protected String  linkTyp;
  @XmlElement(namespace="http://awf.sozvers.at/schema/geschaeftsfall", required=true)
  protected String  quelle;
  @XmlElement(namespace="http://awf.sozvers.at/schema/geschaeftsfall", required=true)
  protected String  ziel;

  /**
   * Ruft den Wert der linkTyp-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getLinkTyp() {
	return linkTyp;
  }

  /**
   * Legt den Wert der linkTyp-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setLinkTyp(String value) {
	this.linkTyp = value;
  }

  /**
   * Ruft den Wert der quelle-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getQuelle() {
	return quelle;
  }

  /**
   * Legt den Wert der quelle-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setQuelle(String value) {
	this.quelle = value;
  }

  /**
   * Ruft den Wert der ziel-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getZiel() {
	return ziel;
  }

  /**
   * Legt den Wert der ziel-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setZiel(String value) {
	this.ziel = value;
  }

  /**
   * Ruft den Wert der istQuelle-Eigenschaft ab.
   */
  public boolean isIstQuelle() {
	return istQuelle;
  }

  /**
   * Legt den Wert der istQuelle-Eigenschaft fest.
   */
  public void setIstQuelle(boolean value) {
	this.istQuelle = value;
  }
}
