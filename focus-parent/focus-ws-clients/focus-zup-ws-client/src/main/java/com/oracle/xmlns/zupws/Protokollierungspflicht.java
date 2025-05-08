package com.oracle.xmlns.zupws;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java-Klasse für Protokollierungspflicht.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="Protokollierungspflicht"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="P"/&gt;
 *     &lt;enumeration value="A"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name="Protokollierungspflicht")
@XmlEnum
public enum Protokollierungspflicht {

  P, A;

  public static Protokollierungspflicht fromValue(String v) {
	return valueOf(v);
  }

  public String value() {
	return name();
  }
}
