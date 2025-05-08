package at.sozvers.focus.ws.generated;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.*;

/**
 * <p>Suche mit Operatoren fuer Geschaeftsfall-Metadaten bzw. technischen Daten wie Ersteller/ErstellDatum.</p>
 *
 * <p>Metadaten-Felder haben einen Punkt, z.b. resolver.text</p>
 *
 * <p>Unterstuetzte Zusatzfelder:  siehe enum LuceneFieldKey in ECMAWF Source Code.
 * Gross-/Kleinschreibung egal.</p>
 *
 *             <ul>
 *                 <li>ERSTELLER</li>
 *                 <li>ERSTELLDATUM</li>
 *                 <li>BEARBEITER</li>
 *                 <li>BEARBEITUNGSDATUM</li>
 *                 <li>GESCHAEFTSZEICHEN</li>
 *                 <li>NAME</li>
 *                 <li>TITLE</li>
 *                 <li>DOKUMENTKLASSE_NAME</li>
 *                 <li>DOKUMENTERWEITERUNGEN_NAME</li>
 *                 <li>METADATA_INDEX</li>
 *                 <li>GESCHAEFTSFALL_GESCHAEFTSZEICHEN</li>
 *                 <li>GESCHAEFTSFALL_DEFINITION_BEZEICHNUNG</li>
 *                 <li>GESCHAEFTSFALL_DEFINITION_NAME</li>
 *                 <li>GESCHAEFTSFALL_INITATOR</li>
 *                 <li>GESCHAEFTSFALL_STARTDATUM</li>
 *                 <li>GESCHAEFTSFALL_STATUS</li>
 *                 <li>GESCHAEFTSFALL_FACHLICHER_STATUS</li>
 *                 <li>GESCHAEFTSFALL_LINKS_GESPERRT</li>
 *                 <li>LEGALHOLD</li>
 *                 <li>LEGALHOLDUSER</li>
 *                 <li>DELETION_END</li>
 *                 <li>RETENTION_END</li>
 *                 <li>BIS_AUF_WEITERES</li>
 *                 <li>GESCHAEFTSFALLERWEITERUNGEN_NAME</li>
 *                 <li>ERSTELLTAM</li>
 *                 <li>OBJECTCLASSTITLE</li>
 *                 <li>DATEINAME</li>
 *                 <li>STARTER</li>
 *                 <li>GESCHAEFTSFALLDEFINITIONBEZEICHNUNG</li>
 *                 <li>GESTARTETAM</li>
 *                 <li>GESCHAEFTSFALLTECHNISCHERSTATUS</li>
 *                 <li>GESCHAEFTSFALLFACHLICHERSTATUS</li>
 *                 <li>LETZTERBEARBEITER</li>
 *                 <li>ZULETZTBEARBEITETAM</li>
 *                 <li>PARENTGESCHAEFTSZEICHEN</li>
 *                 <li>PARENTGESCHAEFTSFALLDEFINITIONBEZEICHNUNG</li>
 *                 <li>TECHNISCHERSTATUS</li>
 *                 <li>FRISTAUSGESETZT</li>
 *                 <li>LOESCHUNGBIS</li>
 *                 <li>AUFBEWAHRUNGBIS</li>
 *                 <li>BISAUFWEITERES</li>
 *                 <li>AUFGABENBEARBEITER</li>
 *                 <li>AUFGABENKANDIDATENOE</li>
 *                 <li>AUFGABENKANDIDATENBENUTZER</li>
 *                 <li>ARBEITSMAPPENZEICHEN</li>
 *             </ul>
 *
 *
 *
 * <p>Java-Klasse für suchkriterienTyp complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="suchkriterienTyp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="feld" type="{http://awf.sozvers.at/schema/suchen}suchkriterienFeldTyp" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="suchkriterienTyp", namespace="http://awf.sozvers.at/schema/suchen", propOrder={"feld"})
public class SuchkriterienTyp {

  @XmlElement(namespace="http://awf.sozvers.at/schema/suchen")
  protected List<SuchkriterienFeldTyp> feld;

  /**
   * Gets the value of the feld property.
   *
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object. This is why there is
   * not a <CODE>set</CODE> method for the feld property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getFeld().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list {@link SuchkriterienFeldTyp }
   */
  public List<SuchkriterienFeldTyp> getFeld() {
	if(feld == null) {
	  feld = new ArrayList<>();
	}
	return this.feld;
  }
}
