package at.itsv.services.svstd11.types;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für Meldung complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="Meldung">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Kategorie" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Parameter" type="{http://types.svstd11.services.itsv.at/}Parameter" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="Meldung", propOrder={"id", "kategorie", "text", "parameter"})
public class Meldung {

  @XmlElement(name="Id", required=true)
  protected String          id;
  @XmlElement(name="Kategorie", required=true)
  protected String          kategorie;
  @XmlElement(name="Parameter")
  protected List<Parameter> parameter;
  @XmlElement(name="Text", required=true)
  protected String          text;

  /**
   * Ruft den Wert der id-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getId() {
	return id;
  }

  /**
   * Legt den Wert der id-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setId(String value) {
	this.id = value;
  }

  /**
   * Ruft den Wert der kategorie-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getKategorie() {
	return kategorie;
  }

  /**
   * Legt den Wert der kategorie-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setKategorie(String value) {
	this.kategorie = value;
  }

  /**
   * Gets the value of the parameter property.
   *
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object. This is why there is
   * not a <CODE>set</CODE> method for the parameter property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getParameter().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list {@link Parameter }
   */
  public List<Parameter> getParameter() {
	if(parameter == null) {
	  parameter = new ArrayList<Parameter>();
	}
	return this.parameter;
  }

  /**
   * Ruft den Wert der text-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getText() {
	return text;
  }

  /**
   * Legt den Wert der text-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setText(String value) {
	this.text = value;
  }
}
