package at.siemens.ecard.server.onlineservices.valueobject;

import jakarta.xml.bind.annotation.*;

/**
 * <p>Java class for ECardAuskunftV2Req complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ECardAuskunftV2Req">
 *   &lt;complexContent>
 *     &lt;extension base="{http://valueobject.onlineservices.server.ecard.siemens.at}StdRequest">
 *       &lt;sequence>
 *         &lt;element name="vsNr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="kartennummer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="ECardAuskunftV2Req", propOrder={"vsNr", "kartennummer"})
public class ECardAuskunftV2Req extends StdRequest {

  protected String kartennummer;
  protected String vsNr;

  /**
   * Gets the value of the kartennummer property.
   *
   * @return possible object is {@link String }
   */
  public String getKartennummer() {
	return kartennummer;
  }

  /**
   * Sets the value of the kartennummer property.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setKartennummer(String value) {
	this.kartennummer = value;
  }

  /**
   * Gets the value of the vsNr property.
   *
   * @return possible object is {@link String }
   */
  public String getVsNr() {
	return vsNr;
  }

  /**
   * Sets the value of the vsNr property.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setVsNr(String value) {
	this.vsNr = value;
  }
}
