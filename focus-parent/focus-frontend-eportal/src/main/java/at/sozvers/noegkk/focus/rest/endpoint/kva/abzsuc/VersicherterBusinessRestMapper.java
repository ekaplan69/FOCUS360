package at.sozvers.noegkk.focus.rest.endpoint.kva.abzsuc;

import at.sozvers.noegkk.focus.rest.api.kva.abzsuc.VersicherterDTO;
import at.sozvers.noegkk.focus.rest.mapping.BusinessRestMapper;
import at.sozvers.noegkk.focus.service.api.kva.abzsuc.VersicherterBTO;

public class VersicherterBusinessRestMapper extends BusinessRestMapper<VersicherterDTO, VersicherterBTO> {

  @Override
  public VersicherterDTO map(VersicherterBTO bto) {
	VersicherterDTO dto = new VersicherterDTO();
	dto.setVorname(bto.getVorname());
	dto.setNachname(bto.getNachname());
	dto.setTyp(bto.getTyp());
	dto.setGueltigVon(bto.getGueltigVon());
	dto.setGueltigBis(bto.getGueltigBis());
	dto.setMeldendeStelle(bto.getMeldendeStelle());
	dto.setVersicherungsnummer(bto.getVersicherungsnummer());
	dto.setAnspruchspruefung(bto.isAnspruchspruefung());
	return dto;
  }
}
