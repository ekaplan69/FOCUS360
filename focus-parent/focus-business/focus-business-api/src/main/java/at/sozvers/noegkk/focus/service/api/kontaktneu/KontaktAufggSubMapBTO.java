package at.sozvers.noegkk.focus.service.api.kontaktneu;

import java.time.LocalDateTime;
import at.sozvers.noegkk.focus.service.api.common.BaseBTO;

public class KontaktAufggSubMapBTO implements BaseBTO {
  private Long          aufgabengebietId;
  private LocalDateTime gueltigBis;
  private LocalDateTime gueltigVon;
  private Long          id;
  private Long          subAufgabengebietId;

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

  public Long getId() {
	return id;
  }

  public void setId(Long id) {
	this.id = id;
  }

  public Long getSubAufgabengebietId() {
	return subAufgabengebietId;
  }

  public void setSubAufgabengebietId(Long subAufgabengebietId) {
	this.subAufgabengebietId = subAufgabengebietId;
  }
}
