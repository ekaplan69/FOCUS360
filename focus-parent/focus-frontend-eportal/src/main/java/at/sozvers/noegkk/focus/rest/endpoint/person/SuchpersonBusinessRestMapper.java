package at.sozvers.noegkk.focus.rest.endpoint.person;

import at.sozvers.noegkk.focus.rest.api.zpv.person.SuchpersonDTO;
import at.sozvers.noegkk.focus.rest.mapping.BusinessRestMapper;
import at.sozvers.noegkk.focus.service.api.zpv.person.SuchpersonBTO;
import jakarta.enterprise.context.Dependent;

@Dependent
public class SuchpersonBusinessRestMapper extends BusinessRestMapper<SuchpersonDTO, SuchpersonBTO> {

  @Override
  public SuchpersonDTO map(SuchpersonBTO bto) {
	SuchpersonDTO dto = new SuchpersonDTO();

	dto.setVorname(bto.getVorname());
	dto.setNachname(bto.getNachname());
	dto.setAdresse(bto.getAdresse());
	dto.setFachschluessel(bto.getFachschluessel());
	dto.setGeburtsdatum(bto.getGeburtsdatum());
	dto.setOrt(bto.getOrt());
	dto.setPlz(bto.getPlz());
	dto.setPrid(bto.getPrid());
	dto.setOrgName(bto.getOrgName());

	return dto;
  }
}
