package at.sozvers.noegkk.sckont.kontakt.focus;

import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für kontaktAendernRequest complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="kontaktAendernRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://focus.kontakt.sckont.noegkk.sozvers.at/}standardRequest">
 *       &lt;sequence>
 *         &lt;element name="abgabeDurchDritte" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="anmerkungGenerell" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="anmerkungSonstigerKontaktgrund" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endeTs" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="externeGewalt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fachschluessel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fachschluesselArt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fremdsystemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="kanalId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="kontaktText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="kontaktartId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="letztAend" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="letztAendName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="orgeinheit" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="detailDetailIds" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="rubrikDetailDetailId" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="rubrikDetailId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="startTs" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="updatecount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="kontaktAendernRequest",
		 propOrder={"abgabeDurchDritte", "anmerkungGenerell", "anmerkungSonstigerKontaktgrund", "endeTs", "externeGewalt", "fachschluessel", "fachschluesselArt", "fremdsystemId", "id", "kanalId",
				 "kontaktText", "kontaktartId", "letztAend", "letztAendName", "orgeinheit", "detailDetailIds", "rubrikDetailId", "startTs", "updatecount"})
public class KontaktAendernRequest extends StandardRequest {

  protected boolean                               abgabeDurchDritte;
  protected String                                anmerkungGenerell;
  protected String                                anmerkungSonstigerKontaktgrund;
  protected KontaktAendernRequest.DetailDetailIds detailDetailIds;
  @XmlSchemaType(name="dateTime")
  protected XMLGregorianCalendar                  endeTs;
  protected String                                externeGewalt;
  @XmlElement(required=true)
  protected String                                fachschluessel;
  @XmlElement(required=true)
  protected String                                fachschluesselArt;
  protected String                                fremdsystemId;
  protected long                                  id;
  protected Long                                  kanalId;
  protected String                                kontaktText;
  protected long                                  kontaktartId;
  @XmlElement(required=true)
  protected String                                letztAend;
  @XmlElement(required=true)
  protected String                                letztAendName;
  protected long                                  orgeinheit;
  protected Long                                  rubrikDetailId;
  @XmlElement(required=true)
  @XmlSchemaType(name="dateTime")
  protected XMLGregorianCalendar                  startTs;
  protected long                                  updatecount;

  /**
   * Ruft den Wert der anmerkungGenerell-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getAnmerkungGenerell() {
	return anmerkungGenerell;
  }

  /**
   * Legt den Wert der anmerkungGenerell-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setAnmerkungGenerell(String value) {
	this.anmerkungGenerell = value;
  }

  /**
   * Ruft den Wert der anmerkungSonstigerKontaktgrund-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getAnmerkungSonstigerKontaktgrund() {
	return anmerkungSonstigerKontaktgrund;
  }

  /**
   * Legt den Wert der anmerkungSonstigerKontaktgrund-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setAnmerkungSonstigerKontaktgrund(String value) {
	this.anmerkungSonstigerKontaktgrund = value;
  }

  /**
   * Ruft den Wert der detailDetailIds-Eigenschaft ab.
   *
   * @return possible object is {@link KontaktAendernRequest.DetailDetailIds }
   */
  public KontaktAendernRequest.DetailDetailIds getDetailDetailIds() {
	return detailDetailIds;
  }

  /**
   * Legt den Wert der detailDetailIds-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link KontaktAendernRequest.DetailDetailIds }
   */
  public void setDetailDetailIds(KontaktAendernRequest.DetailDetailIds value) {
	this.detailDetailIds = value;
  }

  /**
   * Ruft den Wert der endeTs-Eigenschaft ab.
   *
   * @return possible object is {@link XMLGregorianCalendar }
   */
  public XMLGregorianCalendar getEndeTs() {
	return endeTs;
  }

  /**
   * Legt den Wert der endeTs-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link XMLGregorianCalendar }
   */
  public void setEndeTs(XMLGregorianCalendar value) {
	this.endeTs = value;
  }

  /**
   * Ruft den Wert der externeGewalt-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getExterneGewalt() {
	return externeGewalt;
  }

  /**
   * Legt den Wert der externeGewalt-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setExterneGewalt(String value) {
	this.externeGewalt = value;
  }

  /**
   * Ruft den Wert der fachschluessel-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getFachschluessel() {
	return fachschluessel;
  }

  /**
   * Legt den Wert der fachschluessel-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setFachschluessel(String value) {
	this.fachschluessel = value;
  }

  /**
   * Ruft den Wert der fachschluesselArt-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getFachschluesselArt() {
	return fachschluesselArt;
  }

  /**
   * Legt den Wert der fachschluesselArt-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setFachschluesselArt(String value) {
	this.fachschluesselArt = value;
  }

  /**
   * Ruft den Wert der fremdsystemId-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getFremdsystemId() {
	return fremdsystemId;
  }

  /**
   * Legt den Wert der fremdsystemId-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setFremdsystemId(String value) {
	this.fremdsystemId = value;
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
   * Ruft den Wert der kanalId-Eigenschaft ab.
   *
   * @return possible object is {@link Long }
   */
  public Long getKanalId() {
	return kanalId;
  }

  /**
   * Legt den Wert der kanalId-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link Long }
   */
  public void setKanalId(Long value) {
	this.kanalId = value;
  }

  /**
   * Ruft den Wert der kontaktText-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getKontaktText() {
	return kontaktText;
  }

  /**
   * Legt den Wert der kontaktText-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setKontaktText(String value) {
	this.kontaktText = value;
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
   * Ruft den Wert der letztAend-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getLetztAend() {
	return letztAend;
  }

  /**
   * Legt den Wert der letztAend-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setLetztAend(String value) {
	this.letztAend = value;
  }

  /**
   * Ruft den Wert der letztAendName-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getLetztAendName() {
	return letztAendName;
  }

  /**
   * Legt den Wert der letztAendName-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setLetztAendName(String value) {
	this.letztAendName = value;
  }

  /**
   * Ruft den Wert der orgeinheit-Eigenschaft ab.
   */
  public long getOrgeinheit() {
	return orgeinheit;
  }

  /**
   * Legt den Wert der orgeinheit-Eigenschaft fest.
   */
  public void setOrgeinheit(long value) {
	this.orgeinheit = value;
  }

  /**
   * Ruft den Wert der rubrikDetailId-Eigenschaft ab.
   *
   * @return possible object is {@link Long }
   */
  public Long getRubrikDetailId() {
	return rubrikDetailId;
  }

  /**
   * Legt den Wert der rubrikDetailId-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link Long }
   */
  public void setRubrikDetailId(Long value) {
	this.rubrikDetailId = value;
  }

  /**
   * Ruft den Wert der startTs-Eigenschaft ab.
   *
   * @return possible object is {@link XMLGregorianCalendar }
   */
  public XMLGregorianCalendar getStartTs() {
	return startTs;
  }

  /**
   * Legt den Wert der startTs-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link XMLGregorianCalendar }
   */
  public void setStartTs(XMLGregorianCalendar value) {
	this.startTs = value;
  }

  /**
   * Ruft den Wert der updatecount-Eigenschaft ab.
   */
  public long getUpdatecount() {
	return updatecount;
  }

  /**
   * Legt den Wert der updatecount-Eigenschaft fest.
   */
  public void setUpdatecount(long value) {
	this.updatecount = value;
  }

  /**
   * Ruft den Wert der abgabeDurchDritte-Eigenschaft ab.
   */
  public boolean isAbgabeDurchDritte() {
	return abgabeDurchDritte;
  }

  /**
   * Legt den Wert der abgabeDurchDritte-Eigenschaft fest.
   */
  public void setAbgabeDurchDritte(boolean value) {
	this.abgabeDurchDritte = value;
  }

  /**
   * <p>Java-Klasse für anonymous complex type.
   *
   * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
   *
   * <pre>
   * &lt;complexType>
   *   &lt;complexContent>
   *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *       &lt;sequence>
   *         &lt;element name="rubrikDetailDetailId" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
   *       &lt;/sequence>
   *     &lt;/restriction>
   *   &lt;/complexContent>
   * &lt;/complexType>
   * </pre>
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(name="", propOrder={"rubrikDetailDetailId"})
  public static class DetailDetailIds {

	@XmlElement(nillable=true)
	protected List<Long> rubrikDetailDetailId;

	/**
	 * Gets the value of the rubrikDetailDetailId property.
	 *
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object. This is why there is
	 * not a <CODE>set</CODE> method for the rubrikDetailDetailId property.
	 *
	 * <p>
	 * For example, to add a new item, do as follows:
	 * <pre>
	 *    getRubrikDetailDetailId().add(newItem);
	 * </pre>
	 *
	 *
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Long }
	 */
	public List<Long> getRubrikDetailDetailId() {
	  if(rubrikDetailDetailId == null) {
		rubrikDetailDetailId = new ArrayList<>();
	  }
	  return this.rubrikDetailDetailId;
	}
  }
}
