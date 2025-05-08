package at.sozvers.stp.lgkk.webservice.focus360.v20;

import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;
import at.itsv.services.lgkk.StandardRequest;
import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für Focus360RequestV2 complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="Focus360RequestV2">
 *   &lt;complexContent>
 *     &lt;extension base="{http://types.services.itsv.at/}standardRequest">
 *       &lt;sequence>
 *         &lt;element name="landesstellen" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="personPid" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="stichtagDat" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="vsnr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="Focus360RequestV2", propOrder={"landesstellen", "personPid", "stichtagDat", "vsnr"})
public class Focus360RequestV2 extends StandardRequest {

  @XmlElement(type=Integer.class)
  protected List<Integer>        landesstellen;
  protected Double               personPid;
  @XmlSchemaType(name="dateTime")
  protected XMLGregorianCalendar stichtagDat;
  protected String               vsnr;

  /**
   * Gets the value of the landesstellen property.
   *
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object. This is why there is
   * not a <CODE>set</CODE> method for the landesstellen property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getLandesstellen().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list {@link Integer }
   */
  public List<Integer> getLandesstellen() {
	if(landesstellen == null) {
	  landesstellen = new ArrayList<Integer>();
	}
	return this.landesstellen;
  }

  /**
   * Ruft den Wert der personPid-Eigenschaft ab.
   *
   * @return possible object is {@link Double }
   */
  public Double getPersonPid() {
	return personPid;
  }

  /**
   * Legt den Wert der personPid-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link Double }
   */
  public void setPersonPid(Double value) {
	this.personPid = value;
  }

  /**
   * Ruft den Wert der stichtagDat-Eigenschaft ab.
   *
   * @return possible object is {@link XMLGregorianCalendar }
   */
  public XMLGregorianCalendar getStichtagDat() {
	return stichtagDat;
  }

  /**
   * Legt den Wert der stichtagDat-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link XMLGregorianCalendar }
   */
  public void setStichtagDat(XMLGregorianCalendar value) {
	this.stichtagDat = value;
  }

  /**
   * Ruft den Wert der vsnr-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getVsnr() {
	return vsnr;
  }

  /**
   * Legt den Wert der vsnr-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setVsnr(String value) {
	this.vsnr = value;
  }
}
