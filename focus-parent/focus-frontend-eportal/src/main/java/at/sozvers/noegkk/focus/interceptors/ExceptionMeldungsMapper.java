package at.sozvers.noegkk.focus.interceptors;

import java.lang.annotation.*;
import jakarta.interceptor.InterceptorBinding;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;

@InterceptorBinding
@Target({METHOD, TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ExceptionMeldungsMapper {

}
