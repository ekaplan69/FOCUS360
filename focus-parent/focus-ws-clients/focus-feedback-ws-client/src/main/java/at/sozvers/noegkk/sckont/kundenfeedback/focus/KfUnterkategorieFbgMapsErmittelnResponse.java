package at.sozvers.noegkk.sckont.kundenfeedback.focus;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für kfUnterkategorieFbgMapsErmittelnResponse complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="kfUnterkategorieFbgMapsErmittelnResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://focus.kundenfeedback.sckont.noegkk.sozvers.at/}standardResponse">
 *       &lt;sequence>
 *         &lt;element name="kfUnterkategorieFbgMaps" type="{http://focus.kundenfeedback.sckont.noegkk.sozvers.at/}kfUnterkategorieFbgMap" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="kfUnterkategorieFbgMapsErmittelnResponse", propOrder={"kfUnterkategorieFbgMaps"})
public class KfUnterkategorieFbgMapsErmittelnResponse extends StandardResponse {

  @XmlElement(nillable=true)
  protected List<KfUnterkategorieFbgMap> kfUnterkategorieFbgMaps;

  /**
   * Gets the value of the kfUnterkategorieFbgMaps property.
   *
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object. This is why there is
   * not a <CODE>set</CODE> method for the kfUnterkategorieFbgMaps property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getKfUnterkategorieFbgMaps().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list {@link KfUnterkategorieFbgMap }
   */
  public List<KfUnterkategorieFbgMap> getKfUnterkategorieFbgMaps() {
	if(kfUnterkategorieFbgMaps == null) {
	  kfUnterkategorieFbgMaps = new ArrayList<KfUnterkategorieFbgMap>();
	}
	return this.kfUnterkategorieFbgMaps;
  }
}
