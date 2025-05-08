package at.sozvers.noegkk.focus.rest.endpoint.kontaktneu;

import at.sozvers.noegkk.focus.rest.api.kontaktneu.KontaktAufggAaMstDTO;
import at.sozvers.noegkk.focus.rest.mapping.BusinessRestMapper;
import at.sozvers.noegkk.focus.service.api.kontaktneu.KontaktAufggAaMstMapBTO;

public class KontaktAufggAaMstBusinessRestMapper extends BusinessRestMapper<KontaktAufggAaMstDTO, KontaktAufggAaMstMapBTO> {

  @Override
  public KontaktAufggAaMstDTO map(KontaktAufggAaMstMapBTO bto) {
	KontaktAufggAaMstDTO dto = new KontaktAufggAaMstDTO();

	dto.setAbschlussartId(bto.getAbschlussartId());
	dto.setAufggAaMstMapId(bto.getAufggAaMstMapId());
	dto.setAnzeigenAls(bto.getAnzeigenAls());
	dto.setMstCode(bto.getMstCode());
	dto.setAufgabengebietId(bto.getAufgabengebietId());
	dto.setGueltigVon(bto.getGueltigVon());
	dto.setGueltigBis(bto.getGueltigBis());

	return dto;
  }
}
