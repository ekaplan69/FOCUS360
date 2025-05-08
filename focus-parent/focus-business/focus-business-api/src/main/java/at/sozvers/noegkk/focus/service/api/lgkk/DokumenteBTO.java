package at.sozvers.noegkk.focus.service.api.lgkk;

import java.util.List;
import at.sozvers.noegkk.focus.service.api.common.BaseBTO;

public class DokumenteBTO implements BaseBTO {

  private List<DokumentBTO> dokumente;

  public List<DokumentBTO> getDokumente() {
	return dokumente;
  }

  public void setDokumente(List<DokumentBTO> dokumente) {
	this.dokumente = dokumente;
  }
}
