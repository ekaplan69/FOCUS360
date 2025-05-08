package at.sozvers.noegkk.sckont.beschwerde.focus;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.*;

/**
 * <p>Java class for returnInfo complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="returnInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="meldungen" type="{http://focus.beschwerde.sckont.noegkk.sozvers.at/}meldung" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="returnCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="returnInfo", propOrder={"meldungen", "returnCode"})
public class ReturnInfo {

  @XmlElement(nillable=true)
  protected List<Meldung> meldungen;
  @XmlElement(required=true)
  protected String        returnCode;

  /**
   * Gets the value of the meldungen property.
   *
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object. This is why there is
   * not a <CODE>set</CODE> method for the meldungen property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getMeldungen().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list {@link Meldung }
   */
  public List<Meldung> getMeldungen() {
	if(meldungen == null) {
	  meldungen = new ArrayList<>();
	}
	return this.meldungen;
  }

  /**
   * Gets the value of the returnCode property.
   *
   * @return possible object is {@link String }
   */
  public String getReturnCode() {
	return returnCode;
  }

  /**
   * Sets the value of the returnCode property.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setReturnCode(String value) {
	this.returnCode = value;
  }
}
