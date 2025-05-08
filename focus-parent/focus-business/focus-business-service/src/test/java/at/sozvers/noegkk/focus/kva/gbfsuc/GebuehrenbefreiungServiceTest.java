package at.sozvers.noegkk.focus.kva.gbfsuc;

import javax.xml.datatype.*;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.*;
import at.sozvers.kva.schema.gebuehrenbefreiung.suchen.GebuehrenbefreiunResponse;
import at.sozvers.kva.schema.gebuehrenbefreiung.suchen.GebuehrenbefreiungDTO;
import at.sozvers.noegkk.focus.service.api.kva.gbfsuc.GebuehrenbefreiungBTO;
import at.sozvers.noegkk.focus.service.common.Fachschluessel;
import at.sozvers.noegkk.focus.service.common.SubsystemNotAvailableException;
import at.sozvers.noegkk.focus.service.kva.gbfsuc.GebuehrenbefreiungBTOExternalServiceMapper;
import at.sozvers.noegkk.focus.service.kva.gbfsuc.GebuehrenbefreiungService;
import at.sozvers.noegkk.focus.ws.client.kva.gbfsuc.GebuehrenbefreiungLesenRequestFactory;
import at.sozvers.noegkk.focus.ws.client.kva.gbfsuc.KvaGbfsucClient;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(MockitoExtension.class)
class GebuehrenbefreiungServiceTest {

  @Mock
  private KvaGbfsucClient                            mockedClient;
  @Mock
  private GebuehrenbefreiungLesenRequestFactory      mockedFactory;
  @Spy
  private GebuehrenbefreiungBTOExternalServiceMapper mockedMapper;
  @Mock
  private GebuehrenbefreiunResponse                  mockedResponse;
  @InjectMocks
  private GebuehrenbefreiungService                  service;

  @Test
  void test_searchGebuehrenbefreiungByFachschluessel__throwsException() throws Exception {
	Fachschluessel fs = Fachschluessel.of("1111111111", "VSNR");
	Mockito.when(mockedClient.sucheGebuehrenbefreiungen_2_0(Mockito.any(), Mockito.any())).thenThrow(SubsystemNotAvailableException.class);
	assertThrows(SubsystemNotAvailableException.class, () -> service.searchGebuehrenbefreiungenByFachschluessel(fs));
  }

  @Test
  void test_searchGebuehrenbefreiungByFachschluessel_success() throws Exception {
	Fachschluessel fs = Fachschluessel.of("1111111111", "VSNR");

	GebuehrenbefreiungDTO dto1 = new GebuehrenbefreiungDTO();
	dto1.setGbfGrundbez("Testgrundbezeichnung1");
	dto1.setGbfTypBez("Testtypbezeichnung1");

	GebuehrenbefreiungDTO dto2 = new GebuehrenbefreiungDTO();
	dto2.setGbfGrundbez("Testgrundbezeichnung2");
	dto2.setGbfTypBez("Testtypbezeichnung2");

	List<GebuehrenbefreiungDTO> dtoList = new ArrayList<>();
	dtoList.add(dto1);
	dtoList.add(dto2);

	Mockito.when(mockedClient.sucheGebuehrenbefreiungen_2_0(Mockito.any(), Mockito.any())).thenReturn(mockedResponse);
	Mockito.when(mockedResponse.getGebuehrenbefreiungen()).thenReturn(dtoList);

	List<GebuehrenbefreiungBTO> btoList = service.searchGebuehrenbefreiungenByFachschluessel(fs);
	assertEquals(2, btoList.size());
	assertEquals("Testgrundbezeichnung1", btoList.get(0).getBefreiungsgrund());
	assertEquals("Testtypbezeichnung1", btoList.get(0).getBefreiung());
	assertEquals("Testgrundbezeichnung2", btoList.get(1).getBefreiungsgrund());
	assertEquals("Testtypbezeichnung2", btoList.get(1).getBefreiung());
  }

  @Test
  void test_searchGebuehrenbefreiungByFachschluessel_vondat_null() throws Exception {
	Fachschluessel fs = Fachschluessel.of("1111111111", "VSNR");

	GebuehrenbefreiungDTO dto1 = new GebuehrenbefreiungDTO();
	dto1.setGbfGrundbez("Testgrundbezeichnung1");
	dto1.setGbfTypBez("Testtypbezeichnung1");
	dto1.setVondat(createXmlCalendar(2019, 8, 9));

	GebuehrenbefreiungDTO dto2 = new GebuehrenbefreiungDTO();
	dto2.setGbfGrundbez("Testgrundbezeichnung2");
	dto2.setGbfTypBez("Testtypbezeichnung2");

	List<GebuehrenbefreiungDTO> dtoList = new ArrayList<>();
	dtoList.add(dto1);
	dtoList.add(dto2);

	Mockito.when(mockedClient.sucheGebuehrenbefreiungen_2_0(Mockito.any(), Mockito.any())).thenReturn(mockedResponse);
	Mockito.when(mockedResponse.getGebuehrenbefreiungen()).thenReturn(dtoList);

	List<GebuehrenbefreiungBTO> btoList = service.searchGebuehrenbefreiungenByFachschluessel(fs);
	assertEquals(2, btoList.size());
	assertEquals("Testgrundbezeichnung1", btoList.get(0).getBefreiungsgrund());
	assertEquals("Testtypbezeichnung1", btoList.get(0).getBefreiung());
	assertEquals("Testgrundbezeichnung2", btoList.get(1).getBefreiungsgrund());
	assertEquals("Testtypbezeichnung2", btoList.get(1).getBefreiung());
  }

  private XMLGregorianCalendar createXmlCalendar(int year, int month, int day) throws DatatypeConfigurationException {
	OffsetDateTime    offsetDateTime    = OffsetDateTime.of(year, month, day, 0, 0, 0, 0, ZoneOffset.of("+2"));
	GregorianCalendar gregorianCalendar = GregorianCalendar.from(offsetDateTime.toZonedDateTime());
	return DatatypeFactory.newInstance().newXMLGregorianCalendar(gregorianCalendar);
  }
}
