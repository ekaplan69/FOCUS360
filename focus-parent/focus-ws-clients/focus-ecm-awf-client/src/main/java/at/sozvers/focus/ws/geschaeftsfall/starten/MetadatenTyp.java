package at.sozvers.focus.ws.geschaeftsfall.starten;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.*;

/**
 * Der MetadatenTyp beinhaltet eine Liste an Metadatenfeldern, die entweder normale (mehrfache) Felder oder komplexe (mehrfache) Felder sein können.
 *
 *
 * <p>Java-Klasse für metadatenTyp complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="metadatenTyp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="feld" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;choice&gt;
 *                     &lt;element name="wert" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                     &lt;element name="komplexerWert" type="{http://awf.sozvers.at/schema/dokument}komplexerTyp"/&gt;
 *                     &lt;element name="mehrfach"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;complexContent&gt;
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                             &lt;choice&gt;
 *                               &lt;sequence&gt;
 *                                 &lt;element name="wert" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                               &lt;/sequence&gt;
 *                               &lt;sequence&gt;
 *                                 &lt;element name="komplexerWert" type="{http://awf.sozvers.at/schema/dokument}komplexerTyp" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                               &lt;/sequence&gt;
 *                             &lt;/choice&gt;
 *                           &lt;/restriction&gt;
 *                         &lt;/complexContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
 *                   &lt;/choice&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="metadatenTyp", namespace="http://awf.sozvers.at/schema/dokument", propOrder={"feld"})
public class MetadatenTyp {

  @XmlElement(namespace="http://awf.sozvers.at/schema/dokument")
  protected List<MetadatenTyp.Feld> feld;

  /**
   * Gets the value of the feld property.
   *
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object. This is why there is
   * not a <CODE>set</CODE> method for the feld property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getFeld().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list {@link MetadatenTyp.Feld }
   */
  public List<MetadatenTyp.Feld> getFeld() {
	if(feld == null) {
	  feld = new ArrayList<>();
	}
	return this.feld;
  }

  /**
   * Ein Metadatenfeld bestehend aus dem Namen und entweder einem Wert, einem Komplexen-Wert oder einem mehrfachen Wert / Komplexen-Wert.
   *
   *
   * <p>Java-Klasse für anonymous complex type.
   *
   * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
   *
   * <pre>
   * &lt;complexType&gt;
   *   &lt;complexContent&gt;
   *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
   *       &lt;sequence&gt;
   *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
   *         &lt;choice&gt;
   *           &lt;element name="wert" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
   *           &lt;element name="komplexerWert" type="{http://awf.sozvers.at/schema/dokument}komplexerTyp"/&gt;
   *           &lt;element name="mehrfach"&gt;
   *             &lt;complexType&gt;
   *               &lt;complexContent&gt;
   *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
   *                   &lt;choice&gt;
   *                     &lt;sequence&gt;
   *                       &lt;element name="wert" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
   *                     &lt;/sequence&gt;
   *                     &lt;sequence&gt;
   *                       &lt;element name="komplexerWert" type="{http://awf.sozvers.at/schema/dokument}komplexerTyp" maxOccurs="unbounded" minOccurs="0"/&gt;
   *                     &lt;/sequence&gt;
   *                   &lt;/choice&gt;
   *                 &lt;/restriction&gt;
   *               &lt;/complexContent&gt;
   *             &lt;/complexType&gt;
   *           &lt;/element&gt;
   *         &lt;/choice&gt;
   *       &lt;/sequence&gt;
   *     &lt;/restriction&gt;
   *   &lt;/complexContent&gt;
   * &lt;/complexType&gt;
   * </pre>
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(name="", propOrder={"name", "wert", "komplexerWert", "mehrfach"})
  public static class Feld {

	@XmlElement(namespace="http://awf.sozvers.at/schema/dokument")
	protected KomplexerTyp               komplexerWert;
	@XmlElement(namespace="http://awf.sozvers.at/schema/dokument")
	protected MetadatenTyp.Feld.Mehrfach mehrfach;
	@XmlElement(namespace="http://awf.sozvers.at/schema/dokument", required=true)
	protected String                     name;
	@XmlElement(namespace="http://awf.sozvers.at/schema/dokument")
	protected String                     wert;

	/**
	 * Ruft den Wert der komplexerWert-Eigenschaft ab.
	 *
	 * @return possible object is {@link KomplexerTyp }
	 */
	public KomplexerTyp getKomplexerWert() {
	  return komplexerWert;
	}

	/**
	 * Legt den Wert der komplexerWert-Eigenschaft fest.
	 *
	 * @param value
	 * 		allowed object is {@link KomplexerTyp }
	 */
	public void setKomplexerWert(KomplexerTyp value) {
	  this.komplexerWert = value;
	}

	/**
	 * Ruft den Wert der mehrfach-Eigenschaft ab.
	 *
	 * @return possible object is {@link MetadatenTyp.Feld.Mehrfach }
	 */
	public MetadatenTyp.Feld.Mehrfach getMehrfach() {
	  return mehrfach;
	}

	/**
	 * Legt den Wert der mehrfach-Eigenschaft fest.
	 *
	 * @param value
	 * 		allowed object is {@link MetadatenTyp.Feld.Mehrfach }
	 */
	public void setMehrfach(MetadatenTyp.Feld.Mehrfach value) {
	  this.mehrfach = value;
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

	/**
	 * Ruft den Wert der wert-Eigenschaft ab.
	 *
	 * @return possible object is {@link String }
	 */
	public String getWert() {
	  return wert;
	}

	/**
	 * Legt den Wert der wert-Eigenschaft fest.
	 *
	 * @param value
	 * 		allowed object is {@link String }
	 */
	public void setWert(String value) {
	  this.wert = value;
	}

	/**
	 * Mehrfach beinhaltet eine Liste an Werten oder eine Liste an Komplexen-Werten.
	 *
	 *
	 * <p>Java-Klasse für anonymous complex type.
	 *
	 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
	 *
	 * <pre>
	 * &lt;complexType&gt;
	 *   &lt;complexContent&gt;
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
	 *       &lt;choice&gt;
	 *         &lt;sequence&gt;
	 *           &lt;element name="wert" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
	 *         &lt;/sequence&gt;
	 *         &lt;sequence&gt;
	 *           &lt;element name="komplexerWert" type="{http://awf.sozvers.at/schema/dokument}komplexerTyp" maxOccurs="unbounded" minOccurs="0"/&gt;
	 *         &lt;/sequence&gt;
	 *       &lt;/choice&gt;
	 *     &lt;/restriction&gt;
	 *   &lt;/complexContent&gt;
	 * &lt;/complexType&gt;
	 * </pre>
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name="", propOrder={"wert", "komplexerWert"})
	public static class Mehrfach {

	  @XmlElement(namespace="http://awf.sozvers.at/schema/dokument")
	  protected List<KomplexerTyp> komplexerWert;
	  @XmlElement(namespace="http://awf.sozvers.at/schema/dokument")
	  protected List<String>       wert;

	  /**
	   * Gets the value of the komplexerWert property.
	   *
	   * <p>
	   * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object. This is why there
	   * is not a <CODE>set</CODE> method for the komplexerWert property.
	   *
	   * <p>
	   * For example, to add a new item, do as follows:
	   * <pre>
	   *    getKomplexerWert().add(newItem);
	   * </pre>
	   *
	   *
	   * <p>
	   * Objects of the following type(s) are allowed in the list {@link KomplexerTyp }
	   */
	  public List<KomplexerTyp> getKomplexerWert() {
		if(komplexerWert == null) {
		  komplexerWert = new ArrayList<>();
		}
		return this.komplexerWert;
	  }

	  /**
	   * Gets the value of the wert property.
	   *
	   * <p>
	   * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object. This is why there
	   * is not a <CODE>set</CODE> method for the wert property.
	   *
	   * <p>
	   * For example, to add a new item, do as follows:
	   * <pre>
	   *    getWert().add(newItem);
	   * </pre>
	   *
	   *
	   * <p>
	   * Objects of the following type(s) are allowed in the list {@link String }
	   */
	  public List<String> getWert() {
		if(wert == null) {
		  wert = new ArrayList<>();
		}
		return this.wert;
	  }
	}
  }
}
