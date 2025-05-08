package at.sozvers.kva.schema.gebuehrenbefreiung.suchen;

import java.util.ArrayList;
import java.util.List;
import at.sozvers.kva.schema.types.StandardResponse;
import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für gebuehrenbefreiunResponse complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="gebuehrenbefreiunResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://kva.sozvers.at/schema/types}standardResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="gebuehrenbefreiungen" type="{http://kva.sozvers.at/schema/gebuehrenbefreiung/suchen}gebuehrenbefreiungDTO" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="gebuehrenbefreiunResponse", propOrder={"gebuehrenbefreiungen"})
public class GebuehrenbefreiunResponse extends StandardResponse {

  @XmlElement(nillable=true)
  protected List<GebuehrenbefreiungDTO> gebuehrenbefreiungen;

  /**
   * Gets the value of the gebuehrenbefreiungen property.
   *
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object. This is why there is
   * not a <CODE>set</CODE> method for the gebuehrenbefreiungen property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getGebuehrenbefreiungen().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list {@link GebuehrenbefreiungDTO }
   */
  public List<GebuehrenbefreiungDTO> getGebuehrenbefreiungen() {
	if(gebuehrenbefreiungen == null) {
	  gebuehrenbefreiungen = new ArrayList<GebuehrenbefreiungDTO>();
	}
	return this.gebuehrenbefreiungen;
  }
}
