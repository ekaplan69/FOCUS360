package at.sozvers.focus.ws.generated;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für suchkriterienAndOrTyp complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="suchkriterienAndOrTyp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded"&gt;
 *         &lt;element name="equals" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="not-equals" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="greater-than" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="less-than" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="greater-than-equal" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="less-than-equal" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="contains" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="empty" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="not-empty" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="suchkriterienAndOrTyp", namespace="http://awf.sozvers.at/schema/suchen", propOrder={"equalsOrNotEqualsOrGreaterThan"})
public class SuchkriterienAndOrTyp {

  @XmlElementRefs({@XmlElementRef(name="equals", namespace="http://awf.sozvers.at/schema/suchen", type=JAXBElement.class, required=false),
		  @XmlElementRef(name="not-equals", namespace="http://awf.sozvers.at/schema/suchen", type=JAXBElement.class, required=false),
		  @XmlElementRef(name="greater-than", namespace="http://awf.sozvers.at/schema/suchen", type=JAXBElement.class, required=false),
		  @XmlElementRef(name="less-than", namespace="http://awf.sozvers.at/schema/suchen", type=JAXBElement.class, required=false),
		  @XmlElementRef(name="greater-than-equal", namespace="http://awf.sozvers.at/schema/suchen", type=JAXBElement.class, required=false),
		  @XmlElementRef(name="less-than-equal", namespace="http://awf.sozvers.at/schema/suchen", type=JAXBElement.class, required=false),
		  @XmlElementRef(name="contains", namespace="http://awf.sozvers.at/schema/suchen", type=JAXBElement.class, required=false),
		  @XmlElementRef(name="empty", namespace="http://awf.sozvers.at/schema/suchen", type=JAXBElement.class, required=false),
		  @XmlElementRef(name="not-empty", namespace="http://awf.sozvers.at/schema/suchen", type=JAXBElement.class, required=false)})
  protected List<JAXBElement<?>> equalsOrNotEqualsOrGreaterThan;

  /**
   * Gets the value of the equalsOrNotEqualsOrGreaterThan property.
   *
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object. This is why there is
   * not a <CODE>set</CODE> method for the equalsOrNotEqualsOrGreaterThan property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getEqualsOrNotEqualsOrGreaterThan().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list {@link JAXBElement }{@code <}{@link String }{@code >} {@link JAXBElement }{@code <}{@link String }{@code >}
   * {@link JAXBElement }{@code <}{@link String }{@code >} {@link JAXBElement }{@code <}{@link String }{@code >} {@link JAXBElement }{@code <}{@link String }{@code >}
   * {@link JAXBElement }{@code <}{@link String }{@code >} {@link JAXBElement }{@code <}{@link String }{@code >} {@link JAXBElement }{@code <}{@link Object }{@code >}
   * {@link JAXBElement }{@code <}{@link Object }{@code >}
   */
  public List<JAXBElement<?>> getEqualsOrNotEqualsOrGreaterThan() {
	if(equalsOrNotEqualsOrGreaterThan == null) {
	  equalsOrNotEqualsOrGreaterThan = new ArrayList<>();
	}
	return this.equalsOrNotEqualsOrGreaterThan;
  }
}
