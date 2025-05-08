package at.sozvers.noegkk.focus.service.kontaktneu;

import at.sozvers.noegkk.focus.service.api.kontaktneu.KontaktErstellenAendernBTO;
import at.sozvers.noegkk.focus.service.common.DateUtil;
import at.sozvers.noegkk.focus.service.mapping.BTOExternalServiceMapper;
import at.sozvers.noegkk.sckont.kontakt.focus.KontaktkontaktAendernRequest;
import at.sozvers.noegkk.sckont.kontakt.focus.KontaktkontaktErstellenRequest;

public class KontaktErstellenAendernBTOExternalServiceMapper extends BTOExternalServiceMapper<KontaktErstellenAendernBTO, KontaktkontaktErstellenRequest> {

  @Override
  public KontaktkontaktErstellenRequest map(KontaktErstellenAendernBTO bto) {
	KontaktkontaktErstellenRequest request = new KontaktkontaktErstellenRequest();

	request.setAbschlussartId(bto.getAbschlussartId());
	request.setAgd(bto.isAgd() ? "J" : "N");
	request.setAgdFachschluessel(bto.getAgdFachschluessel());
	request.setAgdName(bto.getAgdName());
	request.setAnmerkung(bto.getAnmerkung());
	request.setAufgabengebietId(bto.getAufgabengebietId());
	request.setBundesland(bto.getBundesland());
	request.setExterneGewalt(bto.getExterneGewalt());
	request.setFachschluessel(bto.getFachschluessel());
	request.setFachschluesselArtKurz(bto.getFachschluesselArtKurz());
	request.setFremdsystemId(bto.getFremdsystemId());
	request.setFremdsystemName(bto.getFremdsystemName());
	request.setGemeinde(bto.getGemeinde());
	request.setGemeindeCode(bto.getGemeindeCode());
	request.setKontaktartId(bto.getKontaktartId());
	request.setMitarbeiterName(bto.getMitarbeiterName());
	request.setMitarbeiterOe(bto.getMitarbeiterOe());
	request.setMitarbeiterkennung(bto.getMitarbeiterkennung());
	request.setNacherfassenGrund(bto.getNacherfassenGrund());
	request.setNacherfassenText(bto.getNacherfassenText());
	request.setName(bto.getName());
	request.setOrt(bto.getOrt());
	request.setPlz(bto.getPlz());
	request.setPolBezirk(bto.getPolBezirk());
	request.setScIdMa(bto.getScIdMa());
	request.setStaatIsoa3(bto.getStaatIsoa3());
	request.setSubAufgabengebietId(bto.getSubAufgabengebietId());
	request.setThemaId(bto.getThemaId());
	request.setUnterthemaId(bto.getUnterthemaId());

	return request;
  }

  public KontaktkontaktAendernRequest mapUpdate(KontaktErstellenAendernBTO bto) {
	KontaktkontaktAendernRequest request = new KontaktkontaktAendernRequest();

	request.setAbschlussartId(bto.getAbschlussartId());
	request.setAgd(bto.isAgd() ? "J" : "N");
	request.setAgdFachschluessel(bto.getAgdFachschluessel());
	request.setAgdName(bto.getAgdName());
	request.setAnmerkung(bto.getAnmerkung());
	request.setAufgabengebietId(bto.getAufgabengebietId());
	request.setBundesland(bto.getBundesland());
	request.setExterneGewalt(bto.getExterneGewalt());
	request.setFachschluessel(bto.getFachschluessel());
	request.setFachschluesselArtKurz(bto.getFachschluesselArtKurz());
	request.setFremdsystemId(bto.getFremdsystemId());
	request.setFremdsystemName(bto.getFremdsystemName());
	request.setGemeinde(bto.getGemeinde());
	request.setGemeindeCode(bto.getGemeindeCode());
	request.setKontaktId(bto.getKontaktId());
	request.setKontaktartId(bto.getKontaktartId());
	request.setLetztAend(DateUtil.toXMLGregorianCalendar(bto.getLetztAend()));
	request.setLetztAendName(bto.getLetztAendName());
	request.setMitarbeiterName(bto.getMitarbeiterName());
	request.setMitarbeiterOe(bto.getMitarbeiterOe());
	request.setMitarbeiterkennung(bto.getMitarbeiterkennung());
	request.setNacherfassenGrund(bto.getNacherfassenGrund());
	request.setNacherfassenText(bto.getNacherfassenText());
	request.setName(bto.getName());
	request.setOrt(bto.getOrt());
	request.setPlz(bto.getPlz());
	request.setPolBezirk(bto.getPolBezirk());
	request.setScIdMa(bto.getScIdMa());
	request.setStaatIsoa3(bto.getStaatIsoa3());
	request.setThemaId(bto.getThemaId());
	request.setUpdatecount(bto.getUpdatecount());
	request.setUnterthemaId(bto.getUnterthemaId());

	return request;
  }
}
