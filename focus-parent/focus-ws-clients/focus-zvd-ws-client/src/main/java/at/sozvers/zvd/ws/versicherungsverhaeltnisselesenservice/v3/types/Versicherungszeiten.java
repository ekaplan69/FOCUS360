package at.sozvers.zvd.ws.versicherungsverhaeltnisselesenservice.v3.types;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für versicherungszeiten complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="versicherungszeiten">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="versicherungszeit" type="{http://sozvers.at/zvd/ws/VersicherungsverhaeltnisseLesenService/v3/types}versicherungszeit" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="versicherungszeiten", propOrder={"versicherungszeit"})
public class Versicherungszeiten {

  @XmlElement(nillable=true)
  protected List<Versicherungszeit> versicherungszeit;

  /**
   * Gets the value of the versicherungszeit property.
   *
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object. This is why there is
   * not a <CODE>set</CODE> method for the versicherungszeit property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getVersicherungszeit().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list {@link Versicherungszeit }
   */
  public List<Versicherungszeit> getVersicherungszeit() {
	if(versicherungszeit == null) {
	  versicherungszeit = new ArrayList<Versicherungszeit>();
	}
	return this.versicherungszeit;
  }
}
