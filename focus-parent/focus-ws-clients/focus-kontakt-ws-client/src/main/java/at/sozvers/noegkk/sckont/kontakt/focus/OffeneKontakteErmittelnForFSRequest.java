package at.sozvers.noegkk.sckont.kontakt.focus;

import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für offeneKontakteErmittelnForFSRequest complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="offeneKontakteErmittelnForFSRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://focus.kontakt.sckont.noegkk.sozvers.at/}standardRequest">
 *       &lt;sequence>
 *         &lt;element name="fs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fsart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="offeneKontakteErmittelnForFSRequest", propOrder={"fs", "fsart"})
public class OffeneKontakteErmittelnForFSRequest extends StandardRequest {
  private String fs;
  private String fsart;

  /**
   * Ruft den Wert der fs-Eigenschaft ab.
   */
  public String getFs() {
	return fs;
  }

  /**
   * Legt den Wert der fs-Eigenschaft fest.
   */
  public void setFs(String fs) {
	this.fs = fs;
  }

  /**
   * Ruft den Wert der fsart-Eigenschaft ab.
   */
  public String getFsart() {
	return fsart;
  }

  /**
   * Legt den Wert der fsart-Eigenschaft fest.
   */
  public void setFsart(String fsart) {
	this.fsart = fsart;
  }
}
