package at.sozvers.noegkk.focus.rest.endpoint.beschwerde.mapper;

import at.itsv.berez.principal.BerezPrincipal;
import at.sozvers.noegkk.focus.rest.api.beschwerde.BeschwerdeUpdateDTO;
import at.sozvers.noegkk.focus.rest.mapping.BusinessRestMapper;
import at.sozvers.noegkk.focus.service.api.beschwerde.BeschwerdeUpdateBTO;
import jakarta.inject.Inject;

public class BeschwerdeUpdateBusinessRestMapper extends BusinessRestMapper<BeschwerdeUpdateDTO, BeschwerdeUpdateBTO> {

  @Inject
  private BerezPrincipal berezPrincipal;

  @Override
  public BeschwerdeUpdateBTO map(BeschwerdeUpdateDTO dto) {
	BeschwerdeUpdateBTO bto = new BeschwerdeUpdateBTO();

	bto.setBeschwerdeId(dto.getBeschwerdeId());
	bto.setBeschreibung(dto.getBeschreibung());
	bto.setBeschwerdegrundAnmerkung(dto.getBeschwerdegrundAnmerkung());
	bto.setBeschwerdegruendeIds(dto.getBeschwerdegruendeIds());
	bto.setEmail(dto.getEmail());
	bto.setFachbereichDetailId(dto.getFachbereichDetailId());
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
	bto.setUpdatecount(dto.getUpdatecount());

	return bto;
  }
}
