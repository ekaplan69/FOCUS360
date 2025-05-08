package at.sozvers.noegkk.focus.rest.endpoint.kontaktneu;

import at.sozvers.noegkk.focus.rest.api.kontaktneu.KontaktKontaktartDTO;
import at.sozvers.noegkk.focus.rest.mapping.BusinessRestMapper;
import at.sozvers.noegkk.focus.service.api.kontaktneu.KontaktKontaktartBTO;

public class KontaktartBusinessRestMapper extends BusinessRestMapper<KontaktKontaktartDTO, KontaktKontaktartBTO> {

  @Override
  public KontaktKontaktartDTO map(KontaktKontaktartBTO bto) {
	KontaktKontaktartDTO dto = new KontaktKontaktartDTO();

	dto.setKontaktartId(bto.getKontaktartId());
	dto.setKontaktartBezeichnung(bto.getKontaktartBezeichnung());
	dto.setKontaktartHilfetext(bto.getKontaktartHilfetext());
	dto.setGueltigVon(bto.getGueltigVon());
	dto.setGueltigBis(bto.getGueltigBis());

	return dto;
  }
}
