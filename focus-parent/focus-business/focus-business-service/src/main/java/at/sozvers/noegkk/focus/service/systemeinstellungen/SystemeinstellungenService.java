package at.sozvers.noegkk.focus.service.systemeinstellungen;

import at.sozvers.focus.persistence.focus.FocusSystem;
import at.sozvers.noegkk.focus.service.api.systemeinstellungen.Systemeinstellungen;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;

public class SystemeinstellungenService implements Systemeinstellungen {

  @Inject
  private EntityManager em;
  @Inject
  private Logger        log;

  @Override
  public String getIntervallTransmitZup() {
	String intervallTransmitZup = getWertToParameterFromFocusSystem(SystemeinstellungenParameterEnum.INTERVALL_TRANSMIT_ZUP.name());

	if(StringUtils.isNotEmpty(intervallTransmitZup)) {
	  return intervallTransmitZup;
	} else {
	  loggingStandardValue(SystemeinstellungenParameterEnum.INTERVALL_TRANSMIT_ZUP);
	  return SystemeinstellungenParameterEnum.INTERVALL_TRANSMIT_ZUP.getStandard();
	}
  }

  @Override
  public int getPackagesizeTransmitZup() {
	try {
	  return Integer.parseInt(getWertToParameterFromFocusSystem(SystemeinstellungenParameterEnum.PACKAGESIZE_TRANSMIT_ZUP.name()));
	} catch(NumberFormatException e) {
	  loggingStandardValue(SystemeinstellungenParameterEnum.PACKAGESIZE_TRANSMIT_ZUP);
	  return Integer.parseInt(SystemeinstellungenParameterEnum.PACKAGESIZE_TRANSMIT_ZUP.getStandard());
	}
  }

  @Override
  public int getScheduleSecurityIntervall() {
	try {
	  return Integer.parseInt(getWertToParameterFromFocusSystem(SystemeinstellungenParameterEnum.SCHEDULE_SECURITY_INTERVALL.name()));
	} catch(NumberFormatException e) {
	  loggingStandardValue(SystemeinstellungenParameterEnum.SCHEDULE_SECURITY_INTERVALL);
	  return Integer.parseInt(SystemeinstellungenParameterEnum.SCHEDULE_SECURITY_INTERVALL.getStandard());
	}
  }

  protected String getWertToParameterFromFocusSystem(String param) {
	FocusSystem focusSystem = em.find(FocusSystem.class, param);
	return focusSystem != null ? focusSystem.getWert() : null;
  }

  private void loggingStandardValue(SystemeinstellungenParameterEnum systemeinstellungenEnum) {
	log.warn("False Value for " + systemeinstellungenEnum.name() + " in table FOCUS_SYSTEM, can not parse! Set standard Value: " + systemeinstellungenEnum.getStandard());
  }
}
