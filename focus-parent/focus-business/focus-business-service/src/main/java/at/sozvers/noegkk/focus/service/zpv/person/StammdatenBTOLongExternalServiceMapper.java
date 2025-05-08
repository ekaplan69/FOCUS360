package at.sozvers.noegkk.focus.service.zpv.person;

import javax.xml.datatype.XMLGregorianCalendar;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import at.sozialversicherung.schema.zpv.ibs.partnerlesenlang_20_0.*;
import at.sozvers.noegkk.focus.service.api.zpv.person.StammdatenBTO;
import at.sozvers.noegkk.focus.service.common.DateUtil;
import at.sozvers.noegkk.focus.service.common.Fachschluessel;
import at.sozvers.noegkk.focus.service.mapping.BTOExternalServiceMapper;
import jakarta.enterprise.context.Dependent;

import static at.sozvers.noegkk.focus.service.zpv.infrastructure.ZpvConstants.FACHSCHLUESSELART_KURZ_BTNR;
import static at.sozvers.noegkk.focus.service.zpv.infrastructure.ZpvConstants.FACHSCHLUESSELART_KURZ_VSNR;

@Dependent
public class StammdatenBTOLongExternalServiceMapper extends BTOExternalServiceMapper<StammdatenBTO, DtoPartnerLELO> {
  private Fachschluessel fachschluessel;

  public StammdatenBTO map(DtoPartnerLELO dtoPartnerLELO, Fachschluessel fachschluessel) {
	this.fachschluessel = fachschluessel;
	try {
	  return map(dtoPartnerLELO);
	} finally {
	  this.fachschluessel = null;
	}
  }

  @Override
  public StammdatenBTO map(DtoPartnerLELO dtoPartnerLELO) {
	StammdatenBTO bto = new StammdatenBTO();

	if(dtoPartnerLELO == null || dtoPartnerLELO.getDtoPartnerListe().isEmpty()) {
	  return bto;
	}

	DtoPerson dtoPerson = (DtoPerson) dtoPartnerLELO.getDtoPartnerListe().get(0);

	DtoPartnerrolleKurz dtoPartnerrolleKurz = dtoPartnerLELO.getDtoPartnerrolleKurzListe().stream().filter(s -> s.getFsPartnerrolle().equals(fachschluessel.getFachschluessel()))
															.collect(Collectors.toList()).get(0);
	bto.setStorniert("J".equals(dtoPartnerrolleKurz.getStornoJN()));
	bto.setParParrolleIDPartnerrolle(dtoPartnerrolleKurz.getParParrolleIDPartnerrolle());
	if(FACHSCHLUESSELART_KURZ_VSNR.equals(dtoPartnerrolleKurz.getFachschluesselartKurzbez())) {
	  bto.setPartnerVersicherterRolleId(dtoPerson.getParParrolleIDPartner());
	} else if(FACHSCHLUESSELART_KURZ_BTNR.equals(dtoPartnerrolleKurz.getFachschluesselartKurzbez())) {
	  bto.setPartnerBetreuterRolleId((dtoPerson.getParParrolleIDPartner()));
	}

	bto.setGueltigeVSNR(dtoPartnerLELO.getDtoPartnerrolleKurzListe().stream().filter(s -> s.getFachschluesselartKurzbez().equals(this.fachschluessel.getFachschluesselArt()) && !s.getFsPartnerrolle()
																																												  .equals(fachschluessel.getFachschluessel()) && s.getStornoJN()
																																																								  .equals("N"))
									  .map(DtoPartnerrolleKurz::getFsPartnerrolle).collect(Collectors.toList()));

	bto.setNameOhneAnrede(getName(dtoPerson.getDtoNamenszusammenfassungDiakritisch()));
	bto.setAnrede(getAnrede(dtoPerson.getDtoNamenszusammenfassungDiakritisch()));
	if(!"".equals(bto.getAnrede())) {
	  bto.setName(bto.getAnrede() + " " + bto.getNameOhneAnrede());
	} else {
	  bto.setName(bto.getNameOhneAnrede());
	}

	bto.setGeschlecht(dtoPerson.getGeschlechtKZ());
	if(dtoPerson.getBestaetigtesGeburtsDAT() != null) {
	  bto.setGeburtsDatum(DateUtil.toLocalDate(dtoPerson.getBestaetigtesGeburtsDAT()));
	} else {
	  bto.setGeburtsDatum(null);
	}

	if(dtoPerson.getBestaetigtesTodesDAT() != null) {
	  bto.setBestaetigtesSterbeDat(DateUtil.toLocalDate(dtoPerson.getBestaetigtesTodesDAT()));
	} else {
	  bto.setBestaetigtesSterbeDat(null);
	}

	if(dtoPerson.getFamilienname() != null) {
	  bto.setNameFamiliennameGross(bto.getName().replace(dtoPerson.getFamilienname(), dtoPerson.getFamilienname().toUpperCase()));
	}
	if(dtoPerson.getFamilienname() != null) {
	  bto.setFamilienname(dtoPerson.getFamilienname());
	}
	if(dtoPerson.getVorname() != null) {
	  bto.setVorname(dtoPerson.getVorname());
	}

	List<DtoAuskunftssperreKurz> dtoAuskunftssperreKurzList = dtoPerson.getDtoAuskunftssperreKurzListe();
	bto.setAuskunftsSperre(auskunftssperreIsActive(dtoAuskunftssperreKurzList));

	// @formatter:off
        bto.setAuskunftsSperreGruende(dtoAuskunftssperreKurzList.stream()
                .filter(
                        this::auskunftssperreIsInGueltigkeitszeitraum)
                .map(DtoAuskunftssperreKurz::getAuskunftssperregrund)
                .collect(Collectors.toList())
        );

        DtoAnschriftKurz dtoAnschriftKurz = dtoPartnerLELO.getDtoAnschriftKurz();
        if(dtoAnschriftKurz != null) {
            bto.setStaatIsoA3(dtoAnschriftKurz.getStaatIsoA3());
            bto.setStaat(dtoAnschriftKurz.getStaatenbezeichnungKurz());
            if(dtoAnschriftKurz instanceof  DtoAnschriftStrasseKurz){
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

        if (namensZeile2 == null) {
            return namensZeile1;
        } else {
            return namensZeile2;
        }
    }

    private String getAnrede(DtoNamenszusammenfassungDiakritisch namenszusammenfassung) {
        String namensZeile1 = namenszusammenfassung.getNamenzeileDiakritisch1();
        String namensZeile2 = namenszusammenfassung.getNamenzeileDiakritisch2();

        if (namensZeile2 == null) {
            return "";
        } else {
            return namensZeile1;
        }
    }

    private boolean auskunftssperreIsActive(List<DtoAuskunftssperreKurz> dtoAuskunftssperreKurzList) {
        boolean isActive = false;
        for (DtoAuskunftssperreKurz auskunftssperreKurz : dtoAuskunftssperreKurzList) {
            if (auskunftssperreIsInGueltigkeitszeitraum(auskunftssperreKurz)) {
                isActive = true;
                break;
            }
        }
        return isActive;
    }

    private boolean auskunftssperreIsInGueltigkeitszeitraum(DtoAuskunftssperreKurz dtoAuskunftssperre) {
        LocalDate now = LocalDate.now();
        LocalDate gueltigBisDat = now;

        LocalDate gueltigVonDat = DateUtil.toLocalDate(dtoAuskunftssperre.getBkGueltigkeitszeitraum().getGueltigVonDAT());
        XMLGregorianCalendar gueltigBisDatGreg = dtoAuskunftssperre.getBkGueltigkeitszeitraum().getGueltigBisDAT();

        if (gueltigBisDatGreg != null) {
            gueltigBisDat = DateUtil.toLocalDate(gueltigBisDatGreg);
        }

        return dtoAuskunftssperre.getStornoJN().equals("N") && (gueltigVonDat.isBefore(now) || gueltigVonDat.isEqual(now)) &&
                (gueltigBisDat.isAfter(now) || gueltigBisDat.isEqual(now));
    }

}
