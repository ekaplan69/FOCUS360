package at.sozvers.noegkk.focus.service.zpv.infrastructure;

@FunctionalInterface
public interface ThrowingFunction<I, O, E extends Exception> {

  O apply(I in) throws E;
}
