package at.sozvers.noegkk.sckont.kundenfeedback.focus;

import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für standardRequest complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="standardRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kontext" type="{http://focus.kundenfeedback.sckont.noegkk.sozvers.at/}RqKontext"/>
 *         &lt;element name="quellSystem" type="{http://focus.kundenfeedback.sckont.noegkk.sozvers.at/}quellSystem"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="standardRequest", propOrder={"kontext", "quellSystem"})
@XmlSeeAlso(
		{KfUnterkategorieFbgMapsErmittelnRequest.class, KfThemenErmittelnRequest.class, KfFeedbackgruendeErmittelnRequest.class, KfThemaFbgMapsErmittelnRequest.class, KfFeedbackAendernRequest.class,
				KfFeedbackKurzListeErmittelnRequest.class, KfFeedbackLangErmittelnRequest.class, KfUnterkategorienErmittelnRequest.class, KfFeedbackErstellenRequest.class})
public class StandardRequest {

  @XmlElement(required=true)
  protected RqKontext   kontext;
  @XmlElement(required=true)
  protected QuellSystem quellSystem;

  /**
   * Ruft den Wert der kontext-Eigenschaft ab.
   *
   * @return possible object is {@link RqKontext }
   */
  public RqKontext getKontext() {
	return kontext;
  }

  /**
   * Legt den Wert der kontext-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link RqKontext }
   */
  public void setKontext(RqKontext value) {
	this.kontext = value;
  }

  /**
   * Ruft den Wert der quellSystem-Eigenschaft ab.
   *
   * @return possible object is {@link QuellSystem }
   */
  public QuellSystem getQuellSystem() {
	return quellSystem;
  }

  /**
   * Legt den Wert der quellSystem-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link QuellSystem }
   */
  public void setQuellSystem(QuellSystem value) {
	this.quellSystem = value;
  }
}
