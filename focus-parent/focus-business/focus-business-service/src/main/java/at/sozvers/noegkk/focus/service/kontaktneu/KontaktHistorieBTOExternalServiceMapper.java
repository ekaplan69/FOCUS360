package at.sozvers.noegkk.focus.service.kontaktneu;

import at.sozvers.noegkk.focus.service.api.kontaktneu.KontaktHistorieBTO;
import at.sozvers.noegkk.focus.service.mapping.BTOExternalServiceMapper;

public class KontaktHistorieBTOExternalServiceMapper extends BTOExternalServiceMapper<KontaktHistorieBTO, String> {

  @Override
  public KontaktHistorieBTO map(String s) {
	KontaktHistorieBTO bto = new KontaktHistorieBTO();

	bto.setFachschluessel(s);

	return bto;
  }
}
