package at.sozvers.focus.ws.generated;

import jakarta.xml.bind.annotation.*;

/**
 * Partner Suche mit Operatoren
 *
 *
 * <p>Java-Klasse für partnerSuchkriterienFeldTyp complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="partnerSuchkriterienFeldTyp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="equals" type="{http://awf.sozvers.at/schema/suchen}zpv-partner-suchen-typ"/&gt;
 *           &lt;element name="not-equals" type="{http://awf.sozvers.at/schema/suchen}zpv-partner-suchen-typ"/&gt;
 *           &lt;element name="and" type="{http://awf.sozvers.at/schema/suchen}partnerSuchkriterienAndOrTyp"/&gt;
 *           &lt;element name="or" type="{http://awf.sozvers.at/schema/suchen}partnerSuchkriterienAndOrTyp"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="partnerSuchkriterienFeldTyp", namespace="http://awf.sozvers.at/schema/suchen", propOrder={"name", "equals", "notEquals", "and", "or"})
public class PartnerSuchkriterienFeldTyp {

  @XmlElement(namespace="http://awf.sozvers.at/schema/suchen")
  protected PartnerSuchkriterienAndOrTyp and;
  @XmlElement(namespace="http://awf.sozvers.at/schema/suchen")
  protected ZpvPartnerSuchenTyp          equals;
  @XmlElement(namespace="http://awf.sozvers.at/schema/suchen", required=true)
  protected String                       name;
  @XmlElement(name="not-equals", namespace="http://awf.sozvers.at/schema/suchen")
  protected ZpvPartnerSuchenTyp          notEquals;
  @XmlElement(namespace="http://awf.sozvers.at/schema/suchen")
  protected PartnerSuchkriterienAndOrTyp or;

  /**
   * Ruft den Wert der and-Eigenschaft ab.
   *
   * @return possible object is {@link PartnerSuchkriterienAndOrTyp }
   */
  public PartnerSuchkriterienAndOrTyp getAnd() {
	return and;
  }

  /**
   * Legt den Wert der and-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link PartnerSuchkriterienAndOrTyp }
   */
  public void setAnd(PartnerSuchkriterienAndOrTyp value) {
	this.and = value;
  }

  /**
   * Ruft den Wert der equals-Eigenschaft ab.
   *
   * @return possible object is {@link ZpvPartnerSuchenTyp }
   */
  public ZpvPartnerSuchenTyp getEquals() {
	return equals;
  }

  /**
   * Legt den Wert der equals-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link ZpvPartnerSuchenTyp }
   */
  public void setEquals(ZpvPartnerSuchenTyp value) {
	this.equals = value;
  }

  /**
   * Ruft den Wert der name-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getName() {
	return name;
  }

  /**
   * Legt den Wert der name-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setName(String value) {
	this.name = value;
  }

  /**
   * Ruft den Wert der notEquals-Eigenschaft ab.
   *
   * @return possible object is {@link ZpvPartnerSuchenTyp }
   */
  public ZpvPartnerSuchenTyp getNotEquals() {
	return notEquals;
  }

  /**
   * Legt den Wert der notEquals-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link ZpvPartnerSuchenTyp }
   */
  public void setNotEquals(ZpvPartnerSuchenTyp value) {
	this.notEquals = value;
  }

  /**
   * Ruft den Wert der or-Eigenschaft ab.
   *
   * @return possible object is {@link PartnerSuchkriterienAndOrTyp }
   */
  public PartnerSuchkriterienAndOrTyp getOr() {
	return or;
  }

  /**
   * Legt den Wert der or-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link PartnerSuchkriterienAndOrTyp }
   */
  public void setOr(PartnerSuchkriterienAndOrTyp value) {
	this.or = value;
  }
}
