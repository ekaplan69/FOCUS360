package at.sozvers.focus.ws.generated;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="versionen"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="version" type="{http://awf.sozvers.at/schema/dokument}migVersion" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="mimetype" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="externeID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="notiz" type="{http://awf.sozvers.at/schema/dokument}migNotiz" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="metadaten" type="{http://awf.sozvers.at/schema/dokument}metadatenTyp"/&gt;
 *         &lt;element name="berechtigungen" type="{http://awf.sozvers.at/schema/dokument}migBerechtigungTyp" minOccurs="0"/&gt;
 *         &lt;element name="anGeschaeftsfallUebergeben" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="", propOrder={"dokumentKlasse", "dokumentErweiterungen", "versionen", "mimetype", "externeID", "notiz", "metadaten", "berechtigungen", "anGeschaeftsfallUebergeben"})
@XmlRootElement(name="migDokumentErstellen", namespace="http://awf.sozvers.at/schema/dokument")
public class MigDokumentErstellen {

  @XmlElement(namespace="http://awf.sozvers.at/schema/dokument")
  protected String                         anGeschaeftsfallUebergeben;
  @XmlElement(namespace="http://awf.sozvers.at/schema/dokument")
  protected MigBerechtigungTyp             berechtigungen;
  @XmlElement(name="dokument-erweiterungen", namespace="http://awf.sozvers.at/schema/dokument")
  protected DokumentErweiterungenTyp       dokumentErweiterungen;
  @XmlElement(name="dokument-klasse", namespace="http://awf.sozvers.at/schema/dokument", required=true)
  protected String                         dokumentKlasse;
  @XmlElement(namespace="http://awf.sozvers.at/schema/dokument", required=true)
  protected String                         externeID;
  @XmlElement(namespace="http://awf.sozvers.at/schema/dokument", required=true)
  protected MetadatenTyp                   metadaten;
  @XmlElement(namespace="http://awf.sozvers.at/schema/dokument", required=true)
  protected String                         mimetype;
  @XmlElement(namespace="http://awf.sozvers.at/schema/dokument")
  protected List<MigNotiz>                 notiz;
  @XmlElement(namespace="http://awf.sozvers.at/schema/dokument", required=true)
  protected MigDokumentErstellen.Versionen versionen;

  /**
   * Ruft den Wert der anGeschaeftsfallUebergeben-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getAnGeschaeftsfallUebergeben() {
	return anGeschaeftsfallUebergeben;
  }

  /**
   * Legt den Wert der anGeschaeftsfallUebergeben-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setAnGeschaeftsfallUebergeben(String value) {
	this.anGeschaeftsfallUebergeben = value;
  }

  /**
   * Ruft den Wert der berechtigungen-Eigenschaft ab.
   *
   * @return possible object is {@link MigBerechtigungTyp }
   */
  public MigBerechtigungTyp getBerechtigungen() {
	return berechtigungen;
  }

  /**
   * Legt den Wert der berechtigungen-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link MigBerechtigungTyp }
   */
  public void setBerechtigungen(MigBerechtigungTyp value) {
	this.berechtigungen = value;
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
   * Ruft den Wert der externeID-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getExterneID() {
	return externeID;
  }

  /**
   * Legt den Wert der externeID-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setExterneID(String value) {
	this.externeID = value;
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
   * Gets the value of the notiz property.
   *
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object. This is why there is
   * not a <CODE>set</CODE> method for the notiz property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getNotiz().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list {@link MigNotiz }
   */
  public List<MigNotiz> getNotiz() {
	if(notiz == null) {
	  notiz = new ArrayList<>();
	}
	return this.notiz;
  }

  /**
   * Ruft den Wert der versionen-Eigenschaft ab.
   *
   * @return possible object is {@link MigDokumentErstellen.Versionen }
   */
  public MigDokumentErstellen.Versionen getVersionen() {
	return versionen;
  }

  /**
   * Legt den Wert der versionen-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link MigDokumentErstellen.Versionen }
   */
  public void setVersionen(MigDokumentErstellen.Versionen value) {
	this.versionen = value;
  }

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
   *         &lt;element name="version" type="{http://awf.sozvers.at/schema/dokument}migVersion" maxOccurs="unbounded"/&gt;
   *       &lt;/sequence&gt;
   *     &lt;/restriction&gt;
   *   &lt;/complexContent&gt;
   * &lt;/complexType&gt;
   * </pre>
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(name="", propOrder={"version"})
  public static class Versionen {

	@XmlElement(namespace="http://awf.sozvers.at/schema/dokument", required=true)
	protected List<MigVersion> version;

	/**
	 * Gets the value of the version property.
	 *
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object. This is why there is
	 * not a <CODE>set</CODE> method for the version property.
	 *
	 * <p>
	 * For example, to add a new item, do as follows:
	 * <pre>
	 *    getVersion().add(newItem);
	 * </pre>
	 *
	 *
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link MigVersion }
	 */
	public List<MigVersion> getVersion() {
	  if(version == null) {
		version = new ArrayList<>();
	  }
	  return this.version;
	}
  }
}
