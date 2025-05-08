package at.sozvers.stp.lgkk.webservice.focus360.v20;

import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für sucheLGKFaelleV2Response complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="sucheLGKFaelleV2Response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://v20.focus360.webservice.lgkk.stp.sozvers.at/}Focus360ResponseV2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="sucheLGKFaelleV2Response", propOrder={"_return"})
public class SucheLGKFaelleV2Response {

  @XmlElement(name="return")
  protected Focus360ResponseV2 _return;

  /**
   * Ruft den Wert der return-Eigenschaft ab.
   *
   * @return possible object is {@link Focus360ResponseV2 }
   */
  public Focus360ResponseV2 getReturn() {
	return _return;
  }

  /**
   * Legt den Wert der return-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link Focus360ResponseV2 }
   */
  public void setReturn(Focus360ResponseV2 value) {
	this._return = value;
  }
}
