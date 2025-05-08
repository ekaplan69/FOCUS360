package at.sozvers.noegkk.sckont.beschwerde.focus;

import jakarta.xml.bind.annotation.*;

/**
 * <p>Java class for standardRequest complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="standardRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kontext" type="{http://focus.beschwerde.sckont.noegkk.sozvers.at/}RqKontext"/>
 *         &lt;element name="quellSystem" type="{http://focus.beschwerde.sckont.noegkk.sozvers.at/}quellSystem"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="standardRequest", propOrder={"kontext", "quellSystem"})
@XmlSeeAlso({BeschwerdeErstellenRequest.class, BeschwerdeStornierenRequest.class, BeschwerdenErmittelnRequest.class, BeschwerdeAendernRequest.class, BeschwerdeLesenRequest.class,
		BeschwerdebereichErmittelnRequest.class,})
public class StandardRequest {

  @XmlElement(required=true)
  protected RqKontext   kontext;
  @XmlElement(required=true)
  protected QuellSystem quellSystem;

  /**
   * Gets the value of the kontext property.
   *
   * @return possible object is {@link RqKontext }
   */
  public RqKontext getKontext() {
	return kontext;
  }

  /**
   * Sets the value of the kontext property.
   *
   * @param value
   * 		allowed object is {@link RqKontext }
   */
  public void setKontext(RqKontext value) {
	this.kontext = value;
  }

  /**
   * Gets the value of the quellSystem property.
   *
   * @return possible object is {@link QuellSystem }
   */
  public QuellSystem getQuellSystem() {
	return quellSystem;
  }

  /**
   * Sets the value of the quellSystem property.
   *
   * @param value
   * 		allowed object is {@link QuellSystem }
   */
  public void setQuellSystem(QuellSystem value) {
	this.quellSystem = value;
  }
}
