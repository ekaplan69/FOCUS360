package at.sozvers.zvd.ws.versicherungsverhaeltnisselesenservice.v3.types;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für beitragsgrundlageJahr complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="beitragsgrundlageJahr">
 *   &lt;complexContent>
 *     &lt;extension base="{http://sozvers.at/zvd/ws/VersicherungsverhaeltnisseLesenService/v3/types}beitragsgrundlage">
 *       &lt;sequence>
 *         &lt;element name="sonderzahlungWert" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="zeitenVeraenderungKennzeichen" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="beitragsgrundlageJahr", propOrder={"sonderzahlungWert", "zeitenVeraenderungKennzeichen"})
public class BeitragsgrundlageJahr extends Beitragsgrundlage {

  protected BigDecimal sonderzahlungWert;
  @XmlElement(required=true)
  protected String     zeitenVeraenderungKennzeichen;

  /**
   * Ruft den Wert der sonderzahlungWert-Eigenschaft ab.
   *
   * @return possible object is {@link BigDecimal }
   */
  public BigDecimal getSonderzahlungWert() {
	return sonderzahlungWert;
  }

  /**
   * Legt den Wert der sonderzahlungWert-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link BigDecimal }
   */
  public void setSonderzahlungWert(BigDecimal value) {
	this.sonderzahlungWert = value;
  }

  /**
   * Ruft den Wert der zeitenVeraenderungKennzeichen-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getZeitenVeraenderungKennzeichen() {
	return zeitenVeraenderungKennzeichen;
  }

  /**
   * Legt den Wert der zeitenVeraenderungKennzeichen-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setZeitenVeraenderungKennzeichen(String value) {
	this.zeitenVeraenderungKennzeichen = value;
  }
}
