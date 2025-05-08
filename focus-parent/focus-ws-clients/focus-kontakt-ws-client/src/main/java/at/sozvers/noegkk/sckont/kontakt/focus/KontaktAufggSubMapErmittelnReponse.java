package at.sozvers.noegkk.sckont.kontakt.focus;

import java.util.List;
import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für kontaktAufggSubMapErmittelnReponse complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="kontaktAufggSubMapErmittelnReponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://focus.kontakt.sckont.noegkk.sozvers.at/}standardResponse">
 *       &lt;sequence>
 *         &lt;element name="kontaktAufggSubMaps" type="{http://focus.kontakt.sckont.noegkk.sozvers.at/}kontaktAufggSubMap" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="kontaktAufggSubMapErmittelnReponse", propOrder={"kontaktAufggSubMaps"})
public class KontaktAufggSubMapErmittelnReponse extends StandardResponse {
  private List<KontaktAufggSubMap> kontaktAufggSubMaps;

  /**
   * Ruft den Wert der kontaktAufggSubMaps-Eigenschaft ab.
   */
  public List<KontaktAufggSubMap> getKontaktAufggSubMaps() {
	return kontaktAufggSubMaps;
  }

  /**
   * Legt den Wert der kontaktAufggSubMaps-Eigenschaft fest.
   */
  public void setKontaktAufggSubMaps(List<KontaktAufggSubMap> kontaktAufggSubMaps) {
	this.kontaktAufggSubMaps = kontaktAufggSubMaps;
  }
}
