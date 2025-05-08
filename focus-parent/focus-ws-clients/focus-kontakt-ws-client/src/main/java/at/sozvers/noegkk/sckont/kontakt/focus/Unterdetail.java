package at.sozvers.noegkk.sckont.kontakt.focus;

import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für unterdetail complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="unterdetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="unterdetailBezeichnung" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="unterdetailHilfetext" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unterdetailId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="unterdetail", propOrder={"unterdetailBezeichnung", "unterdetailHilfetext", "unterdetailId"})
public class Unterdetail {

  @XmlElement(required=true)
  protected String unterdetailBezeichnung;
  protected String unterdetailHilfetext;
  protected long   unterdetailId;

  /**
   * Ruft den Wert der unterdetailBezeichnung-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getUnterdetailBezeichnung() {
	return unterdetailBezeichnung;
  }

  /**
   * Legt den Wert der unterdetailBezeichnung-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setUnterdetailBezeichnung(String value) {
	this.unterdetailBezeichnung = value;
  }

  /**
   * Ruft den Wert der unterdetailHilfetext-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getUnterdetailHilfetext() {
	return unterdetailHilfetext;
  }

  /**
   * Legt den Wert der unterdetailHilfetext-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setUnterdetailHilfetext(String value) {
	this.unterdetailHilfetext = value;
  }

  /**
   * Ruft den Wert der unterdetailId-Eigenschaft ab.
   */
  public long getUnterdetailId() {
	return unterdetailId;
  }

  /**
   * Legt den Wert der unterdetailId-Eigenschaft fest.
   */
  public void setUnterdetailId(long value) {
	this.unterdetailId = value;
  }
}
