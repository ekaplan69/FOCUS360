package at.sozvers.focus.ws.geschaeftsfall.starten;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.*;

/**
 * AufgabenausgaengeTyp beinhaltet eine Liste an möglichen Aufgabenausgängen für eine Aufgabe.
 *
 *
 * <p>Java-Klasse für aufgabenausgaengeTyp complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="aufgabenausgaengeTyp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="aufgabenausgang" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="aufgabenausgaengeTyp", namespace="http://awf.sozvers.at/schema/geschaeftsfall", propOrder={"aufgabenausgang"})
public class AufgabenausgaengeTyp {

  @XmlElement(namespace="http://awf.sozvers.at/schema/geschaeftsfall")
  protected List<String> aufgabenausgang;

  /**
   * Gets the value of the aufgabenausgang property.
   *
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object. This is why there is
   * not a <CODE>set</CODE> method for the aufgabenausgang property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getAufgabenausgang().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list {@link String }
   */
  public List<String> getAufgabenausgang() {
	if(aufgabenausgang == null) {
	  aufgabenausgang = new ArrayList<>();
	}
	return this.aufgabenausgang;
  }
}
