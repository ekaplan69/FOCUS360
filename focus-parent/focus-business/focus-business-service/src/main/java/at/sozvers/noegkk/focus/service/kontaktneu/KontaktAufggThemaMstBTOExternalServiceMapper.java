package at.sozvers.noegkk.focus.service.kontaktneu;

import at.sozvers.noegkk.focus.service.api.kontaktneu.KontaktAufggThemaMstBTO;
import at.sozvers.noegkk.focus.service.common.DateUtil;
import at.sozvers.noegkk.focus.service.mapping.BTOExternalServiceMapper;
import at.sozvers.noegkk.sckont.kontakt.focus.KontaktAufggThemaMstMap;

public class KontaktAufggThemaMstBTOExternalServiceMapper extends BTOExternalServiceMapper<KontaktAufggThemaMstBTO, KontaktAufggThemaMstMap> {

  @Override
  public KontaktAufggThemaMstBTO map(KontaktAufggThemaMstMap kontaktAufggThemaMstMap) {
	KontaktAufggThemaMstBTO bto = new KontaktAufggThemaMstBTO();

	bto.setAufgabengebietId(kontaktAufggThemaMstMap.getAufgabengebietId());
	bto.setAnzeigenAls(kontaktAufggThemaMstMap.getAnzeigenAls());
	bto.setMstCode(kontaktAufggThemaMstMap.getMstCode());
	bto.setGueltigVon(DateUtil.toLocalDateTime(kontaktAufggThemaMstMap.getGueltigVon()));
	bto.setGueltigBis(DateUtil.toLocalDateTime(kontaktAufggThemaMstMap.getGueltigBis()));
	bto.setThemaId(kontaktAufggThemaMstMap.getThemaId());
	bto.setAufggThemaMstMapId(kontaktAufggThemaMstMap.getAufggThemaMstMapId());

	return bto;
  }
}
