package at.sozvers.focus.ws.geschaeftsfall.starten;

import jakarta.xml.bind.annotation.*;

/**
 * MigDateiInfo beinhaltet die Informationen Datei einer Version eines migrierten Dokuments.
 *
 *
 * <p>Java-Klasse für migDateiInfo complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="migDateiInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="md5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="extension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="migDateiInfo", namespace="http://awf.sozvers.at/schema/dokument", propOrder={"name", "md5", "extension"})
public class MigDateiInfo {

  @XmlElement(namespace="http://awf.sozvers.at/schema/dokument")
  protected String extension;
  @XmlElement(namespace="http://awf.sozvers.at/schema/dokument")
  protected String md5;
  @XmlElement(namespace="http://awf.sozvers.at/schema/dokument", required=true)
  protected String name;

  /**
   * Ruft den Wert der extension-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getExtension() {
	return extension;
  }

  /**
   * Legt den Wert der extension-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setExtension(String value) {
	this.extension = value;
  }

  /**
   * Ruft den Wert der md5-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getMd5() {
	return md5;
  }

  /**
   * Legt den Wert der md5-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setMd5(String value) {
	this.md5 = value;
  }

  /**
   * Ruft den Wert der name-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getName() {
	return name;
  }

  /**
   * Legt den Wert der name-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setName(String value) {
	this.name = value;
  }
}
