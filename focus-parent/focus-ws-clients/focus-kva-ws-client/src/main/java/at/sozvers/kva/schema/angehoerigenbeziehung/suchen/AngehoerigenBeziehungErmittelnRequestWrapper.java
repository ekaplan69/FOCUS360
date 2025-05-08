package at.sozvers.kva.schema.angehoerigenbeziehung.suchen;

import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für angehoerigenBeziehungErmittelnRequestWrapper complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="angehoerigenBeziehungErmittelnRequestWrapper"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="angehoerigenBeziehungErmittelnRequest" type="{http://kva.sozvers.at/schema/angehoerigenbeziehung/suchen}angehoerigenBeziehungErmittelnRequest"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="angehoerigenBeziehungErmittelnRequestWrapper", propOrder={"angehoerigenBeziehungErmittelnRequest"})
public class AngehoerigenBeziehungErmittelnRequestWrapper {

  @XmlElement(required=true)
  protected AngehoerigenBeziehungErmittelnRequest angehoerigenBeziehungErmittelnRequest;

  /**
   * Ruft den Wert der angehoerigenBeziehungErmittelnRequest-Eigenschaft ab.
   *
   * @return possible object is {@link AngehoerigenBeziehungErmittelnRequest }
   */
  public AngehoerigenBeziehungErmittelnRequest getAngehoerigenBeziehungErmittelnRequest() {
	return angehoerigenBeziehungErmittelnRequest;
  }

  /**
   * Legt den Wert der angehoerigenBeziehungErmittelnRequest-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link AngehoerigenBeziehungErmittelnRequest }
   */
  public void setAngehoerigenBeziehungErmittelnRequest(AngehoerigenBeziehungErmittelnRequest value) {
	this.angehoerigenBeziehungErmittelnRequest = value;
  }
}
