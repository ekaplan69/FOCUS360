package at.sozvers.noegkk.focus.service.api.zvd;

import java.util.List;
import at.sozvers.noegkk.focus.service.api.common.BaseBTO;

public class VersicherungsverhaeltnisBTO implements BaseBTO {
  private String hvbBeitragskontonummer;
  private String hvbBeitragskontonummerKennzeichen;
  private String meldendeStelle;

  private List<VersicherungszeitBTO> versicherungszeiten;

  public String getHvbBeitragskontonummer() {
	return hvbBeitragskontonummer;
  }

  public void setHvbBeitragskontonummer(String hvbBeitragskontonummer) {
	this.hvbBeitragskontonummer = hvbBeitragskontonummer;
  }

  public String getHvbBeitragskontonummerKennzeichen() {
	return hvbBeitragskontonummerKennzeichen;
  }

  public void setHvbBeitragskontonummerKennzeichen(String hvbBeitragskontonummerKennzeichen) {
	this.hvbBeitragskontonummerKennzeichen = hvbBeitragskontonummerKennzeichen;
  }

  public String getMeldendeStelle() {
	return meldendeStelle;
  }

  public void setMeldendeStelle(String meldendeStelle) {
	this.meldendeStelle = meldendeStelle;
  }

  public List<VersicherungszeitBTO> getVersicherungszeiten() {
	return versicherungszeiten;
  }

  public void setVersicherungszeiten(List<VersicherungszeitBTO> versicherungszeiten) {
	this.versicherungszeiten = versicherungszeiten;
  }
}
