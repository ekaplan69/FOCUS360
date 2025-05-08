package at.sozvers.noegkk.focus.rest.endpoint.ecmawf;

import java.util.List;
import at.sozvers.noegkk.focus.rest.api.ecmawf.DokumentDTO;
import at.sozvers.noegkk.focus.rest.api.zpv.person.ClkTokenDTO;
import at.sozvers.noegkk.focus.rest.endpoint.person.ClkTokenBusinessRestMapper;
import at.sozvers.noegkk.focus.service.api.ecmawf.DokumentBTO;
import at.sozvers.noegkk.focus.service.api.zpv.person.ClkTokenBTO;
import at.sozvers.noegkk.focus.service.ecmawf.DokumenteService;
import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class DokumenteController {

  @Inject
  private ClkTokenBusinessRestMapper clkTokenBusinessRestMapper;
  @Inject
  private DokumentBusinessRestMapper dokumentBusinessRestMapper;
  @Inject
  private DokumenteService           dokumentService;

  public List<DokumentDTO> searchDokumenteWithPartnerId(String partnerId) {
	List<DokumentBTO> dokumentBTOList = dokumentService.searchDokumenteByPartnerId(partnerId);

	return dokumentBusinessRestMapper.mapToDtoList(dokumentBTOList);
  }

  public ClkTokenDTO showDokumentByDokumentId(String dokumentId) {
	ClkTokenBTO bto = dokumentService.showDokumentByDokumentId(dokumentId);

	return clkTokenBusinessRestMapper.map(bto);
  }
}
