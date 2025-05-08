package at.sozvers.kva.schema.gebuehrenbefreiung.suchen;

import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für gebuehrenbefreiunRequestWrapper complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="gebuehrenbefreiunRequestWrapper"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="gebuehrenbefreiunRequest" type="{http://kva.sozvers.at/schema/gebuehrenbefreiung/suchen}gebuehrenbefreiunRequest"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="gebuehrenbefreiunRequestWrapper", propOrder={"gebuehrenbefreiunRequest"})
public class GebuehrenbefreiunRequestWrapper {

  @XmlElement(required=true)
  protected GebuehrenbefreiunRequest gebuehrenbefreiunRequest;

  /**
   * Ruft den Wert der gebuehrenbefreiunRequest-Eigenschaft ab.
   *
   * @return possible object is {@link GebuehrenbefreiunRequest }
   */
  public GebuehrenbefreiunRequest getGebuehrenbefreiunRequest() {
	return gebuehrenbefreiunRequest;
  }

  /**
   * Legt den Wert der gebuehrenbefreiunRequest-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link GebuehrenbefreiunRequest }
   */
  public void setGebuehrenbefreiunRequest(GebuehrenbefreiunRequest value) {
	this.gebuehrenbefreiunRequest = value;
  }
}
