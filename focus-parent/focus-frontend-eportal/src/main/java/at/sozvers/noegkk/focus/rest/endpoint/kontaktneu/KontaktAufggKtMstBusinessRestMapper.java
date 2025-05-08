package at.sozvers.noegkk.focus.rest.endpoint.kontaktneu;

import at.sozvers.noegkk.focus.rest.api.kontaktneu.KontaktAufggKtMstDTO;
import at.sozvers.noegkk.focus.rest.mapping.BusinessRestMapper;
import at.sozvers.noegkk.focus.service.api.kontaktneu.KontaktAufggKtMstMapBTO;

public class KontaktAufggKtMstBusinessRestMapper extends BusinessRestMapper<KontaktAufggKtMstDTO, KontaktAufggKtMstMapBTO> {

  @Override
  public KontaktAufggKtMstDTO map(KontaktAufggKtMstMapBTO bto) {
	KontaktAufggKtMstDTO dto = new KontaktAufggKtMstDTO();

	dto.setKontaktartId(bto.getKontaktartId());
	dto.setAufggKtMstMapId(bto.getAufggKtMstMapId());
	dto.setMstCode(bto.getMstCode());
	dto.setAnzeigenAls(bto.getAnzeigenAls());
	dto.setAufgabengebietId(bto.getAufgabengebietId());
	dto.setGueltigVon(bto.getGueltigVon());
	dto.setGueltigBis(bto.getGueltigBis());

	return dto;
  }
}
