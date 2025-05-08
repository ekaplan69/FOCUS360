package at.sozvers.focus.ws.generated;

import jakarta.xml.bind.annotation.*;

/**
 * Die Ergebnisaufbereitung definiert wie das Suchergebnis geliefert wird. Die Anzahl pro Seite und die aktuelle Seite müssen angegeben werden.
 *
 *
 * <p>Java-Klasse für ergebnis-aufbereitung complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="ergebnis-aufbereitung"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="anzahl-pro-seite" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="aktuelle-seite" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="sortier-feld" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sortier-reihenfolge" type="{http://awf.sozvers.at/schema/suchen}sortierreihenfolgeTyp" minOccurs="0"/&gt;
 *         &lt;element name="anzahl-volltext-treffer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="ergebnis-aufbereitung", namespace="http://awf.sozvers.at/schema/suchen", propOrder={"anzahlProSeite", "aktuelleSeite", "sortierFeld", "sortierReihenfolge", "anzahlVolltextTreffer"})
public class ErgebnisAufbereitung {

  @XmlElement(name="aktuelle-seite", namespace="http://awf.sozvers.at/schema/suchen", defaultValue="1")
  protected int                   aktuelleSeite;
  @XmlElement(name="anzahl-pro-seite", namespace="http://awf.sozvers.at/schema/suchen")
  protected int                   anzahlProSeite;
  @XmlElement(name="anzahl-volltext-treffer", namespace="http://awf.sozvers.at/schema/suchen")
  protected Integer               anzahlVolltextTreffer;
  @XmlElement(name="sortier-feld", namespace="http://awf.sozvers.at/schema/suchen")
  protected String                sortierFeld;
  @XmlElement(name="sortier-reihenfolge", namespace="http://awf.sozvers.at/schema/suchen")
  @XmlSchemaType(name="string")
  protected SortierreihenfolgeTyp sortierReihenfolge;

  /**
   * Ruft den Wert der aktuelleSeite-Eigenschaft ab.
   */
  public int getAktuelleSeite() {
	return aktuelleSeite;
  }

  /**
   * Legt den Wert der aktuelleSeite-Eigenschaft fest.
   */
  public void setAktuelleSeite(int value) {
	this.aktuelleSeite = value;
  }

  /**
   * Ruft den Wert der anzahlProSeite-Eigenschaft ab.
   */
  public int getAnzahlProSeite() {
	return anzahlProSeite;
  }

  /**
   * Legt den Wert der anzahlProSeite-Eigenschaft fest.
   */
  public void setAnzahlProSeite(int value) {
	this.anzahlProSeite = value;
  }

  /**
   * Ruft den Wert der anzahlVolltextTreffer-Eigenschaft ab.
   *
   * @return possible object is {@link Integer }
   */
  public Integer getAnzahlVolltextTreffer() {
	return anzahlVolltextTreffer;
  }

  /**
   * Legt den Wert der anzahlVolltextTreffer-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link Integer }
   */
  public void setAnzahlVolltextTreffer(Integer value) {
	this.anzahlVolltextTreffer = value;
  }

  /**
   * Ruft den Wert der sortierFeld-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getSortierFeld() {
	return sortierFeld;
  }

  /**
   * Legt den Wert der sortierFeld-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setSortierFeld(String value) {
	this.sortierFeld = value;
  }

  /**
   * Ruft den Wert der sortierReihenfolge-Eigenschaft ab.
   *
   * @return possible object is {@link SortierreihenfolgeTyp }
   */
  public SortierreihenfolgeTyp getSortierReihenfolge() {
	return sortierReihenfolge;
  }

  /**
   * Legt den Wert der sortierReihenfolge-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link SortierreihenfolgeTyp }
   */
  public void setSortierReihenfolge(SortierreihenfolgeTyp value) {
	this.sortierReihenfolge = value;
  }
}
