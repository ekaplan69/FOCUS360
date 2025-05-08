package at.sozvers.noegkk.sckont.kontakt.focus;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für kontaktgrund complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="kontaktgrund">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kontaktdetails" type="{http://focus.kontakt.sckont.noegkk.sozvers.at/}kontaktdetail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="kontaktgrundId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="kontaktgrund_bezeichnung" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="kontaktgrund", propOrder={"kontaktdetails", "kontaktgrundId", "kontaktgrundBezeichnung"})
public class Kontaktgrund {

  @XmlElement(nillable=true)
  protected List<Kontaktdetail> kontaktdetails;
  @XmlElement(name="kontaktgrund_bezeichnung", required=true)
  protected String              kontaktgrundBezeichnung;
  protected Long                kontaktgrundId;

  /**
   * Gets the value of the kontaktdetails property.
   *
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object. This is why there is
   * not a <CODE>set</CODE> method for the kontaktdetails property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getKontaktdetails().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list {@link Kontaktdetail }
   */
  public List<Kontaktdetail> getKontaktdetails() {
	if(kontaktdetails == null) {
	  kontaktdetails = new ArrayList<>();
	}
	return this.kontaktdetails;
  }

  /**
   * Ruft den Wert der kontaktgrundBezeichnung-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getKontaktgrundBezeichnung() {
	return kontaktgrundBezeichnung;
  }

  /**
   * Legt den Wert der kontaktgrundBezeichnung-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setKontaktgrundBezeichnung(String value) {
	this.kontaktgrundBezeichnung = value;
  }

  /**
   * Ruft den Wert der kontaktgrundId-Eigenschaft ab.
   *
   * @return possible object is {@link Long }
   */
  public Long getKontaktgrundId() {
	return kontaktgrundId;
  }

  /**
   * Legt den Wert der kontaktgrundId-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link Long }
   */
  public void setKontaktgrundId(Long value) {
	this.kontaktgrundId = value;
  }
}
