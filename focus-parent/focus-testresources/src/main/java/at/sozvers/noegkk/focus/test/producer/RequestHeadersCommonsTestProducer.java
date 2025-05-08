package at.sozvers.noegkk.focus.test.producer;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import at.itsv.berez.principal.BerezPrincipal;
import jakarta.annotation.Priority;
import jakarta.enterprise.context.Dependent;
import jakarta.enterprise.context.RequestScoped;
import jakarta.enterprise.inject.Alternative;
import jakarta.enterprise.inject.Produces;
import jakarta.inject.Inject;
import jakarta.interceptor.Interceptor;

@Alternative
@Priority(Interceptor.Priority.APPLICATION + 10)
@Dependent
public class RequestHeadersCommonsTestProducer {

  @Inject
  private BerezPrincipal berezPrincipal;

  @Produces
  @RequestScoped
  public at.itsv.noegkk.commons.RequestHeadersCommons berePrincipal() {
	return new RequestHeaderCommons(berezPrincipal.organisationseinheiten(), berezPrincipal.benutzername(), berezPrincipal.traeger().code(), berezPrincipal.traeger().code());
  }

  private static class RequestHeaderCommons implements at.itsv.noegkk.commons.RequestHeadersCommons {

	String                                   bearbeiterID;
	String                                   meldendeStelle;
	Set<BerezPrincipal.Organisationseinheit> organisationseinheitSet;
	String                                   traegerID;

	public RequestHeaderCommons(Stream<BerezPrincipal.Organisationseinheit> organisationseinheiten, String bearbeiterID, String meldendeStelle, String traegerID) {
	  this.organisationseinheitSet = organisationseinheiten.collect(Collectors.toSet());
	  this.bearbeiterID = bearbeiterID;
	  this.meldendeStelle = meldendeStelle;
	  this.traegerID = traegerID;
	}

	@Override
	public String getBearbeiterID() {
	  return bearbeiterID != null ? bearbeiterID : "12FOCUS";
	}

	@Override
	public String getMeldendeStelle() {
	  return meldendeStelle != null ? meldendeStelle : "12";
	}

	@Override
	public String getOrgeinheitId() {
	  Optional<at.itsv.berez.principal.BerezPrincipal.Organisationseinheit> obp                  = organisationseinheitSet.stream().findFirst();
	  BerezPrincipal.Organisationseinheit                                   organisationseinheit = new TestBerezPrincipal.OrganisationseinheitTest();
	  if(obp.isPresent()) {
		organisationseinheit = obp.get();
	  }
	  return organisationseinheit.name();
	}

	@Override
	public String getTraegerID() {
	  return traegerID != null ? traegerID : "12";
	}

	@Override
	public String getTransactionUUID() {
	  return UUID.randomUUID().toString();
	}
  }
}
