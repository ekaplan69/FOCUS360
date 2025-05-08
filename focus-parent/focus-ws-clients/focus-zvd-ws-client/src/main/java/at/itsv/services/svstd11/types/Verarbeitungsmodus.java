package at.itsv.services.svstd11.types;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java-Klasse für Verarbeitungsmodus.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="Verarbeitungsmodus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="O"/>
 *     &lt;enumeration value="B"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name="Verarbeitungsmodus")
@XmlEnum
public enum Verarbeitungsmodus {

  O, B;

  public static Verarbeitungsmodus fromValue(String v) {
	return valueOf(v);
  }

  public String value() {
	return name();
  }
}
