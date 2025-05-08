package at.sozvers.noegkk.focus.rest.endpoint.kontaktneu;

import at.sozvers.noegkk.focus.rest.api.kontaktneu.KontaktAufggSubMapDTO;
import at.sozvers.noegkk.focus.rest.mapping.BusinessRestMapper;
import at.sozvers.noegkk.focus.service.api.kontaktneu.KontaktAufggSubMapBTO;

public class KontaktAufggSubMapBusinessRestMapper extends BusinessRestMapper<KontaktAufggSubMapDTO, KontaktAufggSubMapBTO> {

  @Override
  public KontaktAufggSubMapDTO map(KontaktAufggSubMapBTO bto) {
	KontaktAufggSubMapDTO dto = new KontaktAufggSubMapDTO();

	dto.setId(bto.getId());
	dto.setAufgabengebietId(bto.getAufgabengebietId());
	dto.setSubAufgabengebietId(bto.getSubAufgabengebietId());
	dto.setGueltigVon(bto.getGueltigVon());
	dto.setGueltigBis(bto.getGueltigBis());

	return dto;
  }
}
