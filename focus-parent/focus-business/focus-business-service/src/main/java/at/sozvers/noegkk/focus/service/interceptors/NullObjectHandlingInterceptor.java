package at.sozvers.noegkk.focus.service.interceptors;

import jakarta.annotation.Priority;
import jakarta.inject.Inject;
import jakarta.interceptor.*;
import org.slf4j.Logger;

@Interceptor
@NullObjectHandling
@Priority(Interceptor.Priority.LIBRARY_BEFORE + 100)
public class NullObjectHandlingInterceptor {

  @Inject
  private Logger logger;

  @AroundInvoke
  public Object validateMethodInvocation(InvocationContext ctx) throws Exception {
	logger.debug("Check if Mapper input is null.");
	if(isTranslatorMethod(ctx) && nullInputIndex(ctx) >= 0) {
	  return null;
	}
	// if no NULL value was passed, proceed with translator call
	return ctx.proceed();
  }

  private boolean isTranslatorMethod(InvocationContext context) {
	// @formatter:off
        return (context.getMethod().getName().equals("map")
                && context.getParameters().length >= 1);
        // @formatter:on
  }

  private int nullInputIndex(InvocationContext context) {
	if(context.getParameters().length >= 1 && context.getParameters()[0] == null) {
	  return 0;
	}
	return -1;
  }
}
