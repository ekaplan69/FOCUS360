package at.sozvers.noegkk.sckont.kundenfeedback.focus;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für kfFeedbackgreundeErmittelnResponse complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="kfFeedbackgreundeErmittelnResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://focus.kundenfeedback.sckont.noegkk.sozvers.at/}standardResponse">
 *       &lt;sequence>
 *         &lt;element name="feedbackgruende" type="{http://focus.kundenfeedback.sckont.noegkk.sozvers.at/}kfFeedbackgrund" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="kfFeedbackgreundeErmittelnResponse", propOrder={"feedbackgruende"})
public class KfFeedbackgreundeErmittelnResponse extends StandardResponse {

  @XmlElement(nillable=true)
  protected List<KfFeedbackgrund> feedbackgruende;

  /**
   * Gets the value of the feedbackgruende property.
   *
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object. This is why there is
   * not a <CODE>set</CODE> method for the feedbackgruende property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getFeedbackgruende().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list {@link KfFeedbackgrund }
   */
  public List<KfFeedbackgrund> getFeedbackgruende() {
	if(feedbackgruende == null) {
	  feedbackgruende = new ArrayList<KfFeedbackgrund>();
	}
	return this.feedbackgruende;
  }
}
