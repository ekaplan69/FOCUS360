package at.sozvers.noegkk.sckont.beschwerde.focus;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.*;

/**
 * <p>Java class for beschwerdebereichErmittelnResponse complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="beschwerdebereichErmittelnResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://focus.beschwerde.sckont.noegkk.sozvers.at/}standardResponse">
 *       &lt;sequence>
 *         &lt;element name="beschwerdebereich" type="{http://focus.beschwerde.sckont.noegkk.sozvers.at/}beschwerdebereich" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="beschwerdebereichErmittelnResponse", propOrder={"beschwerdebereich"})
public class BeschwerdebereichErmittelnResponse extends StandardResponse {

  @XmlElement(nillable=true)
  protected List<Beschwerdebereich> beschwerdebereich;

  /**
   * Gets the value of the beschwerdebereich property.
   *
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object. This is why there is
   * not a <CODE>set</CODE> method for the beschwerdebereich property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getBeschwerdebereich().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list {@link Beschwerdebereich }
   */
  public List<Beschwerdebereich> getBeschwerdebereich() {
	if(beschwerdebereich == null) {
	  beschwerdebereich = new ArrayList<>();
	}
	return this.beschwerdebereich;
  }
}
