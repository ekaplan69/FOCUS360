package at.sozvers.zvd.ws.versicherungsverhaeltnisselesenservice.v3.types;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für versicherungszeit complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="versicherungszeit">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vonDatum" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="bisDatum" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="vvhKey" type="{http://sozvers.at/zvd/ws/VersicherungsverhaeltnisseLesenService/v3/types}vvhKey"/>
 *         &lt;element name="qualifikation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="versicherungszeit", propOrder={"vonDatum", "bisDatum", "vvhKey", "qualifikation"})
public class Versicherungszeit {

  @XmlElement(required=true)
  @XmlSchemaType(name="date")
  protected XMLGregorianCalendar bisDatum;
  @XmlElement(required=true)
  protected String               qualifikation;
  @XmlElement(required=true)
  @XmlSchemaType(name="date")
  protected XMLGregorianCalendar vonDatum;
  @XmlElement(required=true)
  protected VvhKey               vvhKey;

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
   * Ruft den Wert der qualifikation-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getQualifikation() {
	return qualifikation;
  }

  /**
   * Legt den Wert der qualifikation-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setQualifikation(String value) {
	this.qualifikation = value;
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
   * Ruft den Wert der vvhKey-Eigenschaft ab.
   *
   * @return possible object is {@link VvhKey }
   */
  public VvhKey getVvhKey() {
	return vvhKey;
  }

  /**
   * Legt den Wert der vvhKey-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link VvhKey }
   */
  public void setVvhKey(VvhKey value) {
	this.vvhKey = value;
  }
}
