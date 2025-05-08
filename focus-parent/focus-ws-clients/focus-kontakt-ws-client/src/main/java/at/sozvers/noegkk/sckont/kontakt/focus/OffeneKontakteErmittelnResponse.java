package at.sozvers.noegkk.sckont.kontakt.focus;

import java.util.List;
import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für offeneKontakteErmittelnResponse complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="offeneKontakteErmittelnResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://focus.kontakt.sckont.noegkk.sozvers.at/}standardResponse">
 *       &lt;sequence>
 *         &lt;element name="kontakte" type="{http://focus.kontakt.sckont.noegkk.sozvers.at/}kontakte" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="offeneKontakteErmittelnResponse", propOrder={"kontakte"})
public class OffeneKontakteErmittelnResponse extends StandardResponse {
  private static final long                     serialVersionUID = 1L;
  @XmlElement(nillable=true)
  private              List<KontaktkontaktKurz> kontakte;

  public OffeneKontakteErmittelnResponse() {
	//Standard Contructor
  }

  /**
   * Gets the value of the kontakte property.
   *
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object. This is why there is
   * not a <CODE>set</CODE> method for the kontakte property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getKontakte().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list {@link KontaktkontaktKurz }
   */
  public List<KontaktkontaktKurz> getKontakte() {
	return kontakte;
  }

  public void setKontakte(List<KontaktkontaktKurz> kontakte) {
	this.kontakte = kontakte;
  }
}
