package at.sozvers.service.lgkk.infrastructure;

import java.lang.annotation.*;
import jakarta.inject.Qualifier;

@Qualifier
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface LgkkService {}
