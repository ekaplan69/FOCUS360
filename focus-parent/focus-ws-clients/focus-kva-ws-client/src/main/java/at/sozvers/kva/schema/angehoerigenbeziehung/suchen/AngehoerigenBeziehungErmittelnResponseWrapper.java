package at.sozvers.kva.schema.angehoerigenbeziehung.suchen;

import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für angehoerigenBeziehungErmittelnResponseWrapper complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="angehoerigenBeziehungErmittelnResponseWrapper"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="angehoerigenBeziehungErmittelnResponse" type="{http://kva.sozvers.at/schema/angehoerigenbeziehung/suchen}angehoerigenBeziehungErmittelnResponse" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="angehoerigenBeziehungErmittelnResponseWrapper", propOrder={"angehoerigenBeziehungErmittelnResponse"})
public class AngehoerigenBeziehungErmittelnResponseWrapper {

  protected AngehoerigenBeziehungErmittelnResponse angehoerigenBeziehungErmittelnResponse;

  /**
   * Ruft den Wert der angehoerigenBeziehungErmittelnResponse-Eigenschaft ab.
   *
   * @return possible object is {@link AngehoerigenBeziehungErmittelnResponse }
   */
  public AngehoerigenBeziehungErmittelnResponse getAngehoerigenBeziehungErmittelnResponse() {
	return angehoerigenBeziehungErmittelnResponse;
  }

  /**
   * Legt den Wert der angehoerigenBeziehungErmittelnResponse-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link AngehoerigenBeziehungErmittelnResponse }
   */
  public void setAngehoerigenBeziehungErmittelnResponse(AngehoerigenBeziehungErmittelnResponse value) {
	this.angehoerigenBeziehungErmittelnResponse = value;
  }
}
