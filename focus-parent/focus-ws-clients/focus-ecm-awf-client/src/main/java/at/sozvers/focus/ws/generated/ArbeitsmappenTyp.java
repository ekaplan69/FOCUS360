package at.sozvers.focus.ws.generated;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.*;

/**
 * Der GeschaeftsfaelleTyp kapselt eine Liste an Geschäftsfällen im Suchergebnis.
 *
 *
 * <p>Java-Klasse für arbeitsmappenTyp complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="arbeitsmappenTyp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="arbeitsmappe" type="{http://awf.sozvers.at/schema/suchen}arbeitsmappeTyp" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="arbeitsmappenTyp", namespace="http://awf.sozvers.at/schema/suchen", propOrder={"arbeitsmappe"})
public class ArbeitsmappenTyp {

  @XmlElement(namespace="http://awf.sozvers.at/schema/suchen")
  protected List<ArbeitsmappeTyp> arbeitsmappe;

  /**
   * Gets the value of the arbeitsmappe property.
   *
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object. This is why there is
   * not a <CODE>set</CODE> method for the arbeitsmappe property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getArbeitsmappe().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list {@link ArbeitsmappeTyp }
   */
  public List<ArbeitsmappeTyp> getArbeitsmappe() {
	if(arbeitsmappe == null) {
	  arbeitsmappe = new ArrayList<>();
	}
	return this.arbeitsmappe;
  }
}
