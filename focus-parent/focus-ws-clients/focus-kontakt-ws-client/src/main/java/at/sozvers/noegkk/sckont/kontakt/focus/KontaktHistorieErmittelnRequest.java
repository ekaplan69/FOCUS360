package at.sozvers.noegkk.sckont.kontakt.focus;

import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für kontaktHistorieErmittelnRequest complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="kontaktHistorieErmittelnRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://focus.kontakt.sckont.noegkk.sozvers.at/}standardRequest">
 *       &lt;sequence>
 *         &lt;element name="mitarbeiterkennung" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="kontaktHistorieErmittelnRequest", propOrder={"mitarbeiterkennung"})
public class KontaktHistorieErmittelnRequest extends StandardRequest {

  @XmlElement(required=true)
  protected String mitarbeiterkennung;

  /**
   * Ruft den Wert der mitarbeiterkennung-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getMitarbeiterkennung() {
	return mitarbeiterkennung;
  }

  /**
   * Legt den Wert der mitarbeiterkennung-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setMitarbeiterkennung(String value) {
	this.mitarbeiterkennung = value;
  }
}
