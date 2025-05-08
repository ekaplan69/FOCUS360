package at.sozvers.noegkk.focus.rest.endpoint.kontaktneu;

import at.sozvers.noegkk.focus.rest.api.kontaktneu.KontaktAufggThemaMstDTO;
import at.sozvers.noegkk.focus.rest.mapping.BusinessRestMapper;
import at.sozvers.noegkk.focus.service.api.kontaktneu.KontaktAufggThemaMstBTO;

public class KontaktAufggThemaMstBusinessRestMapper extends BusinessRestMapper<KontaktAufggThemaMstDTO, KontaktAufggThemaMstBTO> {

  @Override
  public KontaktAufggThemaMstDTO map(KontaktAufggThemaMstBTO bto) {
	KontaktAufggThemaMstDTO dto = new KontaktAufggThemaMstDTO();

	dto.setAufgabengebietId(bto.getAufgabengebietId());
	dto.setAnzeigenAls(bto.getAnzeigenAls());
	dto.setMstCode(bto.getMstCode());
	dto.setGueltigVon(bto.getGueltigVon());
	dto.setGueltigBis(bto.getGueltigBis());
	dto.setThemaId(bto.getThemaId());
	dto.setAufggThemaMstMapId(bto.getAufggThemaMstMapId());

	return dto;
  }
}
