package at.sozvers.zvd.ws.versicherungsverhaeltnisselesenservice.v3.types;

import at.itsv.services.svstd11.types.StandardResponse;
import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für VersicherungsverhaeltnisseLesenResponse complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="VersicherungsverhaeltnisseLesenResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://types.svstd11.services.itsv.at/}StandardResponse">
 *       &lt;sequence>
 *         &lt;element name="versicherungsverhaeltnisse" type="{http://sozvers.at/zvd/ws/VersicherungsverhaeltnisseLesenService/v3/types}versicherungsverhaeltnisse"/>
 *         &lt;element name="fehlerliste" type="{http://sozvers.at/zvd/ws/VersicherungsverhaeltnisseLesenService/v3/types}fehlerliste" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="VersicherungsverhaeltnisseLesenResponse", propOrder={"versicherungsverhaeltnisse", "fehlerliste"})
public class VersicherungsverhaeltnisseLesenResponse extends StandardResponse {

  protected Fehlerliste                fehlerliste;
  @XmlElement(required=true)
  protected Versicherungsverhaeltnisse versicherungsverhaeltnisse;

  /**
   * Ruft den Wert der fehlerliste-Eigenschaft ab.
   *
   * @return possible object is {@link Fehlerliste }
   */
  public Fehlerliste getFehlerliste() {
	return fehlerliste;
  }

  /**
   * Legt den Wert der fehlerliste-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link Fehlerliste }
   */
  public void setFehlerliste(Fehlerliste value) {
	this.fehlerliste = value;
  }

  /**
   * Ruft den Wert der versicherungsverhaeltnisse-Eigenschaft ab.
   *
   * @return possible object is {@link Versicherungsverhaeltnisse }
   */
  public Versicherungsverhaeltnisse getVersicherungsverhaeltnisse() {
	return versicherungsverhaeltnisse;
  }

  /**
   * Legt den Wert der versicherungsverhaeltnisse-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link Versicherungsverhaeltnisse }
   */
  public void setVersicherungsverhaeltnisse(Versicherungsverhaeltnisse value) {
	this.versicherungsverhaeltnisse = value;
  }
}
