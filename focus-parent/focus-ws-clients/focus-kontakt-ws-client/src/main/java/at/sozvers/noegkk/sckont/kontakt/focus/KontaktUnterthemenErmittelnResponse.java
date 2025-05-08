package at.sozvers.noegkk.sckont.kontakt.focus;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für kontaktUnterthemenErmittelnResponse complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="kontaktUnterthemenErmittelnResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://focus.kontakt.sckont.noegkk.sozvers.at/}standardResponse">
 *       &lt;sequence>
 *         &lt;element name="unterthemen" type="{http://focus.kontakt.sckont.noegkk.sozvers.at/}kontaktunterthema" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="kontaktUnterthemenErmittelnResponse", propOrder={"unterthemen"})
public class KontaktUnterthemenErmittelnResponse extends StandardResponse {

  @XmlElement(nillable=true)
  protected List<Kontaktunterthema> unterthemen;

  /**
   * Gets the value of the unterthemen property.
   *
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object. This is why there is
   * not a <CODE>set</CODE> method for the unterthemen property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getUnterthemen().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list {@link Kontaktunterthema }
   */
  public List<Kontaktunterthema> getUnterthemen() {
	if(unterthemen == null) {
	  unterthemen = new ArrayList<>();
	}
	return this.unterthemen;
  }
}
