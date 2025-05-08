package at.sozvers.noegkk.focus.rest.endpoint.ecmawf;

import at.sozvers.noegkk.focus.rest.api.ecmawf.DokumentDTO;
import at.sozvers.noegkk.focus.rest.mapping.BusinessRestMapper;
import at.sozvers.noegkk.focus.service.api.ecmawf.DokumentBTO;
import jakarta.enterprise.context.Dependent;

@Dependent
public class DokumentBusinessRestMapper extends BusinessRestMapper<DokumentDTO, DokumentBTO> {

  @Override
  public DokumentDTO map(DokumentBTO bto) {
	DokumentDTO dto = new DokumentDTO();
	dto.setArt(bto.getArt());
	dto.setDatum(bto.getDatum());
	dto.setDokumentId(bto.getDokumentId());
	dto.setAnzeigeUrl(bto.getAnzeigeUrl());
	dto.setKategorie(bto.getKategorie());
	dto.setDokumentenklasse(bto.getDokumentenklasse());

	return dto;
  }
}
