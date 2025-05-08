package at.sozvers.noegkk.sckont.kontakt.focus;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für kontaktaufgabengebietErmittelnResponse complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="kontaktaufgabengebietErmittelnResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://focus.kontakt.sckont.noegkk.sozvers.at/}standardResponse">
 *       &lt;sequence>
 *         &lt;element name="kontaktaufgabengebiete" type="{http://focus.kontakt.sckont.noegkk.sozvers.at/}kontaktaufgabengebiet" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="kontaktaufgabengebietErmittelnResponse", propOrder={"kontaktaufgabengebiete"})
public class KontaktaufgabengebietErmittelnResponse extends StandardResponse {

  @XmlElement(nillable=true)
  protected List<Kontaktaufgabengebiet> kontaktaufgabengebiete;

  /**
   * Gets the value of the kontaktaufgabengebiete property.
   *
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object. This is why there is
   * not a <CODE>set</CODE> method for the kontaktaufgabengebiete property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getKontaktaufgabengebiete().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list {@link Kontaktaufgabengebiet }
   */
  public List<Kontaktaufgabengebiet> getKontaktaufgabengebiete() {
	if(kontaktaufgabengebiete == null) {
	  kontaktaufgabengebiete = new ArrayList<>();
	}
	return this.kontaktaufgabengebiete;
  }
}
