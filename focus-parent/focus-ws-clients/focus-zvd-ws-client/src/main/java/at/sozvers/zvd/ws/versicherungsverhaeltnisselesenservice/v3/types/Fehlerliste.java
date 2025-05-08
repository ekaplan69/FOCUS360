package at.sozvers.zvd.ws.versicherungsverhaeltnisselesenservice.v3.types;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für fehlerliste complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="fehlerliste">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fehler" type="{http://sozvers.at/zvd/ws/VersicherungsverhaeltnisseLesenService/v3/types}fehler" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="fehlerliste", propOrder={"fehler"})
public class Fehlerliste {

  @XmlElement(nillable=true)
  protected List<Fehler> fehler;

  /**
   * Gets the value of the fehler property.
   *
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object. This is why there is
   * not a <CODE>set</CODE> method for the fehler property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getFehler().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list {@link Fehler }
   */
  public List<Fehler> getFehler() {
	if(fehler == null) {
	  fehler = new ArrayList<Fehler>();
	}
	return this.fehler;
  }
}
