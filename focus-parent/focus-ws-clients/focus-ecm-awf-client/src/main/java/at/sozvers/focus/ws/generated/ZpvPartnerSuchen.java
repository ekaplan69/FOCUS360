package at.sozvers.focus.ws.generated;

import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für zpv-partner-suchen complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="zpv-partner-suchen"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="parparolle-id-partner" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="partnerrolleart-kurz" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="beteiligungsart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="zpv-partner-suchen", namespace="http://awf.sozvers.at/schema/suchen", propOrder={"parparolleIdPartner", "partnerrolleartKurz", "beteiligungsart"})
public class ZpvPartnerSuchen {

  @XmlElement(namespace="http://awf.sozvers.at/schema/suchen")
  protected String beteiligungsart;
  @XmlElement(name="parparolle-id-partner", namespace="http://awf.sozvers.at/schema/suchen")
  protected long   parparolleIdPartner;
  @XmlElement(name="partnerrolleart-kurz", namespace="http://awf.sozvers.at/schema/suchen", required=true)
  protected String partnerrolleartKurz;

  /**
   * Ruft den Wert der beteiligungsart-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getBeteiligungsart() {
	return beteiligungsart;
  }

  /**
   * Legt den Wert der beteiligungsart-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setBeteiligungsart(String value) {
	this.beteiligungsart = value;
  }

  /**
   * Ruft den Wert der parparolleIdPartner-Eigenschaft ab.
   */
  public long getParparolleIdPartner() {
	return parparolleIdPartner;
  }

  /**
   * Legt den Wert der parparolleIdPartner-Eigenschaft fest.
   */
  public void setParparolleIdPartner(long value) {
	this.parparolleIdPartner = value;
  }

  /**
   * Ruft den Wert der partnerrolleartKurz-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getPartnerrolleartKurz() {
	return partnerrolleartKurz;
  }

  /**
   * Legt den Wert der partnerrolleartKurz-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setPartnerrolleartKurz(String value) {
	this.partnerrolleartKurz = value;
  }
}
