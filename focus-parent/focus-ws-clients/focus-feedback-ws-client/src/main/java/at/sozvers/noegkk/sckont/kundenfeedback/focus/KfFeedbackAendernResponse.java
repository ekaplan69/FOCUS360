package at.sozvers.noegkk.sckont.kundenfeedback.focus;

import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für kfFeedbackAendernResponse complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="kfFeedbackAendernResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://focus.kundenfeedback.sckont.noegkk.sozvers.at/}standardResponse">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="updatecount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="kfFeedbackAendernResponse", propOrder={"id", "updatecount"})
public class KfFeedbackAendernResponse extends StandardResponse {

  protected Long id;
  protected long updatecount;

  /**
   * Ruft den Wert der id-Eigenschaft ab.
   *
   * @return possible object is {@link Long }
   */
  public Long getId() {
	return id;
  }

  /**
   * Legt den Wert der id-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link Long }
   */
  public void setId(Long value) {
	this.id = value;
  }

  /**
   * Ruft den Wert der updatecount-Eigenschaft ab.
   */
  public long getUpdatecount() {
	return updatecount;
  }

  /**
   * Legt den Wert der updatecount-Eigenschaft fest.
   */
  public void setUpdatecount(long value) {
	this.updatecount = value;
  }
}
