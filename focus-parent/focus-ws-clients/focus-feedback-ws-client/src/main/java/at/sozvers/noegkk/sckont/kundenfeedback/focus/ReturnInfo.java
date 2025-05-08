package at.sozvers.noegkk.sckont.kundenfeedback.focus;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für returnInfo complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="returnInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="meldungen" type="{http://focus.kundenfeedback.sckont.noegkk.sozvers.at/}meldung" maxOccurs="unbounded" minOccurs="0"/>
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
	  meldungen = new ArrayList<Meldung>();
	}
	return this.meldungen;
  }

  /**
   * Ruft den Wert der returnCode-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getReturnCode() {
	return returnCode;
  }

  /**
   * Legt den Wert der returnCode-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setReturnCode(String value) {
	this.returnCode = value;
  }
}
