package at.sozvers.focus.ws.generated;

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
 *         &lt;element name="suchbegriffe" type="{http://awf.sozvers.at/schema/suchen}gfSuchbegriffe"/&gt;
 *         &lt;element name="ergebnisaufbereitung" type="{http://awf.sozvers.at/schema/suchen}ergebnis-aufbereitung"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="", propOrder={"suchbegriffe", "ergebnisaufbereitung"})
@XmlRootElement(name="gfSucheingabe", namespace="http://awf.sozvers.at/schema/suchen")
public class GfSucheingabe {

  @XmlElement(namespace="http://awf.sozvers.at/schema/suchen", required=true)
  protected ErgebnisAufbereitung ergebnisaufbereitung;
  @XmlElement(namespace="http://awf.sozvers.at/schema/suchen", required=true)
  protected GfSuchbegriffe       suchbegriffe;

  /**
   * Ruft den Wert der ergebnisaufbereitung-Eigenschaft ab.
   *
   * @return possible object is {@link ErgebnisAufbereitung }
   */
  public ErgebnisAufbereitung getErgebnisaufbereitung() {
	return ergebnisaufbereitung;
  }

  /**
   * Legt den Wert der ergebnisaufbereitung-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link ErgebnisAufbereitung }
   */
  public void setErgebnisaufbereitung(ErgebnisAufbereitung value) {
	this.ergebnisaufbereitung = value;
  }

  /**
   * Ruft den Wert der suchbegriffe-Eigenschaft ab.
   *
   * @return possible object is {@link GfSuchbegriffe }
   */
  public GfSuchbegriffe getSuchbegriffe() {
	return suchbegriffe;
  }

  /**
   * Legt den Wert der suchbegriffe-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link GfSuchbegriffe }
   */
  public void setSuchbegriffe(GfSuchbegriffe value) {
	this.suchbegriffe = value;
  }
}
