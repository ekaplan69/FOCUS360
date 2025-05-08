package at.sozvers.noegkk.sckont.kundenfeedback.focus;

import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für kfFeedbackKurzListeErmittelnRequest complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="kfFeedbackKurzListeErmittelnRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://focus.kundenfeedback.sckont.noegkk.sozvers.at/}standardRequest">
 *       &lt;sequence>
 *         &lt;element name="ersteller" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fsArtKurz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="kfFeedbackKurzListeErmittelnRequest", propOrder={"ersteller", "fs", "fsArtKurz"})
public class KfFeedbackKurzListeErmittelnRequest extends StandardRequest {

  protected String ersteller;
  protected String fs;
  protected String fsArtKurz;

  /**
   * Ruft den Wert der ersteller-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getErsteller() {
	return ersteller;
  }

  /**
   * Legt den Wert der ersteller-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setErsteller(String value) {
	this.ersteller = value;
  }

  /**
   * Ruft den Wert der fs-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getFs() {
	return fs;
  }

  /**
   * Legt den Wert der fs-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setFs(String value) {
	this.fs = value;
  }

  /**
   * Ruft den Wert der fsArtKurz-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getFsArtKurz() {
	return fsArtKurz;
  }

  /**
   * Legt den Wert der fsArtKurz-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setFsArtKurz(String value) {
	this.fsArtKurz = value;
  }
}
