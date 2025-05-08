package at.itsv.services.svstd11.types;

import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für ZielSystem complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="ZielSystem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SystemModus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SystemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="ZielSystem", propOrder={"systemModus", "systemId"})
public class ZielSystem {

  @XmlElement(name="SystemId")
  protected String systemId;
  @XmlElement(name="SystemModus")
  protected String systemModus;

  /**
   * Ruft den Wert der systemId-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getSystemId() {
	return systemId;
  }

  /**
   * Legt den Wert der systemId-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setSystemId(String value) {
	this.systemId = value;
  }

  /**
   * Ruft den Wert der systemModus-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getSystemModus() {
	return systemModus;
  }

  /**
   * Legt den Wert der systemModus-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setSystemModus(String value) {
	this.systemModus = value;
  }
}
