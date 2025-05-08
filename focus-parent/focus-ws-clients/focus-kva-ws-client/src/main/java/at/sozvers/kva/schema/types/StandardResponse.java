package at.sozvers.kva.schema.types;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import at.sozvers.kva.schema.ermittle_krankenversicherungsanspruch.ErmittelterKrankenversicherungsanspruch;
import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für standardResponse complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="standardResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="transaktionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="returnCode" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="meldung" type="{http://kva.sozvers.at/schema/types}meldung" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="standardResponse", propOrder={"transaktionID", "returnCode", "meldung"})
@XmlSeeAlso({ErmittelterKrankenversicherungsanspruch.class})
public abstract class StandardResponse {

  @XmlElement(nillable=true)
  protected List<Meldung> meldung;
  @XmlElement(required=true)
  protected BigInteger    returnCode;
  protected String        transaktionID;

  /**
   * Gets the value of the meldung property.
   *
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object. This is why there is
   * not a <CODE>set</CODE> method for the meldung property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getMeldung().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list {@link Meldung }
   */
  public List<Meldung> getMeldung() {
	if(meldung == null) {
	  meldung = new ArrayList<Meldung>();
	}
	return this.meldung;
  }

  /**
   * Ruft den Wert der returnCode-Eigenschaft ab.
   *
   * @return possible object is {@link BigInteger }
   */
  public BigInteger getReturnCode() {
	return returnCode;
  }

  /**
   * Legt den Wert der returnCode-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link BigInteger }
   */
  public void setReturnCode(BigInteger value) {
	this.returnCode = value;
  }

  /**
   * Ruft den Wert der transaktionID-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getTransaktionID() {
	return transaktionID;
  }

  /**
   * Legt den Wert der transaktionID-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setTransaktionID(String value) {
	this.transaktionID = value;
  }
}
