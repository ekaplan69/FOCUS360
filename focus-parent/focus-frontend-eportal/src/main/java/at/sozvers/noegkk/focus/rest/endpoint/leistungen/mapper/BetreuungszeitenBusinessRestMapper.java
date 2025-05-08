package at.sozvers.noegkk.focus.rest.endpoint.leistungen.mapper;

import at.sozvers.noegkk.focus.rest.api.lgkk.BetreuungszeitenDTO;
import at.sozvers.noegkk.focus.rest.mapping.BusinessRestMapper;
import at.sozvers.noegkk.focus.service.api.lgkk.BetreuungszeitenBTO;

public class BetreuungszeitenBusinessRestMapper extends BusinessRestMapper<BetreuungszeitenDTO, BetreuungszeitenBTO> {

  @Override
  public BetreuungszeitenDTO map(BetreuungszeitenBTO bto) {
	BetreuungszeitenDTO dto = new BetreuungszeitenDTO();
	dto.setBetreuungVon(bto.getBetreuungVon());
	dto.setBetreuungBis(bto.getBetreuungBis());
	dto.setLandesstelle(bto.getLandesstelle().toString());
	dto.setStatus(bto.getStatus());

	return dto;
  }
}
