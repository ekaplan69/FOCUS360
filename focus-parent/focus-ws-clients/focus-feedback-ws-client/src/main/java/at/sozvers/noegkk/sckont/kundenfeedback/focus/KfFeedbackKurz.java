package at.sozvers.noegkk.sckont.kundenfeedback.focus;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für kfFeedbackKurz complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="kfFeedbackKurz">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="erstellTs" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="feedbackartId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="feedbackgrundBezeichnung" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="kontaktartId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="statusId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="themaBezeichnung" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="unterkategorieBezeichnung" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="kfFeedbackKurz", propOrder={"erstellTs", "feedbackartId", "feedbackgrundBezeichnung", "id", "kontaktartId", "statusId", "themaBezeichnung", "unterkategorieBezeichnung"})
public class KfFeedbackKurz {

  @XmlElement(required=true)
  @XmlSchemaType(name="dateTime")
  protected XMLGregorianCalendar erstellTs;
  protected long                 feedbackartId;
  @XmlElement(required=true)
  protected String               feedbackgrundBezeichnung;
  protected long                 id;
  protected long                 kontaktartId;
  protected long                 statusId;
  @XmlElement(required=true)
  protected String               themaBezeichnung;
  protected String               unterkategorieBezeichnung;

  /**
   * Ruft den Wert der erstellTs-Eigenschaft ab.
   *
   * @return possible object is {@link XMLGregorianCalendar }
   */
  public XMLGregorianCalendar getErstellTs() {
	return erstellTs;
  }

  /**
   * Legt den Wert der erstellTs-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link XMLGregorianCalendar }
   */
  public void setErstellTs(XMLGregorianCalendar value) {
	this.erstellTs = value;
  }

  /**
   * Ruft den Wert der feedbackartId-Eigenschaft ab.
   */
  public long getFeedbackartId() {
	return feedbackartId;
  }

  /**
   * Legt den Wert der feedbackartId-Eigenschaft fest.
   */
  public void setFeedbackartId(long value) {
	this.feedbackartId = value;
  }

  /**
   * Ruft den Wert der feedbackgrundBezeichnung-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getFeedbackgrundBezeichnung() {
	return feedbackgrundBezeichnung;
  }

  /**
   * Legt den Wert der feedbackgrundBezeichnung-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setFeedbackgrundBezeichnung(String value) {
	this.feedbackgrundBezeichnung = value;
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
   * Ruft den Wert der statusId-Eigenschaft ab.
   */
  public long getStatusId() {
	return statusId;
  }

  /**
   * Legt den Wert der statusId-Eigenschaft fest.
   */
  public void setStatusId(long value) {
	this.statusId = value;
  }

  /**
   * Ruft den Wert der themaBezeichnung-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getThemaBezeichnung() {
	return themaBezeichnung;
  }

  /**
   * Legt den Wert der themaBezeichnung-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setThemaBezeichnung(String value) {
	this.themaBezeichnung = value;
  }

  /**
   * Ruft den Wert der unterkategorieBezeichnung-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getUnterkategorieBezeichnung() {
	return unterkategorieBezeichnung;
  }

  /**
   * Legt den Wert der unterkategorieBezeichnung-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setUnterkategorieBezeichnung(String value) {
	this.unterkategorieBezeichnung = value;
  }
}
