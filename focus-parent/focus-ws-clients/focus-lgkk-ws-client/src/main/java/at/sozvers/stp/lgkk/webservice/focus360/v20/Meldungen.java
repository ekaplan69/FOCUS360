package at.sozvers.stp.lgkk.webservice.focus360.v20;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für meldungen complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="meldungen">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fehlerMeldungListe" type="{http://v20.focus360.webservice.lgkk.stp.sozvers.at/}meldung" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="hinweisMeldungListe" type="{http://v20.focus360.webservice.lgkk.stp.sozvers.at/}meldung" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="systemfehlerMeldungListe" type="{http://v20.focus360.webservice.lgkk.stp.sozvers.at/}meldung" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="warnungMeldungListe" type="{http://v20.focus360.webservice.lgkk.stp.sozvers.at/}meldung" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="meldungen", propOrder={"fehlerMeldungListe", "hinweisMeldungListe", "systemfehlerMeldungListe", "warnungMeldungListe"})
public class Meldungen {

  @XmlElement(nillable=true)
  protected List<Meldung> fehlerMeldungListe;
  @XmlElement(nillable=true)
  protected List<Meldung> hinweisMeldungListe;
  @XmlElement(nillable=true)
  protected List<Meldung> systemfehlerMeldungListe;
  @XmlElement(nillable=true)
  protected List<Meldung> warnungMeldungListe;

  /**
   * Gets the value of the fehlerMeldungListe property.
   *
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object. This is why there is
   * not a <CODE>set</CODE> method for the fehlerMeldungListe property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getFehlerMeldungListe().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list {@link Meldung }
   */
  public List<Meldung> getFehlerMeldungListe() {
	if(fehlerMeldungListe == null) {
	  fehlerMeldungListe = new ArrayList<Meldung>();
	}
	return this.fehlerMeldungListe;
  }

  /**
   * Gets the value of the hinweisMeldungListe property.
   *
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object. This is why there is
   * not a <CODE>set</CODE> method for the hinweisMeldungListe property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getHinweisMeldungListe().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list {@link Meldung }
   */
  public List<Meldung> getHinweisMeldungListe() {
	if(hinweisMeldungListe == null) {
	  hinweisMeldungListe = new ArrayList<Meldung>();
	}
	return this.hinweisMeldungListe;
  }

  /**
   * Gets the value of the systemfehlerMeldungListe property.
   *
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object. This is why there is
   * not a <CODE>set</CODE> method for the systemfehlerMeldungListe property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getSystemfehlerMeldungListe().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list {@link Meldung }
   */
  public List<Meldung> getSystemfehlerMeldungListe() {
	if(systemfehlerMeldungListe == null) {
	  systemfehlerMeldungListe = new ArrayList<Meldung>();
	}
	return this.systemfehlerMeldungListe;
  }

  /**
   * Gets the value of the warnungMeldungListe property.
   *
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object. This is why there is
   * not a <CODE>set</CODE> method for the warnungMeldungListe property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getWarnungMeldungListe().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list {@link Meldung }
   */
  public List<Meldung> getWarnungMeldungListe() {
	if(warnungMeldungListe == null) {
	  warnungMeldungListe = new ArrayList<Meldung>();
	}
	return this.warnungMeldungListe;
  }
}
