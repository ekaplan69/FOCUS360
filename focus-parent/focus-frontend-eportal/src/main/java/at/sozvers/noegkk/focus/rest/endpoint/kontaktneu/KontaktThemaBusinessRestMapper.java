package at.sozvers.noegkk.focus.rest.endpoint.kontaktneu;

import at.sozvers.noegkk.focus.rest.api.kontaktneu.KontaktThemaDTO;
import at.sozvers.noegkk.focus.rest.mapping.BusinessRestMapper;
import at.sozvers.noegkk.focus.service.api.kontaktneu.KontaktThemaBTO;

public class KontaktThemaBusinessRestMapper extends BusinessRestMapper<KontaktThemaDTO, KontaktThemaBTO> {

  @Override
  public KontaktThemaDTO map(KontaktThemaBTO bto) {
	KontaktThemaDTO dto = new KontaktThemaDTO();

	dto.setThemaId(bto.getThemaId());
	dto.setThemaBezeichnung(bto.getThemaBezeichnung());
	dto.setThemaHilfetext(bto.getThemaHilfetext());
	dto.setGueltigBis(bto.getGueltigBis());
	dto.setGueltigVon(bto.getGueltigVon());

	return dto;
  }
}
