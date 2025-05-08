package at.sozvers.noegkk.focus.service.kontaktneu;

import at.sozvers.noegkk.focus.service.api.kontaktneu.KontaktAbschlussartBTO;
import at.sozvers.noegkk.focus.service.common.DateUtil;
import at.sozvers.noegkk.focus.service.mapping.BTOExternalServiceMapper;
import at.sozvers.noegkk.sckont.kontakt.focus.Kontaktabschlussart;

public class KontaktAbschlussartBTOExternalServiceMapper extends BTOExternalServiceMapper<KontaktAbschlussartBTO, Kontaktabschlussart> {

  @Override
  public KontaktAbschlussartBTO map(Kontaktabschlussart kontaktabschlussart) {
	KontaktAbschlussartBTO bto = new KontaktAbschlussartBTO();

	bto.setAbschlussartBezeichnung(kontaktabschlussart.getAbschlussartBezeichnung());
	bto.setAbschlussartId(kontaktabschlussart.getAbschlussartId());
	bto.setAbschlussartHilfetext(kontaktabschlussart.getAbschlussartHilfetext());
	bto.setGueltigVon(DateUtil.toLocalDateTime(kontaktabschlussart.getGueltigVon()));
	bto.setGueltigBis(DateUtil.toLocalDateTime(kontaktabschlussart.getGueltigBis()));

	return bto;
  }
}
