package at.sozvers.focus.ws.generated;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.*;

/**
 * Der DokumenteTyp kapselt eine Liste an Dokumenten im Suchergebnis.
 *
 *
 * <p>Java-Klasse für dokumenteTyp complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="dokumenteTyp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dokument" type="{http://awf.sozvers.at/schema/suchen}dokumentTyp" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="dokumenteTyp", namespace="http://awf.sozvers.at/schema/suchen", propOrder={"dokument"})
public class DokumenteTyp {

  @XmlElement(namespace="http://awf.sozvers.at/schema/suchen")
  protected List<DokumentTyp> dokument;

  /**
   * Gets the value of the dokument property.
   *
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object. This is why there is
   * not a <CODE>set</CODE> method for the dokument property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getDokument().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list {@link DokumentTyp }
   */
  public List<DokumentTyp> getDokument() {
	if(dokument == null) {
	  dokument = new ArrayList<>();
	}
	return this.dokument;
  }
}
