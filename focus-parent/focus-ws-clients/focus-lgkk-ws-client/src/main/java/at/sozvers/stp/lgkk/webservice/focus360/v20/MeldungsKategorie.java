package at.sozvers.stp.lgkk.webservice.focus360.v20;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java-Klasse für meldungsKategorie.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="meldungsKategorie">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="S"/>
 *     &lt;enumeration value="F"/>
 *     &lt;enumeration value="W"/>
 *     &lt;enumeration value="H"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name="meldungsKategorie")
@XmlEnum
public enum MeldungsKategorie {

  S, F, W, H;

  public static MeldungsKategorie fromValue(String v) {
	return valueOf(v);
  }

  public String value() {
	return name();
  }
}
