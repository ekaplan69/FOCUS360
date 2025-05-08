package at.sozvers.noegkk.focus.rest.api.beschwerde;

import at.sozvers.noegkk.focus.rest.api.common.BaseDTO;

public class UpdateCountDTO implements BaseDTO {

  private Long updatecount;

  public UpdateCountDTO(Long updatecount) {
	this.updatecount = updatecount;
  }

  public Long getUpdatecount() {
	return updatecount;
  }

  public void setUpdatecount(Long updatecount) {
	this.updatecount = updatecount;
  }
}
