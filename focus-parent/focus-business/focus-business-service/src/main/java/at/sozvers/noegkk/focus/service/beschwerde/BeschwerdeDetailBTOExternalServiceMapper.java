package at.sozvers.noegkk.focus.service.beschwerde;

import at.sozvers.noegkk.focus.service.api.beschwerde.BeschwerdeDetailBTO;
import at.sozvers.noegkk.focus.service.common.DateUtil;
import at.sozvers.noegkk.focus.service.mapping.BTOExternalServiceMapper;
import at.sozvers.noegkk.sckont.beschwerde.focus.Beschwerde;

public class BeschwerdeDetailBTOExternalServiceMapper extends BTOExternalServiceMapper<BeschwerdeDetailBTO, Beschwerde> {

  @Override
  public BeschwerdeDetailBTO map(Beschwerde beschwerde) {
	BeschwerdeDetailBTO bto = new BeschwerdeDetailBTO();

	bto.setBeschreibung(beschwerde.getBeschreibung());
	bto.setBeschwerdegruendeIds(beschwerde.getBeschwerdegruende());
	bto.setBeschwerdegrundAnmerkung(beschwerde.getBeschwerdegrundAnmerkung());
	bto.setEmail(beschwerde.getEmail());
	bto.setFachbereichDetailId(beschwerde.getFachbereichDetailId());
	bto.setKanalId(beschwerde.getKanalId());
	bto.setKontaktpunktId(beschwerde.getKontaktpunktId());
	bto.setMassnahmen(beschwerde.getMassnahmen());
	bto.setMeldendeStelleId(beschwerde.getMeldendeStelleId());
	bto.setMitarbeitername(beschwerde.getMitarbeitername());
	bto.setStatusId(beschwerde.getStatusId());
	bto.setTelefon(beschwerde.getTelefon());
	bto.setUpdatecount(beschwerde.getUpdatecount());
	bto.setZeitpunkt(DateUtil.toLocalDateTime(beschwerde.getZeitpunkt()));
	bto.setStorno(beschwerde.isStorno());

	return bto;
  }
}
