package at.sozvers.kva.schema.angehoerigenbeziehung.suchen;

import java.util.ArrayList;
import java.util.List;
import at.sozvers.kva.schema.types.StandardResponse;
import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für angehoerigenBeziehungErmittelnResponse complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="angehoerigenBeziehungErmittelnResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://kva.sozvers.at/schema/types}standardResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="angehoerigenBeziehungen" type="{http://kva.sozvers.at/schema/angehoerigenbeziehung/suchen}angehoerigenBeziehungDTO" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="angehoerigenBeziehungErmittelnResponse", propOrder={"angehoerigenBeziehungen"})
public class AngehoerigenBeziehungErmittelnResponse extends StandardResponse {

  @XmlElement(nillable=true)
  protected List<AngehoerigenBeziehungDTO> angehoerigenBeziehungen;

  /**
   * Gets the value of the angehoerigenBeziehungen property.
   *
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object. This is why there is
   * not a <CODE>set</CODE> method for the angehoerigenBeziehungen property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getAngehoerigenBeziehungen().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list {@link AngehoerigenBeziehungDTO }
   */
  public List<AngehoerigenBeziehungDTO> getAngehoerigenBeziehungen() {
	if(angehoerigenBeziehungen == null) {
	  angehoerigenBeziehungen = new ArrayList<AngehoerigenBeziehungDTO>();
	}
	return this.angehoerigenBeziehungen;
  }
}
