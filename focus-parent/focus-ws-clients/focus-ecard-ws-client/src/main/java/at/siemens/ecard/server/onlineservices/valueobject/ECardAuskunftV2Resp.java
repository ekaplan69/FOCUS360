package at.siemens.ecard.server.onlineservices.valueobject;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.*;

/**
 * <p>Java class for ECardAuskunftV2Resp complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ECardAuskunftV2Resp">
 *   &lt;complexContent>
 *     &lt;extension base="{http://valueobject.onlineservices.server.ecard.siemens.at}StdResponse">
 *       &lt;sequence>
 *         &lt;element name="anzahl" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ECards" type="{http://valueobject.onlineservices.server.ecard.siemens.at}ECardV2" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="zustelladresse" type="{http://valueobject.onlineservices.server.ecard.siemens.at}Zustelladresse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="ECardAuskunftV2Resp", propOrder={"anzahl", "eCards", "zustelladresse"})
public class ECardAuskunftV2Resp extends StdResponse {

  protected int            anzahl;
  @XmlElement(name="ECards")
  protected List<ECardV2>  eCards;
  protected Zustelladresse zustelladresse;

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
   * Gets the value of the eCards property.
   *
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object. This is why there is
   * not a <CODE>set</CODE> method for the eCards property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getECards().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list {@link ECardV2 }
   */
  public List<ECardV2> getECards() {
	if(eCards == null) {
	  eCards = new ArrayList<>();
	}
	return this.eCards;
  }

  /**
   * Gets the value of the zustelladresse property.
   *
   * @return possible object is {@link Zustelladresse }
   */
  public Zustelladresse getZustelladresse() {
	return zustelladresse;
  }

  /**
   * Sets the value of the zustelladresse property.
   *
   * @param value
   * 		allowed object is {@link Zustelladresse }
   */
  public void setZustelladresse(Zustelladresse value) {
	this.zustelladresse = value;
  }
}
