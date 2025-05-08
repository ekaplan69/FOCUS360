package at.sozvers.focus.ws.generated;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für anonymous complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dokument-klasse" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dokument-erweiterungen" type="{http://awf.sozvers.at/schema/dokument}dokumentErweiterungenTyp" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="geschaeftszeichen" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dateiname" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="mimetype" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="erstelltAm" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="ersteller" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="metadaten" type="{http://awf.sozvers.at/schema/dokument}metadatenTyp"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="", propOrder={"dokumentKlasse", "dokumentErweiterungen", "id", "geschaeftszeichen", "dateiname", "mimetype", "version", "erstelltAm", "ersteller", "metadaten"})
@XmlRootElement(name="dokument", namespace="http://awf.sozvers.at/schema/dokument")
public class Dokument {

  @XmlElement(namespace="http://awf.sozvers.at/schema/dokument", required=true)
  protected String                   dateiname;
  @XmlElement(name="dokument-erweiterungen", namespace="http://awf.sozvers.at/schema/dokument")
  protected DokumentErweiterungenTyp dokumentErweiterungen;
  @XmlElement(name="dokument-klasse", namespace="http://awf.sozvers.at/schema/dokument", required=true)
  protected String                   dokumentKlasse;
  @XmlElement(namespace="http://awf.sozvers.at/schema/dokument", required=true)
  protected String                   ersteller;
  @XmlElement(namespace="http://awf.sozvers.at/schema/dokument", required=true)
  @XmlSchemaType(name="dateTime")
  protected XMLGregorianCalendar     erstelltAm;
  @XmlElement(namespace="http://awf.sozvers.at/schema/dokument", required=true)
  protected String                   geschaeftszeichen;
  @XmlElement(namespace="http://awf.sozvers.at/schema/dokument", required=true)
  protected String                   id;
  @XmlElement(namespace="http://awf.sozvers.at/schema/dokument", required=true)
  protected MetadatenTyp             metadaten;
  @XmlElement(namespace="http://awf.sozvers.at/schema/dokument", required=true)
  protected String                   mimetype;
  @XmlElement(namespace="http://awf.sozvers.at/schema/dokument", required=true)
  protected String                   version;

  /**
   * Ruft den Wert der dateiname-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getDateiname() {
	return dateiname;
  }

  /**
   * Legt den Wert der dateiname-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setDateiname(String value) {
	this.dateiname = value;
  }

  /**
   * Ruft den Wert der dokumentErweiterungen-Eigenschaft ab.
   *
   * @return possible object is {@link DokumentErweiterungenTyp }
   */
  public DokumentErweiterungenTyp getDokumentErweiterungen() {
	return dokumentErweiterungen;
  }

  /**
   * Legt den Wert der dokumentErweiterungen-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link DokumentErweiterungenTyp }
   */
  public void setDokumentErweiterungen(DokumentErweiterungenTyp value) {
	this.dokumentErweiterungen = value;
  }

  /**
   * Ruft den Wert der dokumentKlasse-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getDokumentKlasse() {
	return dokumentKlasse;
  }

  /**
   * Legt den Wert der dokumentKlasse-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setDokumentKlasse(String value) {
	this.dokumentKlasse = value;
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
   * Ruft den Wert der erstelltAm-Eigenschaft ab.
   *
   * @return possible object is {@link XMLGregorianCalendar }
   */
  public XMLGregorianCalendar getErstelltAm() {
	return erstelltAm;
  }

  /**
   * Legt den Wert der erstelltAm-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link XMLGregorianCalendar }
   */
  public void setErstelltAm(XMLGregorianCalendar value) {
	this.erstelltAm = value;
  }

  /**
   * Ruft den Wert der geschaeftszeichen-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getGeschaeftszeichen() {
	return geschaeftszeichen;
  }

  /**
   * Legt den Wert der geschaeftszeichen-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setGeschaeftszeichen(String value) {
	this.geschaeftszeichen = value;
  }

  /**
   * Ruft den Wert der id-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getId() {
	return id;
  }

  /**
   * Legt den Wert der id-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setId(String value) {
	this.id = value;
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
   * Ruft den Wert der mimetype-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getMimetype() {
	return mimetype;
  }

  /**
   * Legt den Wert der mimetype-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setMimetype(String value) {
	this.mimetype = value;
  }

  /**
   * Ruft den Wert der version-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getVersion() {
	return version;
  }

  /**
   * Legt den Wert der version-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setVersion(String value) {
	this.version = value;
  }
}
