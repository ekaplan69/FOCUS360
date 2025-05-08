package at.itsv.services.svstd11.types;

import at.sozvers.zvd.ws.versicherungsverhaeltnisselesenservice.v3.types.VersicherungsverhaeltnisseLesenRequest;
import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für StandardRequest complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="StandardRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Header" type="{http://types.svstd11.services.itsv.at/}StandardRequestHeader"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="StandardRequest", propOrder={"header"})
@XmlSeeAlso({VersicherungsverhaeltnisseLesenRequest.class})
public abstract class StandardRequest {

  @XmlElement(name="Header", required=true)
  protected StandardRequestHeader header;

  /**
   * Ruft den Wert der header-Eigenschaft ab.
   *
   * @return possible object is {@link StandardRequestHeader }
   */
  public StandardRequestHeader getHeader() {
	return header;
  }

  /**
   * Legt den Wert der header-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link StandardRequestHeader }
   */
  public void setHeader(StandardRequestHeader value) {
	this.header = value;
  }
}
