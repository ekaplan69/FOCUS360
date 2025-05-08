package at.siemens.ecard.server.onlineservices.valueobject;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.*;

/**
 * <p>Java class for Fehlerbeschreibung complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Fehlerbeschreibung">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fehlercode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fehlerTextParm" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="Fehlerbeschreibung", propOrder={"fehlercode", "fehlerTextParm"})
public class Fehlerbeschreibung {

  @XmlElement(required=true, nillable=true)
  protected List<String> fehlerTextParm;
  @XmlElement(required=true, nillable=true)
  protected String       fehlercode;

  /**
   * Gets the value of the fehlerTextParm property.
   *
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object. This is why there is
   * not a <CODE>set</CODE> method for the fehlerTextParm property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getFehlerTextParm().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list {@link String }
   */
  public List<String> getFehlerTextParm() {
	if(fehlerTextParm == null) {
	  fehlerTextParm = new ArrayList<>();
	}
	return this.fehlerTextParm;
  }

  /**
   * Gets the value of the fehlercode property.
   *
   * @return possible object is {@link String }
   */
  public String getFehlercode() {
	return fehlercode;
  }

  /**
   * Sets the value of the fehlercode property.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setFehlercode(String value) {
	this.fehlercode = value;
  }
}
