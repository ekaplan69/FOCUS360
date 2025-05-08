package at.sozvers.noegkk.focus;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;
import jakarta.enterprise.inject.se.SeContainer;
import jakarta.enterprise.inject.se.SeContainerInitializer;
import jakarta.inject.Inject;
import jakarta.inject.Qualifier;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestInstancePostProcessor;

import static java.util.Arrays.asList;

public class CdiExtension implements TestInstancePostProcessor {
  private static final SeContainer           CONTAINER    = SeContainerInitializer.newInstance().initialize();
  private static final Predicate<Annotation> IS_QUALIFIER = a -> a.annotationType().isAnnotationPresent(Qualifier.class);

  private List<Field> getFields(Class<?> clazzInstance) {
	List<Field> fields = new ArrayList<>();
	if(!clazzInstance.getSuperclass().equals(Object.class)) {
	  fields.addAll(getFields(clazzInstance.getSuperclass()));
	}

	fields.addAll(asList(clazzInstance.getDeclaredFields()));
	return fields;
  }

  @Override
  public void postProcessTestInstance(Object testInstance, ExtensionContext context) throws IllegalAccessException {
	for(Field field : getFields(testInstance.getClass())) {
	  if(field.getAnnotation(Inject.class) != null) {
		Annotation[] qualifiers = Stream.of(field.getAnnotations()).filter(IS_QUALIFIER).toArray(Annotation[]::new);
		Object       injected   = CONTAINER.select(field.getType(), qualifiers).get();
		field.setAccessible(true);
		field.set(testInstance, injected);
	  }
	}
  }
}


