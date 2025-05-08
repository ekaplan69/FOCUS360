package at.sozvers.noegkk.focus.service.kontaktneu;

import at.sozvers.noegkk.focus.service.api.kontaktneu.KontaktBTO;
import at.sozvers.noegkk.focus.service.common.DateUtil;
import at.sozvers.noegkk.focus.service.mapping.BTOExternalServiceMapper;
import at.sozvers.noegkk.sckont.kontakt.focus.Kontaktkontakt;

public class KontaktBTOExternalServiceMapper extends BTOExternalServiceMapper<KontaktBTO, Kontaktkontakt> {

  @Override
  public KontaktBTO map(Kontaktkontakt kontaktkontakt) {
	KontaktBTO bto = new KontaktBTO();
	boolean    agd = false;

	if(kontaktkontakt.getAgd() != null) {
	  agd = kontaktkontakt.getAgd().equals("J");
	}

	bto.setAbschlussartId(kontaktkontakt.getAbschlussartId());
	bto.setAufgabengebietId(kontaktkontakt.getAufgabengebietId());
	bto.setAgd(agd);
	bto.setAgdFachschluessel(kontaktkontakt.getAgdFachschluessel());
	bto.setAgdName(kontaktkontakt.getAgdName());
	bto.setAnmerkung(kontaktkontakt.getAnmerkung());
	bto.setBundesland(kontaktkontakt.getBundesland());
	bto.setEndeTs(DateUtil.toLocalDateTime(kontaktkontakt.getEndeTs()));
	bto.setErstellt(kontaktkontakt.getErstellt());
	bto.setErstelltName(kontaktkontakt.getErstelltName());
	bto.setExterneGewalt(kontaktkontakt.getExterneGewalt());
	bto.setFachschluessel(kontaktkontakt.getFachschluessel());
	bto.setFachschluesselArtKurz(kontaktkontakt.getFachschluesselArtKurz());
	bto.setFremdsystemId(kontaktkontakt.getFremdsystemId());
	bto.setFremdsystemName(kontaktkontakt.getFremdsystemName());
	bto.setGemeinde(kontaktkontakt.getGemeinde());
	bto.setGemeindeCode(kontaktkontakt.getGemeindeCode());
	bto.setKontaktId(kontaktkontakt.getKontaktId());
	bto.setKontaktartId(kontaktkontakt.getKontaktartId());
	bto.setLetztAend(kontaktkontakt.getLetztAend());
	bto.setLetztAendName(kontaktkontakt.getLetztAendName());
	bto.setMitarbeiterName(kontaktkontakt.getMitarbeiterName());
	bto.setMitarbeiterOe(kontaktkontakt.getMitarbeiterOe());
	bto.setNacherfassenGrund(kontaktkontakt.getNacherfassenGrund());
	bto.setNacherfassenGrund(kontaktkontakt.getNacherfassenGrund());
	bto.setNacherfassenText(kontaktkontakt.getNacherfassenText());
	bto.setName(kontaktkontakt.getName());
	bto.setOrt(kontaktkontakt.getOrt());
	bto.setPlz(kontaktkontakt.getPlz());
	bto.setPolBezirk(kontaktkontakt.getPolBezirk());
	bto.setScIdMa(kontaktkontakt.getScIdMa());
	bto.setStaatIsoa3(kontaktkontakt.getStaatIsoa3());
	bto.setStartTs(DateUtil.toLocalDateTime(kontaktkontakt.getStartTs()));
	bto.setThemaId(kontaktkontakt.getThemaId());
	bto.setUnterthemaId(kontaktkontakt.getUnterthemaId());
	bto.setSubAufgabengebietId(kontaktkontakt.getSubAufgabengebietId());
	bto.setUpdatecount(kontaktkontakt.getUpdatecount());
	bto.setScBezeichnung(kontaktkontakt.getScBezeichnung());

	return bto;
  }
}
