package at.sozvers.noegkk.sckont.kontakt.focus;

import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für kontaktkontaktLesenRequest complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="kontaktkontaktLesenRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://focus.kontakt.sckont.noegkk.sozvers.at/}standardRequest">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="kontaktkontaktLesenRequest", propOrder={"id"})
public class KontaktkontaktLesenRequest extends StandardRequest {

  protected long id;

  /**
   * Ruft den Wert der id-Eigenschaft ab.
   */
  public long getId() {
	return id;
  }

  /**
   * Legt den Wert der id-Eigenschaft fest.
   */
  public void setId(long value) {
	this.id = value;
  }
}
