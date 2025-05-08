package at.sozvers.focus.ws.geschaeftsfall.starten;

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
 *         &lt;element name="metadaten" type="{http://awf.sozvers.at/schema/dokument}metadatenTyp" minOccurs="0"/&gt;
 *         &lt;element name="dokument-id" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="aufgabenausgang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="", propOrder={"metadaten", "dokumentId", "aufgabenausgang"})
@XmlRootElement(name="aufgabe-bearbeiten", namespace="http://awf.sozvers.at/schema/geschaeftsfall")
public class AufgabeBearbeiten {

  @XmlElement(namespace="http://awf.sozvers.at/schema/geschaeftsfall")
  protected String       aufgabenausgang;
  @XmlElement(name="dokument-id", namespace="http://awf.sozvers.at/schema/geschaeftsfall")
  protected List<String> dokumentId;
  @XmlElement(namespace="http://awf.sozvers.at/schema/geschaeftsfall")
  protected MetadatenTyp metadaten;

  /**
   * Ruft den Wert der aufgabenausgang-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getAufgabenausgang() {
	return aufgabenausgang;
  }

  /**
   * Legt den Wert der aufgabenausgang-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setAufgabenausgang(String value) {
	this.aufgabenausgang = value;
  }

  /**
   * Gets the value of the dokumentId property.
   *
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object. This is why there is
   * not a <CODE>set</CODE> method for the dokumentId property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getDokumentId().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list {@link String }
   */
  public List<String> getDokumentId() {
	if(dokumentId == null) {
	  dokumentId = new ArrayList<>();
	}
	return this.dokumentId;
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
}
