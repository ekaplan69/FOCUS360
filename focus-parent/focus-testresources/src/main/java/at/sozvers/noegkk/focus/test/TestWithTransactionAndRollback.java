package at.sozvers.noegkk.focus.test;

import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class TestWithTransactionAndRollback {

  @Inject
  protected EntityManager em;

  @AfterEach
  public void after() {
	rollbackTransaction();
  }

  private void rollbackTransaction() {
	em.getTransaction().rollback();
  }

  @BeforeEach
  public void before() {
	beginTransaction();
  }

  private void beginTransaction() {
	if(!em.getTransaction().isActive()) {
	  em.getTransaction().begin();
	}
  }
}
