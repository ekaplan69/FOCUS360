package at.sozvers.kva.schema.gebuehrenbefreiung.suchen;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für gebuehrenbefreiungDTO complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="gebuehrenbefreiungDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="aendzpkt" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="befreiungsart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bisdat" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="erinndat" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ersteller" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="erstellzpkt" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="gbfGrund" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gbfGrundbez" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gbfTyp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gbfTypBez" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gbfZeitenKonnex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gbfgrundkurz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gbfstatuskz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="internerordnbegr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="letztbearb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mstmeldjn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vondat" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="gebuehrenbefreiungDTO",
		 propOrder={"aendzpkt", "befreiungsart", "bisdat", "erinndat", "ersteller", "erstellzpkt", "gbfGrund", "gbfGrundbez", "gbfTyp", "gbfTypBez", "gbfZeitenKonnex", "gbfgrundkurz", "gbfstatuskz",
				 "internerordnbegr", "letztbearb", "mstmeldjn", "vondat"})
public class GebuehrenbefreiungDTO {

  @XmlSchemaType(name="dateTime")
  protected XMLGregorianCalendar aendzpkt;
  protected String               befreiungsart;
  @XmlSchemaType(name="dateTime")
  protected XMLGregorianCalendar bisdat;
  @XmlSchemaType(name="dateTime")
  protected XMLGregorianCalendar erinndat;
  protected String               ersteller;
  @XmlSchemaType(name="dateTime")
  protected XMLGregorianCalendar erstellzpkt;
  protected String               gbfGrund;
  protected String               gbfGrundbez;
  protected String               gbfTyp;
  protected String               gbfTypBez;
  protected String               gbfZeitenKonnex;
  protected String               gbfgrundkurz;
  protected String               gbfstatuskz;
  protected String               internerordnbegr;
  protected String               letztbearb;
  protected String               mstmeldjn;
  @XmlSchemaType(name="dateTime")
  protected XMLGregorianCalendar vondat;

  /**
   * Ruft den Wert der aendzpkt-Eigenschaft ab.
   *
   * @return possible object is {@link XMLGregorianCalendar }
   */
  public XMLGregorianCalendar getAendzpkt() {
	return aendzpkt;
  }

  /**
   * Legt den Wert der aendzpkt-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link XMLGregorianCalendar }
   */
  public void setAendzpkt(XMLGregorianCalendar value) {
	this.aendzpkt = value;
  }

  /**
   * Ruft den Wert der befreiungsart-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getBefreiungsart() {
	return befreiungsart;
  }

  /**
   * Legt den Wert der befreiungsart-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setBefreiungsart(String value) {
	this.befreiungsart = value;
  }

  /**
   * Ruft den Wert der bisdat-Eigenschaft ab.
   *
   * @return possible object is {@link XMLGregorianCalendar }
   */
  public XMLGregorianCalendar getBisdat() {
	return bisdat;
  }

  /**
   * Legt den Wert der bisdat-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link XMLGregorianCalendar }
   */
  public void setBisdat(XMLGregorianCalendar value) {
	this.bisdat = value;
  }

  /**
   * Ruft den Wert der erinndat-Eigenschaft ab.
   *
   * @return possible object is {@link XMLGregorianCalendar }
   */
  public XMLGregorianCalendar getErinndat() {
	return erinndat;
  }

  /**
   * Legt den Wert der erinndat-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link XMLGregorianCalendar }
   */
  public void setErinndat(XMLGregorianCalendar value) {
	this.erinndat = value;
  }

  /**
   * Ruft den Wert der ersteller-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getErsteller() {
	return ersteller;
  }

  /**
   * Legt den Wert der ersteller-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setErsteller(String value) {
	this.ersteller = value;
  }

  /**
   * Ruft den Wert der erstellzpkt-Eigenschaft ab.
   *
   * @return possible object is {@link XMLGregorianCalendar }
   */
  public XMLGregorianCalendar getErstellzpkt() {
	return erstellzpkt;
  }

  /**
   * Legt den Wert der erstellzpkt-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link XMLGregorianCalendar }
   */
  public void setErstellzpkt(XMLGregorianCalendar value) {
	this.erstellzpkt = value;
  }

  /**
   * Ruft den Wert der gbfGrund-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getGbfGrund() {
	return gbfGrund;
  }

  /**
   * Legt den Wert der gbfGrund-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setGbfGrund(String value) {
	this.gbfGrund = value;
  }

  /**
   * Ruft den Wert der gbfGrundbez-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getGbfGrundbez() {
	return gbfGrundbez;
  }

  /**
   * Legt den Wert der gbfGrundbez-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setGbfGrundbez(String value) {
	this.gbfGrundbez = value;
  }

  /**
   * Ruft den Wert der gbfTyp-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getGbfTyp() {
	return gbfTyp;
  }

  /**
   * Legt den Wert der gbfTyp-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setGbfTyp(String value) {
	this.gbfTyp = value;
  }

  /**
   * Ruft den Wert der gbfTypBez-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getGbfTypBez() {
	return gbfTypBez;
  }

  /**
   * Legt den Wert der gbfTypBez-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setGbfTypBez(String value) {
	this.gbfTypBez = value;
  }

  /**
   * Ruft den Wert der gbfZeitenKonnex-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getGbfZeitenKonnex() {
	return gbfZeitenKonnex;
  }

  /**
   * Legt den Wert der gbfZeitenKonnex-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setGbfZeitenKonnex(String value) {
	this.gbfZeitenKonnex = value;
  }

  /**
   * Ruft den Wert der gbfgrundkurz-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getGbfgrundkurz() {
	return gbfgrundkurz;
  }

  /**
   * Legt den Wert der gbfgrundkurz-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setGbfgrundkurz(String value) {
	this.gbfgrundkurz = value;
  }

  /**
   * Ruft den Wert der gbfstatuskz-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getGbfstatuskz() {
	return gbfstatuskz;
  }

  /**
   * Legt den Wert der gbfstatuskz-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setGbfstatuskz(String value) {
	this.gbfstatuskz = value;
  }

  /**
   * Ruft den Wert der internerordnbegr-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getInternerordnbegr() {
	return internerordnbegr;
  }

  /**
   * Legt den Wert der internerordnbegr-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setInternerordnbegr(String value) {
	this.internerordnbegr = value;
  }

  /**
   * Ruft den Wert der letztbearb-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getLetztbearb() {
	return letztbearb;
  }

  /**
   * Legt den Wert der letztbearb-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setLetztbearb(String value) {
	this.letztbearb = value;
  }

  /**
   * Ruft den Wert der mstmeldjn-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getMstmeldjn() {
	return mstmeldjn;
  }

  /**
   * Legt den Wert der mstmeldjn-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setMstmeldjn(String value) {
	this.mstmeldjn = value;
  }

  /**
   * Ruft den Wert der vondat-Eigenschaft ab.
   *
   * @return possible object is {@link XMLGregorianCalendar }
   */
  public XMLGregorianCalendar getVondat() {
	return vondat;
  }

  /**
   * Legt den Wert der vondat-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link XMLGregorianCalendar }
   */
  public void setVondat(XMLGregorianCalendar value) {
	this.vondat = value;
  }
}
