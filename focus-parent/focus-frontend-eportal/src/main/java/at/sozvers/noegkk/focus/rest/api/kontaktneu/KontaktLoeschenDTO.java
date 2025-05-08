package at.sozvers.noegkk.focus.rest.api.kontaktneu;

import at.sozvers.noegkk.focus.rest.api.common.BaseDTO;

public class KontaktLoeschenDTO implements BaseDTO {
  private long id;

  public long getId() {
	return id;
  }

  public void setId(long id) {
	this.id = id;
  }
}
