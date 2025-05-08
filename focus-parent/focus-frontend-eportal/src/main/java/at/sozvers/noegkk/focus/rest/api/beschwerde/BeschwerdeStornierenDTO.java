package at.sozvers.noegkk.focus.rest.api.beschwerde;

import at.sozvers.noegkk.focus.rest.api.common.BaseDTO;

public class BeschwerdeStornierenDTO implements BaseDTO {

  private Long id;
  private Long updatecount;

  public Long getId() {
	return id;
  }

  public void setId(Long id) {
	this.id = id;
  }

  public Long getUpdatecount() {
	return updatecount;
  }

  public void setUpdatecount(Long updatecount) {
	this.updatecount = updatecount;
  }
}
