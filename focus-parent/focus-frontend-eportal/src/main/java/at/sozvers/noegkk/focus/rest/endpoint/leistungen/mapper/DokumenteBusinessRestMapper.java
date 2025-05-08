package at.sozvers.noegkk.focus.rest.endpoint.leistungen.mapper;

import java.util.List;
import at.sozvers.noegkk.focus.rest.api.lgkk.DokumentDTO;
import at.sozvers.noegkk.focus.rest.api.lgkk.DokumenteDTO;
import at.sozvers.noegkk.focus.rest.mapping.BusinessRestMapper;
import at.sozvers.noegkk.focus.service.api.lgkk.DokumenteBTO;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class DokumenteBusinessRestMapper extends BusinessRestMapper<DokumenteDTO, DokumenteBTO> {

  @Inject
  DokumentBusinessRestMapper dokumentBusinessRestMapper;

  @Override
  public DokumenteDTO map(DokumenteBTO bto) {
	DokumenteDTO dto = new DokumenteDTO();

	List<DokumentDTO> dtoList = dokumentBusinessRestMapper.mapToDtoList(bto.getDokumente());
	dto.setDokumente(dtoList);

	return dto;
  }
}
