package at.itsv.services.lgkk;

import at.sozvers.stp.lgkk.webservice.focus360.v20.*;
import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für standardResponse complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="standardResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://types.services.itsv.at/}meldungen" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="standardResponse", propOrder={"meldungen"})
@XmlSeeAlso({Focus360DokumentResponse.class, Focus360ResponseV2.class})
public abstract class StandardResponse {

  @XmlElement(namespace="http://types.services.itsv.at/")
  protected Meldungen meldungen;

  /**
   * Ruft den Wert der meldungen-Eigenschaft ab.
   *
   * @return possible object is {@link Meldungen }
   */
  public Meldungen getMeldungen() {
	return meldungen;
  }

  /**
   * Legt den Wert der meldungen-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link Meldungen }
   */
  public void setMeldungen(Meldungen value) {
	this.meldungen = value;
  }
}
