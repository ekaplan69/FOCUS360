package at.sozvers.noegkk.focus.scheduling.interceptor;

import java.io.Serializable;
import java.util.Random;
import at.sozvers.focus.scheduling.error.AcquireLockFailed;
import jakarta.inject.Inject;
import jakarta.interceptor.*;
import org.slf4j.Logger;

@Locking
@Interceptor
public class LockingInterceptor implements Serializable {

  private static final int         MAX_RELEASE_LOCK_SLEEP = 2000;
  private static final int         MAX_RELEASE_LOCK_TRIES = 3;
  private static final long        serialVersionUID       = 1L;
  @Inject
  private              LockingBean lockingBean;
  @Inject
  private              Logger      logger;
  private              Random      rand                   = new Random();

  @AroundTimeout
  @AroundInvoke
  public Object invoke(InvocationContext invocationContext) {
	String taskname = "unknown";

	try {
	  ReflectionUtil<Locking> reflectionUtil = new ReflectionUtil<>();
	  Locking                 lockable       = reflectionUtil.retrieveAnnotation(Locking.class, invocationContext);
	  taskname = lockable.taskName();

	  logger.info("Trying to aquire lock for " + taskname);
	  long releaseUpdateCount = lockingBean.acquireLogicalLockOrFail(taskname);
	  logger.info("Lock acquired for " + taskname + "! Let's proceed!");

	  return returnProceed(invocationContext, taskname, lockable, releaseUpdateCount);
	} catch(jakarta.persistence.LockTimeoutException e) {
	  logger.error("LockTimeoutException sollte nicht vorkommen!  LockFehler ist jetzt AcquireLockFailed");
	} catch(AcquireLockFailed e) {
	  logger.info("EAP too slow for " + taskname + " ... maybe the next time!");
	  String owner = e.getOwner();
	  if(owner != null) {
		logger.info("Reason: the lock for " + taskname + " is already owned by " + owner);
	  } else {
		logger.info("Reason: " + e);
	  }
	} catch(Exception e) {
	  // letting exceptions be thrown from here will cause our scheduled job to be run
	  // again immediately
	  logger.error("Unhandled general error while trying to process " + taskname, e);
	}

	return null;
  }

  private Object returnProceed(InvocationContext invocationContext, String taskname, Locking lockable, long releaseUpdateCount) {
	try {
	  return invocationContext.proceed();
	} catch(Exception ex) {
	  logger.error("Error beim Proceed im LockInterceptor for " + taskname + "!", ex);
	  return null;
	} finally {
	  logger.info("Releasing lock for " + taskname);
	  repeatedlyTryToReleaseLock(lockable, releaseUpdateCount);
	}
  }

  private void repeatedlyTryToReleaseLock(Locking lockable, long releaseUpdateCount) {
	for(int i = 0; i < MAX_RELEASE_LOCK_TRIES; i++) {
	  try {
		lockingBean.releaseLogicalLock(lockable.taskName(), releaseUpdateCount);
		break;
	  } catch(AcquireLockFailed lf) {
		if(i < MAX_RELEASE_LOCK_TRIES - 1) {
		  logger.warn("Releasing lock failed with error: " + lf);
		  try {
			int millis = rand.nextInt(MAX_RELEASE_LOCK_SLEEP);
			logger.info("Retrying after " + millis + " ms");
			Thread.sleep(millis);
		  } catch(InterruptedException ie) {
			// ignore interruptions
		  }
		} else {
		  logger.warn("Could not release lock in " + MAX_RELEASE_LOCK_TRIES + " tries, giving up");
		}
	  }
	}
  }
}
