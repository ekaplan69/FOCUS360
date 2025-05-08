package at.sozvers.noegkk.focus.service.zpv.person;

import at.sozialversicherung.schema.zpv.ibs.partnersuchen_14_0.*;
import at.sozvers.noegkk.focus.service.api.zpv.person.SuchpersonBTO;
import at.sozvers.noegkk.focus.service.common.DateUtil;
import at.sozvers.noegkk.focus.service.mapping.BTOExternalServiceMapper;
import jakarta.enterprise.context.Dependent;

@Dependent
public class SuchpersonBTOExternalServiceMapper extends BTOExternalServiceMapper<SuchpersonBTO, DtoPartnerSUO> {

  @Override
  public SuchpersonBTO map(DtoPartnerSUO dtoPartnerSUO) {
	SuchpersonBTO bto = new SuchpersonBTO();

	if(dtoPartnerSUO.getDtoAnschriftKurzListe() != null && !dtoPartnerSUO.getDtoAnschriftKurzListe().isEmpty()) {
	  DtoAnschriftStrasseKurz hauptanschrift = (DtoAnschriftStrasseKurz) dtoPartnerSUO.getDtoAnschriftKurzListe().get(0);
	  bto.setPlz(hauptanschrift.getPostleitzahl());
	  bto.setAdresse(hauptanschrift.getStrasse() + " " + hauptanschrift.getHausnummer());
	  if(hauptanschrift.getStockTuernummer() != null && !hauptanschrift.getStockTuernummer().isEmpty()) {
		bto.setAdresse(bto.getAdresse() + "/" + hauptanschrift.getStockTuernummer());
	  }
	  bto.setOrt(hauptanschrift.getOrt());
	}

	if(dtoPartnerSUO.getDtoPartnerKurz() != null) {
	  if(dtoPartnerSUO.getDtoPartnerKurz() instanceof DtoPersonKurz) {
		DtoPersonKurz personKurz = (DtoPersonKurz) dtoPartnerSUO.getDtoPartnerKurz();
		bto.setVorname(personKurz.getDtoPersonDiakritisch().getVornameDiakritisch());
		bto.setNachname(personKurz.getDtoPersonDiakritisch().getFamiliennameDiakritisch());
		bto.setGeburtsdatum(DateUtil.toLocalDateOrNull(personKurz.getBestaetigtesGeburtsDAT()));
	  } else if(dtoPartnerSUO.getDtoPartnerKurz() instanceof DtoOrganisationKurz) {
		DtoOrganisationKurz organisationKurz = (DtoOrganisationKurz) dtoPartnerSUO.getDtoPartnerKurz();
		bto.setOrgName(organisationKurz.getDtoOrganisationDiakritisch().getOrganisationsnameDiakritisch());
	  }
	}

	if(dtoPartnerSUO.getDtoPartnerrolleKurzListe() != null && !dtoPartnerSUO.getDtoPartnerrolleKurzListe().isEmpty()) {
	  bto.setFachschluessel(dtoPartnerSUO.getDtoPartnerrolleKurzListe().get(0).getFsPartnerrolle());
	  bto.setPrid(dtoPartnerSUO.getDtoPartnerrolleKurzListe().get(0).getParParrolleIDPartnerrolle().toString());
	}

	return bto;
  }
}
