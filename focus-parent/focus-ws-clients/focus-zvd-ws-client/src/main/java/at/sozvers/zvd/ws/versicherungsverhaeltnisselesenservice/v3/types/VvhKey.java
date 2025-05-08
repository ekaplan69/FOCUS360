package at.sozvers.zvd.ws.versicherungsverhaeltnisselesenservice.v3.types;

import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für vvhKey complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="vvhKey">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vvhId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="pruefziffer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="vvhKey", propOrder={"vvhId", "pruefziffer"})
public class VvhKey {

  @XmlElement(required=true)
  protected String pruefziffer;
  protected long   vvhId;

  /**
   * Ruft den Wert der pruefziffer-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getPruefziffer() {
	return pruefziffer;
  }

  /**
   * Legt den Wert der pruefziffer-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setPruefziffer(String value) {
	this.pruefziffer = value;
  }

  /**
   * Ruft den Wert der vvhId-Eigenschaft ab.
   */
  public long getVvhId() {
	return vvhId;
  }

  /**
   * Legt den Wert der vvhId-Eigenschaft fest.
   */
  public void setVvhId(long value) {
	this.vvhId = value;
  }
}
