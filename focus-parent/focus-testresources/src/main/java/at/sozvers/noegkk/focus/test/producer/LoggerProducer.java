package at.sozvers.noegkk.focus.test.producer;

import jakarta.annotation.Priority;
import jakarta.enterprise.inject.Alternative;
import jakarta.enterprise.inject.Produces;
import jakarta.enterprise.inject.spi.InjectionPoint;
import jakarta.interceptor.Interceptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Alternative
@Priority(Interceptor.Priority.APPLICATION + 10) // https://docs.oracle.com/javaee/7/tutorial/cdi-adv002.htm
public class LoggerProducer {
  @Produces
  public Logger produceLog(InjectionPoint injectionPoint) {
	return LoggerFactory.getLogger(injectionPoint.getMember().getDeclaringClass().getName());
  }
}
