package at.sozvers.stp.lgkk.webservice.focus360.v20;

import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für sucheLGKDokumenteV1 complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="sucheLGKDokumenteV1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://v20.focus360.webservice.lgkk.stp.sozvers.at/}Focus360DokumentRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="sucheLGKDokumenteV1", propOrder={"arg0"})
public class SucheLGKDokumenteV1 {

  protected Focus360DokumentRequest arg0;

  /**
   * Ruft den Wert der arg0-Eigenschaft ab.
   *
   * @return possible object is {@link Focus360DokumentRequest }
   */
  public Focus360DokumentRequest getArg0() {
	return arg0;
  }

  /**
   * Legt den Wert der arg0-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link Focus360DokumentRequest }
   */
  public void setArg0(Focus360DokumentRequest value) {
	this.arg0 = value;
  }
}
