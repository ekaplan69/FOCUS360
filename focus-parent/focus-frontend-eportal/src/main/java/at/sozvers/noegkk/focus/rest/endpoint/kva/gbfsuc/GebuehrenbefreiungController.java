package at.sozvers.noegkk.focus.rest.endpoint.kva.gbfsuc;

import javax.xml.datatype.DatatypeConfigurationException;
import java.util.List;
import at.sozvers.noegkk.focus.rest.api.kva.gbfsuc.GebuehrenbefreiungDTO;
import at.sozvers.noegkk.focus.service.api.kva.gbfsuc.GebuehrenbefreiungBTO;
import at.sozvers.noegkk.focus.service.common.Fachschluessel;
import at.sozvers.noegkk.focus.service.common.FachschluesselValidator;
import at.sozvers.noegkk.focus.service.kva.gbfsuc.GebuehrenbefreiungService;
import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class GebuehrenbefreiungController {

  @Inject
  private FachschluesselValidator              fachschluesselValidator;
  @Inject
  private GebuehrenbefreiungBusinessRestMapper gebuehrenbefreiungBusinessRestMapper;
  @Inject
  private GebuehrenbefreiungService            gebuehrenbefreiungService;

  public List<GebuehrenbefreiungDTO> searchGebuehrenbefreiungen(Fachschluessel fs) throws DatatypeConfigurationException {
	fachschluesselValidator.validate(fs);
	List<GebuehrenbefreiungBTO> btoList = gebuehrenbefreiungService.searchGebuehrenbefreiungenByFachschluessel(fs);
	return gebuehrenbefreiungBusinessRestMapper.mapToDtoList(btoList);
  }
}
