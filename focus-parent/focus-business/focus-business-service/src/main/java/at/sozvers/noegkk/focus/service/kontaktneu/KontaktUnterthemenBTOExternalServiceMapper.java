package at.sozvers.noegkk.focus.service.kontaktneu;

import at.sozvers.noegkk.focus.service.api.kontaktneu.KontaktUnterthemaBTO;
import at.sozvers.noegkk.focus.service.mapping.BTOExternalServiceMapper;
import at.sozvers.noegkk.sckont.kontakt.focus.Kontaktunterthema;

public class KontaktUnterthemenBTOExternalServiceMapper extends BTOExternalServiceMapper<KontaktUnterthemaBTO, Kontaktunterthema> {

  @Override
  public KontaktUnterthemaBTO map(Kontaktunterthema kontaktunterthema) {
	KontaktUnterthemaBTO bto = new KontaktUnterthemaBTO();

	bto.setUnterthemaId(kontaktunterthema.getId());
	bto.setUnterthemaBezeichnung(kontaktunterthema.getBezeichnung());

	return bto;
  }
}
