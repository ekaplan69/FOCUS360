package at.sozvers.focus.ws.generated;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.*;

/**
 * Der GeschaeftsfaelleTyp kapselt eine Liste an Geschäftsfällen im Suchergebnis.
 *
 *
 * <p>Java-Klasse für geschaeftsfaelleTyp complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="geschaeftsfaelleTyp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="geschaeftsfall" type="{http://awf.sozvers.at/schema/suchen}geschaeftsfallTyp" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="geschaeftsfaelleTyp", namespace="http://awf.sozvers.at/schema/suchen", propOrder={"geschaeftsfall"})
public class GeschaeftsfaelleTyp {

  @XmlElement(namespace="http://awf.sozvers.at/schema/suchen")
  protected List<GeschaeftsfallTyp> geschaeftsfall;

  /**
   * Gets the value of the geschaeftsfall property.
   *
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object. This is why there is
   * not a <CODE>set</CODE> method for the geschaeftsfall property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getGeschaeftsfall().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list {@link GeschaeftsfallTyp }
   */
  public List<GeschaeftsfallTyp> getGeschaeftsfall() {
	if(geschaeftsfall == null) {
	  geschaeftsfall = new ArrayList<>();
	}
	return this.geschaeftsfall;
  }
}
