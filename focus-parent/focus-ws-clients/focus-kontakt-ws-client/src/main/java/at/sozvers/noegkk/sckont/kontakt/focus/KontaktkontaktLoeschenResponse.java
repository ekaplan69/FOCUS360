package at.sozvers.noegkk.sckont.kontakt.focus;

import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für kontaktkontaktLoeschenResponse complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="kontaktkontaktLoeschenResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://focus.kontakt.sckont.noegkk.sozvers.at/}standardResponse">
 *       &lt;sequence>
 *         &lt;element name="amountDeleted" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="kontaktkontaktLoeschenResponse", propOrder={"amountDeleted"})
public class KontaktkontaktLoeschenResponse extends StandardResponse {

  protected long amountDeleted;

  /**
   * Ruft den Wert der amountDeleted-Eigenschaft ab.
   */
  public long getAmountDeleted() {
	return amountDeleted;
  }

  /**
   * Legt den Wert der amountDeleted-Eigenschaft fest.
   */
  public void setAmountDeleted(long value) {
	this.amountDeleted = value;
  }
}
