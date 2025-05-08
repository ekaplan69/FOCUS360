package at.sozvers.focus.persistence;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.RequestScoped;
import jakarta.enterprise.inject.Produces;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@ApplicationScoped
public class EntityManagerProducer {
  @PersistenceContext(unitName="focusPU")
  private EntityManager entityManager;

  @Produces
  @RequestScoped
  private EntityManager produceEm() {
	return entityManager;
  }
}
