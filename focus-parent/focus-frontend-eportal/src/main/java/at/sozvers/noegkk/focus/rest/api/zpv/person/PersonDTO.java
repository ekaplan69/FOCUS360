package at.sozvers.noegkk.focus.rest.api.zpv.person;

import at.sozvers.noegkk.focus.rest.api.common.BaseDTO;

public class PersonDTO implements BaseDTO {

  private StammdatenDTO stammdaten;
  private String        vsnr;

  public StammdatenDTO getStammdaten() {
	return stammdaten;
  }

  public void setStammdaten(StammdatenDTO stammdaten) {
	this.stammdaten = stammdaten;
  }

  public String getVsnr() {
	return vsnr;
  }

  public void setVsnr(String vsnr) {
	this.vsnr = vsnr;
  }
}
