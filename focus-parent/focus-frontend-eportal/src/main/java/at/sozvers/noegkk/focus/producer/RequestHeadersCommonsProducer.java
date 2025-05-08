package at.sozvers.noegkk.focus.producer;

import at.itsv.berez.principal.BerezPrincipal;
import jakarta.enterprise.context.Dependent;
import jakarta.enterprise.context.RequestScoped;
import jakarta.enterprise.inject.Produces;
import jakarta.enterprise.inject.Vetoed;
import jakarta.inject.Inject;
import jakarta.servlet.http.HttpServletRequest;

@Dependent
public class RequestHeadersCommonsProducer {

  @Inject
  BerezPrincipal berezPrincipal;

  @Produces
  @RequestScoped
  public at.itsv.noegkk.commons.RequestHeadersCommons berePrincipal(HttpServletRequest request) {

	String orgeinheitId    = request.getHeader("X-ORGEINHEITID");
	String transactionUUID = request.getHeader("X-TRANSACTIONUUID");

	if(orgeinheitId == null || transactionUUID == null) {
	  throw new IllegalArgumentException("Headers X-ORGEINHEITID, X-TRANSACTIONUUID must be set.");
	}

	return RequestHeadersCommons.of(berezPrincipal.benutzername(), berezPrincipal.traeger().code(), berezPrincipal.traeger().code(), orgeinheitId, transactionUUID);
  }

  @Vetoed
  public static class RequestHeadersCommons implements at.itsv.noegkk.commons.RequestHeadersCommons {

	private String bearbeiterID;
	private String meldendeStelle;
	private String orgeinheitId;
	private String traegerID;
	private String transactionUUID;

	private RequestHeadersCommons() {
	}

	private RequestHeadersCommons(String bearbeiterID, String meldendeStelle, String traegerID, String orgeinheitId, String transactionUUID) {
	  this.bearbeiterID = bearbeiterID;
	  this.meldendeStelle = meldendeStelle;
	  this.traegerID = traegerID;
	  this.orgeinheitId = orgeinheitId;
	  this.transactionUUID = transactionUUID;
	}

	public static RequestHeadersCommons of(String bearbeiterID, String meldendeStelle, String traegerID, String orgeinheitId, String transactionUUID) {
	  return new RequestHeadersCommons(bearbeiterID, meldendeStelle, traegerID, orgeinheitId, transactionUUID);
	}

	@Override
	public String getBearbeiterID() {
	  return bearbeiterID;
	}

	@Override
	public String getMeldendeStelle() {
	  return meldendeStelle;
	}

	@Override
	public String getOrgeinheitId() {
	  return orgeinheitId;
	}

	@Override
	public String getTraegerID() {
	  return traegerID;
	}

	@Override
	public String getTransactionUUID() {
	  return transactionUUID;
	}
  }
}
