package at.sozvers.noegkk.focus.service.api.kontaktneu;

import java.time.LocalDateTime;
import at.sozvers.noegkk.focus.service.api.common.BaseBTO;

public class KontaktAbschlussartBTO implements BaseBTO {

  private String        abschlussartBezeichnung;
  private String        abschlussartHilfetext;
  private Long          abschlussartId;
  private LocalDateTime gueltigBis;
  private LocalDateTime gueltigVon;

  public String getAbschlussartBezeichnung() {
	return abschlussartBezeichnung;
  }

  public void setAbschlussartBezeichnung(String abschlussartBezeichnung) {
	this.abschlussartBezeichnung = abschlussartBezeichnung;
  }

  public String getAbschlussartHilfetext() {
	return abschlussartHilfetext;
  }

  public void setAbschlussartHilfetext(String abschlussartHilfetext) {
	this.abschlussartHilfetext = abschlussartHilfetext;
  }

  public Long getAbschlussartId() {
	return abschlussartId;
  }

  public void setAbschlussartId(Long abschlussartId) {
	this.abschlussartId = abschlussartId;
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
}
