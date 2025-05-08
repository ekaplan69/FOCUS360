package at.sozvers.noegkk.focus.service.ecmawf;

import java.util.ArrayList;
import java.util.List;
import at.itsv.noegkk.commons.RequestHeadersCommons;
import at.sozvers.focus.ws.client.*;
import at.sozvers.focus.ws.client.factory.SucheingabeRequestFactory;
import at.sozvers.focus.ws.generated.*;
import at.sozvers.noegkk.focus.service.api.ecmawf.DokumentBTO;
import at.sozvers.noegkk.focus.service.api.zpv.person.ClkTokenBTO;
import at.sozvers.noegkk.focus.service.common.NotAuthorizedException;
import at.sozvers.noegkk.focus.service.common.SubsystemNotAvailableException;
import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;
import jakarta.ws.rs.core.Response;

@Dependent
public class DokumenteService {
  @Inject
  private DokumentAnzeigenRestClient       dokumentAnzeigenRestClient;
  @Inject
  private DokumentBTOExternalServiceMapper dokumentBTOExternalServiceMapper;
  @Inject
  private DokumentSuchenRestClient         dokumentSuchenRestClient;
  @Inject
  private RequestHeadersCommons            requestHeadersCommons;
  @Inject
  private SucheingabeRequestFactory        sucheingabeRequestFactory;

  public List<DokumentBTO> searchDokumenteByPartnerId(String partnerId) {
	List<Sucheingabe> sucheingabeList = sucheingabeRequestFactory.allRequestsAsList(Long.parseLong(partnerId));
	List<DokumentTyp> dokumentTypList = getDokumentTypList(sucheingabeList);

	return dokumentBTOExternalServiceMapper.mapToBtoList(dokumentTypList);
  }

  private List<DokumentTyp> getDokumentTypList(List<Sucheingabe> sucheingabeList) {
	List<DokumentTyp> dokumentTypList = new ArrayList<>();
	for(Sucheingabe sucheingabe : sucheingabeList) {
	  sucheingabe.getSuchbegriffe().getPartnerSuchkriterien().getFeld().get(0).getOr().getEqualsOrNotEquals().remove(1);
	  try(Response response = dokumentSuchenRestClient.dokumentSuchen(sucheingabe, new ECMAWFHeader(requestHeadersCommons))) {
		if(response.getStatus() == 200) {
		  Suchergebnis suchergebnis = response.readEntity(Suchergebnis.class);
		  dokumentTypList.addAll(suchergebnis.getDokumente().getDokument());
		} else {
		  Meldungen     meldungen      = response.readEntity(Meldungen.class);
		  StringBuilder meldungsstring = new StringBuilder();
		  for(Meldung meldung : meldungen.getMeldung()) {
			meldungsstring.append(meldung.getCode()).append(" - ").append(meldung.getText());
		  }
		  if(meldungsstring.toString().startsWith("AWF0003")) {
			throw new NotAuthorizedException(meldungsstring.toString());
		  } else {
			throw new SubsystemNotAvailableException(new Exception("Fehler beim Lesen der Dokumente über ECM-AWF: " + meldungsstring));
		  }
		}
	  }
	}
	return dokumentTypList;
  }

  public ClkTokenBTO showDokumentByDokumentId(String dokumentId) {
	try(Response response = dokumentAnzeigenRestClient.dokumentAnzeigen(dokumentId, new ECMAWFHeader(requestHeadersCommons))) {
	  if(response.getStatus() == 200) {
		ClkTokenBTO bto       = new ClkTokenBTO();
		Meldungen   meldungen = response.readEntity(Meldungen.class);
		bto.setClkToken(meldungen.getMeldung().get(0).getParameter().get(0).getValue());
		return bto;
	  } else {
		Meldungen     meldungen      = response.readEntity(Meldungen.class);
		StringBuilder meldungsstring = new StringBuilder();
		for(Meldung meldung : meldungen.getMeldung()) {
		  meldungsstring.append(meldung.getCode()).append(";").append(meldung.getText()).append(";");
		}
		throw new SubsystemNotAvailableException(new Exception("Fehler beim Anzeigen des Dokuments " + dokumentId + " über ECM-AWF: " + meldungsstring));
	  }
	}
  }
}
