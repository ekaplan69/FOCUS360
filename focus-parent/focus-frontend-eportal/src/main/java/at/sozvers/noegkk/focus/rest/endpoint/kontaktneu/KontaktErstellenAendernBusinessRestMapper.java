package at.sozvers.noegkk.focus.rest.endpoint.kontaktneu;

import at.sozvers.noegkk.focus.rest.api.kontaktneu.KontaktErstellenAendernDTO;
import at.sozvers.noegkk.focus.rest.mapping.BusinessRestMapper;
import at.sozvers.noegkk.focus.service.api.kontaktneu.KontaktErstellenAendernBTO;

public class KontaktErstellenAendernBusinessRestMapper extends BusinessRestMapper<KontaktErstellenAendernDTO, KontaktErstellenAendernBTO> {

  @Override
  public KontaktErstellenAendernBTO map(KontaktErstellenAendernDTO dto) {
	KontaktErstellenAendernBTO bto = new KontaktErstellenAendernBTO();

	bto.setAbschlussartId(dto.getAbschlussartId());
	bto.setAgd(dto.isAgd());
	bto.setAgdFachschluessel(dto.getAgdFachschluessel());
	bto.setAgdName(dto.getAgdName());
	bto.setAnmerkung(dto.getAnmerkung());
	bto.setAufgabengebietId(dto.getAufgabengebietId());
	bto.setBundesland(dto.getBundesland());
	bto.setEndeTs(dto.getEndeTs());
	bto.setExterneGewalt(dto.getExterneGewalt());
	bto.setFachschluessel(dto.getFachschluessel());
	bto.setFachschluesselArtKurz(dto.getFachschluesselArtKurz());
	bto.setFremdsystemId(dto.getFremdsystemId());
	bto.setFremdsystemName(dto.getFremdsystemName());
	bto.setGemeinde(dto.getGemeinde());
	bto.setGemeindeCode(dto.getGemeindeCode());
	bto.setKontaktId(dto.getKontaktId());
	bto.setKontaktartId(dto.getKontaktartId());
	bto.setLetztAend(dto.getLetztAend());
	bto.setLetztAendName(dto.getLetztAendName());
	bto.setMitarbeiterName(dto.getMitarbeiterName());
	bto.setMitarbeiterOe(dto.getMitarbeiterOe());
	bto.setMitarbeiterkennung(dto.getMitarbeiterkennung());
	bto.setNacherfassenGrund(dto.getNacherfassenGrund());
	bto.setNacherfassenText(dto.getNacherfassenText());
	bto.setName(dto.getName());
	bto.setOrt(dto.getOrt());
	bto.setPlz(dto.getPlz());
	bto.setPolBezirk(dto.getPolBezirk());
	bto.setScIdMa(dto.getScIdMa());
	bto.setStaatIsoa3(dto.getStaatIsoa3());
	bto.setStartTs(dto.getStartTs());
	bto.setSubAufgabengebietId(dto.getSubAufgabengebietId());
	bto.setThemaId(dto.getThemaId());
	bto.setUpdatecount(dto.getUpdatecount());
	bto.setUnterthemaId(dto.getUnterthemaId());

	return bto;
  }
}
