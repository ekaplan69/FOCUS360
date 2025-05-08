package at.sozvers.noegkk.focus.rest.api.kva.kvkerm;

import at.sozvers.noegkk.focus.rest.api.common.BaseDTO;

public class KvkermDTO implements BaseDTO {

  private String anspruch;
  private String schutzfrist;
  private String toleranzfrist;

  public String getAnspruch() {
	return anspruch;
  }

  public void setAnspruch(String anspruch) {
	this.anspruch = anspruch;
  }

  public String getSchutzfrist() {
	return schutzfrist;
  }

  public void setSchutzfrist(String schutzfrist) {
	this.schutzfrist = schutzfrist;
  }

  public String getToleranzfrist() {
	return toleranzfrist;
  }

  public void setToleranzfrist(String toleranzfrist) {
	this.toleranzfrist = toleranzfrist;
  }
}
