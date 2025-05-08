package at.sozvers.noegkk.focus.service.ecmawf;

import at.sozvers.focus.ws.generated.DokumentTyp;
import at.sozvers.noegkk.focus.service.api.ecmawf.DokumentBTO;
import at.sozvers.noegkk.focus.service.common.DateUtil;
import at.sozvers.noegkk.focus.service.mapping.BTOExternalServiceMapper;

public class DokumentBTOExternalServiceMapper extends BTOExternalServiceMapper<DokumentBTO, DokumentTyp> {

  @Override
  public DokumentBTO map(DokumentTyp dokumentTyp) {
	DokumentBTO bto = new DokumentBTO();
	//TODO: definieren was in ungesetzte Felder kommen soll
	//        bto.setArt();
	bto.setDokumentId(dokumentTyp.getId());
	bto.setDokumentenklasse(dokumentTyp.getDokumentKlasse());
	bto.setDatum(DateUtil.getLocalDateFromGregorianCalendar(dokumentTyp.getErstelltAm()));
	//        bto.setKategorie(dokumentTyp.get);
	//        bto.setThema();
	return bto;
  }
}
