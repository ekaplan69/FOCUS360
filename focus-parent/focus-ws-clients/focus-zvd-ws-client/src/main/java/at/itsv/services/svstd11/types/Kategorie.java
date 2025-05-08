package at.itsv.services.svstd11.types;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java-Klasse für Kategorie.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="Kategorie">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="H"/>
 *     &lt;enumeration value="W"/>
 *     &lt;enumeration value="F"/>
 *     &lt;enumeration value="S"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name="Kategorie")
@XmlEnum
public enum Kategorie {

  H, W, F, S;

  public static Kategorie fromValue(String v) {
	return valueOf(v);
  }

  public String value() {
	return name();
  }
}
