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
 *         &lt;element name="gesamtzahl-geschaeftsfaelle" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="geschaeftsfaelle" type="{http://awf.sozvers.at/schema/suchen}geschaeftsfaelleTyp"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="", propOrder={"gesamtzahlGeschaeftsfaelle", "geschaeftsfaelle"})
@XmlRootElement(name="gfSuchergebnis", namespace="http://awf.sozvers.at/schema/suchen")
public class GfSuchergebnis {

  @XmlElement(name="gesamtzahl-geschaeftsfaelle", namespace="http://awf.sozvers.at/schema/suchen")
  protected long                gesamtzahlGeschaeftsfaelle;
  @XmlElement(namespace="http://awf.sozvers.at/schema/suchen", required=true)
  protected GeschaeftsfaelleTyp geschaeftsfaelle;

  /**
   * Ruft den Wert der gesamtzahlGeschaeftsfaelle-Eigenschaft ab.
   */
  public long getGesamtzahlGeschaeftsfaelle() {
	return gesamtzahlGeschaeftsfaelle;
  }

  /**
   * Legt den Wert der gesamtzahlGeschaeftsfaelle-Eigenschaft fest.
   */
  public void setGesamtzahlGeschaeftsfaelle(long value) {
	this.gesamtzahlGeschaeftsfaelle = value;
  }

  /**
   * Ruft den Wert der geschaeftsfaelle-Eigenschaft ab.
   *
   * @return possible object is {@link GeschaeftsfaelleTyp }
   */
  public GeschaeftsfaelleTyp getGeschaeftsfaelle() {
	return geschaeftsfaelle;
  }

  /**
   * Legt den Wert der geschaeftsfaelle-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link GeschaeftsfaelleTyp }
   */
  public void setGeschaeftsfaelle(GeschaeftsfaelleTyp value) {
	this.geschaeftsfaelle = value;
  }
}
