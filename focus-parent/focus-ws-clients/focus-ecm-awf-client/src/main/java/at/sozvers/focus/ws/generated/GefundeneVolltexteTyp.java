package at.sozvers.focus.ws.generated;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.*;

/**
 * Der GefundeneVolltesteTyp kapselt eine Liste an Stellen im Inhalt eines Dokuments, die den Suchbegriffen entsprechen.
 *
 *
 * <p>Java-Klasse für gefundeneVolltexteTyp complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="gefundeneVolltexteTyp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="gefundener-volltext" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="gefundeneVolltexteTyp", namespace="http://awf.sozvers.at/schema/suchen", propOrder={"gefundenerVolltext"})
public class GefundeneVolltexteTyp {

  @XmlElement(name="gefundener-volltext", namespace="http://awf.sozvers.at/schema/suchen")
  protected List<String> gefundenerVolltext;

  /**
   * Gets the value of the gefundenerVolltext property.
   *
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object. This is why there is
   * not a <CODE>set</CODE> method for the gefundenerVolltext property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getGefundenerVolltext().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list {@link String }
   */
  public List<String> getGefundenerVolltext() {
	if(gefundenerVolltext == null) {
	  gefundenerVolltext = new ArrayList<>();
	}
	return this.gefundenerVolltext;
  }
}
