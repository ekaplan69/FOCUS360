package at.sozvers.noegkk.focus.testresources.testdb;

import java.lang.reflect.Method;
import org.junit.jupiter.api.extension.*;

public class DbTestDataExtension implements ParameterResolver, BeforeEachCallback, TestInstancePostProcessor {

  //Making this static isn't exactly a clean solution, but I could not figure out how to do it with a non-static variable
  public static DbTestData annotation;

  @Override
  public void beforeEach(ExtensionContext context) {
	// Check for annotation on the test method
	Method testMethod = context.getRequiredTestMethod();
	annotation = testMethod.getAnnotation(DbTestData.class);

	// If the annotation is not found on the method, check the class level
	if(annotation == null) {
	  Class<?> testClass = context.getRequiredTestClass();
	  annotation = testClass.getAnnotation(DbTestData.class);
	}
  }

  public DbTestData getAnnotation() {
	return annotation;
  }

  @Override
  public void postProcessTestInstance(Object testInstance, ExtensionContext context) throws Exception {
	// You can perform additional actions if needed, for example, inject the annotation into the test instance
  }

  @Override
  public boolean supportsParameter(ParameterContext parameterContext, ExtensionContext extensionContext) {
	return parameterContext.getParameter().getType() == DbTestDataExtension.class;
  }

  @Override
  public Object resolveParameter(ParameterContext parameterContext, ExtensionContext extensionContext) {
	return new DbTestDataExtension(); // Adjust instantiation logic as needed
  }
}
