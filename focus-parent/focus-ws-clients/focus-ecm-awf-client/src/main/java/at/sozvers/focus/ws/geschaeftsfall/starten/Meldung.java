package at.sozvers.focus.ws.geschaeftsfall.starten;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.*;

/**
 * Eine Meldung besteht aus ihrem Code und Kategorie, sowie dem Text der Meldung und einer Liste möglicher Parameter.
 *
 *
 * <p>Java-Klasse für Meldung complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="Meldung"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="parameter" type="{http://awf.sozvers.at/schema/meldungen}MeldungParameter" maxOccurs="64" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="code" use="required" type="{http://awf.sozvers.at/schema/meldungen}MeldungCode" /&gt;
 *       &lt;attribute name="kategorie" use="required" type="{http://awf.sozvers.at/schema/meldungen}MeldungKategorie" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="Meldung", namespace="http://awf.sozvers.at/schema/meldungen", propOrder={"text", "parameter"})
public class Meldung {

  @XmlAttribute(name="code", required=true)
  protected String                 code;
  @XmlAttribute(name="kategorie", required=true)
  protected MeldungKategorie       kategorie;
  @XmlElement(namespace="http://awf.sozvers.at/schema/meldungen")
  protected List<MeldungParameter> parameter;
  @XmlElement(namespace="http://awf.sozvers.at/schema/meldungen", required=true)
  protected String                 text;

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
   * @return possible object is {@link MeldungKategorie }
   */
  public MeldungKategorie getKategorie() {
	return kategorie;
  }

  /**
   * Legt den Wert der kategorie-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link MeldungKategorie }
   */
  public void setKategorie(MeldungKategorie value) {
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
   * Objects of the following type(s) are allowed in the list {@link MeldungParameter }
   */
  public List<MeldungParameter> getParameter() {
	if(parameter == null) {
	  parameter = new ArrayList<>();
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
