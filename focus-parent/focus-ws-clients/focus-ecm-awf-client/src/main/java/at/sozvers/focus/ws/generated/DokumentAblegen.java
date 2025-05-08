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
 *         &lt;element name="pfad" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="mimetype" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="metadaten" type="{http://awf.sozvers.at/schema/dokument}metadatenTyp"/&gt;
 *         &lt;element name="links" type="{http://awf.sozvers.at/schema/dokument}link" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="anGeschaeftsfallUebergeben" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nutzID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="", propOrder={"dokumentKlasse", "dokumentErweiterungen", "pfad", "mimetype", "metadaten", "links", "anGeschaeftsfallUebergeben", "nutzID"})
@XmlRootElement(name="dokumentAblegen", namespace="http://awf.sozvers.at/schema/dokument")
public class DokumentAblegen {

  @XmlElement(namespace="http://awf.sozvers.at/schema/dokument")
  protected String                   anGeschaeftsfallUebergeben;
  @XmlElement(name="dokument-erweiterungen", namespace="http://awf.sozvers.at/schema/dokument")
  protected DokumentErweiterungenTyp dokumentErweiterungen;
  @XmlElement(name="dokument-klasse", namespace="http://awf.sozvers.at/schema/dokument", required=true)
  protected String                   dokumentKlasse;
  @XmlElement(namespace="http://awf.sozvers.at/schema/dokument")
  protected List<Link>               links;
  @XmlElement(namespace="http://awf.sozvers.at/schema/dokument", required=true)
  protected MetadatenTyp             metadaten;
  @XmlElement(namespace="http://awf.sozvers.at/schema/dokument", required=true)
  protected String                   mimetype;
  @XmlElement(namespace="http://awf.sozvers.at/schema/dokument")
  protected String                   nutzID;
  @XmlElement(namespace="http://awf.sozvers.at/schema/dokument", required=true)
  protected String                   pfad;

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
   * Gets the value of the links property.
   *
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object. This is why there is
   * not a <CODE>set</CODE> method for the links property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getLinks().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list {@link Link }
   */
  public List<Link> getLinks() {
	if(links == null) {
	  links = new ArrayList<>();
	}
	return this.links;
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
   * Ruft den Wert der nutzID-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getNutzID() {
	return nutzID;
  }

  /**
   * Legt den Wert der nutzID-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setNutzID(String value) {
	this.nutzID = value;
  }

  /**
   * Ruft den Wert der pfad-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getPfad() {
	return pfad;
  }

  /**
   * Legt den Wert der pfad-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setPfad(String value) {
	this.pfad = value;
  }
}
