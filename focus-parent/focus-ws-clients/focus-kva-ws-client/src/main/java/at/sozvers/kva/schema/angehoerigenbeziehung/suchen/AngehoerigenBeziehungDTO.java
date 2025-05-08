package at.sozvers.kva.schema.angehoerigenbeziehung.suchen;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für angehoerigenBeziehungDTO complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="angehoerigenBeziehungDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="abzEinschrKz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="abzStatusKz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="aendzpkt" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="angTyp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="angTypBez" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="angTypKurz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="behoerdenBez3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bisdat" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ersteller" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="erstellzpkt" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="erweiterungsGrund" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="erweiterungsGrundBez" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="erweiterungsGrundKurz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="famname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gebdat" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="gebdatfingiertkz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="geschlecht" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="interneOrdnBegr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="letzbearb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="meldendeStelle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="todesdat" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="todesdatfingiertkz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vondat" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="vorname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vsnrAng" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vsnrStornokz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vsnrVers" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="wegfallGrund" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="wegfallGrundBez" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="wegfallGrundKurz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="angehoerigenBeziehungDTO",
		 propOrder={"abzEinschrKz", "abzStatusKz", "aendzpkt", "angTyp", "angTypBez", "angTypKurz", "behoerdenBez3", "bisdat", "ersteller", "erstellzpkt", "erweiterungsGrund", "erweiterungsGrundBez",
				 "erweiterungsGrundKurz", "famname", "gebdat", "gebdatfingiertkz", "geschlecht", "interneOrdnBegr", "letzbearb", "meldendeStelle", "todesdat", "todesdatfingiertkz", "vondat",
				 "vorname", "vsnrAng", "vsnrStornokz", "vsnrVers", "wegfallGrund", "wegfallGrundBez", "wegfallGrundKurz"})
public class AngehoerigenBeziehungDTO {

  protected String               abzEinschrKz;
  protected String               abzStatusKz;
  @XmlSchemaType(name="dateTime")
  protected XMLGregorianCalendar aendzpkt;
  protected String               angTyp;
  protected String               angTypBez;
  protected String               angTypKurz;
  protected String               behoerdenBez3;
  @XmlSchemaType(name="dateTime")
  protected XMLGregorianCalendar bisdat;
  protected String               ersteller;
  @XmlSchemaType(name="dateTime")
  protected XMLGregorianCalendar erstellzpkt;
  protected String               erweiterungsGrund;
  protected String               erweiterungsGrundBez;
  protected String               erweiterungsGrundKurz;
  protected String               famname;
  @XmlSchemaType(name="date")
  protected XMLGregorianCalendar gebdat;
  protected String               gebdatfingiertkz;
  protected String               geschlecht;
  protected String               interneOrdnBegr;
  protected String               letzbearb;
  protected String               meldendeStelle;
  @XmlSchemaType(name="dateTime")
  protected XMLGregorianCalendar todesdat;
  protected String               todesdatfingiertkz;
  @XmlSchemaType(name="dateTime")
  protected XMLGregorianCalendar vondat;
  protected String               vorname;
  protected String               vsnrAng;
  protected String               vsnrStornokz;
  protected String               vsnrVers;
  protected String               wegfallGrund;
  protected String               wegfallGrundBez;
  protected String               wegfallGrundKurz;

  /**
   * Ruft den Wert der abzEinschrKz-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getAbzEinschrKz() {
	return abzEinschrKz;
  }

  /**
   * Legt den Wert der abzEinschrKz-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setAbzEinschrKz(String value) {
	this.abzEinschrKz = value;
  }

  /**
   * Ruft den Wert der abzStatusKz-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getAbzStatusKz() {
	return abzStatusKz;
  }

  /**
   * Legt den Wert der abzStatusKz-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setAbzStatusKz(String value) {
	this.abzStatusKz = value;
  }

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
   * Ruft den Wert der angTyp-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getAngTyp() {
	return angTyp;
  }

  /**
   * Legt den Wert der angTyp-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setAngTyp(String value) {
	this.angTyp = value;
  }

  /**
   * Ruft den Wert der angTypBez-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getAngTypBez() {
	return angTypBez;
  }

  /**
   * Legt den Wert der angTypBez-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setAngTypBez(String value) {
	this.angTypBez = value;
  }

  /**
   * Ruft den Wert der angTypKurz-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getAngTypKurz() {
	return angTypKurz;
  }

  /**
   * Legt den Wert der angTypKurz-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setAngTypKurz(String value) {
	this.angTypKurz = value;
  }

  /**
   * Ruft den Wert der behoerdenBez3-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getBehoerdenBez3() {
	return behoerdenBez3;
  }

  /**
   * Legt den Wert der behoerdenBez3-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setBehoerdenBez3(String value) {
	this.behoerdenBez3 = value;
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
   * Ruft den Wert der erweiterungsGrund-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getErweiterungsGrund() {
	return erweiterungsGrund;
  }

  /**
   * Legt den Wert der erweiterungsGrund-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setErweiterungsGrund(String value) {
	this.erweiterungsGrund = value;
  }

  /**
   * Ruft den Wert der erweiterungsGrundBez-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getErweiterungsGrundBez() {
	return erweiterungsGrundBez;
  }

  /**
   * Legt den Wert der erweiterungsGrundBez-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setErweiterungsGrundBez(String value) {
	this.erweiterungsGrundBez = value;
  }

  /**
   * Ruft den Wert der erweiterungsGrundKurz-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getErweiterungsGrundKurz() {
	return erweiterungsGrundKurz;
  }

  /**
   * Legt den Wert der erweiterungsGrundKurz-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setErweiterungsGrundKurz(String value) {
	this.erweiterungsGrundKurz = value;
  }

  /**
   * Ruft den Wert der famname-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getFamname() {
	return famname;
  }

  /**
   * Legt den Wert der famname-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setFamname(String value) {
	this.famname = value;
  }

  /**
   * Ruft den Wert der gebdat-Eigenschaft ab.
   *
   * @return possible object is {@link XMLGregorianCalendar }
   */
  public XMLGregorianCalendar getGebdat() {
	return gebdat;
  }

  /**
   * Legt den Wert der gebdat-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link XMLGregorianCalendar }
   */
  public void setGebdat(XMLGregorianCalendar value) {
	this.gebdat = value;
  }

  /**
   * Ruft den Wert der gebdatfingiertkz-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getGebdatfingiertkz() {
	return gebdatfingiertkz;
  }

  /**
   * Legt den Wert der gebdatfingiertkz-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setGebdatfingiertkz(String value) {
	this.gebdatfingiertkz = value;
  }

  /**
   * Ruft den Wert der geschlecht-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getGeschlecht() {
	return geschlecht;
  }

  /**
   * Legt den Wert der geschlecht-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setGeschlecht(String value) {
	this.geschlecht = value;
  }

  /**
   * Ruft den Wert der interneOrdnBegr-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getInterneOrdnBegr() {
	return interneOrdnBegr;
  }

  /**
   * Legt den Wert der interneOrdnBegr-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setInterneOrdnBegr(String value) {
	this.interneOrdnBegr = value;
  }

  /**
   * Ruft den Wert der letzbearb-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getLetzbearb() {
	return letzbearb;
  }

  /**
   * Legt den Wert der letzbearb-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setLetzbearb(String value) {
	this.letzbearb = value;
  }

  /**
   * Ruft den Wert der meldendeStelle-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getMeldendeStelle() {
	return meldendeStelle;
  }

  /**
   * Legt den Wert der meldendeStelle-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setMeldendeStelle(String value) {
	this.meldendeStelle = value;
  }

  /**
   * Ruft den Wert der todesdat-Eigenschaft ab.
   *
   * @return possible object is {@link XMLGregorianCalendar }
   */
  public XMLGregorianCalendar getTodesdat() {
	return todesdat;
  }

  /**
   * Legt den Wert der todesdat-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link XMLGregorianCalendar }
   */
  public void setTodesdat(XMLGregorianCalendar value) {
	this.todesdat = value;
  }

  /**
   * Ruft den Wert der todesdatfingiertkz-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getTodesdatfingiertkz() {
	return todesdatfingiertkz;
  }

  /**
   * Legt den Wert der todesdatfingiertkz-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setTodesdatfingiertkz(String value) {
	this.todesdatfingiertkz = value;
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

  /**
   * Ruft den Wert der vorname-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getVorname() {
	return vorname;
  }

  /**
   * Legt den Wert der vorname-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setVorname(String value) {
	this.vorname = value;
  }

  /**
   * Ruft den Wert der vsnrAng-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getVsnrAng() {
	return vsnrAng;
  }

  /**
   * Legt den Wert der vsnrAng-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setVsnrAng(String value) {
	this.vsnrAng = value;
  }

  /**
   * Ruft den Wert der vsnrStornokz-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getVsnrStornokz() {
	return vsnrStornokz;
  }

  /**
   * Legt den Wert der vsnrStornokz-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setVsnrStornokz(String value) {
	this.vsnrStornokz = value;
  }

  /**
   * Ruft den Wert der vsnrVers-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getVsnrVers() {
	return vsnrVers;
  }

  /**
   * Legt den Wert der vsnrVers-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setVsnrVers(String value) {
	this.vsnrVers = value;
  }

  /**
   * Ruft den Wert der wegfallGrund-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getWegfallGrund() {
	return wegfallGrund;
  }

  /**
   * Legt den Wert der wegfallGrund-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setWegfallGrund(String value) {
	this.wegfallGrund = value;
  }

  /**
   * Ruft den Wert der wegfallGrundBez-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getWegfallGrundBez() {
	return wegfallGrundBez;
  }

  /**
   * Legt den Wert der wegfallGrundBez-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setWegfallGrundBez(String value) {
	this.wegfallGrundBez = value;
  }

  /**
   * Ruft den Wert der wegfallGrundKurz-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getWegfallGrundKurz() {
	return wegfallGrundKurz;
  }

  /**
   * Legt den Wert der wegfallGrundKurz-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setWegfallGrundKurz(String value) {
	this.wegfallGrundKurz = value;
  }
}
