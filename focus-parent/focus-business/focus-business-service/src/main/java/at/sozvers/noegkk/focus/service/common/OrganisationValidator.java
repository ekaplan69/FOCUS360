package at.sozvers.noegkk.focus.service.common;

import jakarta.enterprise.context.Dependent;

@Dependent
public class OrganisationValidator implements Validator<Organisation> {

  @Override
  public void validate(Organisation organisation) {
	if(organisation.getOeId() == null && organisation.getBereOrg() == null) {
	  throw new ValidationException("oeId oder bereOrg muss gesetzt sein.");
	}
	if(organisation.getOeId() != null && organisation.getBereOrg() != null) {
	  throw new ValidationException("oeId und bereOrg duerfen nicht beide gesetzt sein.");
	}
  }
}
