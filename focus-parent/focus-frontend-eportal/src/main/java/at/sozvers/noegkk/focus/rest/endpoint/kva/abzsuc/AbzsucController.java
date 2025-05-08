package at.sozvers.noegkk.focus.rest.endpoint.kva.abzsuc;

import javax.xml.datatype.DatatypeConfigurationException;
import java.util.List;
import at.sozvers.noegkk.focus.rest.api.kva.abzsuc.AngehoerigeDTO;
import at.sozvers.noegkk.focus.rest.api.kva.abzsuc.VersicherterDTO;
import at.sozvers.noegkk.focus.service.api.kva.abzsuc.AngehoerigeBTO;
import at.sozvers.noegkk.focus.service.api.kva.abzsuc.VersicherterBTO;
import at.sozvers.noegkk.focus.service.common.Fachschluessel;
import at.sozvers.noegkk.focus.service.common.FachschluesselValidator;
import at.sozvers.noegkk.focus.service.kva.abzsuc.AngehoerigeService;
import at.sozvers.noegkk.focus.service.kva.abzsuc.VersicherterService;
import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class AbzsucController {

  @Inject
  private AngehoerigeBusinessRestMapper  angehoerigeBusinessRestMapper;
  @Inject
  private AngehoerigeService             angehoerigeService;
  @Inject
  private FachschluesselValidator        fachschluesselValidator;
  @Inject
  private VersicherterBusinessRestMapper versicherterBusinessRestMapper;
  @Inject
  private VersicherterService            versicherterService;

  public List<AngehoerigeDTO> searchAngehoerige(Fachschluessel fs) throws DatatypeConfigurationException {
	fachschluesselValidator.validate(fs);
	List<AngehoerigeBTO> angehoerigeBTOList = angehoerigeService.searchAngehoerigeByFachschluessel(fs);
	return angehoerigeBusinessRestMapper.mapToDtoList(angehoerigeBTOList);
  }

  public List<VersicherterDTO> searchVersicherter(Fachschluessel fs) throws DatatypeConfigurationException {
	fachschluesselValidator.validate(fs);
	List<VersicherterBTO> versicherterBTOList = versicherterService.searchVersicherteByFachschluessel(fs);
	return versicherterBusinessRestMapper.mapToDtoList(versicherterBTOList);
  }
}
