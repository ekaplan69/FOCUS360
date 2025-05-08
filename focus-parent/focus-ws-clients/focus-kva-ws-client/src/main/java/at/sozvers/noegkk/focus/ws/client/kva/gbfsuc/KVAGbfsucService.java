package at.sozvers.noegkk.focus.ws.client.kva.gbfsuc;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import jakarta.inject.Qualifier;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Qualifier
@Target({METHOD, FIELD})
@Retention(RUNTIME)
public @interface KVAGbfsucService {}
