package at.sozvers.noegkk.focus.scheduling.zugriffsprotokollierung;

import java.util.List;
import at.sozvers.noegkk.focus.service.api.zugriffsprotokollierung.ZugriffsprotokollBTO;
import at.sozvers.noegkk.focus.service.api.zugriffsprotokollierung.Zugriffsprotokollierung;
import jakarta.ejb.*;
import jakarta.inject.Inject;

@Stateless
public class ScheduledTaskProtokollsaetzeUebermittelnSingle {

  @Inject
  private Zugriffsprotokollierung zugriffsprotokollierung;

  @TransactionAttribute(value=TransactionAttributeType.REQUIRES_NEW)
  public void sendeProtokollsaetzeWithNewTransaction(List<ZugriffsprotokollBTO> protokollsaetze) {
	zugriffsprotokollierung.uebermittleProtokollsaetze(protokollsaetze);
  }
}
