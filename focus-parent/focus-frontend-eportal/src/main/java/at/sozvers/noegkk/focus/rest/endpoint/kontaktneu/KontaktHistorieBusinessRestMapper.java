package at.sozvers.noegkk.focus.rest.endpoint.kontaktneu;

import at.sozvers.noegkk.focus.rest.api.kontaktneu.KontaktHistorieDTO;
import at.sozvers.noegkk.focus.rest.mapping.BusinessRestMapper;
import at.sozvers.noegkk.focus.service.api.kontaktneu.KontaktHistorieBTO;

public class KontaktHistorieBusinessRestMapper extends BusinessRestMapper<KontaktHistorieDTO, KontaktHistorieBTO> {

  @Override
  public KontaktHistorieDTO map(KontaktHistorieBTO bto) {
	KontaktHistorieDTO dto = new KontaktHistorieDTO();

	dto.setFachschluessel(bto.getFachschluessel());

	return dto;
  }
}
