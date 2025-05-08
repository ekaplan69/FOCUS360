package at.sozvers.focus.ws.geschaeftsfall.starten;

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
 *         &lt;element name="link" type="{http://awf.sozvers.at/schema/geschaeftsfall}geschaeftsfallLinkTyp" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="", propOrder={"link"})
@XmlRootElement(name="geschaeftsfallLinks", namespace="http://awf.sozvers.at/schema/geschaeftsfall")
public class GeschaeftsfallLinks {

  @XmlElement(namespace="http://awf.sozvers.at/schema/geschaeftsfall")
  protected List<GeschaeftsfallLinkTyp> link;

  /**
   * Gets the value of the link property.
   *
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object. This is why there is
   * not a <CODE>set</CODE> method for the link property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getLink().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list {@link GeschaeftsfallLinkTyp }
   */
  public List<GeschaeftsfallLinkTyp> getLink() {
	if(link == null) {
	  link = new ArrayList<>();
	}
	return this.link;
  }
}
