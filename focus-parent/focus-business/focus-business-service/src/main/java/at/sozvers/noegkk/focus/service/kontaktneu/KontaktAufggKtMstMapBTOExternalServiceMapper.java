package at.sozvers.noegkk.focus.service.kontaktneu;

import at.sozvers.noegkk.focus.service.api.kontaktneu.KontaktAufggKtMstMapBTO;
import at.sozvers.noegkk.focus.service.common.DateUtil;
import at.sozvers.noegkk.focus.service.mapping.BTOExternalServiceMapper;
import at.sozvers.noegkk.sckont.kontakt.focus.KontaktAufggKtMstMap;

public class KontaktAufggKtMstMapBTOExternalServiceMapper extends BTOExternalServiceMapper<KontaktAufggKtMstMapBTO, KontaktAufggKtMstMap> {

  @Override
  public KontaktAufggKtMstMapBTO map(KontaktAufggKtMstMap kontaktAufggKtMstMap) {
	KontaktAufggKtMstMapBTO bto = new KontaktAufggKtMstMapBTO();

	bto.setKontaktartId(kontaktAufggKtMstMap.getKontaktartId());
	bto.setAufggKtMstMapId(kontaktAufggKtMstMap.getAufggKtMstMapId());
	bto.setMstCode(kontaktAufggKtMstMap.getMstCode());
	bto.setAnzeigenAls(kontaktAufggKtMstMap.getAnzeigenAls());
	bto.setAufgabengebietId(kontaktAufggKtMstMap.getAufgabengebietId());
	bto.setGueltigVon(DateUtil.toLocalDateTime(kontaktAufggKtMstMap.getGueltigVon()));
	bto.setGueltigBis(DateUtil.toLocalDateTime(kontaktAufggKtMstMap.getGueltigBis()));

	return bto;
  }
}
