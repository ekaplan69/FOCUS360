package at.sozvers.noegkk.focus.service.api.zpv.dienstgeber;

import at.sozvers.noegkk.focus.service.api.common.BaseBTO;

public class DienstgeberBTO implements BaseBTO {

  private String                   dgnr;
  private DienstgeberStammdatenBTO stammdatenBTO;

  public String getDgnr() {
	return dgnr;
  }

  public void setDgnr(String dgnr) {
	this.dgnr = dgnr;
  }

  public DienstgeberStammdatenBTO getStammdatenBTO() {
	return stammdatenBTO;
  }

  public void setStammdatenBTO(DienstgeberStammdatenBTO stammdatenBTO) {
	this.stammdatenBTO = stammdatenBTO;
  }

  @Override
  public String toString() {
	return "DienstgeberBTO [dgnr=" + dgnr + "]";
  }
}
