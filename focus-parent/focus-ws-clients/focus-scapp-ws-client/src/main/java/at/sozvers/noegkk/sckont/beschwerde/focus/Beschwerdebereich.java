package at.sozvers.noegkk.sckont.beschwerde.focus;

import jakarta.xml.bind.annotation.*;

/**
 * <p>Java class for beschwerdebereich complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="beschwerdebereich">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="beschwerdebereichId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="fachbereichBezeichnung" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fachbereichDetailBezeichnung" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fachbereichDetailHilfetext" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fachbereichHilfetext" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fachbereichId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="themaBezeichnung" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="themaHilfetext" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="themaId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="beschwerdebereich",
		 propOrder={"beschwerdebereichId", "fachbereichBezeichnung", "fachbereichDetailBezeichnung", "fachbereichDetailHilfetext", "fachbereichHilfetext", "fachbereichId", "themaBezeichnung",
				 "themaHilfetext", "themaId"})
public class Beschwerdebereich {

  protected long   beschwerdebereichId;
  @XmlElement(required=true)
  protected String fachbereichBezeichnung;
  @XmlElement(required=true)
  protected String fachbereichDetailBezeichnung;
  protected String fachbereichDetailHilfetext;
  protected String fachbereichHilfetext;
  protected long   fachbereichId;
  @XmlElement(required=true)
  protected String themaBezeichnung;
  protected String themaHilfetext;
  protected long   themaId;

  /**
   * Gets the value of the beschwerdebereichId property.
   */
  public long getBeschwerdebereichId() {
	return beschwerdebereichId;
  }

  /**
   * Sets the value of the beschwerdebereichId property.
   */
  public void setBeschwerdebereichId(long value) {
	this.beschwerdebereichId = value;
  }

  /**
   * Gets the value of the fachbereichBezeichnung property.
   *
   * @return possible object is {@link String }
   */
  public String getFachbereichBezeichnung() {
	return fachbereichBezeichnung;
  }

  /**
   * Sets the value of the fachbereichBezeichnung property.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setFachbereichBezeichnung(String value) {
	this.fachbereichBezeichnung = value;
  }

  /**
   * Gets the value of the fachbereichDetailBezeichnung property.
   *
   * @return possible object is {@link String }
   */
  public String getFachbereichDetailBezeichnung() {
	return fachbereichDetailBezeichnung;
  }

  /**
   * Sets the value of the fachbereichDetailBezeichnung property.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setFachbereichDetailBezeichnung(String value) {
	this.fachbereichDetailBezeichnung = value;
  }

  /**
   * Gets the value of the fachbereichDetailHilfetext property.
   *
   * @return possible object is {@link String }
   */
  public String getFachbereichDetailHilfetext() {
	return fachbereichDetailHilfetext;
  }

  /**
   * Sets the value of the fachbereichDetailHilfetext property.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setFachbereichDetailHilfetext(String value) {
	this.fachbereichDetailHilfetext = value;
  }

  /**
   * Gets the value of the fachbereichHilfetext property.
   *
   * @return possible object is {@link String }
   */
  public String getFachbereichHilfetext() {
	return fachbereichHilfetext;
  }

  /**
   * Sets the value of the fachbereichHilfetext property.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setFachbereichHilfetext(String value) {
	this.fachbereichHilfetext = value;
  }

  /**
   * Gets the value of the fachbereichId property.
   */
  public long getFachbereichId() {
	return fachbereichId;
  }

  /**
   * Sets the value of the fachbereichId property.
   */
  public void setFachbereichId(long value) {
	this.fachbereichId = value;
  }

  /**
   * Gets the value of the themaBezeichnung property.
   *
   * @return possible object is {@link String }
   */
  public String getThemaBezeichnung() {
	return themaBezeichnung;
  }

  /**
   * Sets the value of the themaBezeichnung property.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setThemaBezeichnung(String value) {
	this.themaBezeichnung = value;
  }

  /**
   * Gets the value of the themaHilfetext property.
   *
   * @return possible object is {@link String }
   */
  public String getThemaHilfetext() {
	return themaHilfetext;
  }

  /**
   * Sets the value of the themaHilfetext property.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setThemaHilfetext(String value) {
	this.themaHilfetext = value;
  }

  /**
   * Gets the value of the themaId property.
   */
  public long getThemaId() {
	return themaId;
  }

  /**
   * Sets the value of the themaId property.
   */
  public void setThemaId(long value) {
	this.themaId = value;
  }
}
