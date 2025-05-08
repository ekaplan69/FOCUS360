package at.sozvers.noegkk.focus.rest.zup;

import java.util.List;
import at.sozvers.noegkk.architektur.zup.model.ProtokollEintrag;
import at.sozvers.noegkk.architektur.zup.service.ProtokollService;
import at.sozvers.noegkk.focus.rest.api.common.ProtokollEintragUtil;
import at.sozvers.noegkk.focus.rest.api.common.ZupInfoDTO;
import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ZUPController {
  @Inject
  private ProtokollService protokollService;

  public void log(ZupInfoDTO zupInfoDTO, String protLogId) {
	List<ProtokollEintrag> protEintraege = ProtokollEintragUtil.getProtokollEintraege(zupInfoDTO);
	protokollService.protokolliere(protLogId, protEintraege);
  }
}
