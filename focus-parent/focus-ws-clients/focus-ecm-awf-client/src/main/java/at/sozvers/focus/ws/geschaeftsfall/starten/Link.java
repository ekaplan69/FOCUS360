package at.sozvers.focus.ws.geschaeftsfall.starten;

import jakarta.xml.bind.annotation.*;

/**
 * Ein Link besteht aus dem referenzierten Dokument, dem LinkTyp und der Richtung der Verlinkung.
 *
 *
 * <p>Java-Klasse für link complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="link"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="referenziertesDokument" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="linkTyp" type="{http://awf.sozvers.at/schema/dokument}linkTyp"/&gt;
 *         &lt;element name="linkUmdrehen" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="link", namespace="http://awf.sozvers.at/schema/dokument", propOrder={"referenziertesDokument", "linkTyp", "linkUmdrehen"})
public class Link {

  @XmlElement(namespace="http://awf.sozvers.at/schema/dokument", required=true)
  @XmlSchemaType(name="string")
  protected LinkTyp linkTyp;
  @XmlElement(namespace="http://awf.sozvers.at/schema/dokument", defaultValue="false")
  protected Boolean linkUmdrehen;
  @XmlElement(namespace="http://awf.sozvers.at/schema/dokument", required=true)
  protected String  referenziertesDokument;

  /**
   * Ruft den Wert der linkTyp-Eigenschaft ab.
   *
   * @return possible object is {@link LinkTyp }
   */
  public LinkTyp getLinkTyp() {
	return linkTyp;
  }

  /**
   * Legt den Wert der linkTyp-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link LinkTyp }
   */
  public void setLinkTyp(LinkTyp value) {
	this.linkTyp = value;
  }

  /**
   * Ruft den Wert der referenziertesDokument-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getReferenziertesDokument() {
	return referenziertesDokument;
  }

  /**
   * Legt den Wert der referenziertesDokument-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setReferenziertesDokument(String value) {
	this.referenziertesDokument = value;
  }

  /**
   * Ruft den Wert der linkUmdrehen-Eigenschaft ab.
   *
   * @return possible object is {@link Boolean }
   */
  public Boolean isLinkUmdrehen() {
	return linkUmdrehen;
  }

  /**
   * Legt den Wert der linkUmdrehen-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link Boolean }
   */
  public void setLinkUmdrehen(Boolean value) {
	this.linkUmdrehen = value;
  }
}
