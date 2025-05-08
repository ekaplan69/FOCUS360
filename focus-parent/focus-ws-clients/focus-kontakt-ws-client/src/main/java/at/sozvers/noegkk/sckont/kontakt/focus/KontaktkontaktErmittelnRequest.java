package at.sozvers.noegkk.sckont.kontakt.focus;

import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für kontaktkontaktErmittelnRequest complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="kontaktkontaktErmittelnRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://focus.kontakt.sckont.noegkk.sozvers.at/}standardRequest">
 *       &lt;sequence>
 *         &lt;element name="fachschluessel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fachschlusselArtKurz" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="kontaktkontaktErmittelnRequest", propOrder={"fachschluessel", "fachschlusselArtKurz"})
public class KontaktkontaktErmittelnRequest extends StandardRequest {

  @XmlElement(required=true)
  protected String fachschluessel;
  @XmlElement(required=true)
  protected String fachschlusselArtKurz;

  /**
   * Ruft den Wert der fachschluessel-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getFachschluessel() {
	return fachschluessel;
  }

  /**
   * Legt den Wert der fachschluessel-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setFachschluessel(String value) {
	this.fachschluessel = value;
  }

  /**
   * Ruft den Wert der fachschlusselArtKurz-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getFachschlusselArtKurz() {
	return fachschlusselArtKurz;
  }

  /**
   * Legt den Wert der fachschlusselArtKurz-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setFachschlusselArtKurz(String value) {
	this.fachschlusselArtKurz = value;
  }
}
