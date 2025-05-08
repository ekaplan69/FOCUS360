package at.sozvers.noegkk.sckont.kontakt.focus;

import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für standardResponse complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="standardResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kontext" type="{http://focus.kontakt.sckont.noegkk.sozvers.at/}RsKontext"/>
 *         &lt;element name="returnInfo" type="{http://focus.kontakt.sckont.noegkk.sozvers.at/}returnInfo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="standardResponse", propOrder={"kontext", "returnInfo"})
@XmlSeeAlso({OffeneKontakteErmittelnForFSResponse.class, KontaktabschlussartErmittelnResponse.class, KontaktAufggAaMstMapErmittelnResponse.class, KontaktHistorieErmittelnResponse.class,
		KontaktkontaktErstellenResponse.class, KontaktAufggSubMapErmittelnReponse.class, KontaktkontaktLesenResponse.class, KontaktkontaktartErmittelnResponse.class,
		GueltigeOesErmittelnResponse.class, KontaktthemaErmittelnResponse.class, KontaktkontaktErmittelnResponse.class, KontaktAufggKtMstMapErmittelnResponse.class,
		KontaktAufggThemaMstMapErmittelnResponse.class, OffeneKontakteErmittelnResponse.class, KontaktkontaktAendernResponse.class, KontaktaufgabengebietErmittelnResponse.class,
		KontaktkontaktLoeschenResponse.class})
public class StandardResponse {

  @XmlElement(required=true)
  protected RsKontext  kontext;
  @XmlElement(required=true)
  protected ReturnInfo returnInfo;

  /**
   * Ruft den Wert der kontext-Eigenschaft ab.
   *
   * @return possible object is {@link RsKontext }
   */
  public RsKontext getKontext() {
	return kontext;
  }

  /**
   * Legt den Wert der kontext-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link RsKontext }
   */
  public void setKontext(RsKontext value) {
	this.kontext = value;
  }

  /**
   * Ruft den Wert der returnInfo-Eigenschaft ab.
   *
   * @return possible object is {@link ReturnInfo }
   */
  public ReturnInfo getReturnInfo() {
	return returnInfo;
  }

  /**
   * Legt den Wert der returnInfo-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link ReturnInfo }
   */
  public void setReturnInfo(ReturnInfo value) {
	this.returnInfo = value;
  }
}
