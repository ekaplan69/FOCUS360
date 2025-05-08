package at.sozvers.noegkk.sckont.beschwerde.focus;

import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.*;

/**
 * <p>Java class for beschwerdeAendernRequest complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="beschwerdeAendernRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://focus.beschwerde.sckont.noegkk.sozvers.at/}standardRequest">
 *       &lt;sequence>
 *         &lt;element name="beschreibung" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="beschwerdegruende" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded"/>
 *         &lt;element name="beschwerdegrundAnmerkung" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fachbereichDetailId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="fachschluessel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fachschluesselArt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="kanalId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="kontaktpunktId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="massnahmen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="meldendeStelleId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="mitarbeiterkennung" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mitarbeitername" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="statusId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="telefon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="updatecount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="zeitpunkt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="beschwerdeAendernRequest",
		 propOrder={"beschreibung", "beschwerdegruende", "beschwerdegrundAnmerkung", "email", "fachbereichDetailId", "fachschluessel", "fachschluesselArt", "id", "kanalId", "kontaktpunktId",
				 "massnahmen", "meldendeStelleId", "mitarbeiterkennung", "mitarbeitername", "statusId", "telefon", "updatecount", "zeitpunkt"})
public class BeschwerdeAendernRequest extends StandardRequest {

  protected String               beschreibung;
  @XmlElement(type=Long.class)
  protected List<Long>           beschwerdegruende;
  protected String               beschwerdegrundAnmerkung;
  protected String               email;
  protected long                 fachbereichDetailId;
  @XmlElement(required=true)
  protected String               fachschluessel;
  @XmlElement(required=true)
  protected String               fachschluesselArt;
  protected long                 id;
  protected long                 kanalId;
  protected long                 kontaktpunktId;
  protected String               massnahmen;
  protected Long                 meldendeStelleId;
  @XmlElement(required=true)
  protected String               mitarbeiterkennung;
  @XmlElement(required=true)
  protected String               mitarbeitername;
  protected int                  statusId;
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
   * Gets the value of the id property.
   */
  public long getId() {
	return id;
  }

  /**
   * Sets the value of the id property.
   */
  public void setId(long value) {
	this.id = value;
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
   * Gets the value of the mitarbeiterkennung property.
   *
   * @return possible object is {@link String }
   */
  public String getMitarbeiterkennung() {
	return mitarbeiterkennung;
  }

  /**
   * Sets the value of the mitarbeiterkennung property.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setMitarbeiterkennung(String value) {
	this.mitarbeiterkennung = value;
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
}
