package at.sozvers.noegkk.focus.service.systemeinstellungen;

import at.sozvers.noegkk.focus.CdiExtension;
import at.sozvers.noegkk.focus.service.api.systemeinstellungen.Systemeinstellungen;
import at.sozvers.noegkk.focus.testresources.testdb.DbTestData;
import at.sozvers.noegkk.focus.testresources.testdb.DbUnitTestBase;
import jakarta.inject.Inject;
import org.jboss.weld.context.RequestContext;
import org.jboss.weld.context.unbound.Unbound;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(CdiExtension.class)
@DbTestData(filename="SystemeinstellungenIT/testdaten.xml")
class SystemeinstellungenIT extends DbUnitTestBase {
  @Inject
  @Unbound
  private RequestContext      requestContext;
  @Inject
  private Systemeinstellungen systemeinstellungen;

  @BeforeEach
  public void activateRequestContext() {
	if(requestContext.isActive()) {
	  requestContext.deactivate();
	}
	requestContext.activate();
  }

  @Test
  void testGetIntervallTransmitZup() {
	String intervallTransmitZup = systemeinstellungen.getIntervallTransmitZup();
	assertEquals("1-6;0-23;0;0", intervallTransmitZup);
  }

  @Test
  void testGetPackagesizeTransmitZup() {
	int packagesizeTransmitZup = systemeinstellungen.getPackagesizeTransmitZup();
	assertEquals(500, packagesizeTransmitZup);
  }

  @Test
  void testGetScheduleSecurityIntervall() {
	int scheduleSecurityIntervall = systemeinstellungen.getScheduleSecurityIntervall();
	assertEquals(13, scheduleSecurityIntervall);
  }
}
