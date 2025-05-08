package at.sozvers.focus.ws.geschaeftsfall.starten;

import jakarta.xml.bind.annotation.*;

/**
 * <p>Java-Klasse für linkTyp.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="linkTyp"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="referenziert"/&gt;
 *     &lt;enumeration value="siehe"/&gt;
 *     &lt;enumeration value="hatBeilage"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name="linkTyp", namespace="http://awf.sozvers.at/schema/dokument")
@XmlEnum
public enum LinkTyp {

  @XmlEnumValue("referenziert") REFERENZIERT("referenziert"), @XmlEnumValue("siehe") SIEHE("siehe"), @XmlEnumValue("hatBeilage") HAT_BEILAGE("hatBeilage");
  private final String value;

  LinkTyp(String v) {
	value = v;
  }

  public static LinkTyp fromValue(String v) {
	for(LinkTyp c : LinkTyp.values()) {
	  if(c.value.equals(v)) {
		return c;
	  }
	}
	throw new IllegalArgumentException(v);
  }

  public String value() {
	return value;
  }
}
