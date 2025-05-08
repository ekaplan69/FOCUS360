package at.sozvers.noegkk.focus.service.lgkk.mapper;

import at.sozvers.noegkk.focus.service.api.lgkk.DokumentBTO;
import at.sozvers.noegkk.focus.service.common.DateUtil;
import at.sozvers.noegkk.focus.service.mapping.BTOExternalServiceMapper;
import at.sozvers.stp.lgkk.webservice.focus360.v20.Focus360DokumentDto;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class DokumentBTOExternalServiceMapper extends BTOExternalServiceMapper<DokumentBTO, Focus360DokumentDto> {

  @Override
  public DokumentBTO map(Focus360DokumentDto dto) {
	DokumentBTO dokumentBTO = new DokumentBTO();

	dokumentBTO.setDokumentklasse(dto.getDokumentklasse());
	dokumentBTO.setEinlangdatum(DateUtil.toLocalDateOrNull(dto.getEinlangdatum()));
	dokumentBTO.setDokumentreferenz(dto.getDokumentreferenz());
	dokumentBTO.setKategorie(dto.getKategorie());
	dokumentBTO.setVersendungsart(dto.getVersendungsart());
	dokumentBTO.setThema(dto.getThema());

	return dokumentBTO;
  }
}
