package at.sozvers.noegkk.focus.rest.endpoint.dienstgeber;

import java.util.List;
import java.util.stream.Collectors;
import at.sozvers.noegkk.focus.rest.api.zpv.dienstgeber.DienstgeberDTO;
import at.sozvers.noegkk.focus.service.api.zpv.adresse.*;
import at.sozvers.noegkk.focus.service.api.zpv.dienstgeber.DienstgeberBTO;
import at.sozvers.noegkk.focus.service.api.zpv.dienstgeber.DienstgeberStammdatenBTO;
import at.sozvers.noegkk.focus.service.common.Fachschluessel;
import at.sozvers.noegkk.focus.service.zpv.adresse.AdresseService;
import at.sozvers.noegkk.focus.service.zpv.dienstgeber.DienstgeberService;
import at.sozvers.noegkk.focus.service.zpv.infrastructure.ZpvConstants;
import jakarta.inject.Inject;

public class DienstgeberController {

  @Inject
  private AdresseService                adresseService;
  @Inject
  private DienstgeberBusinessRestMapper dienstgeberBusinessRestMapper;
  @Inject
  private DienstgeberService            dienstgeberService;

  public DienstgeberDTO searchDienstgeber(Fachschluessel fachschluessel) throws Exception {
	DienstgeberBTO bto = dienstgeberService.searchByFachschluessel(fachschluessel);

	if(bto.getStammdatenBTO() != null) {
	  List<AdresseBTO> adresseBTOList = adresseService.searchByFachschluessel(fachschluessel, ZpvConstants.GEBRAUCHART_GESCH);

	  AdresseBTO email = getKontaktEmailBTO(adresseBTOList);
	  bto.getStammdatenBTO().setKontaktEmail(email != null ? (KontaktEmailBTO) email : null);

	  AdresseBTO telefon = getKontaktTelefonBTO(adresseBTOList);
	  bto.getStammdatenBTO().setKontaktTelefon(telefon != null ? (KontaktTelefonBTO) telefon : null);

	  AdresseBTO anschrift = getAdresseAnschriftBTO(adresseBTOList);
	  bto.getStammdatenBTO().setAdresse(anschrift != null ? (AdresseAnschriftBTO) anschrift : null);

	  setGeldAdressenBTOList(bto.getStammdatenBTO(), adresseBTOList);
	}

	return dienstgeberBusinessRestMapper.map(bto);
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

  private void setGeldAdressenBTOList(DienstgeberStammdatenBTO stammdatenBTO, List<AdresseBTO> adresseBTOList) {
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
}
