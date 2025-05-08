package at.sozvers.focus.ws.generated;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.*;

/**
 * Der ArbeitsmappeTyp beinhaltet die Informationen zu einer Arbeitsmappe im Suchergebnis.
 *
 *
 * <p>Java-Klasse für arbeitsmappeTyp complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="arbeitsmappeTyp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="arbeitsmappe-definition" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="arbeitsmappenzeichen" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ersteller" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="erstelltAm" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="letzterBearbeiter" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="letzteBearbeitungAm" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="fachinfos" type="{http://awf.sozvers.at/schema/suchen}fachinfoTyp"/&gt;
 *         &lt;element name="relevanz" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="arbeitsmappeTyp", namespace="http://awf.sozvers.at/schema/suchen",
		 propOrder={"id", "arbeitsmappeDefinition", "arbeitsmappenzeichen", "ersteller", "erstelltAm", "letzterBearbeiter", "letzteBearbeitungAm", "fachinfos", "relevanz"})
public class ArbeitsmappeTyp {

  @XmlElement(name="arbeitsmappe-definition", namespace="http://awf.sozvers.at/schema/suchen", required=true)
  protected String               arbeitsmappeDefinition;
  @XmlElement(namespace="http://awf.sozvers.at/schema/suchen", required=true)
  protected String               arbeitsmappenzeichen;
  @XmlElement(namespace="http://awf.sozvers.at/schema/suchen", required=true)
  protected String               ersteller;
  @XmlElement(namespace="http://awf.sozvers.at/schema/suchen", required=true)
  @XmlSchemaType(name="date")
  protected XMLGregorianCalendar erstelltAm;
  @XmlElement(namespace="http://awf.sozvers.at/schema/suchen", required=true)
  protected FachinfoTyp          fachinfos;
  @XmlElement(namespace="http://awf.sozvers.at/schema/suchen", required=true)
  protected String               id;
  @XmlElement(namespace="http://awf.sozvers.at/schema/suchen", required=true)
  @XmlSchemaType(name="date")
  protected XMLGregorianCalendar letzteBearbeitungAm;
  @XmlElement(namespace="http://awf.sozvers.at/schema/suchen", required=true)
  protected String               letzterBearbeiter;
  @XmlElement(namespace="http://awf.sozvers.at/schema/suchen")
  protected float                relevanz;

  /**
   * Ruft den Wert der arbeitsmappeDefinition-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getArbeitsmappeDefinition() {
	return arbeitsmappeDefinition;
  }

  /**
   * Legt den Wert der arbeitsmappeDefinition-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setArbeitsmappeDefinition(String value) {
	this.arbeitsmappeDefinition = value;
  }

  /**
   * Ruft den Wert der arbeitsmappenzeichen-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getArbeitsmappenzeichen() {
	return arbeitsmappenzeichen;
  }

  /**
   * Legt den Wert der arbeitsmappenzeichen-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setArbeitsmappenzeichen(String value) {
	this.arbeitsmappenzeichen = value;
  }

  /**
   * Ruft den Wert der ersteller-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getErsteller() {
	return ersteller;
  }

  /**
   * Legt den Wert der ersteller-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setErsteller(String value) {
	this.ersteller = value;
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
   * Ruft den Wert der fachinfos-Eigenschaft ab.
   *
   * @return possible object is {@link FachinfoTyp }
   */
  public FachinfoTyp getFachinfos() {
	return fachinfos;
  }

  /**
   * Legt den Wert der fachinfos-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link FachinfoTyp }
   */
  public void setFachinfos(FachinfoTyp value) {
	this.fachinfos = value;
  }

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
   * Ruft den Wert der letzteBearbeitungAm-Eigenschaft ab.
   *
   * @return possible object is {@link XMLGregorianCalendar }
   */
  public XMLGregorianCalendar getLetzteBearbeitungAm() {
	return letzteBearbeitungAm;
  }

  /**
   * Legt den Wert der letzteBearbeitungAm-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link XMLGregorianCalendar }
   */
  public void setLetzteBearbeitungAm(XMLGregorianCalendar value) {
	this.letzteBearbeitungAm = value;
  }

  /**
   * Ruft den Wert der letzterBearbeiter-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getLetzterBearbeiter() {
	return letzterBearbeiter;
  }

  /**
   * Legt den Wert der letzterBearbeiter-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setLetzterBearbeiter(String value) {
	this.letzterBearbeiter = value;
  }

  /**
   * Ruft den Wert der relevanz-Eigenschaft ab.
   */
  public float getRelevanz() {
	return relevanz;
  }

  /**
   * Legt den Wert der relevanz-Eigenschaft fest.
   */
  public void setRelevanz(float value) {
	this.relevanz = value;
  }
}
