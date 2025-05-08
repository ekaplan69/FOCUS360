package at.sozvers.noegkk.focus.service.kontaktneu;

import at.sozvers.noegkk.focus.service.api.kontaktneu.KontaktKontaktartBTO;
import at.sozvers.noegkk.focus.service.common.DateUtil;
import at.sozvers.noegkk.focus.service.mapping.BTOExternalServiceMapper;
import at.sozvers.noegkk.sckont.kontakt.focus.Kontaktkontaktart;

public class KontaktartBTOExternalServiceMapper extends BTOExternalServiceMapper<KontaktKontaktartBTO, Kontaktkontaktart> {

  @Override
  public KontaktKontaktartBTO map(Kontaktkontaktart kontaktkontaktart) {
	KontaktKontaktartBTO bto = new KontaktKontaktartBTO();

	bto.setKontaktartId(kontaktkontaktart.getKontaktartId());
	bto.setKontaktartBezeichnung(kontaktkontaktart.getKontaktartBezeichnung());
	bto.setKontaktartHilfetext(kontaktkontaktart.getKontaktartHilfetext());
	bto.setGueltigVon(DateUtil.toLocalDateTime(kontaktkontaktart.getGueltigVon()));
	bto.setGueltigBis(DateUtil.toLocalDateTime(kontaktkontaktart.getGueltigBis()));

	return bto;
  }
}
