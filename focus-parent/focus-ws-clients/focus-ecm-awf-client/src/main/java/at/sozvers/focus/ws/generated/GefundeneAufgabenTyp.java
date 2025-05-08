package at.sozvers.focus.ws.generated;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.*;

/**
 * Der GefundeneAufgabenTyp beinhaltet eine Liste an gefundenen Aufgaben.
 *
 *
 * <p>Java-Klasse für gefundeneAufgabenTyp complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="gefundeneAufgabenTyp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="aufgabe" type="{http://awf.sozvers.at/schema/geschaeftsfall}gefundeneAufgabeTyp" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="gefundeneAufgabenTyp", namespace="http://awf.sozvers.at/schema/geschaeftsfall", propOrder={"aufgabe"})
public class GefundeneAufgabenTyp {

  @XmlElement(namespace="http://awf.sozvers.at/schema/geschaeftsfall")
  protected List<GefundeneAufgabeTyp> aufgabe;

  /**
   * Gets the value of the aufgabe property.
   *
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object. This is why there is
   * not a <CODE>set</CODE> method for the aufgabe property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getAufgabe().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list {@link GefundeneAufgabeTyp }
   */
  public List<GefundeneAufgabeTyp> getAufgabe() {
	if(aufgabe == null) {
	  aufgabe = new ArrayList<>();
	}
	return this.aufgabe;
  }
}
