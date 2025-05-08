package at.sozvers.zvd.ws.versicherungsverhaeltnisselesenservice.v3.types;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für beitragsgrundlagenMonat complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="beitragsgrundlagenMonat">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="beitragsgrundlageMonat" type="{http://sozvers.at/zvd/ws/VersicherungsverhaeltnisseLesenService/v3/types}beitragsgrundlageMonat" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="beitragsgrundlagenMonat", propOrder={"beitragsgrundlageMonat"})
public class BeitragsgrundlagenMonat {

  @XmlElement(nillable=true)
  protected List<BeitragsgrundlageMonat> beitragsgrundlageMonat;

  /**
   * Gets the value of the beitragsgrundlageMonat property.
   *
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object. This is why there is
   * not a <CODE>set</CODE> method for the beitragsgrundlageMonat property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getBeitragsgrundlageMonat().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list {@link BeitragsgrundlageMonat }
   */
  public List<BeitragsgrundlageMonat> getBeitragsgrundlageMonat() {
	if(beitragsgrundlageMonat == null) {
	  beitragsgrundlageMonat = new ArrayList<BeitragsgrundlageMonat>();
	}
	return this.beitragsgrundlageMonat;
  }
}
