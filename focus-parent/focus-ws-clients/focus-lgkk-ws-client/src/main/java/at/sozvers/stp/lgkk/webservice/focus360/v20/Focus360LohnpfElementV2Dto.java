package at.sozvers.stp.lgkk.webservice.focus360.v20;

import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für Focus360LohnpfElementV2Dto complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="Focus360LohnpfElementV2Dto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lohnpfaendung" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="Focus360LohnpfElementV2Dto", propOrder={"lohnpfaendung"})
public class Focus360LohnpfElementV2Dto {

  protected Boolean lohnpfaendung;

  /**
   * Ruft den Wert der lohnpfaendung-Eigenschaft ab.
   *
   * @return possible object is {@link Boolean }
   */
  public Boolean isLohnpfaendung() {
	return lohnpfaendung;
  }

  /**
   * Legt den Wert der lohnpfaendung-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link Boolean }
   */
  public void setLohnpfaendung(Boolean value) {
	this.lohnpfaendung = value;
  }
}
