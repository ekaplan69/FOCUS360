package at.sozvers.noegkk.focus.rest.endpoint.patchnotes;

import java.util.List;
import at.sozvers.noegkk.focus.service.patchnotes.PatchnotesService;
import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class PatchnotesController {
  @Inject
  private PatchnotesService patchnotesService;

  List<String> lesePatchnotes() {
	return patchnotesService.readPatchnotes();
  }
}
