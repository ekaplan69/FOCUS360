package at.sozvers.zvd.ws.versicherungsverhaeltnisselesenservice.v3.types;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für versicherungsverhaeltnisse complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="versicherungsverhaeltnisse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="versicherungsverhaeltnis" type="{http://sozvers.at/zvd/ws/VersicherungsverhaeltnisseLesenService/v3/types}versicherungsverhaeltnis" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="versicherungsverhaeltnisse", propOrder={"versicherungsverhaeltnis"})
public class Versicherungsverhaeltnisse {

  @XmlElement(nillable=true)
  protected List<Versicherungsverhaeltnis> versicherungsverhaeltnis;

  /**
   * Gets the value of the versicherungsverhaeltnis property.
   *
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object. This is why there is
   * not a <CODE>set</CODE> method for the versicherungsverhaeltnis property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getVersicherungsverhaeltnis().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list {@link Versicherungsverhaeltnis }
   */
  public List<Versicherungsverhaeltnis> getVersicherungsverhaeltnis() {
	if(versicherungsverhaeltnis == null) {
	  versicherungsverhaeltnis = new ArrayList<Versicherungsverhaeltnis>();
	}
	return this.versicherungsverhaeltnis;
  }
}
