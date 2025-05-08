package at.sozvers.noegkk.focus.rest.api.lgkk;

import java.util.List;
import at.sozvers.noegkk.focus.rest.api.common.BaseDTO;

public class DokumenteDTO implements BaseDTO {

  private List<DokumentDTO> dokumente;

  public List<DokumentDTO> getDokumente() {
	return dokumente;
  }

  public void setDokumente(List<DokumentDTO> dokumente) {
	this.dokumente = dokumente;
  }
}
