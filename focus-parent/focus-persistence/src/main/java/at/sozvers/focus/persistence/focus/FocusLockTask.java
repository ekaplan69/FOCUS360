package at.sozvers.focus.persistence.focus;

import java.io.Serializable;
import java.util.Date;
import at.sozvers.focus.scheduling.error.AcquireLockFailed;
import jakarta.persistence.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Entity
@Table(name="focus_lock_task")
public class FocusLockTask implements Serializable {
  private static final double MILLIS_IN_HOUR   = 3600 * 1000D;
  private static final Logger logger           = LoggerFactory.getLogger("at.sozvers.noegkk.svweber.QlTaskLock");
  private static final long   serialVersionUID = 1L;
  private              Date   erstellTs;
  private              String ersteller;
  private              String letztaend;
  private              Date   letztaendTs;
  private              String lockOwner;
  private              String lockTask;
  private              Long   updatecount;

  public FocusLockTask() {
	//Default Constructor
  }

  /**
   * Acquires the lock or throws an exception if its already held.
   * <p>
   * If the lock is acquired, the timestamp is returned. It will be needed for releasing the lock.
   *
   * @param breakLockAfterHours
   * 		break an existing lock after this timeout
   * @param owner
   * 		identifies the new holder
   *
   * @return update count for release of the lock
   *
   * @throws AcquireLockFailed
   */
  public long acquireLockOrFail(int breakLockAfterHours, String owner) throws AcquireLockFailed {
	if(pLocked() && !pLockBreakable(breakLockAfterHours)) {
	  throw new AcquireLockFailed(getLockOwner());
	}

	long releaseUpdateCount = getUpdatecount() + 1L;
	setLockOwner(owner);
	setLetztaendTs(new Date());
	setUpdatecount(releaseUpdateCount);

	return releaseUpdateCount;
  }

  /**
   * Is the row currently locked?
   * <p>
   * isLocked leads to error messages about not having a property setter. So we call it "p" locked for "predicate"
   *
   * @return lock status
   */
  private boolean pLocked() {
	return lockOwner != null;
  }

  private boolean pLockBreakable(int hours) {
	double elapsed = (System.currentTimeMillis() - getLetztaendTs().getTime()) / MILLIS_IN_HOUR;
	if(elapsed > hours) {
	  logger.warn(String.format("Breaking existing lock by %s after %.2f", getLockOwner(), elapsed));
	}
	return elapsed > hours;
  }

  @Column(name="lock_owner")
  public String getLockOwner() {
	return this.lockOwner;
  }

  public void setLockOwner(String lockOwner) {
	this.lockOwner = lockOwner;
  }

  public Long getUpdatecount() {
	return this.updatecount;
  }

  @Temporal(TemporalType.DATE)
  @Column(name="letztaend_ts")
  public Date getLetztaendTs() {
	return this.letztaendTs;
  }

  public void setLetztaendTs(Date letztaendTs) {
	this.letztaendTs = letztaendTs;
  }

  public void setUpdatecount(Long updatecount) {
	this.updatecount = updatecount;
  }

  @Temporal(TemporalType.DATE)
  @Column(name="erstell_ts")
  public Date getErstellTs() {
	return this.erstellTs;
  }

  public void setErstellTs(Date erstellTs) {
	this.erstellTs = erstellTs;
  }

  public String getErsteller() {
	return this.ersteller;
  }

  public void setErsteller(String ersteller) {
	this.ersteller = ersteller;
  }

  public String getLetztaend() {
	return this.letztaend;
  }

  public void setLetztaend(String letztaend) {
	this.letztaend = letztaend;
  }

  @Id
  @Column(name="lock_task")
  public String getLockTask() {
	return this.lockTask;
  }

  public void setLockTask(String lockTask) {
	this.lockTask = lockTask;
  }

  /**
   * Release the lock.
   * <p>
   * In the case we did not actually own the lock, false.  an error should be logged prominently!
   *
   * @param owner
   * 		lock owner, needs to match
   * @param releaseUpdateCount
   * 		update counts, needs to match
   *
   * @return the lock was successfully released.
   */
  public boolean releaseLock(String owner, long releaseUpdateCount) {
	Long rowUpdateCount = getUpdatecount();
	if(owner != null && owner.equals(getLockOwner()) && rowUpdateCount != null && rowUpdateCount.longValue() == releaseUpdateCount) {
	  setLockOwner(null);
	  return true;
	} else {
	  return false;
	}
  }
}
