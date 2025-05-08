package at.sozvers.focus.ws.generated;

import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für anonymous complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://awf.sozvers.at/schema/geschaeftsfall}gefundeneAufgabeTyp"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="metadaten" type="{http://awf.sozvers.at/schema/dokument}metadatenTyp" minOccurs="0"/&gt;
 *         &lt;element name="aufgabenAusgaenge" type="{http://awf.sozvers.at/schema/geschaeftsfall}aufgabenausgaengeTyp"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="", propOrder={"metadaten", "aufgabenAusgaenge"})
@XmlRootElement(name="aufgabe", namespace="http://awf.sozvers.at/schema/geschaeftsfall")
public class Aufgabe extends GefundeneAufgabeTyp {

  @XmlElement(namespace="http://awf.sozvers.at/schema/geschaeftsfall", required=true)
  protected AufgabenausgaengeTyp aufgabenAusgaenge;
  @XmlElement(namespace="http://awf.sozvers.at/schema/geschaeftsfall")
  protected MetadatenTyp         metadaten;

  /**
   * Ruft den Wert der aufgabenAusgaenge-Eigenschaft ab.
   *
   * @return possible object is {@link AufgabenausgaengeTyp }
   */
  public AufgabenausgaengeTyp getAufgabenAusgaenge() {
	return aufgabenAusgaenge;
  }

  /**
   * Legt den Wert der aufgabenAusgaenge-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link AufgabenausgaengeTyp }
   */
  public void setAufgabenAusgaenge(AufgabenausgaengeTyp value) {
	this.aufgabenAusgaenge = value;
  }

  /**
   * Ruft den Wert der metadaten-Eigenschaft ab.
   *
   * @return possible object is {@link MetadatenTyp }
   */
  public MetadatenTyp getMetadaten() {
	return metadaten;
  }

  /**
   * Legt den Wert der metadaten-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link MetadatenTyp }
   */
  public void setMetadaten(MetadatenTyp value) {
	this.metadaten = value;
  }
}
