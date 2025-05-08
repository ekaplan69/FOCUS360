package at.sozvers.noegkk.focus.rest.endpoint.dienstgeber;

import at.sozvers.noegkk.focus.rest.api.zpv.dienstgeber.DienstgeberDTO;
import at.sozvers.noegkk.focus.rest.mapping.BusinessRestMapper;
import at.sozvers.noegkk.focus.service.api.zpv.dienstgeber.DienstgeberBTO;
import jakarta.inject.Inject;

public class DienstgeberBusinessRestMapper extends BusinessRestMapper<DienstgeberDTO, DienstgeberBTO> {

  @Inject
  private DienstgeberStammdatenBusinessRestMapper dienstgeberStammdatenBusinessRestMapper;

  @Override
  public DienstgeberDTO map(DienstgeberBTO bto) {
	DienstgeberDTO dto = new DienstgeberDTO();

	dto.setDgnr(bto.getDgnr());
	dto.setStammdatenDTO(dienstgeberStammdatenBusinessRestMapper.map(bto.getStammdatenBTO()));

	return dto;
  }
}
