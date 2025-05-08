package at.sozvers.noegkk.focus.service.kontaktneu;

import at.sozvers.noegkk.focus.service.api.kontaktneu.KontaktAufgabengebietBTO;
import at.sozvers.noegkk.focus.service.common.DateUtil;
import at.sozvers.noegkk.focus.service.mapping.BTOExternalServiceMapper;
import at.sozvers.noegkk.sckont.kontakt.focus.Kontaktaufgabengebiet;

public class KontaktAufgabengebietBTOExternalServiceMapper extends BTOExternalServiceMapper<KontaktAufgabengebietBTO, Kontaktaufgabengebiet> {

  @Override
  public KontaktAufgabengebietBTO map(Kontaktaufgabengebiet kontaktaufgabengebiet) {
	KontaktAufgabengebietBTO bto = new KontaktAufgabengebietBTO();

	bto.setAufgabengebietId(kontaktaufgabengebiet.getAufgabengebietId());
	bto.setAufgabengebietBezeichnung(kontaktaufgabengebiet.getAufgabengebietBezeichnung());
	bto.setAufgabengebietHilfetext(kontaktaufgabengebiet.getAufgabengebietHilfetext());
	bto.setGueltigVon(DateUtil.toLocalDateTime(kontaktaufgabengebiet.getGueltigVon()));
	bto.setGueltigBis(DateUtil.toLocalDateTime(kontaktaufgabengebiet.getGueltigBis()));
	bto.setAnzeigeAls(kontaktaufgabengebiet.getAnzeigeAls());
	bto.setSubAufgabengebietJN(kontaktaufgabengebiet.getSubAufgabengebietJN());

	return bto;
  }
}
