package at.itsv.services.svstd11.types;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für ReturnInfo complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="ReturnInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReturnCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Meldungen" type="{http://types.svstd11.services.itsv.at/}Meldung" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="ReturnInfo", propOrder={"returnCode", "meldungen"})
public class ReturnInfo {

  @XmlElement(name="Meldungen")
  protected List<Meldung> meldungen;
  @XmlElement(name="ReturnCode")
  protected int           returnCode;

  /**
   * Gets the value of the meldungen property.
   *
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object. This is why there is
   * not a <CODE>set</CODE> method for the meldungen property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getMeldungen().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list {@link Meldung }
   */
  public List<Meldung> getMeldungen() {
	if(meldungen == null) {
	  meldungen = new ArrayList<Meldung>();
	}
	return this.meldungen;
  }

  /**
   * Ruft den Wert der returnCode-Eigenschaft ab.
   */
  public int getReturnCode() {
	return returnCode;
  }

  /**
   * Legt den Wert der returnCode-Eigenschaft fest.
   */
  public void setReturnCode(int value) {
	this.returnCode = value;
  }
}
