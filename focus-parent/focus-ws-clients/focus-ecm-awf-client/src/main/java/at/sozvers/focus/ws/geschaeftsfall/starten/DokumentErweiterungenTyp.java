package at.sozvers.focus.ws.geschaeftsfall.starten;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.*;

/**
 * DokumentErweiterungenTyp kapselt eine Liste an Dokumenterweiterungen eines Dokuments.
 *
 *
 * <p>Java-Klasse für dokumentErweiterungenTyp complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="dokumentErweiterungenTyp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dokument-erweiterung" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="dokumentErweiterungenTyp", namespace="http://awf.sozvers.at/schema/dokument", propOrder={"dokumentErweiterung"})
public class DokumentErweiterungenTyp {

  @XmlElement(name="dokument-erweiterung", namespace="http://awf.sozvers.at/schema/dokument")
  protected List<String> dokumentErweiterung;

  /**
   * Gets the value of the dokumentErweiterung property.
   *
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object. This is why there is
   * not a <CODE>set</CODE> method for the dokumentErweiterung property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getDokumentErweiterung().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list {@link String }
   */
  public List<String> getDokumentErweiterung() {
	if(dokumentErweiterung == null) {
	  dokumentErweiterung = new ArrayList<>();
	}
	return this.dokumentErweiterung;
  }
}
