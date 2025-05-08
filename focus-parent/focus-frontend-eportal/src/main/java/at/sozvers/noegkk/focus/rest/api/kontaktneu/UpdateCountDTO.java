package at.sozvers.noegkk.focus.rest.api.kontaktneu;

import at.sozvers.noegkk.focus.rest.api.common.BaseDTO;

public class UpdateCountDTO implements BaseDTO {

  private Long updateCount;

  public UpdateCountDTO(Long updateCount) {this.updateCount = updateCount;}

  public Long getUpdateCount() {
	return updateCount;
  }

  public void setUpdateCount(Long updateCount) {
	this.updateCount = updateCount;
  }
}
