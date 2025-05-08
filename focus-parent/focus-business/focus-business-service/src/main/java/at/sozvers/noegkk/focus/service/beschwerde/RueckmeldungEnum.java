package at.sozvers.noegkk.focus.service.beschwerde;

import java.util.HashMap;
import java.util.Map;

public enum RueckmeldungEnum {
  Anregung(0), Beschwerde(1), Lob(2);

  private static final Map<Integer, RueckmeldungEnum> map = new HashMap<>(values().length, 1);

  static {
	for(RueckmeldungEnum c : values()) map.put(c.rueckmeldungId, c);
  }

  private final int rueckmeldungId;

  RueckmeldungEnum(int kanalId) {
	this.rueckmeldungId = kanalId;
  }

  public static String getTokenFromKanalId(int id) {
	return map.get(id).name();
  }

  public int getKanalId() {
	return rueckmeldungId;
  }
}
