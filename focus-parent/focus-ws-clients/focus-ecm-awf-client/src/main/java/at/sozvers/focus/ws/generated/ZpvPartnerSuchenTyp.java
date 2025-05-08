package at.sozvers.focus.ws.generated;

import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für zpv-partner-suchen-typ complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="zpv-partner-suchen-typ"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="zpv-partner" type="{http://awf.sozvers.at/schema/suchen}zpv-partner-suchen"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="zpv-partner-suchen-typ", namespace="http://awf.sozvers.at/schema/suchen", propOrder={"zpvPartner"})
public class ZpvPartnerSuchenTyp {

  @XmlElement(name="zpv-partner", namespace="http://awf.sozvers.at/schema/suchen", required=true)
  protected ZpvPartnerSuchen zpvPartner;

  /**
   * Ruft den Wert der zpvPartner-Eigenschaft ab.
   *
   * @return possible object is {@link ZpvPartnerSuchen }
   */
  public ZpvPartnerSuchen getZpvPartner() {
	return zpvPartner;
  }

  /**
   * Legt den Wert der zpvPartner-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link ZpvPartnerSuchen }
   */
  public void setZpvPartner(ZpvPartnerSuchen value) {
	this.zpvPartner = value;
  }
}
