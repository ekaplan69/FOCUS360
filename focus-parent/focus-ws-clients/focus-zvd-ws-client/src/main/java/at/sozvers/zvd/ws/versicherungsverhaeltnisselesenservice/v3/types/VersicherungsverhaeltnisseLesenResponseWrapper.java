package at.sozvers.zvd.ws.versicherungsverhaeltnisselesenservice.v3.types;

import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für VersicherungsverhaeltnisseLesenResponseWrapper complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="VersicherungsverhaeltnisseLesenResponseWrapper">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Response" type="{http://sozvers.at/zvd/ws/VersicherungsverhaeltnisseLesenService/v3/types}VersicherungsverhaeltnisseLesenResponse"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="VersicherungsverhaeltnisseLesenResponseWrapper", propOrder={"response"})
public class VersicherungsverhaeltnisseLesenResponseWrapper {

  @XmlElement(name="Response", required=true)
  protected VersicherungsverhaeltnisseLesenResponse response;

  /**
   * Ruft den Wert der response-Eigenschaft ab.
   *
   * @return possible object is {@link VersicherungsverhaeltnisseLesenResponse }
   */
  public VersicherungsverhaeltnisseLesenResponse getResponse() {
	return response;
  }

  /**
   * Legt den Wert der response-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link VersicherungsverhaeltnisseLesenResponse }
   */
  public void setResponse(VersicherungsverhaeltnisseLesenResponse value) {
	this.response = value;
  }
}
