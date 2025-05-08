package at.sozvers.noegkk.focus.service.ecard.ecarddaten;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import at.siemens.ecard.server.onlineservices.valueobject.ECardAuskunftV2Resp;
import at.siemens.ecard.server.onlineservices.valueobject.ECardV2;
import at.sozvers.noegkk.focus.service.api.ecard.ECarddatenBTO;
import at.sozvers.noegkk.focus.service.mapping.BTOExternalServiceMapper;
import jakarta.enterprise.context.Dependent;

@Dependent
public class ECarddatenBTOExternalServiceMapper extends BTOExternalServiceMapper<ECarddatenBTO, ECardAuskunftV2Resp> {

  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyy");

  @Override
  public ECarddatenBTO map(ECardAuskunftV2Resp response) {
	ECarddatenBTO bto = new ECarddatenBTO();
	ECardV2       eCard;

	try {
	  eCard = getEcard(response);
	  if(eCard == null) {
		return bto;
	  }
	} catch(NullPointerException e) {
	  return bto;
	}

	String versendeDatum = eCard.getVersendeDatum() != null ? eCard.getVersendeDatum() : null;
	bto.setAusstellungsDatum(versendeDatum != null ? LocalDate.parse(eCard.getVersendeDatum(), formatter) : null);
	bto.setLaufnummer(eCard.getECard());
	String endeDatum = eCard.getEkvkBisDatum() != null ? eCard.getEkvkBisDatum() : null;
	bto.setEndeDatum(endeDatum != null ? LocalDate.parse(endeDatum, formatter) : null);
	return bto;
  }

  private ECardV2 getEcard(ECardAuskunftV2Resp response) {
	if(response.getECards() != null && response.getAnzahl() > 0) {
	  for(ECardV2 eCardV2 : response.getECards()) {
		if(eCardV2.getVersendeDatum() != null) {
		  return eCardV2;
		}
	  }
	  return response.getECards().get(0);
	}
	return null;
  }
}
