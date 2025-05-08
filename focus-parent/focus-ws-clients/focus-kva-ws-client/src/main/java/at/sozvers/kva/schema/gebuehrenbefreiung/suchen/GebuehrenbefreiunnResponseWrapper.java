package at.sozvers.kva.schema.gebuehrenbefreiung.suchen;

import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für gebuehrenbefreiunnResponseWrapper complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="gebuehrenbefreiunnResponseWrapper"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="gebuehrenbefreiunResponse" type="{http://kva.sozvers.at/schema/gebuehrenbefreiung/suchen}gebuehrenbefreiunResponse" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="gebuehrenbefreiunnResponseWrapper", propOrder={"gebuehrenbefreiunResponse"})
public class GebuehrenbefreiunnResponseWrapper {

  protected GebuehrenbefreiunResponse gebuehrenbefreiunResponse;

  /**
   * Ruft den Wert der gebuehrenbefreiunResponse-Eigenschaft ab.
   *
   * @return possible object is {@link GebuehrenbefreiunResponse }
   */
  public GebuehrenbefreiunResponse getGebuehrenbefreiunResponse() {
	return gebuehrenbefreiunResponse;
  }

  /**
   * Legt den Wert der gebuehrenbefreiunResponse-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link GebuehrenbefreiunResponse }
   */
  public void setGebuehrenbefreiunResponse(GebuehrenbefreiunResponse value) {
	this.gebuehrenbefreiunResponse = value;
  }
}
