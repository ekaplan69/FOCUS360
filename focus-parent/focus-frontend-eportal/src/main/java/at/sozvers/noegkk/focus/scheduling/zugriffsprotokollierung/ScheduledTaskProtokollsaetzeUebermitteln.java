package at.sozvers.noegkk.focus.scheduling.zugriffsprotokollierung;

import java.util.List;
import at.sozvers.noegkk.focus.scheduling.ScheduledTask;
import at.sozvers.noegkk.focus.scheduling.interceptor.Locking;
import at.sozvers.noegkk.focus.service.api.systemeinstellungen.Systemeinstellungen;
import at.sozvers.noegkk.focus.service.api.zugriffsprotokollierung.ZugriffsprotokollBTO;
import at.sozvers.noegkk.focus.service.api.zugriffsprotokollierung.Zugriffsprotokollierung;
import at.sozvers.noegkk.focus.service.common.CollectionUtil;
import jakarta.annotation.PostConstruct;
import jakarta.ejb.*;
import jakarta.inject.Inject;

@Singleton
//@Startup
public class ScheduledTaskProtokollsaetzeUebermitteln extends ScheduledTask {

  private static final String LOG_PREFIX              = "[TRANSMIT_ZUP] ";
  private static final int    MAX_ROWS_FOR_WS_REQUEST = 20;

  @Inject
  private Systemeinstellungen                            systemeinstellungen;
  @Inject
  private Zugriffsprotokollierung                        zugriffsprotokollierung;
  @Inject
  private ScheduledTaskProtokollsaetzeUebermittelnSingle zugriffsprotokollierungSingle;

  @Timeout
  @Locking(taskName="TRANSMIT_ZUP")
  @TransactionAttribute(TransactionAttributeType.NEVER)
  @Override
  public void scheduler(Timer timer) {
	super.scheduler(timer);
  }

  @Override
  protected String getLogPrefix() {
	return LOG_PREFIX;
  }

  @Override
  protected void doWork() {
	int                        limit           = systemeinstellungen.getPackagesizeTransmitZup();
	List<ZugriffsprotokollBTO> protokollsaetze = zugriffsprotokollierung.ermittleUnverarbeiteteProtkollsaetze(limit);

	List<List<ZugriffsprotokollBTO>> partitionierteProtkollsaetze = CollectionUtil.partitioniereListe(protokollsaetze, MAX_ROWS_FOR_WS_REQUEST);

	for(List<ZugriffsprotokollBTO> partition : partitionierteProtkollsaetze) {
	  zugriffsprotokollierungSingle.sendeProtokollsaetzeWithNewTransaction(partition);
	}
  }

  @PostConstruct
  @Override
  public void startTimer() {
	super.startTimer();
  }

  @Override
  protected String readInterval() {
	return systemeinstellungen.getIntervallTransmitZup();
  }
}
