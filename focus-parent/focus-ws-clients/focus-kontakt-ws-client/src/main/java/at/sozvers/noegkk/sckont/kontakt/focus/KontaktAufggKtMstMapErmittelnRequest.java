package at.sozvers.noegkk.sckont.kontakt.focus;

import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für kontaktAufggKtMstMapErmittelnRequest complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="kontaktAufggKtMstMapErmittelnRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://focus.kontakt.sckont.noegkk.sozvers.at/}standardRequest">
 *       &lt;sequence>
 *         &lt;element name="mstCode" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="kontaktAufggKtMstMapErmittelnRequest", propOrder={"mstCode"})
public class KontaktAufggKtMstMapErmittelnRequest extends StandardRequest {

  protected long mstCode;

  /**
   * Ruft den Wert der mstCode-Eigenschaft ab.
   */
  public long getMstCode() {
	return mstCode;
  }

  /**
   * Legt den Wert der mstCode-Eigenschaft fest.
   */
  public void setMstCode(long value) {
	this.mstCode = value;
  }
}
