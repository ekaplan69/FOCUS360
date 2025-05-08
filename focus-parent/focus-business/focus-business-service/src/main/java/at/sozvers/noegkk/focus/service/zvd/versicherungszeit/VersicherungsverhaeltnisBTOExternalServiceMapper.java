package at.sozvers.noegkk.focus.service.zvd.versicherungszeit;

import java.util.ArrayList;
import java.util.List;
import at.sozvers.noegkk.focus.service.api.zvd.VersicherungsverhaeltnisBTO;
import at.sozvers.noegkk.focus.service.api.zvd.VersicherungszeitBTO;
import at.sozvers.noegkk.focus.service.mapping.BTOExternalServiceMapper;
import at.sozvers.zvd.ws.versicherungsverhaeltnisselesenservice.v3.types.Versicherungsverhaeltnis;
import at.sozvers.zvd.ws.versicherungsverhaeltnisselesenservice.v3.types.Versicherungszeit;
import jakarta.inject.Inject;

public class VersicherungsverhaeltnisBTOExternalServiceMapper extends BTOExternalServiceMapper<VersicherungsverhaeltnisBTO, Versicherungsverhaeltnis> {

  @Inject
  private VersicherungszeitBTOExternalServiceMapper versicherungszeitBTOExternalServiceMapper;

  @Override
  public VersicherungsverhaeltnisBTO map(Versicherungsverhaeltnis versicherungsverhaeltnis) {
	if(versicherungsverhaeltnis == null) {
	  return null;
	} else {
	  VersicherungsverhaeltnisBTO bto = new VersicherungsverhaeltnisBTO();

	  bto.setHvbBeitragskontonummer(versicherungsverhaeltnis.getHvbBeitragskontonummer());
	  bto.setHvbBeitragskontonummerKennzeichen(versicherungsverhaeltnis.getHvbBeitragskontonummerKennzeichen());
	  bto.setMeldendeStelle(versicherungsverhaeltnis.getMeldendeStelle());
	  bto.setVersicherungszeiten(getVersicherungszeitBTOList(versicherungsverhaeltnis));

	  return bto;
	}
  }

  private List<VersicherungszeitBTO> getVersicherungszeitBTOList(Versicherungsverhaeltnis versicherungsverhaeltnis) {
	List<VersicherungszeitBTO> versicherungszeitBTOList = new ArrayList<>();

	if(versicherungsverhaeltnis.getVersicherungszeiten() != null) {
	  for(Versicherungszeit versicherungszeit : versicherungsverhaeltnis.getVersicherungszeiten().getVersicherungszeit()) {
		versicherungszeitBTOList.add(versicherungszeitBTOExternalServiceMapper.map(versicherungszeit));
	  }
	}

	return versicherungszeitBTOList;
  }
}
