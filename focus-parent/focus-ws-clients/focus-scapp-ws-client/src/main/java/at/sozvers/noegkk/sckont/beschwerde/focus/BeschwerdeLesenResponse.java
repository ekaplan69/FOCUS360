package at.sozvers.noegkk.sckont.beschwerde.focus;

import jakarta.xml.bind.annotation.*;

/**
 * <p>Java class for beschwerdeLesenResponse complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="beschwerdeLesenResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://focus.beschwerde.sckont.noegkk.sozvers.at/}standardResponse">
 *       &lt;sequence>
 *         &lt;element name="beschwerde" type="{http://focus.beschwerde.sckont.noegkk.sozvers.at/}beschwerde" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="beschwerdeLesenResponse", propOrder={"beschwerde"})
public class BeschwerdeLesenResponse extends StandardResponse {

  protected Beschwerde beschwerde;

  /**
   * Gets the value of the beschwerde property.
   *
   * @return possible object is {@link Beschwerde }
   */
  public Beschwerde getBeschwerde() {
	return beschwerde;
  }

  /**
   * Sets the value of the beschwerde property.
   *
   * @param value
   * 		allowed object is {@link Beschwerde }
   */
  public void setBeschwerde(Beschwerde value) {
	this.beschwerde = value;
  }
}
