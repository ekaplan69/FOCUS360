package at.sozvers.noegkk.focus.rest.endpoint.ecarddaten;

import at.sozvers.noegkk.focus.rest.api.ecard.ECarddatenDTO;
import at.sozvers.noegkk.focus.rest.mapping.BusinessRestMapper;
import at.sozvers.noegkk.focus.service.api.ecard.ECarddatenBTO;

public class ECardBusinessRestMapper extends BusinessRestMapper<ECarddatenDTO, ECarddatenBTO> {

  @Override
  public ECarddatenDTO map(ECarddatenBTO bto) {
	ECarddatenDTO dto = new ECarddatenDTO();

	dto.setAusstellungsDatum(bto.getAusstellungsDatum());
	dto.setLaufnummer(bto.getLaufnummer());
	dto.setLetzteKonsultation(bto.getLetzteKonsultation());
	dto.setEndeDatum(bto.getEndeDatum());

	return dto;
  }
}
