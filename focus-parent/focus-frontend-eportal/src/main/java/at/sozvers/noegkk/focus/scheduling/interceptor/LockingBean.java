package at.sozvers.noegkk.focus.scheduling.interceptor;

import java.lang.management.ManagementFactory;
import java.util.HashMap;
import java.util.Map;
import at.sozvers.focus.persistence.focus.FocusLockTask;
import at.sozvers.focus.scheduling.error.AcquireLockFailed;
import at.sozvers.noegkk.focus.service.api.systemeinstellungen.Systemeinstellungen;
import jakarta.ejb.*;
import jakarta.inject.Inject;
import jakarta.persistence.*;
import org.slf4j.Logger;

@Stateless
public class LockingBean {
  @Inject
  private EntityManager       em;
  @Inject
  private Logger              logger;
  @Inject
  private Systemeinstellungen systemeinstellungen;

  @TransactionAttribute(value=TransactionAttributeType.REQUIRES_NEW)
  public long acquireLogicalLockOrFail(String taskname) throws AcquireLockFailed {
	FocusLockTask lock = acquireRowLock(taskname, "LOCK");
	if(lock == null) {
	  throw new IllegalArgumentException("Can not acquire lock - no such task: " + taskname);
	}
	try {
	  int breakAfter = systemeinstellungen.getScheduleSecurityIntervall();
	  logger.debug("acquiring lock on " + taskname);
	  return lock.acquireLockOrFail(breakAfter, ownerIdentification());
	} finally {
	  // the persist and/or the end of the transaction will release the row lock
	  // no exception handling in the finally - an error here SHOULD prevent
	  // the jobs from being run
	  em.persist(lock);
	}
  }

  // the row lock is only valid during the current transaction!
  private FocusLockTask acquireRowLock(String taskname, String mode) throws AcquireLockFailed {
	try {
	  Map<String, Object> properties = new HashMap<>();
	  properties.put("javax.persistence.lock.timeout", "5");
	  return em.find(FocusLockTask.class, taskname, LockModeType.PESSIMISTIC_WRITE, properties);
	} catch(LockTimeoutException e) {
	  throw new AcquireLockFailed("Error acquiring row lock for " + taskname + " mode: " + mode, e);
	}
  }

  /**
   * Hostname/Process ID for storage in lock table
   *
   * @return 12345@hostname
   */
  private String ownerIdentification() {
	return ManagementFactory.getRuntimeMXBean().getName();
  }

  @TransactionAttribute(value=TransactionAttributeType.REQUIRES_NEW)
  public void releaseLogicalLock(String taskname, long releaseUpdateCount) throws AcquireLockFailed {
	FocusLockTask lock = acquireRowLock(taskname, "RELEASE");
	if(lock == null) {
	  throw new IllegalArgumentException("Can not acquire lock - no such task: " + taskname);
	}
	logger.debug("releasing lock on " + taskname);

	String  myid     = ownerIdentification();
	boolean released = lock.releaseLock(myid, releaseUpdateCount);
	if(!released) {
	  logger.error("releaseLogicalLock: could not release lock, someone else owned it: " + "Owner:" + lock.getLockOwner() + "/" + lock.getUpdatecount() + "  i am: " + myid + "/" + releaseUpdateCount);
	}

	try {
	  // the persist and/or the end of the transaction will release the row lock
	  em.persist(lock);
	} catch(Exception e) {
	  logger.error("Exception trying to persist lock state", e);
	}
  }
}
