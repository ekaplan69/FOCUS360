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
 *         &lt;element name="aufgaben" type="{http://awf.sozvers.at/schema/geschaeftsfall}gefundeneAufgabenTyp"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="", propOrder={"aufgaben"})
@XmlRootElement(name="aufgaben-suchergebnis", namespace="http://awf.sozvers.at/schema/geschaeftsfall")
public class AufgabenSuchergebnis {

  @XmlElement(namespace="http://awf.sozvers.at/schema/geschaeftsfall", required=true)
  protected GefundeneAufgabenTyp aufgaben;

  /**
   * Ruft den Wert der aufgaben-Eigenschaft ab.
   *
   * @return possible object is {@link GefundeneAufgabenTyp }
   */
  public GefundeneAufgabenTyp getAufgaben() {
	return aufgaben;
  }

  /**
   * Legt den Wert der aufgaben-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link GefundeneAufgabenTyp }
   */
  public void setAufgaben(GefundeneAufgabenTyp value) {
	this.aufgaben = value;
  }
}
