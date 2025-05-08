package at.sozvers.kva.schema.ermittle_krankenversicherungsanspruch;

import javax.xml.datatype.XMLGregorianCalendar;
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
 *         &lt;element name="ermittlungszeitpunkt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="kvaBatch" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="kvaOnline" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="qualifikation" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="versicherungsnummer" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="erstellungsphase" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="", propOrder={"ermittlungszeitpunkt", "kvaBatch", "kvaOnline", "qualifikation", "versicherungsnummer", "erstellungsphase"})
@XmlRootElement(name="krankenversicherungsanspruchErmittlung")
public class KrankenversicherungsanspruchErmittlung {

  @XmlElement(required=true)
  @XmlSchemaType(name="dateTime")
  protected XMLGregorianCalendar ermittlungszeitpunkt;
  protected boolean              erstellungsphase;
  protected boolean              kvaBatch;
  protected boolean              kvaOnline;
  protected boolean              qualifikation;
  @XmlElement(required=true)
  protected String               versicherungsnummer;

  /**
   * Ruft den Wert der ermittlungszeitpunkt-Eigenschaft ab.
   *
   * @return possible object is {@link XMLGregorianCalendar }
   */
  public XMLGregorianCalendar getErmittlungszeitpunkt() {
	return ermittlungszeitpunkt;
  }

  /**
   * Legt den Wert der ermittlungszeitpunkt-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link XMLGregorianCalendar }
   */
  public void setErmittlungszeitpunkt(XMLGregorianCalendar value) {
	this.ermittlungszeitpunkt = value;
  }

  /**
   * Ruft den Wert der versicherungsnummer-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getVersicherungsnummer() {
	return versicherungsnummer;
  }

  /**
   * Legt den Wert der versicherungsnummer-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setVersicherungsnummer(String value) {
	this.versicherungsnummer = value;
  }

  /**
   * Ruft den Wert der erstellungsphase-Eigenschaft ab.
   */
  public boolean isErstellungsphase() {
	return erstellungsphase;
  }

  /**
   * Legt den Wert der erstellungsphase-Eigenschaft fest.
   */
  public void setErstellungsphase(boolean value) {
	this.erstellungsphase = value;
  }

  /**
   * Ruft den Wert der kvaBatch-Eigenschaft ab.
   */
  public boolean isKvaBatch() {
	return kvaBatch;
  }

  /**
   * Legt den Wert der kvaBatch-Eigenschaft fest.
   */
  public void setKvaBatch(boolean value) {
	this.kvaBatch = value;
  }

  /**
   * Ruft den Wert der kvaOnline-Eigenschaft ab.
   */
  public boolean isKvaOnline() {
	return kvaOnline;
  }

  /**
   * Legt den Wert der kvaOnline-Eigenschaft fest.
   */
  public void setKvaOnline(boolean value) {
	this.kvaOnline = value;
  }

  /**
   * Ruft den Wert der qualifikation-Eigenschaft ab.
   */
  public boolean isQualifikation() {
	return qualifikation;
  }

  /**
   * Legt den Wert der qualifikation-Eigenschaft fest.
   */
  public void setQualifikation(boolean value) {
	this.qualifikation = value;
  }
}
