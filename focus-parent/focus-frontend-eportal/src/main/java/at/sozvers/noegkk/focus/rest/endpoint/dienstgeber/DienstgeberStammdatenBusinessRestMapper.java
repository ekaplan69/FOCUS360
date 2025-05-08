package at.sozvers.noegkk.focus.rest.endpoint.dienstgeber;

import java.util.Optional;
import at.sozvers.noegkk.focus.rest.api.zpv.dienstgeber.DienstgeberStammdatenDTO;
import at.sozvers.noegkk.focus.rest.endpoint.person.AdresseAnschriftBusinessRestMapper;
import at.sozvers.noegkk.focus.rest.endpoint.person.GeldadresseBusinessRestMapper;
import at.sozvers.noegkk.focus.rest.mapping.BusinessRestMapper;
import at.sozvers.noegkk.focus.service.api.zpv.adresse.KontaktEmailBTO;
import at.sozvers.noegkk.focus.service.api.zpv.adresse.KontaktTelefonBTO;
import at.sozvers.noegkk.focus.service.api.zpv.dienstgeber.DienstgeberStammdatenBTO;
import jakarta.inject.Inject;

public class DienstgeberStammdatenBusinessRestMapper extends BusinessRestMapper<DienstgeberStammdatenDTO, DienstgeberStammdatenBTO> {

  @Inject
  private AdresseAnschriftBusinessRestMapper    adresseAnschriftBusinessRestMapper;
  @Inject
  private FremdIdentifikationBusinessRestMapper fremdIdentifikationBusinessRestMapper;
  @Inject
  private GeldadresseBusinessRestMapper         geldadresseBusinessRestMapper;

  @Override
  public DienstgeberStammdatenDTO map(DienstgeberStammdatenBTO bto) {
	DienstgeberStammdatenDTO dto = new DienstgeberStammdatenDTO();

	if(bto == null) {
	  return dto;
	}

	dto.setParParrolleIDPartner(bto.getParParrolleIDPartner());
	dto.setName(bto.getName());

	dto.setFirmenbuchNr(fremdIdentifikationBusinessRestMapper.mapToDtoList(bto.getFirmenbuchNr()));
	dto.setKur(fremdIdentifikationBusinessRestMapper.mapToDtoList(bto.getKur()));
	dto.setUid(fremdIdentifikationBusinessRestMapper.mapToDtoList(bto.getUid()));

	dto.setSvtBeitragskontoNr(bto.getSvtBeitragskontoNr());

	dto.setMailAdresse(Optional.ofNullable(bto.getKontaktEmail()).map(KontaktEmailBTO::getMailAdresse).orElse(null));
	dto.setTelefonNummer(Optional.ofNullable(bto.getKontaktTelefon()).map(KontaktTelefonBTO::getTelefonNummer).orElse(null));
	dto.setGeldadressen(geldadresseBusinessRestMapper.mapToDtoList(bto.getGeldAdressen()));
	dto.setAdresse(adresseAnschriftBusinessRestMapper.map(bto.getAdresse()));

	dto.setStaatIsoA3(bto.getStaatIsoA3());
	dto.setBundesland(bto.getBundesland());
	dto.setGemeinde(bto.getGemeinde());
	dto.setGemeindecode(bto.getGemeindecode());
	dto.setPolBezirk(bto.getPolBezirk());
	dto.setStorniert(bto.isStorniert());

	return dto;
  }
}
