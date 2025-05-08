package at.sozvers.noegkk.sckont.kontakt.focus;

import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für kontaktkontaktLesenResponse complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="kontaktkontaktLesenResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://focus.kontakt.sckont.noegkk.sozvers.at/}standardResponse">
 *       &lt;sequence>
 *         &lt;element name="kontaktkontakt" type="{http://focus.kontakt.sckont.noegkk.sozvers.at/}kontaktkontakt" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="kontaktkontaktLesenResponse", propOrder={"kontaktkontakt"})
public class KontaktkontaktLesenResponse extends StandardResponse {

  protected Kontaktkontakt kontaktkontakt;

  /**
   * Ruft den Wert der kontaktkontakt-Eigenschaft ab.
   *
   * @return possible object is {@link Kontaktkontakt }
   */
  public Kontaktkontakt getKontaktkontakt() {
	return kontaktkontakt;
  }

  /**
   * Legt den Wert der kontaktkontakt-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link Kontaktkontakt }
   */
  public void setKontaktkontakt(Kontaktkontakt value) {
	this.kontaktkontakt = value;
  }
}
