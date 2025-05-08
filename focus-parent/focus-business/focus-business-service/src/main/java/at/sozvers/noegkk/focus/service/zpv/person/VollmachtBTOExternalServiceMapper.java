package at.sozvers.noegkk.focus.service.zpv.person;

import javax.xml.datatype.XMLGregorianCalendar;
import java.time.LocalDate;
import at.sozialversicherung.schema.zpv.ibs.beziehungsuchen_11_0.*;
import at.sozvers.noegkk.focus.service.api.zpv.person.VollmachtBTO;
import at.sozvers.noegkk.focus.service.common.DateUtil;
import at.sozvers.noegkk.focus.service.mapping.BTOExternalServiceMapper;

public class VollmachtBTOExternalServiceMapper extends BTOExternalServiceMapper<VollmachtBTO, DtoBeziehungAllgemeinSUO> {

  @Override
  public VollmachtBTO map(DtoBeziehungAllgemeinSUO dtoBeziehungAllgemeinSUO) {
	VollmachtBTO bto = new VollmachtBTO();

	if(dtoBeziehungAllgemeinSUO == null || !vollmachtIsInGueltigkeitszeitraum(dtoBeziehungAllgemeinSUO)) {
	  return bto;
	}

	if(dtoBeziehungAllgemeinSUO instanceof DtoBeziehungGesetzlicheVertrSUO) {
	  DtoBeziehungGesetzlicheVertrSUO gesvSUO = (DtoBeziehungGesetzlicheVertrSUO) dtoBeziehungAllgemeinSUO;
	  bto.setArtDerVollmacht(gesvSUO.getVertretungsumfang());
	}

	if(dtoBeziehungAllgemeinSUO instanceof DtoBeziehungBevollmaechtigterSUO) {
	  DtoBeziehungBevollmaechtigterSUO bevolSUO = (DtoBeziehungBevollmaechtigterSUO) dtoBeziehungAllgemeinSUO;
	  bto.setArtDerVollmacht(bevolSUO.getVollmachtsumfang());
	}

	bto.setName(getNameWithAnrede(dtoBeziehungAllgemeinSUO.getDtoPartnerKurzBezugspartner().getDtoNamenszusammenfassungDiakritisch()));
	bto.setBeziehungsart(dtoBeziehungAllgemeinSUO.getBeziehungsartbez());
	XMLGregorianCalendar vonDat = dtoBeziehungAllgemeinSUO.getBkGueltigkeitszeitraum().getGueltigVonDAT();
	XMLGregorianCalendar bisDat = dtoBeziehungAllgemeinSUO.getBkGueltigkeitszeitraum().getGueltigBisDAT();

	bto.setGueltigVon(DateUtil.toLocalDate(vonDat));

	if(bisDat != null) {
	  bto.setGueltigBis(DateUtil.toLocalDate(bisDat));
	}

	return bto;
  }

  private boolean vollmachtIsInGueltigkeitszeitraum(DtoBeziehungAllgemeinSUO dtoBeziehungAllgemeinSUO) {
	LocalDate now           = LocalDate.now();
	LocalDate gueltigBisDat = now;

	LocalDate            gueltigVonDat     = DateUtil.toLocalDate(dtoBeziehungAllgemeinSUO.getBkGueltigkeitszeitraum().getGueltigVonDAT());
	XMLGregorianCalendar gueltigBisDatGreg = dtoBeziehungAllgemeinSUO.getBkGueltigkeitszeitraum().getGueltigBisDAT();

	if(gueltigBisDatGreg != null) {
	  gueltigBisDat = DateUtil.toLocalDate(gueltigBisDatGreg);
	}

	return (dtoBeziehungAllgemeinSUO.getBkStornoinformation() == null || "N".equals(dtoBeziehungAllgemeinSUO.getBkStornoinformation().getStornoJN())) && (gueltigVonDat.isBefore(
			now) || gueltigVonDat.isEqual(now)) && (gueltigBisDat.isAfter(now) || gueltigBisDat.isEqual(now));
  }

  private String getNameWithAnrede(DtoNamenszusammenfassungDiakritisch namenszusammenfassung) {
	if(namenszusammenfassung == null) {
	  return "";
	}

	String namensZeile1 = namenszusammenfassung.getNamenzeileDiakritisch1();
	String namensZeile2 = namenszusammenfassung.getNamenzeileDiakritisch2();

	if(namensZeile2 == null) {
	  return namensZeile1;
	} else {
	  return namensZeile1 + " " + namensZeile2;
	}
  }
}
