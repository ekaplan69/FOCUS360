package at.sozvers.noegkk.focus.rest.endpoint.kontaktneu;

import at.sozvers.noegkk.focus.rest.api.kontaktneu.KontaktAufgabengebietDTO;
import at.sozvers.noegkk.focus.rest.mapping.BusinessRestMapper;
import at.sozvers.noegkk.focus.service.api.kontaktneu.KontaktAufgabengebietBTO;

public class KontaktAufgabengebietBusinessRestMapper extends BusinessRestMapper<KontaktAufgabengebietDTO, KontaktAufgabengebietBTO> {

  @Override
  public KontaktAufgabengebietDTO map(KontaktAufgabengebietBTO bto) {
	KontaktAufgabengebietDTO dto = new KontaktAufgabengebietDTO();

	dto.setAufgabengebietId(bto.getAufgabengebietId());
	dto.setAufgabengebietBezeichnung(bto.getAufgabengebietBezeichnung());
	dto.setAufgabengebietHilfetext(bto.getAufgabengebietHilfetext());
	dto.setGueltigVon(bto.getGueltigVon());
	dto.setGueltigBis(bto.getGueltigBis());
	dto.setAnzeigeAls(bto.getAnzeigeAls());
	dto.setSubAufgabengebietJN(bto.getSubAufgabengebietJN());

	return dto;
  }
}
