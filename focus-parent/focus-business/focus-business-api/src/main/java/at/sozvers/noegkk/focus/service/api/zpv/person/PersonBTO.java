package at.sozvers.noegkk.focus.service.api.zpv.person;

import at.sozvers.noegkk.focus.service.api.common.BaseBTO;
import at.sozvers.noegkk.focus.service.api.notiz.NotizBTO;

public class PersonBTO implements BaseBTO {

  private NotizBTO      notiz;
  private StammdatenBTO stammdaten;
  private String        vsnr;

  public NotizBTO getNotiz() {
	return notiz;
  }

  public void setNotiz(NotizBTO notiz) {
	this.notiz = notiz;
  }

  public StammdatenBTO getStammdaten() {
	return stammdaten;
  }

  public void setStammdaten(StammdatenBTO stammdaten) {
	this.stammdaten = stammdaten;
  }

  public String getVsnr() {
	return vsnr;
  }

  public void setVsnr(String vsnr) {
	this.vsnr = vsnr;
  }

  @Override
  public String toString() {
	return "PersonBTO [vsnr=" + vsnr + ", stammdaten=" + stammdaten + ", notiz=" + notiz + "]";
  }
}
