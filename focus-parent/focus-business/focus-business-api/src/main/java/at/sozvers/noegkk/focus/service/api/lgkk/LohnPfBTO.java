package at.sozvers.noegkk.focus.service.api.lgkk;

import at.sozvers.noegkk.focus.service.api.common.BaseBTO;

public class LohnPfBTO implements BaseBTO {
  private Boolean lohnpfaendung;

  public Boolean getLohnpfaendung() {
	return lohnpfaendung;
  }

  public void setLohnpfaendung(Boolean lohnpfaendung) {
	this.lohnpfaendung = lohnpfaendung;
  }
}
