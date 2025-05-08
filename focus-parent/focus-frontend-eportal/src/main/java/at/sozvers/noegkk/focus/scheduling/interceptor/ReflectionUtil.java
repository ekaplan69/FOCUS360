package at.sozvers.noegkk.focus.scheduling.interceptor;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import jakarta.interceptor.InvocationContext;

public class ReflectionUtil<T> {

  @SuppressWarnings("unchecked")
  public T retrieveAnnotation(Class<T> clazz, InvocationContext invocationContext) {
	Method       method      = invocationContext.getMethod();
	Annotation[] annotations = method.getDeclaredAnnotations();

	for(Annotation annotation : annotations) {
	  if(annotation.annotationType().getCanonicalName().equals(clazz.getCanonicalName())) {
		return (T) annotation;
	  }
	}

	throw new IllegalArgumentException(String.format("Methode benoetigt mindestens eine Annotation der Klasse %s!", clazz.getCanonicalName()));
  }
}
