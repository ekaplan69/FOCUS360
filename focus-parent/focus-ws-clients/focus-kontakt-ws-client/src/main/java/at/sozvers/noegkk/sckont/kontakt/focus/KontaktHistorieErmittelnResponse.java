package at.sozvers.noegkk.sckont.kontakt.focus;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für kontaktHistorieErmittelnResponse complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="kontaktHistorieErmittelnResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://focus.kontakt.sckont.noegkk.sozvers.at/}standardResponse">
 *       &lt;sequence>
 *         &lt;element name="kontaktHistorie" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="kontaktHistorieErmittelnResponse", propOrder={"kontaktHistorie"})
public class KontaktHistorieErmittelnResponse extends StandardResponse {

  @XmlElement(nillable=true)
  protected List<String> kontaktHistorie;

  /**
   * Gets the value of the kontaktHistorie property.
   *
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object. This is why there is
   * not a <CODE>set</CODE> method for the kontaktHistorie property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getKontaktHistorie().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list {@link String }
   */
  public List<String> getKontaktHistorie() {
	if(kontaktHistorie == null) {
	  kontaktHistorie = new ArrayList<String>();
	}
	return this.kontaktHistorie;
  }
}
