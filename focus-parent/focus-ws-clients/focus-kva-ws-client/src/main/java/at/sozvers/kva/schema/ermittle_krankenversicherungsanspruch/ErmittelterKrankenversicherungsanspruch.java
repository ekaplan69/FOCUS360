package at.sozvers.kva.schema.ermittle_krankenversicherungsanspruch;

import java.util.ArrayList;
import java.util.List;
import at.sozvers.kva.schema.types.StandardResponse;
import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für anonymous complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://kva.sozvers.at/schema/types}standardResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="kva" type="{http://kva.sozvers.at/schema/ermittle-krankenversicherungsanspruch}krankenversicherungsanspruch" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="versicherungsnummer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="kvaAnzahl" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="", propOrder={"kva", "versicherungsnummer", "kvaAnzahl"})
@XmlRootElement(name="ermittelterKrankenversicherungsanspruch")
public class ErmittelterKrankenversicherungsanspruch extends StandardResponse {

  @XmlElement(nillable=true)
  protected List<Krankenversicherungsanspruch> kva;
  protected int                                kvaAnzahl;
  protected String                             versicherungsnummer;

  /**
   * Gets the value of the kva property.
   *
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object. This is why there is
   * not a <CODE>set</CODE> method for the kva property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getKva().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list {@link Krankenversicherungsanspruch }
   */
  public List<Krankenversicherungsanspruch> getKva() {
	if(kva == null) {
	  kva = new ArrayList<Krankenversicherungsanspruch>();
	}
	return this.kva;
  }

  /**
   * Ruft den Wert der kvaAnzahl-Eigenschaft ab.
   */
  public int getKvaAnzahl() {
	return kvaAnzahl;
  }

  /**
   * Legt den Wert der kvaAnzahl-Eigenschaft fest.
   */
  public void setKvaAnzahl(int value) {
	this.kvaAnzahl = value;
  }

  /**
   * Ruft den Wert der versicherungsnummer-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getVersicherungsnummer() {
	return versicherungsnummer;
  }

  /**
   * Legt den Wert der versicherungsnummer-Eigenschaft fest.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setVersicherungsnummer(String value) {
	this.versicherungsnummer = value;
  }
}
