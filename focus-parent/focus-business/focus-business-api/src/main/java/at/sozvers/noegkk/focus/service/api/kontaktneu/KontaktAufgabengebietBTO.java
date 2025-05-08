package at.sozvers.noegkk.focus.service.api.kontaktneu;

import java.time.LocalDateTime;
import at.sozvers.noegkk.focus.service.api.common.BaseBTO;

public class KontaktAufgabengebietBTO implements BaseBTO {

  private String        anzeigeAls;
  private String        aufgabengebietBezeichnung;
  private String        aufgabengebietHilfetext;
  private Long          aufgabengebietId;
  private LocalDateTime gueltigBis;
  private LocalDateTime gueltigVon;
  private Character     subAufgabengebietJN;

  public String getAnzeigeAls() {
	return anzeigeAls;
  }

  public void setAnzeigeAls(String anzeigeAls) {
	this.anzeigeAls = anzeigeAls;
  }

  public String getAufgabengebietBezeichnung() {
	return aufgabengebietBezeichnung;
  }

  public void setAufgabengebietBezeichnung(String aufgabengebietBezeichnung) {
	this.aufgabengebietBezeichnung = aufgabengebietBezeichnung;
  }

  public String getAufgabengebietHilfetext() {
	return aufgabengebietHilfetext;
  }

  public void setAufgabengebietHilfetext(String aufgabengebietHilfetext) {
	this.aufgabengebietHilfetext = aufgabengebietHilfetext;
  }

  public Long getAufgabengebietId() {
	return aufgabengebietId;
  }

  public void setAufgabengebietId(Long aufgabengebietId) {
	this.aufgabengebietId = aufgabengebietId;
  }

  public LocalDateTime getGueltigBis() {
	return gueltigBis;
  }

  public void setGueltigBis(LocalDateTime gueltigBis) {
	this.gueltigBis = gueltigBis;
  }

  public LocalDateTime getGueltigVon() {
	return gueltigVon;
  }

  public void setGueltigVon(LocalDateTime gueltigVon) {
	this.gueltigVon = gueltigVon;
  }

  public Character getSubAufgabengebietJN() {
	return subAufgabengebietJN;
  }

  public void setSubAufgabengebietJN(Character subAufgabengebietJN) {
	this.subAufgabengebietJN = subAufgabengebietJN;
  }
}
