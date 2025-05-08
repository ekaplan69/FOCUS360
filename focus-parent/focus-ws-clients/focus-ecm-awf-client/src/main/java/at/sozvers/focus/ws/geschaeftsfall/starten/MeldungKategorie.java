package at.sozvers.focus.ws.geschaeftsfall.starten;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java-Klasse für MeldungKategorie.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="MeldungKategorie"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="S"/&gt;
 *     &lt;enumeration value="F"/&gt;
 *     &lt;enumeration value="W"/&gt;
 *     &lt;enumeration value="H"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name="MeldungKategorie", namespace="http://awf.sozvers.at/schema/meldungen")
@XmlEnum
public enum MeldungKategorie {

  S, F, W, H;

  public static MeldungKategorie fromValue(String v) {
	return valueOf(v);
  }

  public String value() {
	return name();
  }
}
