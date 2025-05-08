package at.sozvers.noegkk.focus.service.api.kontaktneu;

import java.time.LocalDateTime;
import at.sozvers.noegkk.focus.service.api.common.BaseBTO;

public class KontaktKontaktartBTO implements BaseBTO {

  private LocalDateTime gueltigBis;
  private LocalDateTime gueltigVon;
  private String        kontaktartBezeichnung;
  private String        kontaktartHilfetext;
  private Long          kontaktartId;

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

  public String getKontaktartBezeichnung() {
	return kontaktartBezeichnung;
  }

  public void setKontaktartBezeichnung(String kontaktartBezeichnung) {
	this.kontaktartBezeichnung = kontaktartBezeichnung;
  }

  public String getKontaktartHilfetext() {
	return kontaktartHilfetext;
  }

  public void setKontaktartHilfetext(String kontaktartHilfetext) {
	this.kontaktartHilfetext = kontaktartHilfetext;
  }

  public Long getKontaktartId() {
	return kontaktartId;
  }

  public void setKontaktartId(Long kontaktartId) {
	this.kontaktartId = kontaktartId;
  }
}
