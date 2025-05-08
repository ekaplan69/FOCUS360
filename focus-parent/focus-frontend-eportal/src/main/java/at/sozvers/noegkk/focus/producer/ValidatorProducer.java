package at.sozvers.noegkk.focus.producer;

import jakarta.enterprise.inject.Produces;
import jakarta.validation.*;

public class ValidatorProducer {
  @Produces
  public Validator produceValidator(ValidatorFactory validatorFactory) {
	return validatorFactory.getValidator();
  }

  @Produces
  public ValidatorFactory produceValidatorFactory() {
	return Validation.buildDefaultValidatorFactory();
  }
}
