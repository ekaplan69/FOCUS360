package at.sozvers.noegkk.focus;

import jakarta.annotation.Priority;
import jakarta.enterprise.context.Dependent;
import jakarta.enterprise.context.RequestScoped;
import jakarta.enterprise.inject.Produces;
import jakarta.interceptor.Interceptor;
import jakarta.servlet.http.HttpServletRequest;

@Priority(Interceptor.Priority.APPLICATION + 10) // https://docs.oracle.com/javaee/7/tutorial/cdi-adv002.htm
@Dependent
public class HttpServletRequestProducer {

  private HttpServletRequestProducer() {
	//Private Constructor
  }

  @Produces
  @RequestScoped
  public HttpServletRequest produceHttpServletRequest() {
	return new FallbackHttpServletRequest();
  }
}