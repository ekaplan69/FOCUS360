package at.sozvers.kva.schema.types;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für meldung complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="meldung"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="parameter" type="{http://kva.sozvers.at/schema/types}meldungenParameter" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="kategorie" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="meldung", propOrder={"text", "parameter"})
public class Meldung {

  @XmlAttribute(name="code", required=true)
  protected String                   code;
  @XmlAttribute(name="kategorie", required=true)
  protected String                   kategorie;
  @XmlElement(nillable=true)
  protected List<MeldungenParameter> parameter;
  @XmlElement(required=true)
  protected String                   text;

  /**
   * Ruft den Wert der code-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getCode() {
	return code;
  }

  /**
   * Legt den Wert der code-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setCode(String value) {
	this.code = value;
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
   * Objects of the following type(s) are allowed in the list {@link MeldungenParameter }
   */
  public List<MeldungenParameter> getParameter() {
	if(parameter == null) {
	  parameter = new ArrayList<MeldungenParameter>();
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
