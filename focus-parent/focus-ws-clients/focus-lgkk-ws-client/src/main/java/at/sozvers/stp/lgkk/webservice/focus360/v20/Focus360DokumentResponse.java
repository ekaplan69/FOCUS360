package at.sozvers.stp.lgkk.webservice.focus360.v20;

import java.util.ArrayList;
import java.util.List;
import at.itsv.services.lgkk.StandardResponse;
import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für Focus360DokumentResponse complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="Focus360DokumentResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://types.services.itsv.at/}standardResponse">
 *       &lt;sequence>
 *         &lt;element name="focus360DokumentDto" type="{http://v20.focus360.webservice.lgkk.stp.sozvers.at/}Focus360DokumentDto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="Focus360DokumentResponse", propOrder={"focus360DokumentDto"})
public class Focus360DokumentResponse extends StandardResponse {

  protected List<Focus360DokumentDto> focus360DokumentDto;

  /**
   * Gets the value of the focus360DokumentDto property.
   *
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object. This is why there is
   * not a <CODE>set</CODE> method for the focus360DokumentDto property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getFocus360DokumentDto().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list {@link Focus360DokumentDto }
   */
  public List<Focus360DokumentDto> getFocus360DokumentDto() {
	if(focus360DokumentDto == null) {
	  focus360DokumentDto = new ArrayList<Focus360DokumentDto>();
	}
	return this.focus360DokumentDto;
  }
}
