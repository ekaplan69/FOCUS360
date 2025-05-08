package at.siemens.ecard.server.onlineservices.valueobject;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.*;

/**
 * <p>Java class for StdResponse complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="StdResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mxSVCApplReturn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="mxOriginatorId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fehleranzahl" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fehlerueberlauf" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="kritischerFehler" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="fehlerbeschreibung" type="{http://valueobject.onlineservices.server.ecard.siemens.at}Fehlerbeschreibung" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="StdResponse", propOrder={"mxSVCApplReturn", "mxOriginatorId", "fehleranzahl", "fehlerueberlauf", "kritischerFehler", "fehlerbeschreibung"})
@XmlSeeAlso({ECardAuskunftV2Resp.class, SVPersonKonsultationenAuskunftV4Resp.class})
public class StdResponse {

  protected int                      fehleranzahl;
  @XmlElement(required=true, nillable=true)
  protected List<Fehlerbeschreibung> fehlerbeschreibung;
  @XmlElement(required=true, type=Boolean.class, nillable=true)
  protected Boolean                  fehlerueberlauf;
  @XmlElement(required=true, type=Short.class, nillable=true)
  protected Short                    kritischerFehler;
  @XmlElement(required=true, nillable=true)
  protected String                   mxOriginatorId;
  protected int                      mxSVCApplReturn;

  /**
   * Gets the value of the fehleranzahl property.
   */
  public int getFehleranzahl() {
	return fehleranzahl;
  }

  /**
   * Sets the value of the fehleranzahl property.
   */
  public void setFehleranzahl(int value) {
	this.fehleranzahl = value;
  }

  /**
   * Gets the value of the fehlerbeschreibung property.
   *
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object. This is why there is
   * not a <CODE>set</CODE> method for the fehlerbeschreibung property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getFehlerbeschreibung().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list {@link Fehlerbeschreibung }
   */
  public List<Fehlerbeschreibung> getFehlerbeschreibung() {
	if(fehlerbeschreibung == null) {
	  fehlerbeschreibung = new ArrayList<>();
	}
	return this.fehlerbeschreibung;
  }

  /**
   * Gets the value of the kritischerFehler property.
   *
   * @return possible object is {@link Short }
   */
  public Short getKritischerFehler() {
	return kritischerFehler;
  }

  /**
   * Sets the value of the kritischerFehler property.
   *
   * @param value
   * 		allowed object is {@link Short }
   */
  public void setKritischerFehler(Short value) {
	this.kritischerFehler = value;
  }

  /**
   * Gets the value of the mxOriginatorId property.
   *
   * @return possible object is {@link String }
   */
  public String getMxOriginatorId() {
	return mxOriginatorId;
  }

  /**
   * Sets the value of the mxOriginatorId property.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setMxOriginatorId(String value) {
	this.mxOriginatorId = value;
  }

  /**
   * Gets the value of the mxSVCApplReturn property.
   */
  public int getMxSVCApplReturn() {
	return mxSVCApplReturn;
  }

  /**
   * Sets the value of the mxSVCApplReturn property.
   */
  public void setMxSVCApplReturn(int value) {
	this.mxSVCApplReturn = value;
  }

  /**
   * Gets the value of the fehlerueberlauf property.
   *
   * @return possible object is {@link Boolean }
   */
  public Boolean isFehlerueberlauf() {
	return fehlerueberlauf;
  }

  /**
   * Sets the value of the fehlerueberlauf property.
   *
   * @param value
   * 		allowed object is {@link Boolean }
   */
  public void setFehlerueberlauf(Boolean value) {
	this.fehlerueberlauf = value;
  }
}
