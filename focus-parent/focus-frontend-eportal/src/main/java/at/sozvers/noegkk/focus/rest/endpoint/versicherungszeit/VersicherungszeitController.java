package at.sozvers.noegkk.focus.rest.endpoint.versicherungszeit;

import javax.xml.datatype.DatatypeConfigurationException;
import java.util.List;
import at.sozvers.noegkk.focus.rest.api.zvd.VersicherungszeitDTO;
import at.sozvers.noegkk.focus.service.api.zvd.VersicherungsverhaeltnisBTO;
import at.sozvers.noegkk.focus.service.api.zvd.VersicherungszeitBTO;
import at.sozvers.noegkk.focus.service.common.Fachschluessel;
import at.sozvers.noegkk.focus.service.common.FachschluesselValidator;
import at.sozvers.noegkk.focus.service.zvd.versicherungszeit.VersicherungszeitenService;
import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class VersicherungszeitController {

  @Inject
  private FachschluesselValidator             fachschluesselValidator;
  @Inject
  private VersicherungszeitBusinessRestMapper versicherungszeitBusinessRestMapper;
  @Inject
  private VersicherungszeitenService          versicherungszeitenService;

  public List<VersicherungszeitDTO> searchVersicherungszeit(Fachschluessel fachschluessel) throws DatatypeConfigurationException {
	fachschluesselValidator.validate(fachschluessel);
	List<VersicherungsverhaeltnisBTO> versicherungsverhaeltnisBTOList = versicherungszeitenService.searchVersicherungsverhaeltnisseByFachschluessel(fachschluessel);

	for(VersicherungsverhaeltnisBTO vhBto : versicherungsverhaeltnisBTOList) {
	  for(VersicherungszeitBTO vzBto : vhBto.getVersicherungszeiten()) {
		vzBto.setQualifikation(vzBto.getQualifikation() + " - " + versicherungszeitenService.getQualifikationKurz(vzBto.getQualifikation()));
		vzBto.setDienstgebername(getDienstgebername(vhBto));
	  }
	}

	return versicherungszeitBusinessRestMapper.mapToDtoList(versicherungsverhaeltnisBTOList);
  }

  private String getDienstgebername(VersicherungsverhaeltnisBTO vhBto) {
	if(vhBto.getHvbBeitragskontonummerKennzeichen().equals("K")) {
	  Fachschluessel fachschluesselMSBKH = Fachschluessel.of(vhBto.getMeldendeStelle().substring(0, 2) + "/" + vhBto.getHvbBeitragskontonummer(), "MSBKH");
	  return versicherungszeitenService.searchDienstgebername(fachschluesselMSBKH);
	} else {
	  return "";
	}
  }
}
