package at.sozvers.noegkk.focus.service.api.beschwerde;

import at.sozvers.noegkk.focus.service.api.common.BaseBTO;

public class BeschwerdeStornierenBTO implements BaseBTO {

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
