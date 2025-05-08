package at.sozvers.noegkk.sckont.beschwerde.focus;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.*;

/**
 * <p>Java class for meldung complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="meldung">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="parameter" type="{http://focus.beschwerde.sckont.noegkk.sozvers.at/}parameter" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="meldung", propOrder={"id", "parameter", "text"})
public class Meldung {

  @XmlElement(required=true)
  protected String          id;
  @XmlElement(nillable=true)
  protected List<Parameter> parameter;
  @XmlElement(required=true)
  protected String          text;

  /**
   * Gets the value of the id property.
   *
   * @return possible object is {@link String }
   */
  public String getId() {
	return id;
  }

  /**
   * Sets the value of the id property.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setId(String value) {
	this.id = value;
  }

  /**
   * Gets the value of the parameter property.
   *
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object. This is why there is
   * not a <CODE>set</CODE> method for the parameter property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getParameter().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list {@link Parameter }
   */
  public List<Parameter> getParameter() {
	if(parameter == null) {
	  parameter = new ArrayList<>();
	}
	return this.parameter;
  }

  /**
   * Gets the value of the text property.
   *
   * @return possible object is {@link String }
   */
  public String getText() {
	return text;
  }

  /**
   * Sets the value of the text property.
   *
   * @param value
   * 		allowed object is {@link String }
   */
  public void setText(String value) {
	this.text = value;
  }
}
