package at.sozvers.noegkk.focus.service.kva.gbfsuc;

import javax.xml.datatype.DatatypeConfigurationException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;
import at.itsv.noegkk.commons.RequestHeadersCommons;
import at.sozvers.kva.schema.gebuehrenbefreiung.suchen.*;
import at.sozvers.noegkk.focus.service.api.kva.gbfsuc.GebuehrenbefreiungBTO;
import at.sozvers.noegkk.focus.service.common.Fachschluessel;
import at.sozvers.noegkk.focus.service.common.SubsystemNotAvailableException;
import at.sozvers.noegkk.focus.ws.client.kva.gbfsuc.*;
import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class GebuehrenbefreiungService {

  @Inject
  private GebuehrenbefreiungBTOExternalServiceMapper gebuehrenbefreiungBTOExternalServiceMapper;
  @Inject
  private GebuehrenbefreiungLesenRequestFactory      gebuehrenbefreiungLesenRequestFactory;
  @Inject
  @KVAGbfsucService
  private KvaGbfsucClient                            kvaGbfsucClient;
  @Inject
  private RequestHeadersCommons                      requestHeadersCommons;

  public List<GebuehrenbefreiungBTO> searchGebuehrenbefreiungenByFachschluessel(Fachschluessel fs) throws DatatypeConfigurationException {
	GebuehrenbefreiunRequest  request = gebuehrenbefreiungLesenRequestFactory.createGbfsucRequest(fs.getFachschluessel(), "0");
	GebuehrenbefreiunResponse response;
	try {
	  response = kvaGbfsucClient.sucheGebuehrenbefreiungen_2_0(request, requestHeadersCommons);
	} catch(Exception e) {
	  throw new SubsystemNotAvailableException(e);
	}
	return mapGebuehrenbefreiungToBTOList(response.getGebuehrenbefreiungen());
  }

  private List<GebuehrenbefreiungBTO> mapGebuehrenbefreiungToBTOList(List<GebuehrenbefreiungDTO> gebuehrenbefreiungList) {
	List<GebuehrenbefreiungDTO>   filteredGebuehrenbefreiungList = filterGebuehrenbefreiung(gebuehrenbefreiungList);
	Stream<GebuehrenbefreiungDTO> mappingStream                  = filteredGebuehrenbefreiungList.stream();
	return mappingStream.map(gebuehrenbefreiung -> gebuehrenbefreiungBTOExternalServiceMapper.map(gebuehrenbefreiung)).toList();
  }

  private List<GebuehrenbefreiungDTO> filterGebuehrenbefreiung(List<GebuehrenbefreiungDTO> gebuehrenbefreiungList) {
	Stream<GebuehrenbefreiungDTO> filterGebuehrenbefreiungStream = gebuehrenbefreiungList.stream();
	return filterGebuehrenbefreiungStream.filter(this::isGebuehrenbefreiungActive).toList();
  }

  private boolean isGebuehrenbefreiungActive(GebuehrenbefreiungDTO gebuehrenbefreiung) {
	return !"s".equalsIgnoreCase(gebuehrenbefreiung.getGbfstatuskz()) && (gebuehrenbefreiung.getBisdat() == null || gebuehrenbefreiung.getBisdat().toGregorianCalendar().getTime().compareTo(
			Date.from(LocalDate.now().atStartOfDay(ZoneId.systemDefault()).toInstant())) >= 0) && (gebuehrenbefreiung.getVondat() == null || gebuehrenbefreiung.getVondat().toGregorianCalendar()
																																							   .getTime().compareTo(
					Date.from(LocalDate.now().atStartOfDay(ZoneId.systemDefault()).toInstant())) <= 0);
  }
}
