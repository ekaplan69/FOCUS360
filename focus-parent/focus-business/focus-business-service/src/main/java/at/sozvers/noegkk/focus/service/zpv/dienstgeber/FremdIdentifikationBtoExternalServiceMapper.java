package at.sozvers.noegkk.focus.service.zpv.dienstgeber;

import javax.xml.datatype.XMLGregorianCalendar;
import java.util.LinkedList;
import java.util.List;
import at.sozialversicherung.schema.zpv.ibs.partnerlesenlang_20_0.DtoFremdidentifikationKurz;
import at.sozvers.noegkk.focus.service.api.zpv.dienstgeber.FremdIdentifikationBTO;
import at.sozvers.noegkk.focus.service.common.DateUtil;
import at.sozvers.noegkk.focus.service.mapping.BTOExternalServiceMapper;

public class FremdIdentifikationBtoExternalServiceMapper extends BTOExternalServiceMapper<FremdIdentifikationBTO, DtoFremdidentifikationKurz> {

  @Override
  public List<FremdIdentifikationBTO> mapToBtoList(List<DtoFremdidentifikationKurz> dtoFremdidentifikationKurzList) {
	List<FremdIdentifikationBTO> btoList = new LinkedList<>();

	for(DtoFremdidentifikationKurz dtoFremdidentifikationKurz : dtoFremdidentifikationKurzList) {
	  btoList.add(map(dtoFremdidentifikationKurz));
	}

	return btoList;
  }

  @Override
  public FremdIdentifikationBTO map(DtoFremdidentifikationKurz dtoFremdidentifikationKurz) {
	FremdIdentifikationBTO bto = new FremdIdentifikationBTO();

	bto.setFachschluessel(dtoFremdidentifikationKurz.getFachschluessel());
	bto.setFachschluesselArt(dtoFremdidentifikationKurz.getFachschluesselart());
	bto.setFachschluesselArtKurz(dtoFremdidentifikationKurz.getFachschluesselartKurz());

	XMLGregorianCalendar dtoVon = dtoFremdidentifikationKurz.getBkGueltigkeitszeitraum().getGueltigVonDAT();
	XMLGregorianCalendar dtoBis = dtoFremdidentifikationKurz.getBkGueltigkeitszeitraum().getGueltigBisDAT();

	bto.setGueltigVon(DateUtil.toLocalDateOrNull(dtoVon));
	bto.setGueltigBis(DateUtil.toLocalDateOrNull(dtoBis));

	return bto;
  }
}
