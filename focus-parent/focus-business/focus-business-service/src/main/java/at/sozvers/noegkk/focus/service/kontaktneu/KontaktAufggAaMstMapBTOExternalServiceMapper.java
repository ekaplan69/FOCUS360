package at.sozvers.noegkk.focus.service.kontaktneu;

import at.sozvers.noegkk.focus.service.api.kontaktneu.KontaktAufggAaMstMapBTO;
import at.sozvers.noegkk.focus.service.common.DateUtil;
import at.sozvers.noegkk.focus.service.mapping.BTOExternalServiceMapper;
import at.sozvers.noegkk.sckont.kontakt.focus.KontaktAufggAaMstMap;

public class KontaktAufggAaMstMapBTOExternalServiceMapper extends BTOExternalServiceMapper<KontaktAufggAaMstMapBTO, KontaktAufggAaMstMap> {

  @Override
  public KontaktAufggAaMstMapBTO map(KontaktAufggAaMstMap kontaktAufggAaMstMap) {
	KontaktAufggAaMstMapBTO bto = new KontaktAufggAaMstMapBTO();

	bto.setAbschlussartId(kontaktAufggAaMstMap.getAbschlussartId());
	bto.setAufggAaMstMapId(kontaktAufggAaMstMap.getAufggAaMstMapId());
	bto.setAnzeigenAls(kontaktAufggAaMstMap.getAnzeigenAls());
	bto.setMstCode(kontaktAufggAaMstMap.getMstCode());
	bto.setAufgabengebietId(kontaktAufggAaMstMap.getAufgabengebietId());
	bto.setGueltigVon(DateUtil.toLocalDateTime(kontaktAufggAaMstMap.getGueltigVon()));
	bto.setGueltigBis(DateUtil.toLocalDateTime(kontaktAufggAaMstMap.getGueltigBis()));

	return bto;
  }
}
