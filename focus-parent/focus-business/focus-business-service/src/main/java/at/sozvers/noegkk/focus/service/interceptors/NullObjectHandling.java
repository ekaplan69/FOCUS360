package at.sozvers.noegkk.focus.service.interceptors;

import java.lang.annotation.*;
import jakarta.interceptor.InterceptorBinding;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;

@Inherited
@InterceptorBinding
@Target({METHOD, TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface NullObjectHandling {}
