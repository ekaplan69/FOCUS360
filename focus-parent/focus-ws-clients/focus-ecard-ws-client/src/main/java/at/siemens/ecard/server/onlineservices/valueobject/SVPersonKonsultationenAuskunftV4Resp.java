package at.siemens.ecard.server.onlineservices.valueobject;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.*;

/**
 * <p>Java class for SVPersonKonsultationenAuskunftV4Resp complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="SVPersonKonsultationenAuskunftV4Resp">
 *   &lt;complexContent>
 *     &lt;extension base="{http://valueobject.onlineservices.server.ecard.siemens.at}StdResponse">
 *       &lt;sequence>
 *         &lt;element name="anzahl" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SVPersonKonsultation" type="{http://valueobject.onlineservices.server.ecard.siemens.at}SVPersonKonsultationV2" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="SVPersonKonsultationenAuskunftV4Resp", propOrder={"anzahl", "svPersonKonsultation"})
public class SVPersonKonsultationenAuskunftV4Resp extends StdResponse {

  protected int                          anzahl;
  @XmlElement(name="SVPersonKonsultation")
  protected List<SVPersonKonsultationV2> svPersonKonsultation;

  /**
   * Gets the value of the anzahl property.
   */
  public int getAnzahl() {
	return anzahl;
  }

  /**
   * Sets the value of the anzahl property.
   */
  public void setAnzahl(int value) {
	this.anzahl = value;
  }

  /**
   * Gets the value of the svPersonKonsultation property.
   *
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object. This is why there is
   * not a <CODE>set</CODE> method for the svPersonKonsultation property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getSVPersonKonsultation().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list {@link SVPersonKonsultationV2 }
   */
  public List<SVPersonKonsultationV2> getSVPersonKonsultation() {
	if(svPersonKonsultation == null) {
	  svPersonKonsultation = new ArrayList<>();
	}
	return this.svPersonKonsultation;
  }
}
