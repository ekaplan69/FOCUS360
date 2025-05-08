package at.sozvers.focus.ws.generated;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.*;

/**
 * Die Suchbegriffe beinhalten die durchsuchbaren Eigenschaften eines Geschäftsfalles. Mindestens einer der Suchbegriffe muss befüllt werden. Werden mehrere Suchbegriffe befüllt so werden diese mit
 * und verknüpft.
 *
 *
 * <p>Java-Klasse für gfSuchbegriffe complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="gfSuchbegriffe"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="suchbegriff-allgemein" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="objekt-klasse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fachlicher-status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="erstelldatum-von" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="erstelldatum-bis" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="bearbeitungsdatum-von" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="bearbeitungsdatum-bis" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="ersteller" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="letzterbearbeiter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="metadaten" type="{http://awf.sozvers.at/schema/suchen}metadatenTyp" minOccurs="0"/&gt;
 *         &lt;element name="suchkriterien" type="{http://awf.sozvers.at/schema/suchen}suchkriterienTyp" minOccurs="0"/&gt;
 *         &lt;element name="partner-suchkriterien" type="{http://awf.sozvers.at/schema/suchen}partnerSuchkriterienTyp" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="gfSuchbegriffe", namespace="http://awf.sozvers.at/schema/suchen",
		 propOrder={"suchbegriffAllgemein", "objektKlasse", "status", "fachlicherStatus", "erstelldatumVon", "erstelldatumBis", "bearbeitungsdatumVon", "bearbeitungsdatumBis", "ersteller",
				 "letzterbearbeiter", "metadaten", "suchkriterien", "partnerSuchkriterien"})
public class GfSuchbegriffe {

  @XmlElement(name="bearbeitungsdatum-bis", namespace="http://awf.sozvers.at/schema/suchen")
  @XmlSchemaType(name="date")
  protected XMLGregorianCalendar    bearbeitungsdatumBis;
  @XmlElement(name="bearbeitungsdatum-von", namespace="http://awf.sozvers.at/schema/suchen")
  @XmlSchemaType(name="date")
  protected XMLGregorianCalendar    bearbeitungsdatumVon;
  @XmlElement(name="erstelldatum-bis", namespace="http://awf.sozvers.at/schema/suchen")
  @XmlSchemaType(name="date")
  protected XMLGregorianCalendar    erstelldatumBis;
  @XmlElement(name="erstelldatum-von", namespace="http://awf.sozvers.at/schema/suchen")
  @XmlSchemaType(name="date")
  protected XMLGregorianCalendar    erstelldatumVon;
  @XmlElement(namespace="http://awf.sozvers.at/schema/suchen")
  protected String                  ersteller;
  @XmlElement(name="fachlicher-status", namespace="http://awf.sozvers.at/schema/suchen")
  protected String                  fachlicherStatus;
  @XmlElement(namespace="http://awf.sozvers.at/schema/suchen")
  protected String                  letzterbearbeiter;
  @XmlElement(namespace="http://awf.sozvers.at/schema/suchen")
  protected MetadatenTyp            metadaten;
  @XmlElement(name="objekt-klasse", namespace="http://awf.sozvers.at/schema/suchen")
  protected String                  objektKlasse;
  @XmlElement(name="partner-suchkriterien", namespace="http://awf.sozvers.at/schema/suchen")
  protected PartnerSuchkriterienTyp partnerSuchkriterien;
  @XmlElement(namespace="http://awf.sozvers.at/schema/suchen")
  protected String                  status;
  @XmlElement(name="suchbegriff-allgemein", namespace="http://awf.sozvers.at/schema/suchen")
  protected String                  suchbegriffAllgemein;
  @XmlElement(namespace="http://awf.sozvers.at/schema/suchen")
  protected SuchkriterienTyp        suchkriterien;

  /**
   * Ruft den Wert der bearbeitungsdatumBis-Eigenschaft ab.
   *
   * @return possible object is {@link XMLGregorianCalendar }
   */
  public XMLGregorianCalendar getBearbeitungsdatumBis() {
	return bearbeitungsdatumBis;
  }

  /**
   * Legt den Wert der bearbeitungsdatumBis-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link XMLGregorianCalendar }
   */
  public void setBearbeitungsdatumBis(XMLGregorianCalendar value) {
	this.bearbeitungsdatumBis = value;
  }

  /**
   * Ruft den Wert der bearbeitungsdatumVon-Eigenschaft ab.
   *
   * @return possible object is {@link XMLGregorianCalendar }
   */
  public XMLGregorianCalendar getBearbeitungsdatumVon() {
	return bearbeitungsdatumVon;
  }

  /**
   * Legt den Wert der bearbeitungsdatumVon-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link XMLGregorianCalendar }
   */
  public void setBearbeitungsdatumVon(XMLGregorianCalendar value) {
	this.bearbeitungsdatumVon = value;
  }

  /**
   * Ruft den Wert der erstelldatumBis-Eigenschaft ab.
   *
   * @return possible object is {@link XMLGregorianCalendar }
   */
  public XMLGregorianCalendar getErstelldatumBis() {
	return erstelldatumBis;
  }

  /**
   * Legt den Wert der erstelldatumBis-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link XMLGregorianCalendar }
   */
  public void setErstelldatumBis(XMLGregorianCalendar value) {
	this.erstelldatumBis = value;
  }

  /**
   * Ruft den Wert der erstelldatumVon-Eigenschaft ab.
   *
   * @return possible object is {@link XMLGregorianCalendar }
   */
  public XMLGregorianCalendar getErstelldatumVon() {
	return erstelldatumVon;
  }

  /**
   * Legt den Wert der erstelldatumVon-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link XMLGregorianCalendar }
   */
  public void setErstelldatumVon(XMLGregorianCalendar value) {
	this.erstelldatumVon = value;
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
   * Ruft den Wert der fachlicherStatus-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getFachlicherStatus() {
	return fachlicherStatus;
  }

  /**
   * Legt den Wert der fachlicherStatus-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setFachlicherStatus(String value) {
	this.fachlicherStatus = value;
  }

  /**
   * Ruft den Wert der letzterbearbeiter-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getLetzterbearbeiter() {
	return letzterbearbeiter;
  }

  /**
   * Legt den Wert der letzterbearbeiter-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setLetzterbearbeiter(String value) {
	this.letzterbearbeiter = value;
  }

  /**
   * Ruft den Wert der metadaten-Eigenschaft ab.
   *
   * @return possible object is {@link MetadatenTyp }
   */
  public MetadatenTyp getMetadaten() {
	return metadaten;
  }

  /**
   * Legt den Wert der metadaten-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link MetadatenTyp }
   */
  public void setMetadaten(MetadatenTyp value) {
	this.metadaten = value;
  }

  /**
   * Ruft den Wert der objektKlasse-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getObjektKlasse() {
	return objektKlasse;
  }

  /**
   * Legt den Wert der objektKlasse-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setObjektKlasse(String value) {
	this.objektKlasse = value;
  }

  /**
   * Ruft den Wert der partnerSuchkriterien-Eigenschaft ab.
   *
   * @return possible object is {@link PartnerSuchkriterienTyp }
   */
  public PartnerSuchkriterienTyp getPartnerSuchkriterien() {
	return partnerSuchkriterien;
  }

  /**
   * Legt den Wert der partnerSuchkriterien-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link PartnerSuchkriterienTyp }
   */
  public void setPartnerSuchkriterien(PartnerSuchkriterienTyp value) {
	this.partnerSuchkriterien = value;
  }

  /**
   * Ruft den Wert der status-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getStatus() {
	return status;
  }

  /**
   * Legt den Wert der status-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setStatus(String value) {
	this.status = value;
  }

  /**
   * Ruft den Wert der suchbegriffAllgemein-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getSuchbegriffAllgemein() {
	return suchbegriffAllgemein;
  }

  /**
   * Legt den Wert der suchbegriffAllgemein-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setSuchbegriffAllgemein(String value) {
	this.suchbegriffAllgemein = value;
  }

  /**
   * Ruft den Wert der suchkriterien-Eigenschaft ab.
   *
   * @return possible object is {@link SuchkriterienTyp }
   */
  public SuchkriterienTyp getSuchkriterien() {
	return suchkriterien;
  }

  /**
   * Legt den Wert der suchkriterien-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link SuchkriterienTyp }
   */
  public void setSuchkriterien(SuchkriterienTyp value) {
	this.suchkriterien = value;
  }
}
