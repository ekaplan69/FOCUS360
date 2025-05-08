package at.sozvers.noegkk.focus.rest.endpoint.kontaktneu;

import at.sozvers.noegkk.focus.rest.api.kontaktneu.KontaktBasicDTO;
import at.sozvers.noegkk.focus.rest.mapping.BusinessRestMapper;
import at.sozvers.noegkk.focus.service.api.kontaktneu.KontaktBasicBTO;

public class KontaktBasicBusinessRestMapper extends BusinessRestMapper<KontaktBasicDTO, KontaktBasicBTO> {

  @Override
  public KontaktBasicDTO map(KontaktBasicBTO bto) {
	KontaktBasicDTO dto = new KontaktBasicDTO();

	dto.setAbschlussart(bto.getAbschlussart());
	dto.setId(bto.getId());
	dto.setEndeTs(bto.getEndeTs());
	dto.setKontaktart(bto.getKontaktart());
	dto.setStartTs(bto.getStartTs());
	dto.setMitarbeiterOe(bto.getMitarbeiterOe());
	dto.setScBezeichnung(bto.getScBezeichnung());
	dto.setAufgabengebiet(bto.getAufgabengebiet());
	dto.setThema(bto.getThema());

	return dto;
  }
}
