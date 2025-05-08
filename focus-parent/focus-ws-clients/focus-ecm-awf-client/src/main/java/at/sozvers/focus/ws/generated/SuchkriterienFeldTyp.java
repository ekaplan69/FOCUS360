package at.sozvers.focus.ws.generated;

import jakarta.xml.bind.annotation.*;

/**
 * Erweiterte Suche mit Operatoren
 *
 *
 * <p>Java-Klasse für suchkriterienFeldTyp complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="suchkriterienFeldTyp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="equals" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *           &lt;element name="not-equals" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *           &lt;element name="greater-than" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *           &lt;element name="less-than" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *           &lt;element name="greater-than-equal" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *           &lt;element name="less-than-equal" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *           &lt;element name="contains" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *           &lt;element name="empty" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *           &lt;element name="not-empty" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *           &lt;element name="and" type="{http://awf.sozvers.at/schema/suchen}suchkriterienAndOrTyp"/&gt;
 *           &lt;element name="or" type="{http://awf.sozvers.at/schema/suchen}suchkriterienAndOrTyp"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="suchkriterienFeldTyp", namespace="http://awf.sozvers.at/schema/suchen",
		 propOrder={"name", "equals", "notEquals", "greaterThan", "lessThan", "greaterThanEqual", "lessThanEqual", "contains", "empty", "notEmpty", "and", "or"})
public class SuchkriterienFeldTyp {

  @XmlElement(namespace="http://awf.sozvers.at/schema/suchen")
  protected SuchkriterienAndOrTyp and;
  @XmlElement(namespace="http://awf.sozvers.at/schema/suchen")
  protected String                contains;
  @XmlElement(namespace="http://awf.sozvers.at/schema/suchen")
  protected Object                empty;
  @XmlElement(namespace="http://awf.sozvers.at/schema/suchen")
  protected String                equals;
  @XmlElement(name="greater-than", namespace="http://awf.sozvers.at/schema/suchen")
  protected String                greaterThan;
  @XmlElement(name="greater-than-equal", namespace="http://awf.sozvers.at/schema/suchen")
  protected String                greaterThanEqual;
  @XmlElement(name="less-than", namespace="http://awf.sozvers.at/schema/suchen")
  protected String                lessThan;
  @XmlElement(name="less-than-equal", namespace="http://awf.sozvers.at/schema/suchen")
  protected String                lessThanEqual;
  @XmlElement(namespace="http://awf.sozvers.at/schema/suchen", required=true)
  protected String                name;
  @XmlElement(name="not-empty", namespace="http://awf.sozvers.at/schema/suchen")
  protected Object                notEmpty;
  @XmlElement(name="not-equals", namespace="http://awf.sozvers.at/schema/suchen")
  protected String                notEquals;
  @XmlElement(namespace="http://awf.sozvers.at/schema/suchen")
  protected SuchkriterienAndOrTyp or;

  /**
   * Ruft den Wert der and-Eigenschaft ab.
   *
   * @return possible object is {@link SuchkriterienAndOrTyp }
   */
  public SuchkriterienAndOrTyp getAnd() {
	return and;
  }

  /**
   * Legt den Wert der and-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link SuchkriterienAndOrTyp }
   */
  public void setAnd(SuchkriterienAndOrTyp value) {
	this.and = value;
  }

  /**
   * Ruft den Wert der contains-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getContains() {
	return contains;
  }

  /**
   * Legt den Wert der contains-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setContains(String value) {
	this.contains = value;
  }

  /**
   * Ruft den Wert der empty-Eigenschaft ab.
   *
   * @return possible object is {@link Object }
   */
  public Object getEmpty() {
	return empty;
  }

  /**
   * Legt den Wert der empty-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link Object }
   */
  public void setEmpty(Object value) {
	this.empty = value;
  }

  /**
   * Ruft den Wert der equals-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getEquals() {
	return equals;
  }

  /**
   * Legt den Wert der equals-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setEquals(String value) {
	this.equals = value;
  }

  /**
   * Ruft den Wert der greaterThan-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getGreaterThan() {
	return greaterThan;
  }

  /**
   * Legt den Wert der greaterThan-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setGreaterThan(String value) {
	this.greaterThan = value;
  }

  /**
   * Ruft den Wert der greaterThanEqual-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getGreaterThanEqual() {
	return greaterThanEqual;
  }

  /**
   * Legt den Wert der greaterThanEqual-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setGreaterThanEqual(String value) {
	this.greaterThanEqual = value;
  }

  /**
   * Ruft den Wert der lessThan-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getLessThan() {
	return lessThan;
  }

  /**
   * Legt den Wert der lessThan-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setLessThan(String value) {
	this.lessThan = value;
  }

  /**
   * Ruft den Wert der lessThanEqual-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getLessThanEqual() {
	return lessThanEqual;
  }

  /**
   * Legt den Wert der lessThanEqual-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setLessThanEqual(String value) {
	this.lessThanEqual = value;
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
   * Ruft den Wert der notEmpty-Eigenschaft ab.
   *
   * @return possible object is {@link Object }
   */
  public Object getNotEmpty() {
	return notEmpty;
  }

  /**
   * Legt den Wert der notEmpty-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link Object }
   */
  public void setNotEmpty(Object value) {
	this.notEmpty = value;
  }

  /**
   * Ruft den Wert der notEquals-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getNotEquals() {
	return notEquals;
  }

  /**
   * Legt den Wert der notEquals-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setNotEquals(String value) {
	this.notEquals = value;
  }

  /**
   * Ruft den Wert der or-Eigenschaft ab.
   *
   * @return possible object is {@link SuchkriterienAndOrTyp }
   */
  public SuchkriterienAndOrTyp getOr() {
	return or;
  }

  /**
   * Legt den Wert der or-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link SuchkriterienAndOrTyp }
   */
  public void setOr(SuchkriterienAndOrTyp value) {
	this.or = value;
  }
}
