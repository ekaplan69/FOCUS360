package at.sozvers.noegkk.focus.rest.endpoint.leistungen;

import javax.xml.datatype.DatatypeConfigurationException;
import java.util.*;
import java.util.stream.Collectors;
import at.sozvers.focus.persistence.focus.dao.FocusMeldendestelleDAO;
import at.sozvers.noegkk.focus.rest.api.lgkk.*;
import at.sozvers.noegkk.focus.rest.api.zvd.VersicherungszeitDTO;
import at.sozvers.noegkk.focus.rest.endpoint.leistungen.mapper.DokumenteBusinessRestMapper;
import at.sozvers.noegkk.focus.rest.endpoint.leistungen.mapper.LeistungenBusinessRestMapper;
import at.sozvers.noegkk.focus.rest.endpoint.versicherungszeit.VersicherungszeitBusinessRestMapper;
import at.sozvers.noegkk.focus.service.api.lgkk.LeistungenBTO;
import at.sozvers.noegkk.focus.service.api.zvd.VersicherungsverhaeltnisBTO;
import at.sozvers.noegkk.focus.service.common.Fachschluessel;
import at.sozvers.noegkk.focus.service.common.FachschluesselValidator;
import at.sozvers.noegkk.focus.service.lgkk.LeistungService;
import at.sozvers.noegkk.focus.service.zvd.versicherungszeit.VersicherungszeitenService;
import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class LeistungenController {

  @Inject
  DokumenteBusinessRestMapper         dokumenteBusinessRestMapper;
  @Inject
  VersicherungszeitBusinessRestMapper versicherungszeitBusinessRestMapper;
  @Inject
  private FocusMeldendestelleDAO       dao;
  @Inject
  private FachschluesselValidator      fachschluesselValidator;
  @Inject
  private LeistungService              leistungService;
  @Inject
  private LeistungenBusinessRestMapper leistungenBusinessRestMapper;
  @Inject
  private VersicherungszeitenService   versicherungszeitenService;

  public DokumenteDTO leseDokumente(String vsnr) throws DatatypeConfigurationException {
	return dokumenteBusinessRestMapper.map(leistungService.leseDokumente(vsnr));
  }

  LeistungenDTO leseLeistungen(String vsnr, String pid, List<String> mitversicherungen, List<String> landesstellen) throws DatatypeConfigurationException {
	validateFachschluessel(vsnr);

	List<Integer> landesstellenAsInt = new LinkedList<>();
	if(landesstellen != null && !landesstellen.isEmpty()) {
	  landesstellenAsInt = landesstellen.stream().map(Integer::parseInt).collect(Collectors.toList());
	}

	if(mitversicherungen != null && !mitversicherungen.isEmpty() && !landesstellenAsInt.isEmpty()) {
	  List<Integer> landesstellenVonAngehoerigen = leseAngehoerigenLandesstellen(mitversicherungen.toArray(new String[0]));
	  landesstellenAsInt.addAll(landesstellenVonAngehoerigen);
	}

	landesstellenAsInt = new LinkedList<>(new HashSet<>(landesstellenAsInt)).stream().sorted().collect(Collectors.toList());

	LeistungenBTO leistungenBTO = leistungService.leseLeistungen(vsnr, Double.parseDouble(pid), landesstellenAsInt);
	LeistungenDTO leistungenDTO = leistungenBusinessRestMapper.map(leistungenBTO);

	leistungenDTO.getBetreute().forEach(this::setMeldendeStelleForDTO);

	return leistungenDTO;
  }

  public void validateFachschluessel(String fachschluessel) {
	if(fachschluessel.charAt(0) != '0') {
	  fachschluesselValidator.validate(Fachschluessel.of(fachschluessel, "VSNR"));
	} else {
	  fachschluesselValidator.validate(Fachschluessel.of(fachschluessel, "BTNR"));
	}
  }

  private List<Integer> leseAngehoerigenLandesstellen(String[] angehoerigeVSNRArr) throws DatatypeConfigurationException {
	Fachschluessel fs;
	List<Integer>  angehoerigeLandesstellen = new LinkedList<>();
	if(angehoerigeVSNRArr.length > 1) {
	  for(String s : angehoerigeVSNRArr) {
		fs = Fachschluessel.of(s, "VSNR");
		List<VersicherungszeitDTO> versicherungszeitDTOList = searchVersicherungszeitKurz(fs);
		versicherungszeitDTOList.forEach(versicherungszeitDTO -> {
		  try {
			int ms = Integer.parseInt(versicherungszeitDTO.getMeldendeStelle());
			if(ms > 10 && ms < 20) {
			  angehoerigeLandesstellen.add(ms);
			}
		  } catch(NumberFormatException nfx) {
			//Handelt es sich nicht um einen Träger zw. 11 u. 19, wird der Code ignoriert.
		  }
		});
	  }
	}
	return angehoerigeLandesstellen;
  }

  private void setMeldendeStelleForDTO(BetreuungszeitenDTO dto) {
	if((dto.getLandesstelle() == null || dto.getLandesstelle().equalsIgnoreCase(""))) {
	  dto.setLandesstelle("");
	} else {
	  dto.setLandesstelle(dao.getMeldendestelleKurzbezeichnung(dto.getLandesstelle(), true));
	}
  }

  private List<VersicherungszeitDTO> searchVersicherungszeitKurz(Fachschluessel fachschluessel) throws DatatypeConfigurationException {
	fachschluesselValidator.validate(fachschluessel);
	List<VersicherungsverhaeltnisBTO> versicherungsverhaeltnisBTOList = versicherungszeitenService.searchVersicherungsverhaeltnisseByFachschluessel(fachschluessel);
	return versicherungszeitBusinessRestMapper.mapToDtoList(versicherungsverhaeltnisBTOList);
  }
}
