package at.sozvers.noegkk.focus.rest.endpoint.versicherungszeit;

import java.util.*;
import at.sozvers.noegkk.focus.rest.api.zvd.VersicherungszeitDTO;
import at.sozvers.noegkk.focus.rest.mapping.BusinessRestMapper;
import at.sozvers.noegkk.focus.service.api.zvd.VersicherungsverhaeltnisBTO;
import at.sozvers.noegkk.focus.service.api.zvd.VersicherungszeitBTO;

public class VersicherungszeitBusinessRestMapper extends BusinessRestMapper<VersicherungszeitDTO, VersicherungsverhaeltnisBTO> {

  @Override
  public List<VersicherungszeitDTO> mapToDtoList(List<VersicherungsverhaeltnisBTO> btoList) {
	List<VersicherungszeitDTO> dtoList = new ArrayList<>();
	if(btoList == null) {
	  return Collections.emptyList();
	}

	for(VersicherungsverhaeltnisBTO bto : btoList) {
	  for(VersicherungszeitBTO versicherungszeitBto : bto.getVersicherungszeiten()) {
		VersicherungszeitDTO dto = new VersicherungszeitDTO();

		dto.setBeginnDatum(versicherungszeitBto.getVonDatum());
		dto.setEndeDatum(versicherungszeitBto.getBisDatum());
		dto.setQualifikation(versicherungszeitBto.getQualifikation());
		dto.setDienstgebername(versicherungszeitBto.getDienstgebername());
		dto.setMeldendeStelle(bto.getMeldendeStelle());
		dtoList.add(dto);
	  }
	}

	dtoList.sort((o1, o2) -> o2.getEndeDatum().compareTo(o1.getEndeDatum()));

	return dtoList;
  }
}
