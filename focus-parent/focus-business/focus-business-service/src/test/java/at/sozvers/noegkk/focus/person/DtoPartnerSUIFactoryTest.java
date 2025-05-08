package at.sozvers.noegkk.focus.person;

import javax.xml.datatype.DatatypeConfigurationException;
import at.itsv.noegkk.commons.RequestHeadersCommons;
import at.sozialversicherung.schema.zpv.ibs.partnersuchen_14_0.DtoPartnerSUI;
import at.sozvers.noegkk.focus.service.zpv.person.DtoPartnerSUIFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

import static at.sozvers.noegkk.focus.service.zpv.infrastructure.ZpvConstants.ZPV_FALSE;
import static at.sozvers.noegkk.focus.service.zpv.infrastructure.ZpvConstants.ZPV_TRUE;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class DtoPartnerSUIFactoryTest {

  @InjectMocks
  private DtoPartnerSUIFactory  factory;
  @Spy
  private RequestHeadersCommons requestHeadersCommons;

  @BeforeEach
  public void before() {
	MockitoAnnotations.initMocks(this);
  }

  @Test
  public void test_createDtoPartnerSUI_NULL() throws DatatypeConfigurationException {

	Mockito.when(requestHeadersCommons.getTransactionUUID()).thenReturn("A4I83NJDOI879GSO");
	Mockito.when(requestHeadersCommons.getOrgeinheitId()).thenReturn("ORGIT");
	Mockito.when(requestHeadersCommons.getBearbeiterID()).thenReturn("12FOCUS");
	Mockito.when(requestHeadersCommons.getMeldendeStelle()).thenReturn("12");

	DtoPartnerSUI dtoPartnerSUI = factory.createDtoPartnerSUI(null, null, null, null);

	assertNotNull(dtoPartnerSUI);

	assertEquals(ZPV_TRUE, dtoPartnerSUI.getAnschriftJN());
	assertEquals(ZPV_FALSE, dtoPartnerSUI.getBeitragskontonrJN());
	assertEquals(ZPV_TRUE, dtoPartnerSUI.getPartnerDiakritischJN());
	assertEquals(ZPV_FALSE, dtoPartnerSUI.getPruefungFuerGeburtsdatumAenderungJN());
	assertEquals(ZPV_FALSE, dtoPartnerSUI.getPruefungFuerNeuanlageJN());

	assertEquals("VS", dtoPartnerSUI.getPartnerrollenartKurz());
	assertEquals("PERS", dtoPartnerSUI.getPartnerartKurz());
	assertNull(dtoPartnerSUI.getPartnernameDiakritisch());
	assertNull(dtoPartnerSUI.getVornameDiakritisch());
	assertNull(dtoPartnerSUI.getPostleitzahl());
	assertNull(dtoPartnerSUI.getGeburtsDAT());
  }

  @Test
  public void test_createDtoPartnerSUI_allesGesetzt() throws DatatypeConfigurationException {

	Mockito.when(requestHeadersCommons.getTransactionUUID()).thenReturn("A4I83NJDOI879GSO");
	Mockito.when(requestHeadersCommons.getOrgeinheitId()).thenReturn("ORGIT");
	Mockito.when(requestHeadersCommons.getBearbeiterID()).thenReturn("12FOCUS");
	Mockito.when(requestHeadersCommons.getMeldendeStelle()).thenReturn("12");

	DtoPartnerSUI dtoPartnerSUI = factory.createDtoPartnerSUI("Andre", "Winterberg", "3100", "04.07.1998");

	assertNotNull(dtoPartnerSUI);

	assertEquals(ZPV_TRUE, dtoPartnerSUI.getAnschriftJN());
	assertEquals(ZPV_FALSE, dtoPartnerSUI.getBeitragskontonrJN());
	assertEquals(ZPV_TRUE, dtoPartnerSUI.getPartnerDiakritischJN());
	assertEquals(ZPV_FALSE, dtoPartnerSUI.getPruefungFuerGeburtsdatumAenderungJN());
	assertEquals(ZPV_FALSE, dtoPartnerSUI.getPruefungFuerNeuanlageJN());

	assertEquals("VS", dtoPartnerSUI.getPartnerrollenartKurz());
	assertEquals("PERS", dtoPartnerSUI.getPartnerartKurz());

	assertEquals("Winterberg", dtoPartnerSUI.getPartnernameDiakritisch());
	assertEquals("Andre", dtoPartnerSUI.getVornameDiakritisch());
	assertEquals("3100", dtoPartnerSUI.getPostleitzahl());
	assertEquals(4, dtoPartnerSUI.getGeburtsDAT().getDay());
	assertEquals(7, dtoPartnerSUI.getGeburtsDAT().getMonth());
	assertEquals(1998, dtoPartnerSUI.getGeburtsDAT().getYear());
  }
}
