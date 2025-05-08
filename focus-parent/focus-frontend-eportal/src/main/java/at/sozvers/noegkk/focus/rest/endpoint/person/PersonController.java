package at.sozvers.noegkk.focus.rest.endpoint.person;

import java.util.List;
import java.util.stream.Collectors;
import at.sozvers.noegkk.focus.rest.api.zpv.person.*;
import at.sozvers.noegkk.focus.service.api.zpv.adresse.*;
import at.sozvers.noegkk.focus.service.api.zpv.person.*;
import at.sozvers.noegkk.focus.service.common.Fachschluessel;
import at.sozvers.noegkk.focus.service.zpv.adresse.AdresseService;
import at.sozvers.noegkk.focus.service.zpv.infrastructure.ZpvConstants;
import at.sozvers.noegkk.focus.service.zpv.person.PersonService;
import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class PersonController {

  @Inject
  private AdresseService                    adresseService;
  @Inject
  private ClkSuchergebnisBusinessRestMapper clkSuchergebnisBusinessRestMapper;
  @Inject
  private ClkTokenBusinessRestMapper        clkTokenBusinessRestMapper;
  @Inject
  private PersonBusinessRestMapper          personBusinessRestMapper;
  @Inject
  private PersonService                     personService;
  @Inject
  private StammdatenKurzBusinessRestMapper  stammdatenKurzBusinessRestMapper;
  @Inject
  private SuchpersonBusinessRestMapper      suchpersonBusinessRestMapper;

  public List<ClkSuchergebnisDTO> abfragenSearchPersonClientCoopNew(String clkToken) throws Exception {
	List<ClkSuchergebnisBTO> btoList = personService.abfragenSearchPersonClientCoopNew(clkToken);
	return clkSuchergebnisBusinessRestMapper.mapToDtoList(btoList);
  }

  public ClkTokenDTO initLinkClientCoopNew(String partnerId) throws Exception {
	ClkTokenBTO bto = personService.initLinkClientCoopNew(partnerId);
	return clkTokenBusinessRestMapper.map(bto);
  }

  public ClkTokenDTO initSearchPersonClientCoopNew() throws Exception {
	ClkTokenBTO bto = personService.initSearchPersonClientCoopNew();
	return clkTokenBusinessRestMapper.map(bto);
  }

  public List<SuchpersonDTO> searchOrgWithoutFachschluessel(String orgName, String plz) throws Exception {
	if(orgName == null || plz == null) {
	  throw new IllegalArgumentException("OrgName, Plz müssen befüllt sein");
	}

	List<SuchpersonBTO> btoList = personService.searchByPartnername(orgName, plz);
	return suchpersonBusinessRestMapper.mapToDtoList(btoList);
  }

  public PersonDTO searchPerson(Fachschluessel fachschluessel) throws Exception {
	PersonBTO bto = new PersonBTO();
	bto.setVsnr(fachschluessel.getFachschluessel());

	StammdatenBTO stammdatenBTO = personService.searchByFachschluessel(fachschluessel);
	bto.setStammdaten(stammdatenBTO);

	List<AdresseBTO> adresseBTOList = adresseService.searchByFachschluessel(fachschluessel, ZpvConstants.GEBRAUCHART_PRIVA);

	if(adresseBTOList != null) {
	  AdresseBTO email = getKontaktEmailBTO(adresseBTOList);
	  stammdatenBTO.setKontaktEmail(email != null ? (KontaktEmailBTO) email : null);

	  AdresseBTO telefon = getKontaktTelefonBTO(adresseBTOList);
	  stammdatenBTO.setKontaktTelefon(telefon != null ? (KontaktTelefonBTO) telefon : null);

	  AdresseBTO anschrift = getAdresseAnschriftBTO(adresseBTOList);
	  stammdatenBTO.setAdresse(anschrift != null ? (AdresseAnschriftBTO) anschrift : null);

	  setGeldAdressenBTOList(stammdatenBTO, adresseBTOList);
	}

	return personBusinessRestMapper.map(bto);
  }

  private AdresseBTO getKontaktEmailBTO(List<AdresseBTO> adresseBTOList) {
	// @formatter:off
		return adresseBTOList.stream()
				.filter(adresseBTO -> AdresseBTO.AdresseType.KONTAKT_EMAIL.equals(adresseBTO.getType()))
				.findFirst()
				.orElse(null);
		// @formatter:on
  }

  private AdresseBTO getKontaktTelefonBTO(List<AdresseBTO> adresseBTOList) {
	// @formatter:off
		return adresseBTOList.stream()
				.filter(adresseBTO -> AdresseBTO.AdresseType.KONTAKT_TELEFON.equals(adresseBTO.getType()))
				.findFirst()
				.orElse(null);
		// @formatter:on
  }

  private AdresseBTO getAdresseAnschriftBTO(List<AdresseBTO> adresseBTOList) {
	// @formatter:off
		return adresseBTOList.stream()
				.filter(adresseBTO -> AdresseBTO.AdresseType.ANSCHRIFT.equals(adresseBTO.getType()))
				.findFirst()
				.orElse(null);
		// @formatter:on
  }

  private void setGeldAdressenBTOList(StammdatenBTO stammdatenBTO, List<AdresseBTO> adresseBTOList) {
	// @formatter:off
		List<AdresseBTO> geldAdressen = adresseBTOList.stream()
				.filter(adresseBTO -> AdresseBTO.AdresseType.GELDADRESSE.equals(adresseBTO.getType()))
				.collect(Collectors.toList());
		stammdatenBTO.setGeldAdressen(
				geldAdressen.stream()
						.map(GeldadresseBTO.class::cast)
						.collect(Collectors.toList())
		);
		// @formatter:on
  }

  public List<StammdatenKurzDTO> searchPersonWithPartnerId(String partnerId) throws Exception {
	List<StammdatenKurzBTO> stammdatenBTOList = personService.searchByPartnerId(partnerId).stream().filter(bto -> bto.getFachschluesselArt() != null && !bto.getFachschluesselArt().isBlank())
															 .collect(Collectors.toList());

	return stammdatenKurzBusinessRestMapper.mapToDtoList(stammdatenBTOList);
  }

  public List<SuchpersonDTO> searchPersonsWithoutFachschluessel(String vorname, String nachname, String plz, String geburtsdatum) throws Exception {
	if(vorname == null || nachname == null || plz == null || geburtsdatum == null) {
	  throw new IllegalArgumentException("Vorname, Nachname, PLZ und Geburtsdatum müssen alle befüllt werden!");
	}
	List<SuchpersonBTO> btoList = personService.searchByPartnername(vorname, nachname, plz, geburtsdatum);
	return suchpersonBusinessRestMapper.mapToDtoList(btoList);
  }
}
