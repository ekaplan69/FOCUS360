package at.sozvers.noegkk.sckont.kontakt.focus;

import java.util.List;
import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für gueltigeOesErmittelnRequest complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="gueltigeOesErmittelnRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://focus.kontakt.sckont.noegkk.sozvers.at/}standardRequest">
 *       &lt;sequence>
 *         &lt;element name="focusRollen" type="{http://focus.kontakt.sckont.noegkk.sozvers.at/}focusRollen" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="gueltigeOesErmittelnRequest", propOrder={"focusRollen"})
public class GueltigeOesErmittelnRequest extends StandardRequest {
  @XmlElement(required=true)
  protected List<String> focusRollen;

  /**
   * Ruft den Wert der focusRollen-Eigenschaft ab.
   *
   * @return possible object is {@link List<String> }
   */
  public List<String> getFocusRollen() {
	return focusRollen;
  }

  /**
   * Legt den Wert der bereOrgs-Eigenschaft fest.
   *
   * @param focusRollen
   * 		allowed object is {@link List<String> }
   */
  public void setFocusRollen(List<String> focusRollen) {
	this.focusRollen = focusRollen;
  }
}
