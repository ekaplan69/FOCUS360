package at.sozvers.noegkk.focus.rest.endpoint.kontaktneu;

import at.sozvers.noegkk.focus.rest.api.kontaktneu.KontaktAbschlussartDTO;
import at.sozvers.noegkk.focus.rest.mapping.BusinessRestMapper;
import at.sozvers.noegkk.focus.service.api.kontaktneu.KontaktAbschlussartBTO;

public class KontaktAbschlussartBusinessRestMapper extends BusinessRestMapper<KontaktAbschlussartDTO, KontaktAbschlussartBTO> {

  @Override
  public KontaktAbschlussartDTO map(KontaktAbschlussartBTO bto) {
	KontaktAbschlussartDTO dto = new KontaktAbschlussartDTO();

	dto.setAbschlussartBezeichnung(bto.getAbschlussartBezeichnung());
	dto.setAbschlussartId(bto.getAbschlussartId());
	dto.setAbschlussartHilfetext(bto.getAbschlussartHilfetext());
	dto.setGueltigVon(bto.getGueltigVon());
	dto.setGueltigBis(bto.getGueltigBis());

	return dto;
  }
}
