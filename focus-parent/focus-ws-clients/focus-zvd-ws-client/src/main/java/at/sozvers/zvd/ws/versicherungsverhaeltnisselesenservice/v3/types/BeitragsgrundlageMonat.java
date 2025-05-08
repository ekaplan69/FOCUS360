package at.sozvers.zvd.ws.versicherungsverhaeltnisselesenservice.v3.types;

import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für beitragsgrundlageMonat complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="beitragsgrundlageMonat">
 *   &lt;complexContent>
 *     &lt;extension base="{http://sozvers.at/zvd/ws/VersicherungsverhaeltnisseLesenService/v3/types}beitragsgrundlage">
 *       &lt;sequence>
 *         &lt;element name="bgArt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bgInteressensvertretung" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bgUeberschreitungHBG" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bgZeitendeckung" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bgExOffo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bgDubios" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="beitragsgrundlageMonat", propOrder={"bgArt", "bgInteressensvertretung", "bgUeberschreitungHBG", "bgZeitendeckung", "bgExOffo", "bgDubios"})
public class BeitragsgrundlageMonat extends Beitragsgrundlage {

  @XmlElement(required=true)
  protected String bgArt;
  @XmlElement(required=true)
  protected String bgDubios;
  @XmlElement(required=true)
  protected String bgExOffo;
  @XmlElement(required=true)
  protected String bgInteressensvertretung;
  @XmlElement(required=true)
  protected String bgUeberschreitungHBG;
  @XmlElement(required=true)
  protected String bgZeitendeckung;

  /**
   * Ruft den Wert der bgArt-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getBgArt() {
	return bgArt;
  }

  /**
   * Legt den Wert der bgArt-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setBgArt(String value) {
	this.bgArt = value;
  }

  /**
   * Ruft den Wert der bgDubios-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getBgDubios() {
	return bgDubios;
  }

  /**
   * Legt den Wert der bgDubios-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setBgDubios(String value) {
	this.bgDubios = value;
  }

  /**
   * Ruft den Wert der bgExOffo-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getBgExOffo() {
	return bgExOffo;
  }

  /**
   * Legt den Wert der bgExOffo-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setBgExOffo(String value) {
	this.bgExOffo = value;
  }

  /**
   * Ruft den Wert der bgInteressensvertretung-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getBgInteressensvertretung() {
	return bgInteressensvertretung;
  }

  /**
   * Legt den Wert der bgInteressensvertretung-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setBgInteressensvertretung(String value) {
	this.bgInteressensvertretung = value;
  }

  /**
   * Ruft den Wert der bgUeberschreitungHBG-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getBgUeberschreitungHBG() {
	return bgUeberschreitungHBG;
  }

  /**
   * Legt den Wert der bgUeberschreitungHBG-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setBgUeberschreitungHBG(String value) {
	this.bgUeberschreitungHBG = value;
  }

  /**
   * Ruft den Wert der bgZeitendeckung-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getBgZeitendeckung() {
	return bgZeitendeckung;
  }

  /**
   * Legt den Wert der bgZeitendeckung-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setBgZeitendeckung(String value) {
	this.bgZeitendeckung = value;
  }
}
