package at.sozvers.noegkk.focus.service.kva.abzsuc;

import java.util.List;
import java.util.stream.Stream;
import at.sozvers.kva.schema.angehoerigenbeziehung.suchen.AngehoerigenBeziehungDTO;
import at.sozvers.noegkk.focus.service.api.kva.abzsuc.VersicherterBTO;
import at.sozvers.noegkk.focus.service.mapping.BTOExternalServiceMapper;

public class VersicherterBTOExternalServiceMapper extends BTOExternalServiceMapper<VersicherterBTO, AngehoerigenBeziehungDTO> {

  public List<VersicherterBTO> mapAngehoerigenBeziehungToBTOList(List<AngehoerigenBeziehungDTO> angehoerigenBeziehungDTOList) {
	List<AngehoerigenBeziehungDTO> filteredAngehoerigenBeziehungDTOList = filterAngehoerigenBeziehung(angehoerigenBeziehungDTOList);
	return filteredAngehoerigenBeziehungDTOList.stream().map(this::map).toList();
  }

  private List<AngehoerigenBeziehungDTO> filterAngehoerigenBeziehung(List<AngehoerigenBeziehungDTO> angehoerigenBeziehungDTOList) {
	Stream<AngehoerigenBeziehungDTO> filteredAngehoerigenBeziehungDTOStream = angehoerigenBeziehungDTOList.stream();
	return filteredAngehoerigenBeziehungDTOStream.filter(this::isAngehoerigenBeziehungStorniert).toList();
  }

  @Override
  public VersicherterBTO map(AngehoerigenBeziehungDTO angehoerigenBeziehungDTO) {
	VersicherterBTO bto = new VersicherterBTO();
	bto.setVersicherungsnummer(angehoerigenBeziehungDTO.getVsnrVers());
	bto.setVorname(angehoerigenBeziehungDTO.getVorname());
	bto.setNachname(angehoerigenBeziehungDTO.getFamname());
	bto.setTyp(angehoerigenBeziehungDTO.getAngTypBez());
	bto.setGueltigVon(angehoerigenBeziehungDTO.getVondat() != null ? angehoerigenBeziehungDTO.getVondat().toGregorianCalendar().toZonedDateTime().toLocalDate() : null);
	bto.setGueltigBis(angehoerigenBeziehungDTO.getBisdat() != null ? angehoerigenBeziehungDTO.getBisdat().toGregorianCalendar().toZonedDateTime().toLocalDate() : null);
	bto.setMeldendeStelle(angehoerigenBeziehungDTO.getMeldendeStelle());
	return bto;
  }

  private boolean isAngehoerigenBeziehungStorniert(AngehoerigenBeziehungDTO dto) {
	return !"s".equalsIgnoreCase(dto.getAbzStatusKz());
  }
}
