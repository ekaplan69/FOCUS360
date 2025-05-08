package at.sozvers.noegkk.focus.service.api.kva.abzsuc;

import java.time.LocalDate;
import at.sozvers.noegkk.focus.service.api.common.BaseBTO;
import at.sozvers.noegkk.focus.service.api.common.xml.LocalDateAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlAccessorType(XmlAccessType.FIELD)
public class AngehoerigeBTO implements BaseBTO {

  private boolean   anspruchspruefung = false;
  @XmlJavaTypeAdapter(value=LocalDateAdapter.class)
  private LocalDate gueltigBis;
  @XmlJavaTypeAdapter(value=LocalDateAdapter.class)
  private LocalDate gueltigVon;
  private String    meldendeStelle;
  private String    nachname;
  private String    typ;
  private String    versicherungsnummer;
  private String    vorname;

  public LocalDate getGueltigBis() {
	return gueltigBis;
  }

  public void setGueltigBis(LocalDate gueltigBis) {
	this.gueltigBis = gueltigBis;
  }

  public LocalDate getGueltigVon() {
	return gueltigVon;
  }

  public void setGueltigVon(LocalDate gueltigVon) {
	this.gueltigVon = gueltigVon;
  }

  public String getMeldendeStelle() {
	return meldendeStelle;
  }

  public void setMeldendeStelle(String meldendeStelle) {
	this.meldendeStelle = meldendeStelle;
  }

  public String getNachname() {
	return nachname;
  }

  public void setNachname(String nachname) {
	this.nachname = nachname;
  }

  public String getTyp() {
	return typ;
  }

  public void setTyp(String typ) {
	this.typ = typ;
  }

  public String getVersicherungsnummer() {
	return versicherungsnummer;
  }

  public void setVersicherungsnummer(String versicherungsnummer) {
	this.versicherungsnummer = versicherungsnummer;
  }

  public String getVorname() {
	return vorname;
  }

  public void setVorname(String vorname) {
	this.vorname = vorname;
  }

  public boolean isAnspruchspruefung() {
	return anspruchspruefung;
  }

  public void setAnspruchspruefung(boolean anspruchspruefung) {
	this.anspruchspruefung = anspruchspruefung;
  }
}
