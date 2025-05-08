package at.sozvers.noegkk.focus.rest.api.lgkk;

import at.sozvers.noegkk.focus.rest.api.common.BaseDTO;

public class LohnPfDTO implements BaseDTO {
  private Boolean lohnpfaendung;

  public Boolean getLohnpfaendung() {
	return lohnpfaendung;
  }

  public void setLohnpfaendung(Boolean lohnpfaendung) {
	this.lohnpfaendung = lohnpfaendung;
  }
}
