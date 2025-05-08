package at.sozvers.noegkk.focus.rest.endpoint.beschwerde;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import at.sozvers.noegkk.focus.rest.api.beschwerde.*;
import at.sozvers.noegkk.focus.rest.endpoint.beschwerde.mapper.*;
import at.sozvers.noegkk.focus.service.api.beschwerde.BeschwerdeBereichBTO;
import at.sozvers.noegkk.focus.service.beschwerde.BeschwerdeService;
import at.sozvers.noegkk.focus.service.common.*;
import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

import static java.util.stream.Collectors.groupingBy;

@Dependent
public class BeschwerdeController {

  private final SimpleDateFormat                                     simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
  @Inject
  private       BeschwerdeBereichFachbereichBusinessRestMapper       beschwerdeBereichFachbereichBusinessRestMapper;
  @Inject
  private       BeschwerdeBereichFachbereichDetailBusinessRestMapper beschwerdeBereichFachbereichDetailBusinessRestMapper;
  @Inject
  private       BeschwerdeBereichThemaBusinessRestMapper             beschwerdeBereichThemaBusinessRestMapper;
  @Inject
  private       BeschwerdeBusinessRestMapper                         beschwerdeBusinessRestMapper;
  @Inject
  private       BeschwerdeDetailBusinessRestMapper                   beschwerdeDetailBusinessRestMapper;
  @Inject
  private       BeschwerdeGrundBusinessRestMapper                    beschwerdeGrundBusinessRestMapper;
  @Inject
  private       BeschwerdeInsertBusinessRestMapper                   beschwerdeInsertBusinessRestMapper;
  @Inject
  private       BeschwerdeService                                    beschwerdeService;
  @Inject
  private       BeschwerdeStornierenBusinessRestMapper               beschwerdeStornierenBusinessRestMapper;
  @Inject
  private       BeschwerdeUpdateBusinessRestMapper                   beschwerdeUpdateBusinessRestMapper;
  @Inject
  private       FachschluesselValidator                              fachschluesselValidator;
  @Inject
  private       OrganisationValidator                                organisationValidator;

  public Long createBeschwerde(BeschwerdeInsertDTO beschwerdeInsertDTO) {
	organisationValidator.validate(Organisation.of(beschwerdeInsertDTO.getKontaktpunktId(), beschwerdeInsertDTO.getKontaktpunktBereOrg()));

	return beschwerdeService.createBeschwerde(beschwerdeInsertBusinessRestMapper.map(beschwerdeInsertDTO));
  }

  public BeschwerdeDetailDTO searchBeschwerde(Long beschwerdeId) {
	return beschwerdeDetailBusinessRestMapper.map(beschwerdeService.searchBeschwerde(beschwerdeId));
  }

  public List<BeschwerdeDTO> searchBeschwerdeListe(String fs, String fsart) {
	Fachschluessel fachschluessel = Fachschluessel.of(fs, fsart);
	fachschluesselValidator.validate(fachschluessel);
	return beschwerdeBusinessRestMapper.mapToDtoList(beschwerdeService.searchBeschwerdeListe(fachschluessel));
  }

  public BeschwerdeBereichDTO searchBeschwerdebereich(Long oeId, String bereOrg, String abfrageDat) {
	organisationValidator.validate(Organisation.of(oeId, bereOrg));

	Date abfrageDatum = createDate(abfrageDat);

	return groupResponse(beschwerdeService.searchBeschwerdebereich(oeId, bereOrg, abfrageDatum));
  }

  private Date createDate(String dat) {
	try {
	  return simpleDateFormat.parse(dat);
	} catch(ParseException e) {
	  throw new ValidationException("Datum hat falsches Format.");
	}
  }

  private BeschwerdeBereichDTO groupResponse(List<BeschwerdeBereichBTO> btoList) {
	Map<Long, List<BeschwerdeBereichBTO>> groupedByThemen = btoList.stream().collect(groupingBy(BeschwerdeBereichBTO::getThemaId));

	BeschwerdeBereichDTO beschwerdeBereich = new BeschwerdeBereichDTO();

	for(Map.Entry<Long, List<BeschwerdeBereichBTO>> thema : groupedByThemen.entrySet()) {

	  Map<Long, List<BeschwerdeBereichBTO>> groupedByFachbereiche = thema.getValue().stream().collect(groupingBy(BeschwerdeBereichBTO::getFachbereichId));

	  BeschwerdeBereichThemaDTO beschwerdeBereichThema = beschwerdeBereichThemaBusinessRestMapper.map(thema.getValue().get(0));

	  for(Map.Entry<Long, List<BeschwerdeBereichBTO>> fachbereich : groupedByFachbereiche.entrySet()) {

		BeschwerdeBereichFachbereichDTO beschwerdeBereichFachbereich = beschwerdeBereichFachbereichBusinessRestMapper.map(fachbereich.getValue().get(0));
		beschwerdeBereichFachbereich.getFachbereichDetails().addAll(beschwerdeBereichFachbereichDetailBusinessRestMapper.mapToDtoList(fachbereich.getValue()));

		beschwerdeBereichThema.getFachbereiche().add(beschwerdeBereichFachbereich);
	  }

	  beschwerdeBereich.getThemen().add(beschwerdeBereichThema);
	}

	return beschwerdeBereich;
  }

  public void storniereBeschwerde(BeschwerdeStornierenDTO beschwerdeStornierenDTO) {
	beschwerdeService.storniereBeschwerde(beschwerdeStornierenBusinessRestMapper.map(beschwerdeStornierenDTO));
  }

  public UpdateCountDTO updateBeschwerde(BeschwerdeUpdateDTO beschwerdeUpdateDTO) {
	Long updatecount = beschwerdeService.updateBeschwerde(beschwerdeUpdateBusinessRestMapper.map(beschwerdeUpdateDTO));

	return new UpdateCountDTO(updatecount);
  }
}
