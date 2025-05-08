package at.sozvers.noegkk.focus.service.kva.kvkerm;

import javax.xml.datatype.DatatypeConfigurationException;
import at.itsv.noegkk.commons.RequestHeadersCommons;
import at.sozvers.kva.schema.ermittle_krankenversicherungsanspruch.*;
import at.sozvers.noegkk.focus.service.api.kva.kvkerm.KvkermBTO;
import at.sozvers.noegkk.focus.service.common.SubsystemNotAvailableException;
import at.sozvers.noegkk.focus.ws.client.kva.kvkerm.*;
import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class KvkermService {

  @Inject
  @KVAKvkermService
  private KvaKvkermClient       kvaKvkermClient;
  @Inject
  private KvkermRequestFactory  kvkermRequestFactory;
  @Inject
  private RequestHeadersCommons requestHeadersCommons;

  public KvkermBTO ermittleKrankenanspruch(String vsnr) throws DatatypeConfigurationException {
	KrankenversicherungsanspruchErmittlung  request = kvkermRequestFactory.createKvkermRequest(vsnr);
	ErmittelterKrankenversicherungsanspruch response;
	try {
	  response = kvaKvkermClient.ermittleKrankenanspruch_2_0(request, requestHeadersCommons);
	} catch(Exception e) {
	  throw new SubsystemNotAvailableException(e);
	}

	KvkermBTO bto = new KvkermBTO();
	bto.setAnspruch("N");
	for(Krankenversicherungsanspruch dto : response.getKva()) {
	  if(dto.getKvTraegerKurz().equals("ÖGK")) {
		bto.setAnspruch("J");
		if(dto.getErstellungsphaseBezeichnung().contains("Schutzfrist")) {
		  bto.setSchutzfrist(dto.getErstellungsphaseBezeichnung());
		}
		if(dto.getErstellungsphaseBezeichnung().contains("Toleranzfrist")) {
		  bto.setToleranzfrist(dto.getErstellungsphaseBezeichnung());
		}
	  }
	}
	return bto;
  }
}
