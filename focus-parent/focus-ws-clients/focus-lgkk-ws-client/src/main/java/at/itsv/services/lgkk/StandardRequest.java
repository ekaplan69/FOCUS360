package at.itsv.services.lgkk;

import at.sozvers.stp.lgkk.webservice.focus360.v20.Focus360DokumentRequest;
import at.sozvers.stp.lgkk.webservice.focus360.v20.Focus360RequestV2;
import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für standardRequest complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="standardRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="header" type="{http://types.services.itsv.at/}standardRequestHeader"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="standardRequest", propOrder={"header"})
@XmlSeeAlso({Focus360RequestV2.class, Focus360DokumentRequest.class})
public abstract class StandardRequest {

  @XmlElement(required=true)
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
