package at.sozvers.noegkk.focus.service.zpv.adresse;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import at.sozialversicherung.schema.zpv.ibs.adresszuordnungsuchen_10_0.*;
import at.sozvers.noegkk.focus.service.api.zpv.adresse.AdresseBTO;
import at.sozvers.noegkk.focus.service.common.Fachschluessel;
import at.sozvers.noegkk.focus.service.common.FachschluesselValidator;
import at.sozvers.noegkk.focus.service.zpv.infrastructure.ZPVService;
import at.sozvers.noegkk.focus.service.zpv.infrastructure.ZpvCaller;
import at.sozvers.noegkk.jsszpvbe2.action.ZPVServices;
import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

import static at.sozvers.noegkk.focus.service.zpv.infrastructure.ZpvConstants.*;

@Dependent
public class AdresseService {

  @Inject
  private DtoAdresszuordnungListeSUIFactory                                 dtoAdresszuordnungListeSUIFactory;
  @Inject
  private FachschluesselValidator                                           fachschluesselValidator;
  @Inject
  private AdresseBTOExternalServiceMapper                                   serviceMapper;
  @Inject
  private ZpvCaller<DtoAdresszuordnungListeSUI, DtoAdresszuordnungListeSUO> zpvCaller;
  @Inject
  @ZPVService
  private ZPVServices                                                       zpvServices;

  public List<AdresseBTO> searchByFachschluessel(Fachschluessel fachschluessel, String gebrauchArt) throws Exception {

	fachschluesselValidator.validate(fachschluessel);

	List<DtoAdresszuordnungAllgemeinSUO> adresszuordnungAllgemeinSUOList = getDtoAdresszuordnungListeSUO(fachschluessel);

	if(adresszuordnungAllgemeinSUOList == null) {
	  return Collections.emptyList();
	}

	adresszuordnungAllgemeinSUOList = filterPriorities(adresszuordnungAllgemeinSUOList, gebrauchArt);

	return serviceMapper.mapToBtoList(adresszuordnungAllgemeinSUOList);
  }

  private List<DtoAdresszuordnungAllgemeinSUO> getDtoAdresszuordnungListeSUO(Fachschluessel fachschluessel) throws Exception {
	DtoAdresszuordnungListeSUI dtoAdresszuordnungListeSUI = dtoAdresszuordnungListeSUIFactory.createDtoAdresszuordnungListeSUIWithFachschluessel((fachschluessel));
	DtoAdresszuordnungListeSUO dtoAdresszuordnungListeSUO = zpvCaller.call(zpvServices::adresszuordnungSuchen_10_0, dtoAdresszuordnungListeSUI);

	if(ZPV_FALSE.equals(dtoAdresszuordnungListeSUO.getFehlerpaket().getIstOk())) {
	  return Collections.emptyList();
	}
	// @formatter:off
		return dtoAdresszuordnungListeSUO
				.getDtoAdresszuordnungPartnerListeSUOListe()
				.get(0)
				.getDtoAdresszuordnungAllgemeinSUOListe();
		// @formatter:on
  }

  private List<DtoAdresszuordnungAllgemeinSUO> filterPriorities(List<DtoAdresszuordnungAllgemeinSUO> adresszuordnungAllgemeinSUOList, String gebrauchArt) {

	List<DtoAdresszuordnungAllgemeinSUO> filteredList = new LinkedList<>();

	addPrivateAdresse(filteredList, adresszuordnungAllgemeinSUOList, ADRESSTYP_KURZ_ANSCH, gebrauchArt);
	addPrivateAdresse(filteredList, adresszuordnungAllgemeinSUOList, ADRESSTYP_KURZ_TELE, gebrauchArt);
	addPrivateAdresse(filteredList, adresszuordnungAllgemeinSUOList, ADRESSTYP_KURZ_EMAIL, gebrauchArt);

	// @formatter:off
		filteredList.addAll(
				getPrivateAdresseStream(adresszuordnungAllgemeinSUOList, ADRESSTYP_KURZ_GELDA, VERWENDUNGSART_KURZ_HAUPT, gebrauchArt)
				.collect(Collectors.toList())
		);
		filteredList.addAll(
				getPrivateAdresseStream(adresszuordnungAllgemeinSUOList, ADRESSTYP_KURZ_GELDA, VERWENDUNGSART_KURZ_WEITE, gebrauchArt)
				.collect(Collectors.toList())
		);
		// @formatter:on

	return filteredList;
  }

  private void addPrivateAdresse(List<DtoAdresszuordnungAllgemeinSUO> filteredList, List<DtoAdresszuordnungAllgemeinSUO> adresszuordnungAllgemeinSUOList, String adresstypKurz, String gebrauchArt) {
	long privateHauptAdresse = getPrivateAdresseStream(adresszuordnungAllgemeinSUOList, adresstypKurz, VERWENDUNGSART_KURZ_HAUPT, gebrauchArt).count();
	if(privateHauptAdresse > 0) {
	  Optional<DtoAdresszuordnungAllgemeinSUO> o = getPrivateAdresseStream(adresszuordnungAllgemeinSUOList, adresstypKurz, VERWENDUNGSART_KURZ_HAUPT, gebrauchArt).findFirst();
	  if(o.isPresent()) {
		filteredList.add(o.get());
	  }
	  return;
	}
	long privateWeitereAdresse = getPrivateAdresseStream(adresszuordnungAllgemeinSUOList, adresstypKurz, VERWENDUNGSART_KURZ_WEITE, gebrauchArt).count();
	if(privateWeitereAdresse > 0) {
	  Optional<DtoAdresszuordnungAllgemeinSUO> o = getPrivateAdresseStream(adresszuordnungAllgemeinSUOList, adresstypKurz, VERWENDUNGSART_KURZ_WEITE, gebrauchArt).findFirst();
	  if(o.isPresent()) {
		filteredList.add(o.get());
	  }
	  return;
	}
	long privateKontaktAdresse = getPrivateAdresseStream(adresszuordnungAllgemeinSUOList, adresstypKurz, VERWENDUNGSART_KURZ_KONTA, gebrauchArt).count();
	if(privateKontaktAdresse > 0) {
	  Optional<DtoAdresszuordnungAllgemeinSUO> o = getPrivateAdresseStream(adresszuordnungAllgemeinSUOList, adresstypKurz, VERWENDUNGSART_KURZ_KONTA, gebrauchArt).findFirst();
	  if(o.isPresent()) {
		filteredList.add(o.get());
	  }
	}
  }

  private Stream<DtoAdresszuordnungAllgemeinSUO> getPrivateAdresseStream(List<DtoAdresszuordnungAllgemeinSUO> adresszuordnungAllgemeinSUOList, String adresstypKurz, String verwendungsartKurz,
																		 String gebrauchArt) {
	// @formatter:off
		return adresszuordnungAllgemeinSUOList.stream()
				.filter(dto -> adresstypKurz.equals(dto.getAdresstypKurz()) && gebrauchArt.equals(dto.getGebrauchKurz()))
				.filter(dto -> verwendungsartKurz.equals(dto.getVerwendungsartKurz()));
		// @formatter:on
  }
}
