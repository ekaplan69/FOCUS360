package at.sozvers.noegkk.sckont.beschwerde.focus;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.*;

/**
 * <p>Java class for beschwerdenErmittelnRequest complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="beschwerdenErmittelnRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://focus.beschwerde.sckont.noegkk.sozvers.at/}standardRequest">
 *       &lt;sequence>
 *         &lt;element name="fachschluessel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fachschluesselArt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="stichtagDat" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="beschwerdenErmittelnRequest", propOrder={"fachschluessel", "fachschluesselArt", "stichtagDat"})
public class BeschwerdenErmittelnRequest extends StandardRequest {

  @XmlElement(required=true)
  protected String               fachschluessel;
  @XmlElement(required=true)
  protected String               fachschluesselArt;
  @XmlSchemaType(name="date")
  protected XMLGregorianCalendar stichtagDat;

  /**
   * Gets the value of the fachschluessel property.
   *
   * @return possible object is {@link String }
   */
  public String getFachschluessel() {
	return fachschluessel;
  }

  /**
   * Sets the value of the fachschluessel property.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setFachschluessel(String value) {
	this.fachschluessel = value;
  }

  /**
   * Gets the value of the fachschluesselArt property.
   *
   * @return possible object is {@link String }
   */
  public String getFachschluesselArt() {
	return fachschluesselArt;
  }

  /**
   * Sets the value of the fachschluesselArt property.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setFachschluesselArt(String value) {
	this.fachschluesselArt = value;
  }

  /**
   * Gets the value of the stichtagDat property.
   *
   * @return possible object is {@link XMLGregorianCalendar }
   */
  public XMLGregorianCalendar getStichtagDat() {
	return stichtagDat;
  }

  /**
   * Sets the value of the stichtagDat property.
   *
   * @param value
   * 		allowed object is {@link XMLGregorianCalendar }
   */
  public void setStichtagDat(XMLGregorianCalendar value) {
	this.stichtagDat = value;
  }
}
