package at.sozvers.zvd.ws.versicherungsverhaeltnisselesenservice.v3.types;

import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für beitragsgrundlageFilter complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="beitragsgrundlageFilter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bgZeitendeckung" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bgExOffo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bgArt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bgUeberschreitungHBG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bgInteressensvertretung" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bgPruefung" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="beitragsgrundlageFilter", propOrder={"bgZeitendeckung", "bgExOffo", "bgArt", "bgUeberschreitungHBG", "bgInteressensvertretung", "bgPruefung"})
public class BeitragsgrundlageFilter {

  protected String  bgArt;
  protected String  bgExOffo;
  protected String  bgInteressensvertretung;
  protected Boolean bgPruefung;
  protected String  bgUeberschreitungHBG;
  protected String  bgZeitendeckung;

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

  /**
   * Ruft den Wert der bgPruefung-Eigenschaft ab.
   *
   * @return possible object is {@link Boolean }
   */
  public Boolean isBgPruefung() {
	return bgPruefung;
  }

  /**
   * Legt den Wert der bgPruefung-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link Boolean }
   */
  public void setBgPruefung(Boolean value) {
	this.bgPruefung = value;
  }
}
