package at.sozvers.noegkk.focus.rest.endpoint.kva.gbfsuc;

import java.time.ZoneId;
import at.sozvers.noegkk.focus.rest.api.kva.gbfsuc.GebuehrenbefreiungDTO;
import at.sozvers.noegkk.focus.rest.mapping.BusinessRestMapper;
import at.sozvers.noegkk.focus.service.api.kva.gbfsuc.GebuehrenbefreiungBTO;

public class GebuehrenbefreiungBusinessRestMapper extends BusinessRestMapper<GebuehrenbefreiungDTO, GebuehrenbefreiungBTO> {

  @Override
  public GebuehrenbefreiungDTO map(GebuehrenbefreiungBTO bto) {
	GebuehrenbefreiungDTO dto = new GebuehrenbefreiungDTO();
	dto.setBefreiung(bto.getBefreiung());
	dto.setBefreiungsgrund(bto.getBefreiungsgrund());
	if(bto.getVonDate() != null) {
	  dto.setGueltigVon(bto.getVonDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
	}
	if(bto.getBisDate() != null) {
	  dto.setGueltigBis(bto.getBisDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
	}
	return dto;
  }
}
