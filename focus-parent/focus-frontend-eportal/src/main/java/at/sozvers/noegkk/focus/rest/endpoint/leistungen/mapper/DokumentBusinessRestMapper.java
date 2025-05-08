package at.sozvers.noegkk.focus.rest.endpoint.leistungen.mapper;

import at.sozvers.noegkk.focus.rest.api.lgkk.DokumentDTO;
import at.sozvers.noegkk.focus.rest.mapping.BusinessRestMapper;
import at.sozvers.noegkk.focus.service.api.lgkk.DokumentBTO;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class DokumentBusinessRestMapper extends BusinessRestMapper<DokumentDTO, DokumentBTO> {

  @Override
  public DokumentDTO map(DokumentBTO bto) {
	DokumentDTO dto = new DokumentDTO();
	dto.setDokumentklasse(bto.getDokumentklasse().replace("Ã¤", "ä").replace("Ã¿", "ä")); //LGK liefert manchmal komische Werte
	dto.setEinlangdatum(bto.getEinlangdatum());
	dto.setDokumentreferenz(bto.getDokumentreferenz());
	dto.setKategorie(bto.getKategorie());
	dto.setThema(bto.getThema());
	dto.setVersendungsart(bto.getVersendungsart());

	return dto;
  }
}
