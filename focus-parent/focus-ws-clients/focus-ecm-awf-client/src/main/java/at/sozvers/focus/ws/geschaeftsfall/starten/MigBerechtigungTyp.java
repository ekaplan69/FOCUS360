package at.sozvers.focus.ws.geschaeftsfall.starten;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.*;

/**
 * MigBerechtigungTyp definiert eine oder mehrere Berechtigungen mit Inhaber (Users) und mit einer bestimmten Berechtigungsrolle.
 *
 *
 * <p>Java-Klasse für migBerechtigungTyp complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="migBerechtigungTyp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="berechtigung" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="inhaber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="rolle" type="{http://awf.sozvers.at/schema/dokument}migRolleTyp"/&gt;
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
@XmlType(name="migBerechtigungTyp", namespace="http://awf.sozvers.at/schema/dokument", propOrder={"berechtigung"})
public class MigBerechtigungTyp {

  @XmlElement(namespace="http://awf.sozvers.at/schema/dokument")
  protected List<MigBerechtigungTyp.Berechtigung> berechtigung;

  /**
   * Gets the value of the berechtigung property.
   *
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object. This is why there is
   * not a <CODE>set</CODE> method for the berechtigung property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getBerechtigung().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list {@link MigBerechtigungTyp.Berechtigung }
   */
  public List<MigBerechtigungTyp.Berechtigung> getBerechtigung() {
	if(berechtigung == null) {
	  berechtigung = new ArrayList<>();
	}
	return this.berechtigung;
  }

  /**
   * Die Berechtigung enthält einen Inhaber (Users) und eine bestimmten Berechtigungsrolle.
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
   *         &lt;element name="inhaber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
   *         &lt;element name="rolle" type="{http://awf.sozvers.at/schema/dokument}migRolleTyp"/&gt;
   *       &lt;/sequence&gt;
   *     &lt;/restriction&gt;
   *   &lt;/complexContent&gt;
   * &lt;/complexType&gt;
   * </pre>
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(name="", propOrder={"inhaber", "rolle"})
  public static class Berechtigung {

	@XmlElement(namespace="http://awf.sozvers.at/schema/dokument", required=true)
	protected String      inhaber;
	@XmlElement(namespace="http://awf.sozvers.at/schema/dokument", required=true)
	@XmlSchemaType(name="string")
	protected MigRolleTyp rolle;

	/**
	 * Ruft den Wert der inhaber-Eigenschaft ab.
	 *
	 * @return possible object is {@link String }
	 */
	public String getInhaber() {
	  return inhaber;
	}

	/**
	 * Legt den Wert der inhaber-Eigenschaft fest.
	 *
	 * @param value
	 * 		allowed object is {@link String }
	 */
	public void setInhaber(String value) {
	  this.inhaber = value;
	}

	/**
	 * Ruft den Wert der rolle-Eigenschaft ab.
	 *
	 * @return possible object is {@link MigRolleTyp }
	 */
	public MigRolleTyp getRolle() {
	  return rolle;
	}

	/**
	 * Legt den Wert der rolle-Eigenschaft fest.
	 *
	 * @param value
	 * 		allowed object is {@link MigRolleTyp }
	 */
	public void setRolle(MigRolleTyp value) {
	  this.rolle = value;
	}
  }
}
