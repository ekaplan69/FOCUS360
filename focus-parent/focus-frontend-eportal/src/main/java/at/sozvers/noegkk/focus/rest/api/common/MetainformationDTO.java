package at.sozvers.noegkk.focus.rest.api.common;

import java.util.*;
import at.sozvers.noegkk.focus.rest.endpoint.common.MetainformationBusinessRestMapper;
import at.sozvers.noegkk.focus.service.api.common.MeldungBTO;

public class MetainformationDTO implements BaseDTO {

  private List<MeldungDTO> meldungen;
  private String           status;

  public static MetainformationDTO of() {
	MetainformationDTO dto = new MetainformationDTO();

	dto.setStatus("OK");

	return dto;
  }

  public static MetainformationDTO of(MeldungDTO meldungDTO) {
	MetainformationDTO dto = new MetainformationDTO();
	dto.setMeldungen(Arrays.asList(meldungDTO));
	dto.setStatus("ERROR");
	return dto;
  }

  public static MetainformationDTO of(List<MeldungBTO> meldungen) {
	MetainformationDTO                dto    = new MetainformationDTO();
	MetainformationBusinessRestMapper mapper = new MetainformationBusinessRestMapper();

	if(meldungen.isEmpty()) {
	  dto.setStatus("OK");
	} else {
	  dto.setStatus("F");
	}

	dto.setMeldungen(mapper.mapToDtoList(meldungen));

	return dto;
  }

  public List<MeldungDTO> getMeldungen() {
	if(meldungen == null) {
	  meldungen = new LinkedList<>();
	}
	return meldungen;
  }

  public void setMeldungen(List<MeldungDTO> meldungen) {
	this.meldungen = meldungen;
  }

  public String getStatus() {
	return status;
  }

  public void setStatus(String status) {
	this.status = status;
  }
}
