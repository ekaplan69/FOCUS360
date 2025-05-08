package at.sozvers.noegkk.focus.rest.endpoint.kva.abzsuc;

import at.sozvers.noegkk.focus.rest.api.kva.abzsuc.AngehoerigeDTO;
import at.sozvers.noegkk.focus.rest.mapping.BusinessRestMapper;
import at.sozvers.noegkk.focus.service.api.kva.abzsuc.AngehoerigeBTO;

public class AngehoerigeBusinessRestMapper extends BusinessRestMapper<AngehoerigeDTO, AngehoerigeBTO> {

  @Override
  public AngehoerigeDTO map(AngehoerigeBTO bto) {
	AngehoerigeDTO dto = new AngehoerigeDTO();
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
