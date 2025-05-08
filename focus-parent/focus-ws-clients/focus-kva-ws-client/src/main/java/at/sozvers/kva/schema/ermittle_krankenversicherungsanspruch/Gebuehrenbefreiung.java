package at.sozvers.kva.schema.ermittle_krankenversicherungsanspruch;

import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für gebuehrenbefreiung complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="gebuehrenbefreiung"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="gebuehrenbefreiungstyp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gebuehrenbefreiungstypBezeichnung" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="gebuehrenbefreiung", propOrder={"gebuehrenbefreiungstyp", "gebuehrenbefreiungstypBezeichnung"})
public class Gebuehrenbefreiung {

  protected String gebuehrenbefreiungstyp;
  protected String gebuehrenbefreiungstypBezeichnung;

  /**
   * Ruft den Wert der gebuehrenbefreiungstyp-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getGebuehrenbefreiungstyp() {
	return gebuehrenbefreiungstyp;
  }

  /**
   * Legt den Wert der gebuehrenbefreiungstyp-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setGebuehrenbefreiungstyp(String value) {
	this.gebuehrenbefreiungstyp = value;
  }

  /**
   * Ruft den Wert der gebuehrenbefreiungstypBezeichnung-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getGebuehrenbefreiungstypBezeichnung() {
	return gebuehrenbefreiungstypBezeichnung;
  }

  /**
   * Legt den Wert der gebuehrenbefreiungstypBezeichnung-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setGebuehrenbefreiungstypBezeichnung(String value) {
	this.gebuehrenbefreiungstypBezeichnung = value;
  }
}
