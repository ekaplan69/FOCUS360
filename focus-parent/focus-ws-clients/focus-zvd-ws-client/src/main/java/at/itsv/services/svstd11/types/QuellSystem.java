package at.itsv.services.svstd11.types;

import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für QuellSystem complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="QuellSystem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ApplikationsId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SystemId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="QuellSystem", propOrder={"applikationsId", "systemId"})
public class QuellSystem {

  @XmlElement(name="ApplikationsId", required=true)
  protected String applikationsId;
  @XmlElement(name="SystemId", required=true)
  protected String systemId;

  /**
   * Ruft den Wert der applikationsId-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getApplikationsId() {
	return applikationsId;
  }

  /**
   * Legt den Wert der applikationsId-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setApplikationsId(String value) {
	this.applikationsId = value;
  }

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
}
