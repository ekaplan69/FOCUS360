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
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="gesamtanzahl-dokumente" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="dokumente" type="{http://awf.sozvers.at/schema/suchen}dokumenteTyp"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="", propOrder={"gesamtanzahlDokumente", "dokumente"})
@XmlRootElement(name="suchergebnis", namespace="http://awf.sozvers.at/schema/suchen")
public class Suchergebnis {

  @XmlElement(namespace="http://awf.sozvers.at/schema/suchen", required=true)
  protected DokumenteTyp dokumente;
  @XmlElement(name="gesamtanzahl-dokumente", namespace="http://awf.sozvers.at/schema/suchen")
  protected long         gesamtanzahlDokumente;

  /**
   * Ruft den Wert der dokumente-Eigenschaft ab.
   *
   * @return possible object is {@link DokumenteTyp }
   */
  public DokumenteTyp getDokumente() {
	return dokumente;
  }

  /**
   * Legt den Wert der dokumente-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link DokumenteTyp }
   */
  public void setDokumente(DokumenteTyp value) {
	this.dokumente = value;
  }

  /**
   * Ruft den Wert der gesamtanzahlDokumente-Eigenschaft ab.
   */
  public long getGesamtanzahlDokumente() {
	return gesamtanzahlDokumente;
  }

  /**
   * Legt den Wert der gesamtanzahlDokumente-Eigenschaft fest.
   */
  public void setGesamtanzahlDokumente(long value) {
	this.gesamtanzahlDokumente = value;
  }
}
