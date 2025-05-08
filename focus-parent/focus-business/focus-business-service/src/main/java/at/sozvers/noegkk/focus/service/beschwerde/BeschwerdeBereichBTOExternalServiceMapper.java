package at.sozvers.noegkk.focus.service.beschwerde;

import at.sozvers.noegkk.focus.service.api.beschwerde.BeschwerdeBereichBTO;
import at.sozvers.noegkk.focus.service.mapping.BTOExternalServiceMapper;
import at.sozvers.noegkk.sckont.beschwerde.focus.Beschwerdebereich;

public class BeschwerdeBereichBTOExternalServiceMapper extends BTOExternalServiceMapper<BeschwerdeBereichBTO, Beschwerdebereich> {

  @Override
  public BeschwerdeBereichBTO map(Beschwerdebereich beschwerdebereich) {
	BeschwerdeBereichBTO bto = new BeschwerdeBereichBTO();

	bto.setBeschwerdebereichId(beschwerdebereich.getBeschwerdebereichId());
	bto.setFachbereichBezeichnung(beschwerdebereich.getFachbereichBezeichnung());
	bto.setFachbereichDetailBezeichnung(beschwerdebereich.getFachbereichDetailBezeichnung());
	bto.setFachbereichDetailHilfetext(beschwerdebereich.getFachbereichDetailHilfetext());
	bto.setFachbereichHilfetext(beschwerdebereich.getFachbereichHilfetext());
	bto.setFachbereichId(beschwerdebereich.getFachbereichId());
	bto.setThemaBezeichnung(beschwerdebereich.getThemaBezeichnung());
	bto.setThemaHilfetext(beschwerdebereich.getThemaHilfetext());
	bto.setThemaId(beschwerdebereich.getThemaId());

	return bto;
  }
}
