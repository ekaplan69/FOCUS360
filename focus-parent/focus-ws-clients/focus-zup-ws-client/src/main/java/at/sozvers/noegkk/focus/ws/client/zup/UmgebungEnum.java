package at.sozvers.noegkk.focus.ws.client.zup;

public enum UmgebungEnum {
  P("P"), //Produktion
  T("V"), //Traegertest (="V" lt. ZUP-WS)
  V("V"), // Traegertest (Interceptor schreibt bereits "V" in Tabelle)
  E("1"); // Entwicklung (= beliebige Umgebungsnummern 1-9 zur Wahl lt. ZUP-WS)

  private String umgebungProdukt;

  private UmgebungEnum(String umgebungProdukt) {
	this.umgebungProdukt = umgebungProdukt;
  }

  public static String getDecodedZupEnv(String umgebungProdukt) {
	UmgebungEnum umgebungZup = valueOf(umgebungProdukt);
	String       env         = umgebungZup.getDecodedEnv();

	if(env == null) {
	  throw new IllegalArgumentException("Umgebung '" + umgebungProdukt + "' kann nicht umgeschlüsselt werden in ZUP-WS-kompatible Umgebung!");
	}
	return env;
  }

  public String getDecodedEnv() {
	return umgebungProdukt;
  }
}
