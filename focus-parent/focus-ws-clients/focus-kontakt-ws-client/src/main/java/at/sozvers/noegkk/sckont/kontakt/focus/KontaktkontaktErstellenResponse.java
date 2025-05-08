package at.sozvers.noegkk.sckont.kontakt.focus;

import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für kontaktkontaktErstellenResponse complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="kontaktkontaktErstellenResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://focus.kontakt.sckont.noegkk.sozvers.at/}standardResponse">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="kontaktkontaktErstellenResponse", propOrder={"id"})
public class KontaktkontaktErstellenResponse extends StandardResponse {

  protected Long id;

  /**
   * Ruft den Wert der id-Eigenschaft ab.
   *
   * @return possible object is {@link Long }
   */
  public Long getId() {
	return id;
  }

  /**
   * Legt den Wert der id-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link Long }
   */
  public void setId(Long value) {
	this.id = value;
  }
}
