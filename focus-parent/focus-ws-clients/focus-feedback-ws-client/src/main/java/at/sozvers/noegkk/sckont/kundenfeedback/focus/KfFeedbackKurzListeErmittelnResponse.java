package at.sozvers.noegkk.sckont.kundenfeedback.focus;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für kfFeedbackKurzListeErmittelnResponse complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="kfFeedbackKurzListeErmittelnResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://focus.kundenfeedback.sckont.noegkk.sozvers.at/}standardResponse">
 *       &lt;sequence>
 *         &lt;element name="feedbackKurzListe" type="{http://focus.kundenfeedback.sckont.noegkk.sozvers.at/}kfFeedbackKurz" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="kfFeedbackKurzListeErmittelnResponse", propOrder={"feedbackKurzListe"})
public class KfFeedbackKurzListeErmittelnResponse extends StandardResponse {

  @XmlElement(nillable=true)
  protected List<KfFeedbackKurz> feedbackKurzListe;

  /**
   * Gets the value of the feedbackKurzListe property.
   *
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object. This is why there is
   * not a <CODE>set</CODE> method for the feedbackKurzListe property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getFeedbackKurzListe().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list {@link KfFeedbackKurz }
   */
  public List<KfFeedbackKurz> getFeedbackKurzListe() {
	if(feedbackKurzListe == null) {
	  feedbackKurzListe = new ArrayList<KfFeedbackKurz>();
	}
	return this.feedbackKurzListe;
  }
}
