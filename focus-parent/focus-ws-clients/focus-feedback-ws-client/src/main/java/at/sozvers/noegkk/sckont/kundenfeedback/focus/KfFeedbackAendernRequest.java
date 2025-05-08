package at.sozvers.noegkk.sckont.kundenfeedback.focus;

import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für kfFeedbackAendernRequest complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="kfFeedbackAendernRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://focus.kundenfeedback.sckont.noegkk.sozvers.at/}standardRequest">
 *       &lt;sequence>
 *         &lt;element name="beschreibung" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="feedbackArt" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="feedbackgrundId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="kontaktartId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="letztaend" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ort" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="plz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="staatISOA3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="telNr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="themaId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="unterkategorieId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="updateCount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="verbesserungspotential" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="kfFeedbackAendernRequest",
		 propOrder={"beschreibung", "email", "feedbackArt", "feedbackgrundId", "id", "kontaktartId", "letztaend", "name", "ort", "plz", "staatISOA3", "status", "telNr", "themaId", "unterkategorieId",
				 "updateCount", "verbesserungspotential"})
public class KfFeedbackAendernRequest extends StandardRequest {

  protected String beschreibung;
  protected String email;
  protected long   feedbackArt;
  protected long   feedbackgrundId;
  protected long   id;
  protected long   kontaktartId;
  @XmlElement(required=true)
  protected String letztaend;
  protected String name;
  protected String ort;
  protected String plz;
  protected String staatISOA3;
  protected long   status;
  protected String telNr;
  protected long   themaId;
  protected Long   unterkategorieId;
  protected long   updateCount;
  protected String verbesserungspotential;

  /**
   * Ruft den Wert der beschreibung-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getBeschreibung() {
	return beschreibung;
  }

  /**
   * Legt den Wert der beschreibung-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setBeschreibung(String value) {
	this.beschreibung = value;
  }

  /**
   * Ruft den Wert der email-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getEmail() {
	return email;
  }

  /**
   * Legt den Wert der email-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setEmail(String value) {
	this.email = value;
  }

  /**
   * Ruft den Wert der feedbackArt-Eigenschaft ab.
   */
  public long getFeedbackArt() {
	return feedbackArt;
  }

  /**
   * Legt den Wert der feedbackArt-Eigenschaft fest.
   */
  public void setFeedbackArt(long value) {
	this.feedbackArt = value;
  }

  /**
   * Ruft den Wert der feedbackgrundId-Eigenschaft ab.
   */
  public long getFeedbackgrundId() {
	return feedbackgrundId;
  }

  /**
   * Legt den Wert der feedbackgrundId-Eigenschaft fest.
   */
  public void setFeedbackgrundId(long value) {
	this.feedbackgrundId = value;
  }

  /**
   * Ruft den Wert der id-Eigenschaft ab.
   */
  public long getId() {
	return id;
  }

  /**
   * Legt den Wert der id-Eigenschaft fest.
   */
  public void setId(long value) {
	this.id = value;
  }

  /**
   * Ruft den Wert der kontaktartId-Eigenschaft ab.
   */
  public long getKontaktartId() {
	return kontaktartId;
  }

  /**
   * Legt den Wert der kontaktartId-Eigenschaft fest.
   */
  public void setKontaktartId(long value) {
	this.kontaktartId = value;
  }

  /**
   * Ruft den Wert der letztaend-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getLetztaend() {
	return letztaend;
  }

  /**
   * Legt den Wert der letztaend-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setLetztaend(String value) {
	this.letztaend = value;
  }

  /**
   * Ruft den Wert der name-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getName() {
	return name;
  }

  /**
   * Legt den Wert der name-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setName(String value) {
	this.name = value;
  }

  /**
   * Ruft den Wert der ort-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getOrt() {
	return ort;
  }

  /**
   * Legt den Wert der ort-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setOrt(String value) {
	this.ort = value;
  }

  /**
   * Ruft den Wert der plz-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getPlz() {
	return plz;
  }

  /**
   * Legt den Wert der plz-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setPlz(String value) {
	this.plz = value;
  }

  /**
   * Ruft den Wert der staatISOA3-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getStaatISOA3() {
	return staatISOA3;
  }

  /**
   * Legt den Wert der staatISOA3-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setStaatISOA3(String value) {
	this.staatISOA3 = value;
  }

  /**
   * Ruft den Wert der status-Eigenschaft ab.
   */
  public long getStatus() {
	return status;
  }

  /**
   * Legt den Wert der status-Eigenschaft fest.
   */
  public void setStatus(long value) {
	this.status = value;
  }

  /**
   * Ruft den Wert der telNr-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getTelNr() {
	return telNr;
  }

  /**
   * Legt den Wert der telNr-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setTelNr(String value) {
	this.telNr = value;
  }

  /**
   * Ruft den Wert der themaId-Eigenschaft ab.
   */
  public long getThemaId() {
	return themaId;
  }

  /**
   * Legt den Wert der themaId-Eigenschaft fest.
   */
  public void setThemaId(long value) {
	this.themaId = value;
  }

  /**
   * Ruft den Wert der unterkategorieId-Eigenschaft ab.
   *
   * @return possible object is {@link Long }
   */
  public Long getUnterkategorieId() {
	return unterkategorieId;
  }

  /**
   * Legt den Wert der unterkategorieId-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link Long }
   */
  public void setUnterkategorieId(Long value) {
	this.unterkategorieId = value;
  }

  /**
   * Ruft den Wert der updateCount-Eigenschaft ab.
   */
  public long getUpdateCount() {
	return updateCount;
  }

  /**
   * Legt den Wert der updateCount-Eigenschaft fest.
   */
  public void setUpdateCount(long value) {
	this.updateCount = value;
  }

  /**
   * Ruft den Wert der verbesserungspotential-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getVerbesserungspotential() {
	return verbesserungspotential;
  }

  /**
   * Legt den Wert der verbesserungspotential-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setVerbesserungspotential(String value) {
	this.verbesserungspotential = value;
  }
}
