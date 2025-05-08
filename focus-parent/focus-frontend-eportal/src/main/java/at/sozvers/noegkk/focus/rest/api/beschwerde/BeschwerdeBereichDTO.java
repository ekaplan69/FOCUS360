package at.sozvers.noegkk.focus.rest.api.beschwerde;

import java.util.ArrayList;
import java.util.List;
import at.sozvers.noegkk.focus.rest.api.common.BaseDTO;

public class BeschwerdeBereichDTO implements BaseDTO {

  private List<BeschwerdeBereichThemaDTO> themen;

  public List<BeschwerdeBereichThemaDTO> getThemen() {
	if(themen == null) {
	  themen = new ArrayList<>();
	}
	return themen;
  }
}
