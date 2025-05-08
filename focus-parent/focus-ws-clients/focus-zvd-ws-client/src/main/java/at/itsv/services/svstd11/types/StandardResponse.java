package at.itsv.services.svstd11.types;

import at.sozvers.zvd.ws.versicherungsverhaeltnisselesenservice.v3.types.VersicherungsverhaeltnisseLesenResponse;
import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für StandardResponse complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="StandardResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Kontext" type="{http://types.svstd11.services.itsv.at/}ResponseKontext"/>
 *         &lt;element name="ReturnInfo" type="{http://types.svstd11.services.itsv.at/}ReturnInfo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="StandardResponse", propOrder={"kontext", "returnInfo"})
@XmlSeeAlso({VersicherungsverhaeltnisseLesenResponse.class})
public abstract class StandardResponse {

  @XmlElement(name="Kontext", required=true)
  protected ResponseKontext kontext;
  @XmlElement(name="ReturnInfo", required=true)
  protected ReturnInfo      returnInfo;

  /**
   * Ruft den Wert der kontext-Eigenschaft ab.
   *
   * @return possible object is {@link ResponseKontext }
   */
  public ResponseKontext getKontext() {
	return kontext;
  }

  /**
   * Legt den Wert der kontext-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link ResponseKontext }
   */
  public void setKontext(ResponseKontext value) {
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
