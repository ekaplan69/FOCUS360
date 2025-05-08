package at.sozvers.noegkk.focus.rest.endpoint.kontaktneu;

import at.sozvers.noegkk.focus.rest.api.kontaktneu.KontaktDTO;
import at.sozvers.noegkk.focus.rest.mapping.BusinessRestMapper;
import at.sozvers.noegkk.focus.service.api.kontaktneu.KontaktBTO;

public class KontaktBusinessRestMapper extends BusinessRestMapper<KontaktDTO, KontaktBTO> {

  @Override
  public KontaktDTO map(KontaktBTO bto) {
	KontaktDTO dto = new KontaktDTO();

	dto.setAbschlussartId(bto.getAbschlussartId());
	dto.setAufgabengebietId(bto.getAufgabengebietId());
	dto.setAgd(bto.isAgd());
	dto.setAgdFachschluessel(bto.getAgdFachschluessel());
	dto.setAgdName(bto.getAgdName());
	dto.setAnmerkung(bto.getAnmerkung());
	dto.setBundesland(bto.getBundesland());
	dto.setEndeTs(bto.getEndeTs());
	dto.setErstellt(bto.getErstellt());
	dto.setErstelltName(bto.getErstelltName());
	dto.setExterneGewalt(bto.getExterneGewalt());
	dto.setFachschluessel(bto.getFachschluessel());
	dto.setFachschluesselArtKurz(bto.getFachschluesselArtKurz());
	dto.setFremdsystemId(bto.getFremdsystemId());
	dto.setFremdsystemName(bto.getFremdsystemName());
	dto.setGemeinde(bto.getGemeinde());
	dto.setGemeindeCode(bto.getGemeindeCode());
	dto.setKontaktId(bto.getKontaktId());
	dto.setKontaktartId(bto.getKontaktartId());
	dto.setLetztAend(bto.getLetztAend());
	dto.setLetztAendName(bto.getLetztAendName());
	dto.setMitarbeiterName(bto.getMitarbeiterName());
	dto.setMitarbeiterOe(bto.getMitarbeiterOe());
	dto.setNacherfassenGrund(bto.getNacherfassenGrund());
	dto.setNacherfassenGrund(bto.getNacherfassenGrund());
	dto.setNacherfassenText(bto.getNacherfassenText());
	dto.setName(bto.getName());
	dto.setOrt(bto.getOrt());
	dto.setPlz(bto.getPlz());
	dto.setPolBezirk(bto.getPolBezirk());
	dto.setScIdMa(bto.getScIdMa());
	dto.setStaatIsoa3(bto.getStaatIsoa3());
	dto.setStartTs(bto.getStartTs());
	dto.setThemaId(bto.getThemaId());
	dto.setUnterthemaId(bto.getUnterthemaId());
	dto.setUpdatecount(bto.getUpdatecount());
	dto.setScBezeichnung(bto.getScBezeichnung());
	dto.setSubAufgabengebietId(bto.getSubAufgabengebietId());

	return dto;
  }
}
