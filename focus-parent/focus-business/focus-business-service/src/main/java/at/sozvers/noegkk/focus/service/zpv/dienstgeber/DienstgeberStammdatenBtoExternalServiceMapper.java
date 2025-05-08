package at.sozvers.noegkk.focus.service.zpv.dienstgeber;

import java.util.List;
import at.sozialversicherung.schema.zpv.ibs.partnerlesenlang_20_0.*;
import at.sozvers.noegkk.focus.service.api.zpv.dienstgeber.DienstgeberStammdatenBTO;
import at.sozvers.noegkk.focus.service.api.zpv.dienstgeber.FremdIdentifikationBTO;
import at.sozvers.noegkk.focus.service.mapping.BTOExternalServiceMapper;
import jakarta.inject.Inject;

public class DienstgeberStammdatenBtoExternalServiceMapper extends BTOExternalServiceMapper<DienstgeberStammdatenBTO, DtoPartnerLELO> {

  @Inject
  private FremdIdentifikationBtoExternalServiceMapper fremdIdentifikationBtoExternalServiceMapper;

  @Override
  public DienstgeberStammdatenBTO map(DtoPartnerLELO dtoPartnerLELO) {
	DienstgeberStammdatenBTO bto = new DienstgeberStammdatenBTO();

	List<DtoPartner> partnerList = dtoPartnerLELO.getDtoPartnerListe();
	if(partnerList == null || partnerList.isEmpty()) {
	  return null;
	}
	DtoPartner dtoPartner = partnerList.get(0);

	String name = dtoPartner.getDtoNamenszusammenfassungDiakritisch().getNamenzeileDiakritisch1();

	if(dtoPartner.getDtoNamenszusammenfassungDiakritisch().getNamenzeileDiakritisch2() != null) {
	  name += " " + dtoPartner.getDtoNamenszusammenfassungDiakritisch().getNamenzeileDiakritisch2();
	}

	bto.setName(name);
	bto.setStorniert(dtoPartner.getBkStornoinformation() != null && "J".equals(dtoPartner.getBkStornoinformation().getStornoJN()));

	bto.setParParrolleIDPartner(dtoPartner.getParParrolleIDPartner());

	bto.setFirmenbuchNr(fremdIdentifikationBtoExternalServiceMapper.mapToBtoList(dtoPartnerLELO.getDtoFremdidentifikationKurzListe().stream()
																							   .filter(dtoFremdidentifikationKurz -> FremdIdentifikationBTO.FIRMENBUCHNR.equals(
																									   dtoFremdidentifikationKurz.getFachschluesselartKurz())).toList()));

	bto.setKur(fremdIdentifikationBtoExternalServiceMapper.mapToBtoList(
			dtoPartnerLELO.getDtoFremdidentifikationKurzListe().stream().filter(dtoFremdidentifikationKurz -> FremdIdentifikationBTO.KUR.equals(dtoFremdidentifikationKurz.getFachschluesselartKurz()))
						  .toList()));

	bto.setUid(fremdIdentifikationBtoExternalServiceMapper.mapToBtoList(
			dtoPartnerLELO.getDtoFremdidentifikationKurzListe().stream().filter(dtoFremdidentifikationKurz -> FremdIdentifikationBTO.UID.equals(dtoFremdidentifikationKurz.getFachschluesselartKurz()))
						  .toList()));

	DtoAnschriftKurz dtoAnschriftKurz = dtoPartnerLELO.getDtoAnschriftKurz();
	if(dtoAnschriftKurz != null) {
	  bto.setStaatIsoA3(dtoAnschriftKurz.getStaatIsoA3());
	  for(DtoAnschriftVerwaltungsgliederung dtoAV : dtoAnschriftKurz.getDtoAnschriftVerwaltungsgliederungListe()) {
		bto.setGemeinde(dtoAV.getGemeinde());
		bto.setGemeindecode(dtoAV.getGemeindecode());
		bto.setBundesland(dtoAV.getBundesland());
		bto.setPolBezirk(dtoAV.getPolitischerBezirk());
	  }
	}

	return bto;
  }
}
