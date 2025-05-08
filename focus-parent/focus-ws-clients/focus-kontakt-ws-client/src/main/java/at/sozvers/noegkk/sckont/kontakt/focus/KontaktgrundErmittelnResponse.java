package at.sozvers.noegkk.sckont.kontakt.focus;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für kontaktgrundErmittelnResponse complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="kontaktgrundErmittelnResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://focus.kontakt.sckont.noegkk.sozvers.at/}standardResponse">
 *       &lt;sequence>
 *         &lt;element name="kontaktgruende" type="{http://focus.kontakt.sckont.noegkk.sozvers.at/}kontaktgrund" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="kontaktgrundErmittelnResponse", propOrder={"kontaktgruende"})
public class KontaktgrundErmittelnResponse extends StandardResponse {

  @XmlElement(nillable=true)
  protected List<Kontaktgrund> kontaktgruende;

  /**
   * Gets the value of the kontaktgruende property.
   *
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object. This is why there is
   * not a <CODE>set</CODE> method for the kontaktgruende property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getKontaktgruende().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list {@link Kontaktgrund }
   */
  public List<Kontaktgrund> getKontaktgruende() {
	if(kontaktgruende == null) {
	  kontaktgruende = new ArrayList<>();
	}
	return this.kontaktgruende;
  }
}
