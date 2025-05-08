package at.sozvers.noegkk.sckont.beschwerde.focus;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.*;

/**
 * <p>Java class for beschwerdebereichErmittelnRequest complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="beschwerdebereichErmittelnRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://focus.beschwerde.sckont.noegkk.sozvers.at/}standardRequest">
 *       &lt;sequence>
 *         &lt;element name="abfrageDat" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="bereOrg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orgeinheit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="beschwerdebereichErmittelnRequest", propOrder={"abfrageDat", "bereOrg", "orgeinheit"})
public class BeschwerdebereichErmittelnRequest extends StandardRequest {

  @XmlElement(required=true)
  @XmlSchemaType(name="date")
  protected XMLGregorianCalendar abfrageDat;
  protected String               bereOrg;
  protected Long                 orgeinheit;

  /**
   * Gets the value of the abfrageDat property.
   *
   * @return possible object is {@link XMLGregorianCalendar }
   */
  public XMLGregorianCalendar getAbfrageDat() {
	return abfrageDat;
  }

  /**
   * Sets the value of the abfrageDat property.
   *
   * @param value
   * 		allowed object is {@link XMLGregorianCalendar }
   */
  public void setAbfrageDat(XMLGregorianCalendar value) {
	this.abfrageDat = value;
  }

  /**
   * Gets the value of the bereOrg property.
   *
   * @return possible object is {@link String }
   */
  public String getBereOrg() {
	return bereOrg;
  }

  /**
   * Sets the value of the bereOrg property.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setBereOrg(String value) {
	this.bereOrg = value;
  }

  /**
   * Gets the value of the orgeinheit property.
   *
   * @return possible object is {@link Long }
   */
  public Long getOrgeinheit() {
	return orgeinheit;
  }

  /**
   * Sets the value of the orgeinheit property.
   *
   * @param value
   * 		allowed object is {@link Long }
   */
  public void setOrgeinheit(Long value) {
	this.orgeinheit = value;
  }
}
