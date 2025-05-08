package at.sozvers.noegkk.focus.service.zpv.person;

import javax.xml.datatype.XMLGregorianCalendar;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import at.sozialversicherung.schema.zpv.ibs.partnerlesenkurz_15_0.*;
import at.sozvers.noegkk.focus.service.api.zpv.person.StammdatenBTO;
import at.sozvers.noegkk.focus.service.common.DateUtil;
import at.sozvers.noegkk.focus.service.mapping.BTOExternalServiceMapper;
import jakarta.enterprise.context.Dependent;

import static at.sozvers.noegkk.focus.service.zpv.infrastructure.ZpvConstants.FACHSCHLUESSELART_KURZ_BTNR;
import static at.sozvers.noegkk.focus.service.zpv.infrastructure.ZpvConstants.FACHSCHLUESSELART_KURZ_VSNR;

@Dependent
public class StammdatenBTOExternalServiceMapper extends BTOExternalServiceMapper<StammdatenBTO, DtoPartnerLEKO> {

  @Override
  public StammdatenBTO map(DtoPartnerLEKO dtoPartnerLEKO) {
	StammdatenBTO bto = new StammdatenBTO();

	if(dtoPartnerLEKO == null || dtoPartnerLEKO.getDtoPartnerKurz() == null) {
	  return bto;
	}

	DtoPartnerKurz dtoPartnerKurz = dtoPartnerLEKO.getDtoPartnerKurz();

	bto.setNameOhneAnrede(getName(dtoPartnerKurz.getDtoNamenszusammenfassungDiakritisch()));
	bto.setAnrede(getAnrede(dtoPartnerKurz.getDtoNamenszusammenfassungDiakritisch()));
	if(!"".equals(bto.getAnrede())) {
	  bto.setName(bto.getAnrede() + " " + bto.getNameOhneAnrede());
	} else {
	  bto.setName(bto.getNameOhneAnrede());
	}

	bto.setStorniert("J".equals(dtoPartnerKurz.getStornoJN()));

	if(dtoPartnerKurz instanceof DtoPersonKurz) {
	  DtoPersonKurz person = (DtoPersonKurz) dtoPartnerKurz;
	  bto.setGeschlecht(person.getGeschlechtKZ());
	  if(person.getBestaetigtesGeburtsDAT() != null) {
		bto.setGeburtsDatum(DateUtil.toLocalDate(person.getBestaetigtesGeburtsDAT()));
	  } else {
		bto.setGeburtsDatum(null);
	  }

	  if(person.getFamilienname() != null) {
		bto.setNameFamiliennameGross(bto.getName().replace(person.getFamilienname(), person.getFamilienname().toUpperCase()));
	  }
	  if(person.getFamilienname() != null) {
		bto.setFamilienname(person.getFamilienname());
	  }
	  if(person.getVorname() != null) {
		bto.setVorname(person.getVorname());
	  }

	  List<DtoAuskunftssperreKurz> dtoAuskunftssperreKurzList = person.getDtoAuskunftssperreKurzListe();
	  bto.setAuskunftsSperre(auskunftssperreIsActive(dtoAuskunftssperreKurzList));

	  // @formatter:off
            bto.setAuskunftsSperreGruende(dtoAuskunftssperreKurzList.stream()
                    .filter(
                            this::auskunftssperreIsInGueltigkeitszeitraum)
                    .map(DtoAuskunftssperreKurz::getAuskunftssperregrund)
                    .collect(Collectors.toList())
            );
            // @formatter:on
	}

	DtoPartnerrolleKurz dtoPartnerrolleKurz = dtoPartnerLEKO.getDtoPartnerrolleKurz();
	if(dtoPartnerrolleKurz != null && FACHSCHLUESSELART_KURZ_VSNR.equals(dtoPartnerrolleKurz.getFachschluesselartKurzbez())) {
	  bto.setPartnerVersicherterRolleId(dtoPartnerKurz.getParParrolleIDPartner());
	} else if(dtoPartnerrolleKurz != null && FACHSCHLUESSELART_KURZ_BTNR.equals(dtoPartnerrolleKurz.getFachschluesselartKurzbez())) {
	  bto.setPartnerBetreuterRolleId((dtoPartnerKurz.getParParrolleIDPartner()));
	}

	DtoAnschriftKurz dtoAnschriftKurz = dtoPartnerLEKO.getDtoAnschriftKurz();
	if(dtoAnschriftKurz != null) {
	  bto.setStaatIsoA3(dtoAnschriftKurz.getStaatIsoA3());
	  bto.setStaat(dtoAnschriftKurz.getStaatenbezeichnungKurz());
	  if(dtoAnschriftKurz instanceof DtoAnschriftStrasseKurz) {
		bto.setStrasse(((DtoAnschriftStrasseKurz) dtoAnschriftKurz).getStrasse());
		bto.setHausnummer(((DtoAnschriftStrasseKurz) dtoAnschriftKurz).getHausnummer());
	  }
	  for(DtoAnschriftVerwaltungsgliederung dtoAnschriftVerwaltungsgliederung : dtoAnschriftKurz.getDtoAnschriftVerwaltungsgliederungListe()) {
		bto.setGemeindecode(dtoAnschriftVerwaltungsgliederung.getGemeindecode());
		bto.setGemeinde(dtoAnschriftVerwaltungsgliederung.getGemeinde());
		bto.setBundesland(dtoAnschriftVerwaltungsgliederung.getBundesland());
		bto.setPolBezirk(dtoAnschriftVerwaltungsgliederung.getPolitischerBezirk());
	  }
	}

	return bto;
  }

  private String getName(DtoNamenszusammenfassungDiakritisch namenszusammenfassung) {
	String namensZeile1 = namenszusammenfassung.getNamenzeileDiakritisch1();
	String namensZeile2 = namenszusammenfassung.getNamenzeileDiakritisch2();

	if(namensZeile2 == null) {
	  return namensZeile1;
	} else {
	  return namensZeile2;
	}
  }

  private String getAnrede(DtoNamenszusammenfassungDiakritisch namenszusammenfassung) {
	String namensZeile1 = namenszusammenfassung.getNamenzeileDiakritisch1();
	String namensZeile2 = namenszusammenfassung.getNamenzeileDiakritisch2();

	if(namensZeile2 == null) {
	  return "";
	} else {
	  return namensZeile1;
	}
  }

  private boolean auskunftssperreIsActive(List<DtoAuskunftssperreKurz> dtoAuskunftssperreKurzList) {
	boolean isActive = false;
	for(DtoAuskunftssperreKurz auskunftssperreKurz : dtoAuskunftssperreKurzList) {
	  if(auskunftssperreIsInGueltigkeitszeitraum(auskunftssperreKurz)) {
		isActive = true;
		break;
	  }
	}
	return isActive;
  }

  private boolean auskunftssperreIsInGueltigkeitszeitraum(DtoAuskunftssperreKurz dtoAuskunftssperre) {
	LocalDate now           = LocalDate.now();
	LocalDate gueltigBisDat = now;

	LocalDate            gueltigVonDat     = DateUtil.toLocalDate(dtoAuskunftssperre.getBkGueltigkeitszeitraum().getGueltigVonDAT());
	XMLGregorianCalendar gueltigBisDatGreg = dtoAuskunftssperre.getBkGueltigkeitszeitraum().getGueltigBisDAT();

	if(gueltigBisDatGreg != null) {
	  gueltigBisDat = DateUtil.toLocalDate(gueltigBisDatGreg);
	}

	return dtoAuskunftssperre.getStornoJN().equals("N") && (gueltigVonDat.isBefore(now) || gueltigVonDat.isEqual(now)) && (gueltigBisDat.isAfter(now) || gueltigBisDat.isEqual(now));
  }
}
