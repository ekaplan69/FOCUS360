package at.sozvers.focus.ws.geschaeftsfall.starten;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java-Klasse für migRolleTyp.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="migRolleTyp"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BEARBEITER"/&gt;
 *     &lt;enumeration value="LESER"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name="migRolleTyp", namespace="http://awf.sozvers.at/schema/dokument")
@XmlEnum
public enum MigRolleTyp {

  BEARBEITER, LESER;

  public static MigRolleTyp fromValue(String v) {
	return valueOf(v);
  }

  public String value() {
	return name();
  }
}
