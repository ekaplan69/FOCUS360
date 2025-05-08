package at.sozvers.noegkk.focus.scheduling.interceptor;

import java.lang.annotation.*;
import jakarta.enterprise.util.Nonbinding;
import jakarta.interceptor.InterceptorBinding;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Inherited
@InterceptorBinding
@Retention(RUNTIME)
@Target({TYPE, METHOD})
public @interface Locking {
  @Nonbinding String taskName() default "";
}
