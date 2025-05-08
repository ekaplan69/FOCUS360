package at.sozvers.noegkk.sckont.beschwerde.focus;

import jakarta.xml.bind.annotation.*;

/**
 * <p>Java class for beschwerdeAendernResponse complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="beschwerdeAendernResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://focus.beschwerde.sckont.noegkk.sozvers.at/}standardResponse">
 *       &lt;sequence>
 *         &lt;element name="updatecount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="beschwerdeAendernResponse", propOrder={"id", "updatecount"})
public class BeschwerdeAendernResponse extends StandardResponse {

  protected Long id;
  protected long updatecount;

  public Long getId() {
	return id;
  }

  public void setId(Long id) {
	this.id = id;
  }

  /**
   * Gets the value of the updatecount property.
   */
  public long getUpdatecount() {
	return updatecount;
  }

  /**
   * Sets the value of the updatecount property.
   */
  public void setUpdatecount(long value) {
	this.updatecount = value;
  }
}
