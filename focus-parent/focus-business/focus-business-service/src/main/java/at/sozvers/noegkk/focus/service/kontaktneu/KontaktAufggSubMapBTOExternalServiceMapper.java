package at.sozvers.noegkk.focus.service.kontaktneu;

import at.sozvers.noegkk.focus.service.api.kontaktneu.KontaktAufggSubMapBTO;
import at.sozvers.noegkk.focus.service.common.DateUtil;
import at.sozvers.noegkk.focus.service.mapping.BTOExternalServiceMapper;
import at.sozvers.noegkk.sckont.kontakt.focus.KontaktAufggSubMap;

public class KontaktAufggSubMapBTOExternalServiceMapper extends BTOExternalServiceMapper<KontaktAufggSubMapBTO, KontaktAufggSubMap> {

  @Override
  public KontaktAufggSubMapBTO map(KontaktAufggSubMap kontaktAufggSubMap) {
	KontaktAufggSubMapBTO bto = new KontaktAufggSubMapBTO();

	bto.setId(kontaktAufggSubMap.getId());
	bto.setAufgabengebietId(kontaktAufggSubMap.getAufgabengebietId());
	bto.setSubAufgabengebietId(kontaktAufggSubMap.getSubAufgabengebietId());
	bto.setGueltigVon(DateUtil.toLocalDateTime(kontaktAufggSubMap.getGueltigVon()));
	bto.setGueltigBis(DateUtil.toLocalDateTime(kontaktAufggSubMap.getGueltigBis()));

	return bto;
  }
}
