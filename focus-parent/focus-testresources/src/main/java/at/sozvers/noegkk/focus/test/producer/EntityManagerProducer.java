package at.sozvers.noegkk.focus.test.producer;

import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Alternative;
import jakarta.enterprise.inject.Produces;
import jakarta.interceptor.Interceptor;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;

@Alternative
@Priority(Interceptor.Priority.APPLICATION + 10) // https://docs.oracle.com/javaee/7/tutorial/cdi-adv002.htm
public class EntityManagerProducer {

  @Produces
  @ApplicationScoped
  private EntityManager produceEm() {
	return Persistence.createEntityManagerFactory("focusTestPU").createEntityManager();
  }
}
