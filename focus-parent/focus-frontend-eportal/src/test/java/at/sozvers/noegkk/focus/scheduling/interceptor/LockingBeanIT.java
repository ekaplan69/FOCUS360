package at.sozvers.noegkk.focus.scheduling.interceptor;

import at.sozvers.focus.persistence.focus.FocusLockTask;
import at.sozvers.focus.scheduling.error.AcquireLockFailed;
import at.sozvers.noegkk.focus.CdiExtension;
import at.sozvers.noegkk.focus.test.TestWithTransactionAndRollback;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(CdiExtension.class)
class LockingBeanIT extends TestWithTransactionAndRollback {

  @Inject
  private LockingBean lockingBean;

  @Test
  void testAcquireLogicalLockOrFail() throws AcquireLockFailed {
	Long updateCountBefore    = em.find(FocusLockTask.class, "TRANSMIT_ZUP").getUpdatecount();
	long updateCountAfterLock = lockingBean.acquireLogicalLockOrFail("TRANSMIT_ZUP");

	assertThat(updateCountAfterLock).isEqualTo(updateCountBefore + 1L);
  }

  @Test
  void testAcquireLogicalLockOrFailEmptyInput() {
	assertThrows(IllegalArgumentException.class, () -> lockingBean.acquireLogicalLockOrFail(null));
  }

  @Test
  void testReleaseLogicalLock() throws AcquireLockFailed {
	long updateCountBefore = em.find(FocusLockTask.class, "TRANSMIT_ZUP").getUpdatecount() + 1L;
	lockingBean.releaseLogicalLock("TRANSMIT_ZUP", updateCountBefore);
  }

  @Test
  void testReleaseLogicalLockEmptyInput() {
	assertThrows(IllegalArgumentException.class, () -> lockingBean.releaseLogicalLock("", 0L));
  }
}
