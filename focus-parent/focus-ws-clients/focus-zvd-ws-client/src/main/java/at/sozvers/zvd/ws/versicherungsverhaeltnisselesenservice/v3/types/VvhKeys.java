package at.sozvers.zvd.ws.versicherungsverhaeltnisselesenservice.v3.types;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für vvhKeys complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="vvhKeys">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vvhKey" type="{http://sozvers.at/zvd/ws/VersicherungsverhaeltnisseLesenService/v3/types}vvhKey" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="vvhKeys", propOrder={"vvhKey"})
public class VvhKeys {

  @XmlElement(required=true)
  protected List<VvhKey> vvhKey;

  /**
   * Gets the value of the vvhKey property.
   *
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object. This is why there is
   * not a <CODE>set</CODE> method for the vvhKey property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getVvhKey().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list {@link VvhKey }
   */
  public List<VvhKey> getVvhKey() {
	if(vvhKey == null) {
	  vvhKey = new ArrayList<VvhKey>();
	}
	return this.vvhKey;
  }
}
