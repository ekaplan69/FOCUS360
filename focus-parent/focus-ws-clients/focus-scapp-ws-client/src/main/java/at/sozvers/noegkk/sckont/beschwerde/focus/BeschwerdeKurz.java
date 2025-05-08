package at.sozvers.noegkk.sckont.beschwerde.focus;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.*;

/**
 * <p>Java class for beschwerdeKurz complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="beschwerdeKurz">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="beschwerdeId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="fachbereichBez" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="kanalBez" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="kontaktpunktBez" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="statusId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="storno" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="themaBez" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="zeitpunkt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="beschwerdeKurz", propOrder={"beschwerdeId", "fachbereichBez", "kanalBez", "kontaktpunktBez", "statusId", "storno", "themaBez", "zeitpunkt"})
public class BeschwerdeKurz {

  protected long                 beschwerdeId;
  @XmlElement(required=true)
  protected String               fachbereichBez;
  @XmlElement(required=true)
  protected String               kanalBez;
  @XmlElement(required=true)
  protected String               kontaktpunktBez;
  protected long                 statusId;
  protected boolean              storno;
  @XmlElement(required=true)
  protected String               themaBez;
  @XmlElement(required=true)
  @XmlSchemaType(name="dateTime")
  protected XMLGregorianCalendar zeitpunkt;

  /**
   * Gets the value of the beschwerdeId property.
   */
  public long getBeschwerdeId() {
	return beschwerdeId;
  }

  /**
   * Sets the value of the beschwerdeId property.
   */
  public void setBeschwerdeId(long value) {
	this.beschwerdeId = value;
  }

  /**
   * Gets the value of the fachbereichBez property.
   *
   * @return possible object is {@link String }
   */
  public String getFachbereichBez() {
	return fachbereichBez;
  }

  /**
   * Sets the value of the fachbereichBez property.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setFachbereichBez(String value) {
	this.fachbereichBez = value;
  }

  /**
   * Gets the value of the kanalBez property.
   *
   * @return possible object is {@link String }
   */
  public String getKanalBez() {
	return kanalBez;
  }

  /**
   * Sets the value of the kanalBez property.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setKanalBez(String value) {
	this.kanalBez = value;
  }

  /**
   * Gets the value of the kontaktpunktBez property.
   *
   * @return possible object is {@link String }
   */
  public String getKontaktpunktBez() {
	return kontaktpunktBez;
  }

  /**
   * Sets the value of the kontaktpunktBez property.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setKontaktpunktBez(String value) {
	this.kontaktpunktBez = value;
  }

  /**
   * Gets the value of the statusId property.
   */
  public long getStatusId() {
	return statusId;
  }

  /**
   * Sets the value of the statusId property.
   */
  public void setStatusId(long value) {
	this.statusId = value;
  }

  /**
   * Gets the value of the themaBez property.
   *
   * @return possible object is {@link String }
   */
  public String getThemaBez() {
	return themaBez;
  }

  /**
   * Sets the value of the themaBez property.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setThemaBez(String value) {
	this.themaBez = value;
  }

  /**
   * Gets the value of the zeitpunkt property.
   *
   * @return possible object is {@link XMLGregorianCalendar }
   */
  public XMLGregorianCalendar getZeitpunkt() {
	return zeitpunkt;
  }

  /**
   * Sets the value of the zeitpunkt property.
   *
   * @param value
   * 		allowed object is {@link XMLGregorianCalendar }
   */
  public void setZeitpunkt(XMLGregorianCalendar value) {
	this.zeitpunkt = value;
  }

  /**
   * Gets the value of the storno property.
   */
  public boolean isStorno() {
	return storno;
  }

  /**
   * Sets the value of the storno property.
   */
  public void setStorno(boolean value) {
	this.storno = value;
  }
}
