package at.sozvers.focus.ws.geschaeftsfall.starten;

import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.*;

/**
 * MigVersion beinhaltet die Informationen über eine Dokumentversion eines migrierten Dokuments.
 *
 *
 * <p>Java-Klasse für migVersion complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="migVersion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="datei" type="{http://awf.sozvers.at/schema/dokument}migDateiInfo" maxOccurs="unbounded"/&gt;
 *         &lt;element name="erstelltAm" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="aktuelleVersion" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="migVersion", namespace="http://awf.sozvers.at/schema/dokument", propOrder={"datei", "erstelltAm", "aktuelleVersion"})
public class MigVersion {

  @XmlElement(namespace="http://awf.sozvers.at/schema/dokument", defaultValue="false")
  protected Boolean              aktuelleVersion;
  @XmlElement(namespace="http://awf.sozvers.at/schema/dokument", required=true)
  protected List<MigDateiInfo>   datei;
  @XmlElement(namespace="http://awf.sozvers.at/schema/dokument", required=true)
  @XmlSchemaType(name="dateTime")
  protected XMLGregorianCalendar erstelltAm;

  /**
   * Gets the value of the datei property.
   *
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object. This is why there is
   * not a <CODE>set</CODE> method for the datei property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getDatei().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list {@link MigDateiInfo }
   */
  public List<MigDateiInfo> getDatei() {
	if(datei == null) {
	  datei = new ArrayList<>();
	}
	return this.datei;
  }

  /**
   * Ruft den Wert der erstelltAm-Eigenschaft ab.
   *
   * @return possible object is {@link XMLGregorianCalendar }
   */
  public XMLGregorianCalendar getErstelltAm() {
	return erstelltAm;
  }

  /**
   * Legt den Wert der erstelltAm-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link XMLGregorianCalendar }
   */
  public void setErstelltAm(XMLGregorianCalendar value) {
	this.erstelltAm = value;
  }

  /**
   * Ruft den Wert der aktuelleVersion-Eigenschaft ab.
   *
   * @return possible object is {@link Boolean }
   */
  public Boolean isAktuelleVersion() {
	return aktuelleVersion;
  }

  /**
   * Legt den Wert der aktuelleVersion-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link Boolean }
   */
  public void setAktuelleVersion(Boolean value) {
	this.aktuelleVersion = value;
  }
}
