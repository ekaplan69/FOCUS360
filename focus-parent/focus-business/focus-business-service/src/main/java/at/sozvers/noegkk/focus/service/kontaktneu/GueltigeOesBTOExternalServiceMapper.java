package at.sozvers.noegkk.focus.service.kontaktneu;

import at.sozvers.noegkk.focus.service.api.kontaktneu.GueltigeOeBTO;
import at.sozvers.noegkk.focus.service.mapping.BTOExternalServiceMapper;
import at.sozvers.noegkk.sckont.kontakt.focus.GueltigeOe;

public class GueltigeOesBTOExternalServiceMapper extends BTOExternalServiceMapper<GueltigeOeBTO, GueltigeOe> {

  @Override
  public GueltigeOeBTO map(GueltigeOe oe) {
	GueltigeOeBTO bto = new GueltigeOeBTO();

	bto.setId(oe.getId());
	bto.setBezeichnung(oe.getBezeichnung());
	bto.setBere_org(oe.getBereOrg());

	return bto;
  }
}
