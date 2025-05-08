package at.sozvers.noegkk.focus.rest.api.zpv.dienstgeber;

import at.sozvers.noegkk.focus.rest.api.common.BaseDTO;

public class DienstgeberDTO implements BaseDTO {

  private String                   dgnr;
  private DienstgeberStammdatenDTO stammdatenDTO;

  public String getDgnr() {
	return dgnr;
  }

  public void setDgnr(String dgnr) {
	this.dgnr = dgnr;
  }

  public DienstgeberStammdatenDTO getStammdatenDTO() {
	return stammdatenDTO;
  }

  public void setStammdatenDTO(DienstgeberStammdatenDTO stammdatenDTO) {
	this.stammdatenDTO = stammdatenDTO;
  }
}
