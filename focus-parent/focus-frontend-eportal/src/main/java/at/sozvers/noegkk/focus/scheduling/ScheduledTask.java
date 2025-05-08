package at.sozvers.noegkk.focus.scheduling;

import jakarta.annotation.Resource;
import jakarta.ejb.*;
import jakarta.inject.Inject;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;

public abstract class ScheduledTask {

  protected static final String LOG_DELIMITER = "################################################################################";

  @Inject
  protected Logger       log;
  @Resource
  private   TimerService timerService;

  public void scheduler(Timer timer) {
	log.info(LOG_DELIMITER);
	log.info(getLogPrefix() + "EJB Timer startet " + timer.getInfo());

	try {
	  doWork();
	} catch(Exception e) {
	  log.error(getLogPrefix() + "error and rollback: ", e);
	  log.info(LOG_DELIMITER);
	} finally {
	  timer.cancel();
	  startTimer();
	}
	log.info(getLogPrefix() + "EJB Timer beendet ");
	log.info(LOG_DELIMITER);
  }

  /**
   * Ermittlung des Log-Prefix eg: TRANSMIT_ZUP
   *
   * @return Log-Prefix
   */
  protected abstract String getLogPrefix();

  /**
   * Implementierung der fachlichen Logik des jeweiligen Scheduled Task
   *
   * @param schedulerParams
   */
  protected abstract void doWork();

  /**
   * Der verwendete Timer löst zu einem speziellen Zeitpunkt aus: eg: se.dayOfWeek("1-5").hour("6/1"); dayOfWeek("1-5") ... Mo - Fr hour("6/1") ........ x/y : beginnend um x Uhr alle y Stunden
   * minute("*\/1") ..... zu jeder vollen Minute ( ohne \ )
   * <p>
   * Methode muss in der abgeleiteten Klasse aufgerufen werden (@PostConstruct)
   */
  public void startTimer() {
	ScheduleExpression se            = new ScheduleExpression();
	String             timerInterval = readInterval();
	if(StringUtils.isEmpty(timerInterval)) {
	  return;
	}
	String[] splittedInterval = timerInterval.split(";");
	if(splittedInterval.length > 0 && StringUtils.isNotBlank(splittedInterval[0])) {
	  se.dayOfWeek(splittedInterval[0]);
	}
	if(splittedInterval.length > 1 && StringUtils.isNotBlank(splittedInterval[1])) {
	  se.hour(splittedInterval[1]);
	}
	if(splittedInterval.length > 2 && StringUtils.isNotBlank(splittedInterval[2])) {
	  se.minute(splittedInterval[2]);
	}
	if(splittedInterval.length > 3 && StringUtils.isNotBlank(splittedInterval[3])) {
	  se.second(splittedInterval[3]);
	}
	log.info(getLogPrefix() + "start timer! Interval:" + timerInterval);
	timerService.createCalendarTimer(se, new TimerConfig(getLogPrefix(), false));
  }

  /**
   * Ermittlung des Intervallstring aus der Tabelle FOCUS_LOCK_TABLE
   *
   * @return Intervallstring mit ; Delimiter
   */
  protected abstract String readInterval();
}
