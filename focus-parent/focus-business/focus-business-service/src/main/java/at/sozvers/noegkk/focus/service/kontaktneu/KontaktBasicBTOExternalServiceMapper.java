package at.sozvers.noegkk.focus.service.kontaktneu;

import at.sozvers.noegkk.focus.service.api.kontaktneu.KontaktBasicBTO;
import at.sozvers.noegkk.focus.service.common.DateUtil;
import at.sozvers.noegkk.focus.service.mapping.BTOExternalServiceMapper;
import at.sozvers.noegkk.sckont.kontakt.focus.KontaktkontaktKurz;

public class KontaktBasicBTOExternalServiceMapper extends BTOExternalServiceMapper<KontaktBasicBTO, KontaktkontaktKurz> {

  @Override
  public KontaktBasicBTO map(KontaktkontaktKurz kontaktkontaktKurz) {
	KontaktBasicBTO bto = new KontaktBasicBTO();

	bto.setAbschlussart(kontaktkontaktKurz.getAbschlussart());
	bto.setId(kontaktkontaktKurz.getId());
	bto.setEndeTs(DateUtil.toLocalDateTime(kontaktkontaktKurz.getEndeTs()));
	bto.setKontaktart(kontaktkontaktKurz.getKontaktart());
	bto.setStartTs(DateUtil.toLocalDateTime(kontaktkontaktKurz.getStartTs()));
	bto.setScBezeichnung(kontaktkontaktKurz.getScBezeichnung());
	bto.setMitarbeiterOe(kontaktkontaktKurz.getMitarbeiterOe());
	bto.setAufgabengebiet(kontaktkontaktKurz.getAufgabengebiet());
	bto.setThema(kontaktkontaktKurz.getThema());

	return bto;
  }
}
