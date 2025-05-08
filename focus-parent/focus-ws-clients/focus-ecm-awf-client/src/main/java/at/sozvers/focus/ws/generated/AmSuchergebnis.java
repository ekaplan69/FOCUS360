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
 *         &lt;element name="gesamtzahl-arbeitsmappen" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="arbeitsmappen" type="{http://awf.sozvers.at/schema/suchen}arbeitsmappenTyp"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="", propOrder={"gesamtzahlArbeitsmappen", "arbeitsmappen"})
@XmlRootElement(name="amSuchergebnis", namespace="http://awf.sozvers.at/schema/suchen")
public class AmSuchergebnis {

  @XmlElement(namespace="http://awf.sozvers.at/schema/suchen", required=true)
  protected ArbeitsmappenTyp arbeitsmappen;
  @XmlElement(name="gesamtzahl-arbeitsmappen", namespace="http://awf.sozvers.at/schema/suchen")
  protected long             gesamtzahlArbeitsmappen;

  /**
   * Ruft den Wert der arbeitsmappen-Eigenschaft ab.
   *
   * @return possible object is {@link ArbeitsmappenTyp }
   */
  public ArbeitsmappenTyp getArbeitsmappen() {
	return arbeitsmappen;
  }

  /**
   * Legt den Wert der arbeitsmappen-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link ArbeitsmappenTyp }
   */
  public void setArbeitsmappen(ArbeitsmappenTyp value) {
	this.arbeitsmappen = value;
  }

  /**
   * Ruft den Wert der gesamtzahlArbeitsmappen-Eigenschaft ab.
   */
  public long getGesamtzahlArbeitsmappen() {
	return gesamtzahlArbeitsmappen;
  }

  /**
   * Legt den Wert der gesamtzahlArbeitsmappen-Eigenschaft fest.
   */
  public void setGesamtzahlArbeitsmappen(long value) {
	this.gesamtzahlArbeitsmappen = value;
  }
}
