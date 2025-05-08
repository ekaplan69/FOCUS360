package at.sozvers.focus.ws.geschaeftsfall.starten;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für anonymous complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="aufbewahrungsfrist-aussetzen" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="frist-beginndatum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="", propOrder={"aufbewahrungsfristAussetzen", "fristBeginndatum"})
@XmlRootElement(name="aufbewahrungsfristAendern", namespace="http://awf.sozvers.at/schema/dokument")
public class AufbewahrungsfristAendern {

  @XmlElement(name="aufbewahrungsfrist-aussetzen", namespace="http://awf.sozvers.at/schema/dokument")
  protected Boolean              aufbewahrungsfristAussetzen;
  @XmlElement(name="frist-beginndatum", namespace="http://awf.sozvers.at/schema/dokument")
  @XmlSchemaType(name="date")
  protected XMLGregorianCalendar fristBeginndatum;

  /**
   * Ruft den Wert der fristBeginndatum-Eigenschaft ab.
   *
   * @return possible object is {@link XMLGregorianCalendar }
   */
  public XMLGregorianCalendar getFristBeginndatum() {
	return fristBeginndatum;
  }

  /**
   * Legt den Wert der fristBeginndatum-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link XMLGregorianCalendar }
   */
  public void setFristBeginndatum(XMLGregorianCalendar value) {
	this.fristBeginndatum = value;
  }

  /**
   * Ruft den Wert der aufbewahrungsfristAussetzen-Eigenschaft ab.
   *
   * @return possible object is {@link Boolean }
   */
  public Boolean isAufbewahrungsfristAussetzen() {
	return aufbewahrungsfristAussetzen;
  }

  /**
   * Legt den Wert der aufbewahrungsfristAussetzen-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link Boolean }
   */
  public void setAufbewahrungsfristAussetzen(Boolean value) {
	this.aufbewahrungsfristAussetzen = value;
  }
}
