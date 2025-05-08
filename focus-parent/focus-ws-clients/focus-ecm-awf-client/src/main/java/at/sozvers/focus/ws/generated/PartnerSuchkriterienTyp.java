package at.sozvers.focus.ws.generated;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.*;

/**
 * <p>Suche mit Operatoren fuer ZPV-Partner.</p>
 *
 * <p>Unterstuetzte Zusatzfelder</p>
 *
 *             <ul>
 *                 <li>parparolle-id-partner</li>
 *                 <li>partnerrolleart-kurz</li>
 *                 <li>beteiligungsart</li>
 *             </ul>
 *
 *
 *
 * <p>Java-Klasse für partnerSuchkriterienTyp complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="partnerSuchkriterienTyp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="feld" type="{http://awf.sozvers.at/schema/suchen}partnerSuchkriterienFeldTyp" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="partnerSuchkriterienTyp", namespace="http://awf.sozvers.at/schema/suchen", propOrder={"feld"})
public class PartnerSuchkriterienTyp {

  @XmlElement(namespace="http://awf.sozvers.at/schema/suchen")
  protected List<PartnerSuchkriterienFeldTyp> feld;

  /**
   * Gets the value of the feld property.
   *
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object. This is why there is
   * not a <CODE>set</CODE> method for the feld property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getFeld().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list {@link PartnerSuchkriterienFeldTyp }
   */
  public List<PartnerSuchkriterienFeldTyp> getFeld() {
	if(feld == null) {
	  feld = new ArrayList<>();
	}
	return this.feld;
  }
}
