package at.sozvers.noegkk.focus.rest.endpoint.beschwerde.mapper;

import at.sozvers.noegkk.focus.rest.api.beschwerde.BeschwerdeDetailDTO;
import at.sozvers.noegkk.focus.rest.mapping.BusinessRestMapper;
import at.sozvers.noegkk.focus.service.api.beschwerde.BeschwerdeDetailBTO;

public class BeschwerdeDetailBusinessRestMapper extends BusinessRestMapper<BeschwerdeDetailDTO, BeschwerdeDetailBTO> {

  @Override
  public BeschwerdeDetailDTO map(BeschwerdeDetailBTO bto) {
	BeschwerdeDetailDTO dto = new BeschwerdeDetailDTO();

	dto.setBeschreibung(bto.getBeschreibung());
	dto.setBeschwerdegruendeIds(bto.getBeschwerdegruendeIds());
	dto.setBeschwerdegrundAnmerkung(bto.getBeschwerdegrundAnmerkung());
	dto.setEmail(bto.getEmail());
	dto.setFachbereichDetailId(bto.getFachbereichDetailId());
	dto.setKanalId(bto.getKanalId());
	dto.setKontaktpunktId(bto.getKontaktpunktId());
	dto.setMassnahmen(bto.getMassnahmen());
	dto.setMeldendeStelleId(bto.getMeldendeStelleId());
	dto.setMitarbeitername(bto.getMitarbeitername());
	dto.setStatusId(bto.getStatusId());
	dto.setTelefon(bto.getTelefon());
	dto.setUpdatecount(bto.getUpdatecount());
	dto.setZeitpunkt(bto.getZeitpunkt());
	dto.setStorno(bto.getStorno());

	return dto;
  }
}
