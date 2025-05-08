package at.sozvers.noegkk.sckont.kontakt.focus;

import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für kontaktunterthema complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="kontaktunterthema">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bezeichnung" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="kontaktunterthema", propOrder={"bezeichnung", "id"})
public class Kontaktunterthema {

  @XmlElement(required=true)
  protected String bezeichnung;
  protected long   id;

  /**
   * Ruft den Wert der bezeichnung-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getBezeichnung() {
	return bezeichnung;
  }

  /**
   * Legt den Wert der bezeichnung-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setBezeichnung(String value) {
	this.bezeichnung = value;
  }

  /**
   * Ruft den Wert der id-Eigenschaft ab.
   */
  public long getId() {
	return id;
  }

  /**
   * Legt den Wert der id-Eigenschaft fest.
   */
  public void setId(long value) {
	this.id = value;
  }
}
