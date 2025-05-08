package at.sozvers.noegkk.focus.service.kva.gbfsuc;

import at.sozvers.kva.schema.gebuehrenbefreiung.suchen.GebuehrenbefreiungDTO;
import at.sozvers.noegkk.focus.service.api.kva.gbfsuc.GebuehrenbefreiungBTO;
import at.sozvers.noegkk.focus.service.mapping.BTOExternalServiceMapper;

public class GebuehrenbefreiungBTOExternalServiceMapper extends BTOExternalServiceMapper<GebuehrenbefreiungBTO, GebuehrenbefreiungDTO> {

  @Override
  public GebuehrenbefreiungBTO map(GebuehrenbefreiungDTO gebuehrenbefreiung) {
	if(gebuehrenbefreiung == null) {
	  return null;
	} else {
	  GebuehrenbefreiungBTO bto = new GebuehrenbefreiungBTO();
	  bto.setBefreiung(gebuehrenbefreiung.getGbfTypBez());
	  bto.setBefreiungsgrund(gebuehrenbefreiung.getGbfGrundbez());
	  if(gebuehrenbefreiung.getVondat() != null) {
		bto.setVonDate(gebuehrenbefreiung.getVondat().toGregorianCalendar().getTime());
	  }
	  if(gebuehrenbefreiung.getBisdat() != null) {
		bto.setBisDate(gebuehrenbefreiung.getBisdat().toGregorianCalendar().getTime());
	  }
	  return bto;
	}
  }
}
