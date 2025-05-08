package at.sozvers.zvd.ws.versicherungsverhaeltnisselesenservice.v3.types;

import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für VersicherungsverhaeltnisseLesenRequestWrapper complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="VersicherungsverhaeltnisseLesenRequestWrapper">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Request" type="{http://sozvers.at/zvd/ws/VersicherungsverhaeltnisseLesenService/v3/types}VersicherungsverhaeltnisseLesenRequest"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="VersicherungsverhaeltnisseLesenRequestWrapper", propOrder={"request"})
public class VersicherungsverhaeltnisseLesenRequestWrapper {

  @XmlElement(name="Request", required=true)
  protected VersicherungsverhaeltnisseLesenRequest request;

  /**
   * Ruft den Wert der request-Eigenschaft ab.
   *
   * @return possible object is {@link VersicherungsverhaeltnisseLesenRequest }
   */
  public VersicherungsverhaeltnisseLesenRequest getRequest() {
	return request;
  }

  /**
   * Legt den Wert der request-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link VersicherungsverhaeltnisseLesenRequest }
   */
  public void setRequest(VersicherungsverhaeltnisseLesenRequest value) {
	this.request = value;
  }
}
