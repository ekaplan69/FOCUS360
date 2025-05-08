package at.sozvers.stp.lgkk.webservice.focus360.v20;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für Focus360MedStElementV2Dto complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="Focus360MedStElementV2Dto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gueltigBisDat" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="lgebiet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stellungnahme" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="Focus360MedStElementV2Dto", propOrder={"gueltigBisDat", "lgebiet", "stellungnahme"})
public class Focus360MedStElementV2Dto {

  @XmlSchemaType(name="dateTime")
  protected XMLGregorianCalendar gueltigBisDat;
  protected String               lgebiet;
  protected String               stellungnahme;

  /**
   * Ruft den Wert der gueltigBisDat-Eigenschaft ab.
   *
   * @return possible object is {@link XMLGregorianCalendar }
   */
  public XMLGregorianCalendar getGueltigBisDat() {
	return gueltigBisDat;
  }

  /**
   * Legt den Wert der gueltigBisDat-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link XMLGregorianCalendar }
   */
  public void setGueltigBisDat(XMLGregorianCalendar value) {
	this.gueltigBisDat = value;
  }

  /**
   * Ruft den Wert der lgebiet-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getLgebiet() {
	return lgebiet;
  }

  /**
   * Legt den Wert der lgebiet-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setLgebiet(String value) {
	this.lgebiet = value;
  }

  /**
   * Ruft den Wert der stellungnahme-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getStellungnahme() {
	return stellungnahme;
  }

  /**
   * Legt den Wert der stellungnahme-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setStellungnahme(String value) {
	this.stellungnahme = value;
  }
}
