package at.sozvers.noegkk.sckont.kontakt.focus;

import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für gueltigeOe complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="gueltigeOe">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id"  type="{http://www.w3.org/2001/XMLSchema}Integer"/>
 *         &lt;element name="bezeichnung" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bere_org" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="gueltigeOe", propOrder={"id", "bezeichnung", "bere_org"})

public class GueltigeOe {
  @XmlElement(required=true)
  protected String  bere_org;
  @XmlElement(required=true)
  protected String  bezeichnung;
  @XmlElement(required=true)
  protected Integer id;

  /**
   * Ruft den Wert der bere_org-Eigenschaft ab.
   *
   * @return *     possible object is *     {@link String }
   */
  public String getBereOrg() {
	return bere_org;
  }

  /**
   * Legt den Wert der bere_org-Eigenschaft fest.
   *
   * @param bere_org
   * 		allowed object is {@link String }
   */
  public void setBereOrg(String bere_org) {
	this.bere_org = bere_org;
  }

  /**
   * Ruft den Wert der bezeichnung-Eigenschaft ab.
   *
   * @return *     possible object is *     {@link String }
   */
  public String getBezeichnung() {
	return bezeichnung;
  }

  /**
   * Legt den Wert der bezeichnung-Eigenschaft fest.
   *
   * @param bezeichnung
   * 		allowed object is {@link String }
   */
  public void setBezeichnung(String bezeichnung) {
	this.bezeichnung = bezeichnung;
  }

  /**
   * Ruft den Wert der id-Eigenschaft ab.
   *
   * @return *     possible object is *     {@link Integer }
   */
  public Integer getId() {
	return id;
  }

  /**
   * Legt den Wert der id-Eigenschaft fest.
   *
   * @param id
   * 		allowed object is {@link Integer }
   */
  public void setId(Integer id) {
	this.id = id;
  }
}
