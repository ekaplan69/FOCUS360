package at.sozvers.noegkk.focus.service.systemeinstellungen;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;
import org.slf4j.Logger;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class SystemeinstellungenTest {

  @Mock
  private Logger mockLog;

  @InjectMocks
  private SystemeinstellungenService systemeinstellungen;

  @Test
  void testGetIntervallTransmitZup() {
	SystemeinstellungenService systemeinstellungenSpy = Mockito.spy(systemeinstellungen);
	Mockito.doReturn("1-5;12-23;*;0").when(systemeinstellungenSpy).getWertToParameterFromFocusSystem(Mockito.any());

	String intervall = systemeinstellungenSpy.getIntervallTransmitZup();

	assertEquals("1-5;12-23;*;0", intervall);
  }

  @Test
  void testGetIntervallTransmitZupStandardValue() {
	SystemeinstellungenService systemeinstellungenSpy = Mockito.spy(systemeinstellungen);
	Mockito.doReturn("").when(systemeinstellungenSpy).getWertToParameterFromFocusSystem(Mockito.any());
	Mockito.doNothing().when(mockLog).warn(Mockito.any());

	String intervall = systemeinstellungenSpy.getIntervallTransmitZup();

	assertEquals(SystemeinstellungenParameterEnum.INTERVALL_TRANSMIT_ZUP.getStandard(), intervall);
  }

  @Test
  void testGetPackagesizeTransmitZup() {
	SystemeinstellungenService systemeinstellungenSpy = Mockito.spy(systemeinstellungen);
	Mockito.doReturn("500").when(systemeinstellungenSpy).getWertToParameterFromFocusSystem(Mockito.any());

	int intervall = systemeinstellungenSpy.getPackagesizeTransmitZup();

	assertEquals(500, intervall);
  }

  @Test
  void testGetPackagesizeTransmitZupStandardValue() {
	SystemeinstellungenService systemeinstellungenSpy = Mockito.spy(systemeinstellungen);
	Mockito.doReturn("ab").when(systemeinstellungenSpy).getWertToParameterFromFocusSystem(Mockito.any());
	Mockito.doNothing().when(mockLog).warn(Mockito.any());

	int intervall = systemeinstellungenSpy.getPackagesizeTransmitZup();

	assertEquals(Integer.parseInt(SystemeinstellungenParameterEnum.PACKAGESIZE_TRANSMIT_ZUP.getStandard()), intervall);
  }

  @Test
  void testGetScheduleSecurityIntervall() {
	SystemeinstellungenService systemeinstellungenSpy = Mockito.spy(systemeinstellungen);
	Mockito.doReturn("13").when(systemeinstellungenSpy).getWertToParameterFromFocusSystem(Mockito.any());

	int intervall = systemeinstellungenSpy.getScheduleSecurityIntervall();

	assertEquals(13, intervall);
  }

  @Test
  void testGetScheduleSecurityIntervallStandardValue() {
	SystemeinstellungenService systemeinstellungenSpy = Mockito.spy(systemeinstellungen);
	Mockito.doReturn("ab").when(systemeinstellungenSpy).getWertToParameterFromFocusSystem(Mockito.any());
	Mockito.doNothing().when(mockLog).warn(Mockito.any());

	int intervall = systemeinstellungenSpy.getScheduleSecurityIntervall();

	assertEquals(Integer.parseInt(SystemeinstellungenParameterEnum.SCHEDULE_SECURITY_INTERVALL.getStandard()), intervall);
  }
}
