package at.sozvers.noegkk.sckont.kontakt.focus;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für kontaktdetail complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="kontaktdetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kontaktdetailBezeichnung" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="kontaktdetailHilfetext" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="kontaktdetailId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="unterdetails" type="{http://focus.kontakt.sckont.noegkk.sozvers.at/}unterdetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="kontaktdetail", propOrder={"kontaktdetailBezeichnung", "kontaktdetailHilfetext", "kontaktdetailId", "unterdetails"})
public class Kontaktdetail {

  @XmlElement(required=true)
  protected String            kontaktdetailBezeichnung;
  protected String            kontaktdetailHilfetext;
  protected long              kontaktdetailId;
  @XmlElement(nillable=true)
  protected List<Unterdetail> unterdetails;

  /**
   * Ruft den Wert der kontaktdetailBezeichnung-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getKontaktdetailBezeichnung() {
	return kontaktdetailBezeichnung;
  }

  /**
   * Legt den Wert der kontaktdetailBezeichnung-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setKontaktdetailBezeichnung(String value) {
	this.kontaktdetailBezeichnung = value;
  }

  /**
   * Ruft den Wert der kontaktdetailHilfetext-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getKontaktdetailHilfetext() {
	return kontaktdetailHilfetext;
  }

  /**
   * Legt den Wert der kontaktdetailHilfetext-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setKontaktdetailHilfetext(String value) {
	this.kontaktdetailHilfetext = value;
  }

  /**
   * Ruft den Wert der kontaktdetailId-Eigenschaft ab.
   */
  public long getKontaktdetailId() {
	return kontaktdetailId;
  }

  /**
   * Legt den Wert der kontaktdetailId-Eigenschaft fest.
   */
  public void setKontaktdetailId(long value) {
	this.kontaktdetailId = value;
  }

  /**
   * Gets the value of the unterdetails property.
   *
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object. This is why there is
   * not a <CODE>set</CODE> method for the unterdetails property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getUnterdetails().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list {@link Unterdetail }
   */
  public List<Unterdetail> getUnterdetails() {
	if(unterdetails == null) {
	  unterdetails = new ArrayList<>();
	}
	return this.unterdetails;
  }
}
