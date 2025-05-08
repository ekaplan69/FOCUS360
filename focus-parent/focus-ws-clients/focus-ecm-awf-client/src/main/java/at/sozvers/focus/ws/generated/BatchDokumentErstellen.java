package at.sozvers.focus.ws.generated;

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
 *         &lt;element name="dateiname" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="mimetype" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="metadaten" type="{http://awf.sozvers.at/schema/dokument}metadatenTyp"/&gt;
 *         &lt;element name="aufbewahrungsfristAussetzen" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="", propOrder={"dokumentKlasse", "dokumentErweiterungen", "dateiname", "mimetype", "metadaten", "aufbewahrungsfristAussetzen"})
@XmlRootElement(name="batchDokumentErstellen", namespace="http://awf.sozvers.at/schema/dokument")
public class BatchDokumentErstellen {

  @XmlElement(namespace="http://awf.sozvers.at/schema/dokument")
  protected Boolean                  aufbewahrungsfristAussetzen;
  @XmlElement(namespace="http://awf.sozvers.at/schema/dokument", required=true)
  protected String                   dateiname;
  @XmlElement(name="dokument-erweiterungen", namespace="http://awf.sozvers.at/schema/dokument")
  protected DokumentErweiterungenTyp dokumentErweiterungen;
  @XmlElement(name="dokument-klasse", namespace="http://awf.sozvers.at/schema/dokument", required=true)
  protected String                   dokumentKlasse;
  @XmlElement(namespace="http://awf.sozvers.at/schema/dokument", required=true)
  protected MetadatenTyp             metadaten;
  @XmlElement(namespace="http://awf.sozvers.at/schema/dokument", required=true)
  protected String                   mimetype;

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
   * Ruft den Wert der aufbewahrungsfristAussetzen-Eigenschaft ab.
   *
   * @return possible object is {@link Boolean }
   */
  public Boolean isAufbewahrungsfristAussetzen() {
	return aufbewahrungsfristAussetzen;
  }

  /**
   * Legt den Wert der aufbewahrungsfristAussetzen-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link Boolean }
   */
  public void setAufbewahrungsfristAussetzen(Boolean value) {
	this.aufbewahrungsfristAussetzen = value;
  }
}
