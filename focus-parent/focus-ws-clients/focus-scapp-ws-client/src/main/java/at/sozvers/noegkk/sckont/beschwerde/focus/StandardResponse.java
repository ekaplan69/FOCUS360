package at.sozvers.noegkk.sckont.beschwerde.focus;

import jakarta.xml.bind.annotation.*;

/**
 * <p>Java class for standardResponse complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="standardResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kontext" type="{http://focus.beschwerde.sckont.noegkk.sozvers.at/}RsKontext"/>
 *         &lt;element name="returnInfo" type="{http://focus.beschwerde.sckont.noegkk.sozvers.at/}returnInfo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="standardResponse", propOrder={"kontext", "returnInfo"})
@XmlSeeAlso({BeschwerdeAendernResponse.class, BeschwerdenErmittelnResponse.class, BeschwerdeStornierenResponse.class, BeschwerdeErstellenResponse.class, BeschwerdebereichErmittelnResponse.class,
		BeschwerdeLesenResponse.class,})
public class StandardResponse {

  @XmlElement(required=true)
  protected RsKontext  kontext;
  @XmlElement(required=true)
  protected ReturnInfo returnInfo;

  /**
   * Gets the value of the kontext property.
   *
   * @return possible object is {@link RsKontext }
   */
  public RsKontext getKontext() {
	return kontext;
  }

  /**
   * Sets the value of the kontext property.
   *
   * @param value
   * 		allowed object is {@link RsKontext }
   */
  public void setKontext(RsKontext value) {
	this.kontext = value;
  }

  /**
   * Gets the value of the returnInfo property.
   *
   * @return possible object is {@link ReturnInfo }
   */
  public ReturnInfo getReturnInfo() {
	return returnInfo;
  }

  /**
   * Sets the value of the returnInfo property.
   *
   * @param value
   * 		allowed object is {@link ReturnInfo }
   */
  public void setReturnInfo(ReturnInfo value) {
	this.returnInfo = value;
  }
}
