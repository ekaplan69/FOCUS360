package at.sozvers.noegkk.focus.service.beschwerde;

import at.sozvers.noegkk.focus.service.api.beschwerde.BeschwerdeBTO;
import at.sozvers.noegkk.focus.service.common.DateUtil;
import at.sozvers.noegkk.focus.service.mapping.BTOExternalServiceMapper;
import at.sozvers.noegkk.sckont.beschwerde.focus.BeschwerdeKurz;

public class BeschwerdeBTOExternalServiceMapper extends BTOExternalServiceMapper<BeschwerdeBTO, BeschwerdeKurz> {

  @Override
  public BeschwerdeBTO map(BeschwerdeKurz beschwerdeKurz) {
	BeschwerdeBTO bto = new BeschwerdeBTO();

	bto.setKanalBezeichnung(beschwerdeKurz.getKanalBez());
	bto.setFachbereichBezeichnung(beschwerdeKurz.getFachbereichBez());
	bto.setBeschwerdeId(beschwerdeKurz.getBeschwerdeId());
	bto.setKontaktpunktBezeichnung(beschwerdeKurz.getKontaktpunktBez());
	bto.setThemaBezeichnung(beschwerdeKurz.getThemaBez());
	bto.setZeitpunkt(DateUtil.toLocalDateTime(beschwerdeKurz.getZeitpunkt()));
	bto.setStatusId(beschwerdeKurz.getStatusId());
	bto.setStorno(beschwerdeKurz.isStorno());

	return bto;
  }
}
