package at.sozvers.focus.ws.generated;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für partnerSuchkriterienAndOrTyp complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="partnerSuchkriterienAndOrTyp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded"&gt;
 *         &lt;element name="equals" type="{http://awf.sozvers.at/schema/suchen}zpv-partner-suchen-typ"/&gt;
 *         &lt;element name="not-equals" type="{http://awf.sozvers.at/schema/suchen}zpv-partner-suchen-typ"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="partnerSuchkriterienAndOrTyp", namespace="http://awf.sozvers.at/schema/suchen", propOrder={"equalsOrNotEquals"})
public class PartnerSuchkriterienAndOrTyp {

  @XmlElementRefs({@XmlElementRef(name="equals", namespace="http://awf.sozvers.at/schema/suchen", type=JAXBElement.class, required=false),
		  @XmlElementRef(name="not-equals", namespace="http://awf.sozvers.at/schema/suchen", type=JAXBElement.class, required=false)})
  protected List<JAXBElement<ZpvPartnerSuchenTyp>> equalsOrNotEquals;

  /**
   * Gets the value of the equalsOrNotEquals property.
   *
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object. This is why there is
   * not a <CODE>set</CODE> method for the equalsOrNotEquals property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getEqualsOrNotEquals().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list {@link JAXBElement }{@code <}{@link ZpvPartnerSuchenTyp }{@code >} {@link JAXBElement }{@code <}{@link ZpvPartnerSuchenTyp }{@code >}
   */
  public List<JAXBElement<ZpvPartnerSuchenTyp>> getEqualsOrNotEquals() {
	if(equalsOrNotEquals == null) {
	  equalsOrNotEquals = new ArrayList<>();
	}
	return this.equalsOrNotEquals;
  }
}
