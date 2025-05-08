package at.sozvers.noegkk.focus.service.api.kundenfeedback;

import java.time.LocalDateTime;
import at.sozvers.noegkk.focus.service.api.common.BaseBTO;

public class KundenfeedbackThemaFbgMapBTO implements BaseBTO {
  private Long          fbgId;
  private LocalDateTime gueltigBis;
  private LocalDateTime gueltigVon;
  private Long          themaId;

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

  public Long getThemaId() {
	return themaId;
  }

  public void setThemaId(Long themaId) {
	this.themaId = themaId;
  }
}
