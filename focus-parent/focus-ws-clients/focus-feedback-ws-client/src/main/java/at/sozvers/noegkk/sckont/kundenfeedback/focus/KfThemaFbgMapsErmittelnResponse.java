package at.sozvers.noegkk.sckont.kundenfeedback.focus;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für kfThemaFbgMapsErmittelnResponse complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="kfThemaFbgMapsErmittelnResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://focus.kundenfeedback.sckont.noegkk.sozvers.at/}standardResponse">
 *       &lt;sequence>
 *         &lt;element name="kfThemaFbgMaps" type="{http://focus.kundenfeedback.sckont.noegkk.sozvers.at/}kfThemaFbgMap" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="kfThemaFbgMapsErmittelnResponse", propOrder={"kfThemaFbgMaps"})
public class KfThemaFbgMapsErmittelnResponse extends StandardResponse {

  @XmlElement(nillable=true)
  protected List<KfThemaFbgMap> kfThemaFbgMaps;

  /**
   * Gets the value of the kfThemaFbgMaps property.
   *
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object. This is why there is
   * not a <CODE>set</CODE> method for the kfThemaFbgMaps property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getKfThemaFbgMaps().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list {@link KfThemaFbgMap }
   */
  public List<KfThemaFbgMap> getKfThemaFbgMaps() {
	if(kfThemaFbgMaps == null) {
	  kfThemaFbgMaps = new ArrayList<KfThemaFbgMap>();
	}
	return this.kfThemaFbgMaps;
  }
}
