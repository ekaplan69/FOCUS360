package at.sozvers.noegkk.focus.interceptors;

import java.util.Collections;
import at.sozvers.noegkk.focus.rest.api.common.*;
import jakarta.inject.Inject;
import jakarta.interceptor.*;
import org.slf4j.Logger;

@ExceptionMeldungsMapper
@Interceptor
public class ExceptionMeldungsMapperInterceptor {

  @Inject
  private ExceptionRestMapper exceptionRestMapper;
  @Inject
  private Logger              logger;

  @AroundInvoke
  public Object aroundInvoke(InvocationContext context) throws Exception {

	Object   obj   = null;
	Class<?> clazz = context.getMethod().getReturnType();

	try {
	  obj = context.proceed();
	} catch(Exception exception) {
	  logger.error("Ein unerwarteter Fehler ist aufgetreten!", exception);

	  obj = clazz.getDeclaredConstructor().newInstance();

	  if(obj instanceof MetainformationBaseDTO) {
		MetainformationDTO meta = new MetainformationDTO();
		meta.setStatus("F");
		meta.setMeldungen(Collections.singletonList(exceptionRestMapper.map(exception)));

		((MetainformationBaseDTO) obj).setMetainformation(meta);
	  }

	  if(obj instanceof BaseResponseCollectionDTO) {
		MetainformationDTO meta = new MetainformationDTO();
		meta.setStatus("F");
		meta.setMeldungen(Collections.singletonList(exceptionRestMapper.map(exception)));

		((BaseResponseCollectionDTO) obj).setMetainformation(meta);
	  }
	}
	return obj;
  }
}
