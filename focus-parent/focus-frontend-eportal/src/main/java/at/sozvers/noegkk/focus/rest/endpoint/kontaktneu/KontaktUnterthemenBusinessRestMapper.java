package at.sozvers.noegkk.focus.rest.endpoint.kontaktneu;

import at.sozvers.noegkk.focus.rest.api.kontaktneu.KontaktUnterthemaDTO;
import at.sozvers.noegkk.focus.rest.mapping.BusinessRestMapper;
import at.sozvers.noegkk.focus.service.api.kontaktneu.KontaktUnterthemaBTO;

public class KontaktUnterthemenBusinessRestMapper extends BusinessRestMapper<KontaktUnterthemaDTO, KontaktUnterthemaBTO> {

  @Override
  public KontaktUnterthemaDTO map(KontaktUnterthemaBTO bto) {
	KontaktUnterthemaDTO dto = new KontaktUnterthemaDTO();

	dto.setUnterthemaId(bto.getUnterthemaId());
	dto.setUnterthemaBezeichnung(bto.getUnterthemaBezeichnung());

	return dto;
  }
}
