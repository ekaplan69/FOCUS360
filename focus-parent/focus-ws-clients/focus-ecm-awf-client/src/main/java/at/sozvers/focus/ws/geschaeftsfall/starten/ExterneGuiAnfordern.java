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
 *         &lt;element name="usecase" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="filename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="metadaten" type="{http://awf.sozvers.at/schema/dokument}metadatenTyp" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="", propOrder={"usecase", "filename", "metadaten"})
@XmlRootElement(name="externeGuiAnfordern", namespace="http://awf.sozvers.at/schema/dokument")
public class ExterneGuiAnfordern {

  @XmlElement(namespace="http://awf.sozvers.at/schema/dokument")
  protected String       filename;
  @XmlElement(namespace="http://awf.sozvers.at/schema/dokument")
  protected MetadatenTyp metadaten;
  @XmlElement(namespace="http://awf.sozvers.at/schema/dokument", required=true)
  protected String       usecase;

  /**
   * Ruft den Wert der filename-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getFilename() {
	return filename;
  }

  /**
   * Legt den Wert der filename-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setFilename(String value) {
	this.filename = value;
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
   * Ruft den Wert der usecase-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getUsecase() {
	return usecase;
  }

  /**
   * Legt den Wert der usecase-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setUsecase(String value) {
	this.usecase = value;
  }
}
