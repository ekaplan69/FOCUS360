package at.sozvers.focus.ws.generated;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java-Klasse für sortierreihenfolgeTyp.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="sortierreihenfolgeTyp"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ASC"/&gt;
 *     &lt;enumeration value="DESC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name="sortierreihenfolgeTyp", namespace="http://awf.sozvers.at/schema/suchen")
@XmlEnum
public enum SortierreihenfolgeTyp {

  ASC, DESC;

  public static SortierreihenfolgeTyp fromValue(String v) {
	return valueOf(v);
  }

  public String value() {
	return name();
  }
}
