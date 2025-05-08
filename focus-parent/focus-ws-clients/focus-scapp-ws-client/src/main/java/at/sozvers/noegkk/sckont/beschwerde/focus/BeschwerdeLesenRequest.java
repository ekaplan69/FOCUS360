package at.sozvers.noegkk.sckont.beschwerde.focus;

import jakarta.xml.bind.annotation.*;

/**
 * <p>Java class for beschwerdeLesenRequest complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="beschwerdeLesenRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://focus.beschwerde.sckont.noegkk.sozvers.at/}standardRequest">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="beschwerdeLesenRequest", propOrder={"id"})
public class BeschwerdeLesenRequest extends StandardRequest {

  protected long id;

  /**
   * Gets the value of the id property.
   */
  public long getId() {
	return id;
  }

  /**
   * Sets the value of the id property.
   */
  public void setId(long value) {
	this.id = value;
  }
}
