package at.sozvers.noegkk.sckont.kontakt.focus;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für kontaktAufggKtMstMapErmittelnResponse complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="kontaktAufggKtMstMapErmittelnResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://focus.kontakt.sckont.noegkk.sozvers.at/}standardResponse">
 *       &lt;sequence>
 *         &lt;element name="kontaktAufggKtMstMapList" type="{http://focus.kontakt.sckont.noegkk.sozvers.at/}kontaktAufggKtMstMap" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="kontaktAufggKtMstMapErmittelnResponse", propOrder={"kontaktAufggKtMstMapList"})
public class KontaktAufggKtMstMapErmittelnResponse extends StandardResponse {

  @XmlElement(nillable=true)
  protected List<KontaktAufggKtMstMap> kontaktAufggKtMstMapList;

  /**
   * Gets the value of the kontaktAufggKtMstMapList property.
   *
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object. This is why there is
   * not a <CODE>set</CODE> method for the kontaktAufggKtMstMapList property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getKontaktAufggKtMstMapList().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list {@link KontaktAufggKtMstMap }
   */
  public List<KontaktAufggKtMstMap> getKontaktAufggKtMstMapList() {
	if(kontaktAufggKtMstMapList == null) {
	  kontaktAufggKtMstMapList = new ArrayList<>();
	}
	return this.kontaktAufggKtMstMapList;
  }
}
