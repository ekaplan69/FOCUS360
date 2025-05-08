package at.sozvers.focus.ws.geschaeftsfall.starten;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.*;

/**
 * Ein KomplexerTyp besteht aus einer Rolle und mehreren Metadatenfeldern.
 *
 *
 * <p>Java-Klasse für komplexerTyp complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="komplexerTyp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="rolle" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="feld" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="wert" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name="komplexerTyp", namespace="http://awf.sozvers.at/schema/dokument", propOrder={"rolle", "feld"})
public class KomplexerTyp {

  @XmlElement(namespace="http://awf.sozvers.at/schema/dokument", required=true)
  protected List<KomplexerTyp.Feld> feld;
  @XmlElement(namespace="http://awf.sozvers.at/schema/dokument", required=true)
  protected String                  rolle;

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
   * Objects of the following type(s) are allowed in the list {@link KomplexerTyp.Feld }
   */
  public List<KomplexerTyp.Feld> getFeld() {
	if(feld == null) {
	  feld = new ArrayList<>();
	}
	return this.feld;
  }

  /**
   * Ruft den Wert der rolle-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getRolle() {
	return rolle;
  }

  /**
   * Legt den Wert der rolle-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setRolle(String value) {
	this.rolle = value;
  }

  /**
   * Ein Feld eines Komplexen Typs besteht aus einem Namen und seinem Wert.
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
   *         &lt;element name="wert" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
   *       &lt;/sequence&gt;
   *     &lt;/restriction&gt;
   *   &lt;/complexContent&gt;
   * &lt;/complexType&gt;
   * </pre>
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(name="", propOrder={"name", "wert"})
  public static class Feld {

	@XmlElement(namespace="http://awf.sozvers.at/schema/dokument", required=true)
	protected String name;
	@XmlElement(namespace="http://awf.sozvers.at/schema/dokument", required=true)
	protected String wert;

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
  }
}
