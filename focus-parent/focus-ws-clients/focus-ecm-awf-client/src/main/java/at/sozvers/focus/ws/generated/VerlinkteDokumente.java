package at.sozvers.focus.ws.generated;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für anonymous complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dokumente" type="{http://awf.sozvers.at/schema/geschaeftsfall}verlinktesDokumentTyp" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="", propOrder={"dokumente"})
@XmlRootElement(name="verlinkteDokumente", namespace="http://awf.sozvers.at/schema/geschaeftsfall")
public class VerlinkteDokumente {

  @XmlElement(namespace="http://awf.sozvers.at/schema/geschaeftsfall")
  protected List<VerlinktesDokumentTyp> dokumente;

  /**
   * Gets the value of the dokumente property.
   *
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object. This is why there is
   * not a <CODE>set</CODE> method for the dokumente property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getDokumente().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list {@link VerlinktesDokumentTyp }
   */
  public List<VerlinktesDokumentTyp> getDokumente() {
	if(dokumente == null) {
	  dokumente = new ArrayList<>();
	}
	return this.dokumente;
  }
}
