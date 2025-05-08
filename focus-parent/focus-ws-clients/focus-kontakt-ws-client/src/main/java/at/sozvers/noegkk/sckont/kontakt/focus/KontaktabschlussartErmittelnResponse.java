package at.sozvers.noegkk.sckont.kontakt.focus;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für kontaktabschlussartErmittelnResponse complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="kontaktabschlussartErmittelnResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://focus.kontakt.sckont.noegkk.sozvers.at/}standardResponse">
 *       &lt;sequence>
 *         &lt;element name="kontaktabschlussarten" type="{http://focus.kontakt.sckont.noegkk.sozvers.at/}kontaktabschlussart" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="kontaktabschlussartErmittelnResponse", propOrder={"kontaktabschlussarten"})
public class KontaktabschlussartErmittelnResponse extends StandardResponse {

  @XmlElement(nillable=true)
  protected List<Kontaktabschlussart> kontaktabschlussarten;

  /**
   * Gets the value of the kontaktabschlussarten property.
   *
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object. This is why there is
   * not a <CODE>set</CODE> method for the kontaktabschlussarten property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getKontaktabschlussarten().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list {@link Kontaktabschlussart }
   */
  public List<Kontaktabschlussart> getKontaktabschlussarten() {
	if(kontaktabschlussarten == null) {
	  kontaktabschlussarten = new ArrayList<>();
	}
	return this.kontaktabschlussarten;
  }
}
