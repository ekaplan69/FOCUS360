package at.sozvers.noegkk.sckont.beschwerde.focus;

import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.*;

/**
 * <p>Java class for beschwerde complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="beschwerde">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="beschreibung" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="beschwerdegruende" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded"/>
 *         &lt;element name="beschwerdegrundAnmerkung" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fachbereichDetailId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="kanalId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="kontaktpunktId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="massnahmen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="meldendeStelleId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="mitarbeitername" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="statusId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="storno" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="telefon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="updatecount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="zeitpunkt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="beschwerde",
		 propOrder={"beschreibung", "beschwerdegruende", "beschwerdegrundAnmerkung", "email", "fachbereichDetailId", "kanalId", "kontaktpunktId", "massnahmen", "meldendeStelleId", "mitarbeitername",
				 "statusId", "storno", "telefon", "updatecount", "zeitpunkt"})
public class Beschwerde {

  protected String               beschreibung;
  @XmlElement(type=Long.class)
  protected List<Long>           beschwerdegruende;
  protected String               beschwerdegrundAnmerkung;
  protected String               email;
  protected long                 fachbereichDetailId;
  protected long                 kanalId;
  protected long                 kontaktpunktId;
  protected String               massnahmen;
  protected Long                 meldendeStelleId;
  @XmlElement(required=true)
  protected String               mitarbeitername;
  protected int                  statusId;
  protected Boolean              storno;
  protected String               telefon;
  protected long                 updatecount;
  @XmlElement(required=true)
  @XmlSchemaType(name="dateTime")
  protected XMLGregorianCalendar zeitpunkt;

  /**
   * Gets the value of the beschreibung property.
   *
   * @return possible object is {@link String }
   */
  public String getBeschreibung() {
	return beschreibung;
  }

  /**
   * Sets the value of the beschreibung property.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setBeschreibung(String value) {
	this.beschreibung = value;
  }

  /**
   * Gets the value of the beschwerdegruende property.
   *
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object. This is why there is
   * not a <CODE>set</CODE> method for the beschwerdegruende property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getBeschwerdegruende().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list {@link Long }
   */
  public List<Long> getBeschwerdegruende() {
	if(beschwerdegruende == null) {
	  beschwerdegruende = new ArrayList<>();
	}
	return this.beschwerdegruende;
  }

  /**
   * Gets the value of the beschwerdegrundAnmerkung property.
   *
   * @return possible object is {@link String }
   */
  public String getBeschwerdegrundAnmerkung() {
	return beschwerdegrundAnmerkung;
  }

  /**
   * Sets the value of the beschwerdegrundAnmerkung property.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setBeschwerdegrundAnmerkung(String value) {
	this.beschwerdegrundAnmerkung = value;
  }

  /**
   * Gets the value of the email property.
   *
   * @return possible object is {@link String }
   */
  public String getEmail() {
	return email;
  }

  /**
   * Sets the value of the email property.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setEmail(String value) {
	this.email = value;
  }

  /**
   * Gets the value of the fachbereichDetailId property.
   */
  public long getFachbereichDetailId() {
	return fachbereichDetailId;
  }

  /**
   * Sets the value of the fachbereichDetailId property.
   */
  public void setFachbereichDetailId(long value) {
	this.fachbereichDetailId = value;
  }

  /**
   * Gets the value of the kanalId property.
   */
  public long getKanalId() {
	return kanalId;
  }

  /**
   * Sets the value of the kanalId property.
   */
  public void setKanalId(long value) {
	this.kanalId = value;
  }

  /**
   * Gets the value of the kontaktpunktId property.
   */
  public long getKontaktpunktId() {
	return kontaktpunktId;
  }

  /**
   * Sets the value of the kontaktpunktId property.
   */
  public void setKontaktpunktId(long value) {
	this.kontaktpunktId = value;
  }

  /**
   * Gets the value of the massnahmen property.
   *
   * @return possible object is {@link String }
   */
  public String getMassnahmen() {
	return massnahmen;
  }

  /**
   * Sets the value of the massnahmen property.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setMassnahmen(String value) {
	this.massnahmen = value;
  }

  /**
   * Gets the value of the meldendeStelleId property.
   *
   * @return possible object is {@link Long }
   */
  public Long getMeldendeStelleId() {
	return meldendeStelleId;
  }

  /**
   * Sets the value of the meldendeStelleId property.
   *
   * @param value
   * 		allowed object is {@link Long }
   */
  public void setMeldendeStelleId(Long value) {
	this.meldendeStelleId = value;
  }

  /**
   * Gets the value of the mitarbeitername property.
   *
   * @return possible object is {@link String }
   */
  public String getMitarbeitername() {
	return mitarbeitername;
  }

  /**
   * Sets the value of the mitarbeitername property.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setMitarbeitername(String value) {
	this.mitarbeitername = value;
  }

  /**
   * Gets the value of the statusId property.
   */
  public int getStatusId() {
	return statusId;
  }

  /**
   * Sets the value of the statusId property.
   */
  public void setStatusId(int value) {
	this.statusId = value;
  }

  /**
   * Gets the value of the telefon property.
   *
   * @return possible object is {@link String }
   */
  public String getTelefon() {
	return telefon;
  }

  /**
   * Sets the value of the telefon property.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setTelefon(String value) {
	this.telefon = value;
  }

  /**
   * Gets the value of the updatecount property.
   */
  public long getUpdatecount() {
	return updatecount;
  }

  /**
   * Sets the value of the updatecount property.
   */
  public void setUpdatecount(long value) {
	this.updatecount = value;
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
   *
   * @return possible object is {@link Boolean }
   */
  public Boolean isStorno() {
	return storno;
  }

  /**
   * Sets the value of the storno property.
   *
   * @param value
   * 		allowed object is {@link Boolean }
   */
  public void setStorno(Boolean value) {
	this.storno = value;
  }
}
