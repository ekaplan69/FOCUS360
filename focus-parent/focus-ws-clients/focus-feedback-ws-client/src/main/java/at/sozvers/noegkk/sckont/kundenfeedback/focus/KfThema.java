package at.sozvers.noegkk.sckont.kundenfeedback.focus;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für kfThema complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="kfThema">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gueltigBis" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="gueltigVon" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ktThemaId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="themaBezeichnung" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="themaId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="kfThema", propOrder={"gueltigBis", "gueltigVon", "ktThemaId", "themaBezeichnung", "themaId"})
public class KfThema {

  @XmlElement(required=true)
  @XmlSchemaType(name="dateTime")
  protected XMLGregorianCalendar gueltigBis;
  @XmlElement(required=true)
  @XmlSchemaType(name="dateTime")
  protected XMLGregorianCalendar gueltigVon;
  protected Long                 ktThemaId;
  @XmlElement(required=true)
  protected String               themaBezeichnung;
  protected long                 themaId;

  /**
   * Ruft den Wert der gueltigBis-Eigenschaft ab.
   *
   * @return possible object is {@link XMLGregorianCalendar }
   */
  public XMLGregorianCalendar getGueltigBis() {
	return gueltigBis;
  }

  /**
   * Legt den Wert der gueltigBis-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link XMLGregorianCalendar }
   */
  public void setGueltigBis(XMLGregorianCalendar value) {
	this.gueltigBis = value;
  }

  /**
   * Ruft den Wert der gueltigVon-Eigenschaft ab.
   *
   * @return possible object is {@link XMLGregorianCalendar }
   */
  public XMLGregorianCalendar getGueltigVon() {
	return gueltigVon;
  }

  /**
   * Legt den Wert der gueltigVon-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link XMLGregorianCalendar }
   */
  public void setGueltigVon(XMLGregorianCalendar value) {
	this.gueltigVon = value;
  }

  /**
   * Ruft den Wert der ktThemaId-Eigenschaft ab.
   *
   * @return possible object is {@link Long }
   */
  public Long getKtThemaId() {
	return ktThemaId;
  }

  /**
   * Legt den Wert der ktThemaId-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link Long }
   */
  public void setKtThemaId(Long value) {
	this.ktThemaId = value;
  }

  /**
   * Ruft den Wert der themaBezeichnung-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getThemaBezeichnung() {
	return themaBezeichnung;
  }

  /**
   * Legt den Wert der themaBezeichnung-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setThemaBezeichnung(String value) {
	this.themaBezeichnung = value;
  }

  /**
   * Ruft den Wert der themaId-Eigenschaft ab.
   */
  public long getThemaId() {
	return themaId;
  }

  /**
   * Legt den Wert der themaId-Eigenschaft fest.
   */
  public void setThemaId(long value) {
	this.themaId = value;
  }
}
