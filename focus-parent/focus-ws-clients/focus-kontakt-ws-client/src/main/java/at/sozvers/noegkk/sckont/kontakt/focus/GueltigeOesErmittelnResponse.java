package at.sozvers.noegkk.sckont.kontakt.focus;

import java.util.Collections;
import java.util.List;
import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für gueltigeOesErmittelnResponse complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="gueltigeOesErmittelnResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://focus.kontakt.sckont.noegkk.sozvers.at/}standardResponse">
 *       &lt;sequence>
 *         &lt;element name="gueltigeOes" type="{http://focus.kontakt.sckont.noegkk.sozvers.at/}gueltigeOes" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="gueltigeOesErmittelnResponse", propOrder={"gueltigeOes"})
public class GueltigeOesErmittelnResponse extends StandardResponse {
  @XmlElement(nillable=true)
  protected List<GueltigeOe> gueltigeOes;

  /**
   * Gets the value of the kontaktkontakteKurz property.
   *
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object. This is why there is
   * not a <CODE>set</CODE> method for the kontaktkontakteKurz property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getKontaktkontakteKurz().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list {@link KontaktkontaktKurz }
   */
  public List<GueltigeOe> getGueltigeOes() {
	if(gueltigeOes == null || gueltigeOes.isEmpty()) {
	  return Collections.emptyList();
	}
	return gueltigeOes;
  }
}
