package at.sozvers.noegkk.focus.service.kontaktneu;

import at.sozvers.noegkk.focus.service.api.kontaktneu.KontaktThemaBTO;
import at.sozvers.noegkk.focus.service.common.DateUtil;
import at.sozvers.noegkk.focus.service.mapping.BTOExternalServiceMapper;
import at.sozvers.noegkk.sckont.kontakt.focus.Kontaktthema;

public class KontaktThemaBTOExternalServiceMapper extends BTOExternalServiceMapper<KontaktThemaBTO, Kontaktthema> {

  @Override
  public KontaktThemaBTO map(Kontaktthema kontaktthema) {
	KontaktThemaBTO bto = new KontaktThemaBTO();

	bto.setThemaId(kontaktthema.getThemaId());
	bto.setThemaBezeichnung(kontaktthema.getThemaBezeichnung());
	bto.setThemaHilfetext(kontaktthema.getThemaHilfetext());
	bto.setGueltigBis(DateUtil.toLocalDateTime(kontaktthema.getGueltigBis()));
	bto.setGueltigVon(DateUtil.toLocalDateTime(kontaktthema.getGueltigVon()));

	return bto;
  }
}
