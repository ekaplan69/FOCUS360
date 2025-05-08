package at.sozvers.noegkk.focus.service.api.kundenfeedback;

import java.time.LocalDateTime;
import at.sozvers.noegkk.focus.service.api.common.BaseBTO;

public class KundenfeedbackUnterkategorieFbgMapBTO implements BaseBTO {
  private Long          fbgId;
  private LocalDateTime gueltigBis;
  private LocalDateTime gueltigVon;
  private Long          unterkategorieId;

  public Long getFbgId() {
	return fbgId;
  }

  public void setFbgId(Long fbgId) {
	this.fbgId = fbgId;
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

  public Long getUnterkategorieId() {
	return unterkategorieId;
  }

  public void setUnterkategorieId(Long unterkategorieId) {
	this.unterkategorieId = unterkategorieId;
  }
}
