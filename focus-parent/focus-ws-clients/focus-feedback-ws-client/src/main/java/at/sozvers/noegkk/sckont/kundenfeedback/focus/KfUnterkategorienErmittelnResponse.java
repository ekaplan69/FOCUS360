package at.sozvers.noegkk.sckont.kundenfeedback.focus;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für kfUnterkategorienErmittelnResponse complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="kfUnterkategorienErmittelnResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://focus.kundenfeedback.sckont.noegkk.sozvers.at/}standardResponse">
 *       &lt;sequence>
 *         &lt;element name="kfUnterkategorien" type="{http://focus.kundenfeedback.sckont.noegkk.sozvers.at/}kfUnterkategorie" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="kfUnterkategorienErmittelnResponse", propOrder={"kfUnterkategorien"})
public class KfUnterkategorienErmittelnResponse extends StandardResponse {

  @XmlElement(nillable=true)
  protected List<KfUnterkategorie> kfUnterkategorien;

  /**
   * Gets the value of the kfUnterkategorien property.
   *
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object. This is why there is
   * not a <CODE>set</CODE> method for the kfUnterkategorien property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getKfUnterkategorien().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list {@link KfUnterkategorie }
   */
  public List<KfUnterkategorie> getKfUnterkategorien() {
	if(kfUnterkategorien == null) {
	  kfUnterkategorien = new ArrayList<KfUnterkategorie>();
	}
	return this.kfUnterkategorien;
  }
}
