package at.sozvers.noegkk.sckont.kundenfeedback.focus;

import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für kfFeedbackLangErmittelnResponse complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="kfFeedbackLangErmittelnResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://focus.kundenfeedback.sckont.noegkk.sozvers.at/}standardResponse">
 *       &lt;sequence>
 *         &lt;element name="kfFeedbackLang" type="{http://focus.kundenfeedback.sckont.noegkk.sozvers.at/}kfFeedbackLang" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="kfFeedbackLangErmittelnResponse", propOrder={"kfFeedbackLang"})
public class KfFeedbackLangErmittelnResponse extends StandardResponse {

  protected KfFeedbackLang kfFeedbackLang;

  /**
   * Ruft den Wert der kfFeedbackLang-Eigenschaft ab.
   *
   * @return possible object is {@link KfFeedbackLang }
   */
  public KfFeedbackLang getKfFeedbackLang() {
	return kfFeedbackLang;
  }

  /**
   * Legt den Wert der kfFeedbackLang-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link KfFeedbackLang }
   */
  public void setKfFeedbackLang(KfFeedbackLang value) {
	this.kfFeedbackLang = value;
  }
}
