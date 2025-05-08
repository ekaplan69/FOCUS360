package at.sozvers.noegkk.focus.service.api.zugriffsprotokollierung;

import java.util.List;

public interface Zugriffsprotokollierung {
  public List<ZugriffsprotokollBTO> ermittleUnverarbeiteteProtkollsaetze(int limit);

  public void uebermittleProtokollsaetze(List<ZugriffsprotokollBTO> input);
}
