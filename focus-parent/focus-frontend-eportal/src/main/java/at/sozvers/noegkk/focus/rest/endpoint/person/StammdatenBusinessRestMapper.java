package at.sozvers.noegkk.focus.rest.endpoint.person;

import java.util.Optional;
import at.sozvers.noegkk.focus.rest.api.zpv.person.StammdatenDTO;
import at.sozvers.noegkk.focus.rest.mapping.BusinessRestMapper;
import at.sozvers.noegkk.focus.service.api.zpv.adresse.KontaktEmailBTO;
import at.sozvers.noegkk.focus.service.api.zpv.adresse.KontaktTelefonBTO;
import at.sozvers.noegkk.focus.service.api.zpv.person.StammdatenBTO;
import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class StammdatenBusinessRestMapper extends BusinessRestMapper<StammdatenDTO, StammdatenBTO> {

  @Inject
  private AdresseAnschriftBusinessRestMapper adresseAnschriftBusinessRestMapper;
  @Inject
  private GeldadresseBusinessRestMapper      geldadresseBusinessRestMapper;
  @Inject
  private VollmachtBusinessRestMapper        vollmachtBusinessRestMapper;

  @Override
  public StammdatenDTO map(StammdatenBTO bto) {
	StammdatenDTO dto = new StammdatenDTO();

	dto.setPartnerVersicherterRolleId(bto.getPartnerVersicherterRolleId());
	dto.setPartnerBetreuterRolleId(bto.getPartnerBetreuterRolleId());
	dto.setParParrolleIDPartnerrolle(bto.getParParrolleIDPartnerrolle());
	dto.setName(bto.getName());
	dto.setMailAdresse(Optional.ofNullable(bto.getKontaktEmail()).map(KontaktEmailBTO::getMailAdresse).orElse(null));
	dto.setTelefonNummer(Optional.ofNullable(bto.getKontaktTelefon()).map(KontaktTelefonBTO::getTelefonNummer).orElse(null));
	dto.setGeburtsDatum(bto.getGeburtsDatum());
	dto.setGeldAdressen(geldadresseBusinessRestMapper.mapToDtoList(bto.getGeldAdressen()));
	dto.setGeschlecht(bto.getGeschlecht());
	dto.setZustimmungSuen(bto.isZustimmungSuen());
	dto.setGesetzlichVertreten(bto.isGesetzlichVertreten());
	dto.setAuskunftsSperre(bto.isAuskunftsSperre());
	dto.setAndererMitarbeiter(bto.isAndererMitarbeiter());
	dto.setAuskunftsSperreGruende(bto.getAuskunftsSperreGruende());
	dto.setNameOhneAnrede(bto.getNameOhneAnrede());
	dto.setNameFamiliennameGross(bto.getNameFamiliennameGross());
	dto.setStaatIsoA3(bto.getStaatIsoA3());
	dto.setGemeindecode(bto.getGemeindecode());
	dto.setGemeinde(bto.getGemeinde());
	dto.setBundesland(bto.getBundesland());
	dto.setPolBezirk(bto.getPolBezirk());
	dto.setVollmachten(vollmachtBusinessRestMapper.mapToDtoList(bto.getVollmachten()));
	dto.setStorniert(bto.isStorniert());
	dto.setVorname(bto.getVorname());
	dto.setFamilienname(bto.getFamilienname());
	dto.setAnrede(bto.getAnrede());
	dto.setStaat(bto.getStaat());
	dto.setStrasse(bto.getStrasse());
	dto.setHausnummer(bto.getHausnummer());
	dto.setGueltigeVSNR(bto.getGueltigeVSNR());
	dto.setBestaetigtesSterbeDat(bto.getBestaetigtesSterbeDat());

	dto.setAdresse(adresseAnschriftBusinessRestMapper.map(bto.getAdresse()));

	return dto;
  }
}
