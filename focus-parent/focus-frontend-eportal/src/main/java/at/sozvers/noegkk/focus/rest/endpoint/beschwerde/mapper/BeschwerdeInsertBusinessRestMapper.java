package at.sozvers.noegkk.focus.rest.endpoint.beschwerde.mapper;

import at.itsv.berez.principal.BerezPrincipal;
import at.sozvers.noegkk.focus.rest.api.beschwerde.BeschwerdeInsertDTO;
import at.sozvers.noegkk.focus.rest.mapping.BusinessRestMapper;
import at.sozvers.noegkk.focus.service.api.beschwerde.BeschwerdeInsertBTO;
import jakarta.inject.Inject;

public class BeschwerdeInsertBusinessRestMapper extends BusinessRestMapper<BeschwerdeInsertDTO, BeschwerdeInsertBTO> {

  @Inject
  private BerezPrincipal berezPrincipal;

  @Override
  public BeschwerdeInsertBTO map(BeschwerdeInsertDTO dto) {
	BeschwerdeInsertBTO bto = new BeschwerdeInsertBTO();

	bto.setBeschreibung(dto.getBeschreibung());
	bto.setBeschwerdegrundAnmerkung(dto.getBeschwerdegrundAnmerkung());
	bto.setBeschwerdegruendeIds(dto.getBeschwerdegruendeIds());
	bto.setEmail(dto.getEmail());
	bto.setThema(dto.getThema());
	bto.setFachbereich(dto.getFachbereich());
	bto.setFachbereichDetail(dto.getFachbereichDetail());
	bto.setFachschluessel(dto.getFachschluessel());
	bto.setFachschluesselArt(dto.getFachschluesselArt());
	bto.setKanalId(dto.getKanalId());
	bto.setKontaktpunktId(dto.getKontaktpunktId());
	bto.setKontaktpunktBereOrg(dto.getKontaktpunktBereOrg());
	bto.setMassnahmen(dto.getMassnahmen());
	bto.setMeldendeStelleId(dto.getMeldendeStelleId());
	String nutzerKennung = berezPrincipal.eindeutigerBenutzername();
	if(nutzerKennung.length() > 8) {
	  nutzerKennung = nutzerKennung.substring(0, 8);
	}
	bto.setMitarbeiterkennung(nutzerKennung);
	bto.setMitarbeitername(dto.getMitarbeitername());
	bto.setStatusId(dto.getStatusId());
	bto.setTelefon(dto.getTelefon());
	bto.setZeitpunkt(dto.getZeitpunkt());
	bto.setName(dto.getName());
	bto.setOrt(dto.getOrt());
	bto.setPostleitzahl(dto.getPostleitzahl());
	bto.setStaatIsoA3(dto.getStaatIsoA3());
	bto.setStaat(dto.getStaat());
	bto.setStrasse(dto.getStrasse());
	bto.setHausnummer(dto.getHausnummer());
	bto.setBundesland(dto.getBundesland());

	return bto;
  }
}
