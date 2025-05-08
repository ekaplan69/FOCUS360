package at.sozvers.noegkk.focus.rest.endpoint.kva.kvkerm;

import at.sozvers.noegkk.focus.rest.api.kva.kvkerm.KvkermDTO;
import at.sozvers.noegkk.focus.rest.mapping.BusinessRestMapper;
import at.sozvers.noegkk.focus.service.api.kva.kvkerm.KvkermBTO;

public class KvkermBusinessRestMapper extends BusinessRestMapper<KvkermDTO, KvkermBTO> {

  @Override
  public KvkermDTO map(KvkermBTO bto) {
	KvkermDTO dto = new KvkermDTO();
	dto.setAnspruch(bto.getAnspruch());
	dto.setSchutzfrist(bto.getSchutzfrist());
	dto.setToleranzfrist(bto.getToleranzfrist());
	return dto;
  }
}
