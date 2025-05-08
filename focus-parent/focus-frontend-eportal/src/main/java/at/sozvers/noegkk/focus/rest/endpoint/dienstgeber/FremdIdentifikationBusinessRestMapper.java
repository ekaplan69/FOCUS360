package at.sozvers.noegkk.focus.rest.endpoint.dienstgeber;

import java.util.LinkedList;
import java.util.List;
import at.sozvers.noegkk.focus.rest.api.zpv.dienstgeber.FremdIdentifikationDTO;
import at.sozvers.noegkk.focus.rest.mapping.BusinessRestMapper;
import at.sozvers.noegkk.focus.service.api.zpv.dienstgeber.FremdIdentifikationBTO;

public class FremdIdentifikationBusinessRestMapper extends BusinessRestMapper<FremdIdentifikationDTO, FremdIdentifikationBTO> {

  @Override
  public List<FremdIdentifikationDTO> mapToDtoList(List<FremdIdentifikationBTO> fremdIdentifikationBtoList) {
	List<FremdIdentifikationDTO> returnList = new LinkedList<>();

	for(FremdIdentifikationBTO bto : fremdIdentifikationBtoList) {
	  returnList.add(map(bto));
	}

	return returnList;
  }

  @Override
  public FremdIdentifikationDTO map(FremdIdentifikationBTO bto) {
	FremdIdentifikationDTO dto = new FremdIdentifikationDTO();

	dto.setFachschluessel(bto.getFachschluessel());
	dto.setFachschluesselArt(bto.getFachschluesselArt());
	dto.setFachschluesselArtKurz(bto.getFachschluesselArtKurz());
	dto.setGueltigVon(bto.getGueltigVon());
	dto.setGueltigBis(bto.getGueltigBis());

	return dto;
  }
}
