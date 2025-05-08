package at.sozvers.focus.ws.geschaeftsfall.starten;

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
 *         &lt;element name="objekt-klasse" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dateiname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="metadaten" type="{http://awf.sozvers.at/schema/dokument}metadatenTyp" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="", propOrder={"objektKlasse", "dateiname", "metadaten"})
@XmlRootElement(name="geschaeftsfallStarten", namespace="http://awf.sozvers.at/schema/geschaeftsfall")
public class GeschaeftsfallStarten {

  @XmlElement(namespace="http://awf.sozvers.at/schema/geschaeftsfall")
  protected String       dateiname;
  @XmlElement(namespace="http://awf.sozvers.at/schema/geschaeftsfall")
  protected MetadatenTyp metadaten;
  @XmlElement(name="objekt-klasse", namespace="http://awf.sozvers.at/schema/geschaeftsfall", required=true)
  protected String       objektKlasse;

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
}
