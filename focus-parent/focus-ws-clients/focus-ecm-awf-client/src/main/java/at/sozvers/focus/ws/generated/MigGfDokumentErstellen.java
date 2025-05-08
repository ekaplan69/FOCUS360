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
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="", propOrder={"versionen", "mimetype"})
@XmlRootElement(name="migGfDokumentErstellen", namespace="http://awf.sozvers.at/schema/geschaeftsfall")
public class MigGfDokumentErstellen {

  @XmlElement(namespace="http://awf.sozvers.at/schema/geschaeftsfall", required=true)
  protected String                           mimetype;
  @XmlElement(namespace="http://awf.sozvers.at/schema/geschaeftsfall", required=true)
  protected MigGfDokumentErstellen.Versionen versionen;

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
   * Ruft den Wert der versionen-Eigenschaft ab.
   *
   * @return possible object is {@link MigGfDokumentErstellen.Versionen }
   */
  public MigGfDokumentErstellen.Versionen getVersionen() {
	return versionen;
  }

  /**
   * Legt den Wert der versionen-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link MigGfDokumentErstellen.Versionen }
   */
  public void setVersionen(MigGfDokumentErstellen.Versionen value) {
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

	@XmlElement(namespace="http://awf.sozvers.at/schema/geschaeftsfall", required=true)
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
