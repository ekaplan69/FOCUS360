package at.sozvers.noegkk.focus.rest.api.patchnotes;

import java.util.List;
import at.sozvers.noegkk.focus.rest.api.common.BaseDTO;

public class PatchnotesDTO implements BaseDTO {
  private List<String> patchnotes;

  public List<String> getPatchnotes() {
	return patchnotes;
  }

  public void setPatchnotes(List<String> patchnotes) {
	this.patchnotes = patchnotes;
  }
}
