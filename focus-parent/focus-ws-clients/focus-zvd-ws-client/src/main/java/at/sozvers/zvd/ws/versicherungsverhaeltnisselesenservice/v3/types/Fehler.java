package at.sozvers.zvd.ws.versicherungsverhaeltnisselesenservice.v3.types;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für fehler complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="fehler">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vvhKeys" type="{http://sozvers.at/zvd/ws/VersicherungsverhaeltnisseLesenService/v3/types}vvhKeys"/>
 *         &lt;element name="vonDatum" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="bisDatum" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="fehlercode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="fehler", propOrder={"vvhKeys", "vonDatum", "bisDatum", "fehlercode"})
public class Fehler {

  @XmlElement(required=true)
  @XmlSchemaType(name="date")
  protected XMLGregorianCalendar bisDatum;
  @XmlElement(required=true)
  protected String               fehlercode;
  @XmlElement(required=true)
  @XmlSchemaType(name="date")
  protected XMLGregorianCalendar vonDatum;
  @XmlElement(required=true)
  protected VvhKeys              vvhKeys;

  /**
   * Ruft den Wert der bisDatum-Eigenschaft ab.
   *
   * @return possible object is {@link XMLGregorianCalendar }
   */
  public XMLGregorianCalendar getBisDatum() {
	return bisDatum;
  }

  /**
   * Legt den Wert der bisDatum-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link XMLGregorianCalendar }
   */
  public void setBisDatum(XMLGregorianCalendar value) {
	this.bisDatum = value;
  }

  /**
   * Ruft den Wert der fehlercode-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getFehlercode() {
	return fehlercode;
  }

  /**
   * Legt den Wert der fehlercode-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setFehlercode(String value) {
	this.fehlercode = value;
  }

  /**
   * Ruft den Wert der vonDatum-Eigenschaft ab.
   *
   * @return possible object is {@link XMLGregorianCalendar }
   */
  public XMLGregorianCalendar getVonDatum() {
	return vonDatum;
  }

  /**
   * Legt den Wert der vonDatum-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link XMLGregorianCalendar }
   */
  public void setVonDatum(XMLGregorianCalendar value) {
	this.vonDatum = value;
  }

  /**
   * Ruft den Wert der vvhKeys-Eigenschaft ab.
   *
   * @return possible object is {@link VvhKeys }
   */
  public VvhKeys getVvhKeys() {
	return vvhKeys;
  }

  /**
   * Legt den Wert der vvhKeys-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link VvhKeys }
   */
  public void setVvhKeys(VvhKeys value) {
	this.vvhKeys = value;
  }
}
