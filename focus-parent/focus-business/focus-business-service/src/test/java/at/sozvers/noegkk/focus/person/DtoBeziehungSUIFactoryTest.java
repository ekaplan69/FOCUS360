package at.sozvers.noegkk.focus.person;

import at.itsv.noegkk.commons.RequestHeadersCommons;
import at.sozialversicherung.schema.zpv.ibs.beziehungsuchen_11_0.DtoBeziehungSUI;
import at.sozvers.noegkk.focus.service.common.Fachschluessel;
import at.sozvers.noegkk.focus.service.zpv.person.DtoBeziehungSUIFactory;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

import static at.sozvers.noegkk.focus.service.zpv.infrastructure.ZpvConstants.*;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class DtoBeziehungSUIFactoryTest {

  @InjectMocks
  private DtoBeziehungSUIFactory factory;
  @Mock
  private RequestHeadersCommons  mockedRequestHeadersCommons;

  @Test
  void test_createDtoBeziehungSUIWithFachschluessel_Btnr() {

	Mockito.when(mockedRequestHeadersCommons.getTransactionUUID()).thenReturn("A4I83NJDOI879GSO");
	Mockito.when(mockedRequestHeadersCommons.getOrgeinheitId()).thenReturn("ORGIT");
	Mockito.when(mockedRequestHeadersCommons.getBearbeiterID()).thenReturn("12FOCUS");
	Mockito.when(mockedRequestHeadersCommons.getMeldendeStelle()).thenReturn("12");

	Fachschluessel fachschluessel = Fachschluessel.of("0123456789", "BTNR");

	DtoBeziehungSUI sui = factory.createDtoBeziehungSUIWithFachschluessel(fachschluessel);

	assertNotNull(sui);
	assertEquals("0123456789", sui.getDtoPartnerParrolleIdentifikationPartner().getBkFachschluesselAngabe().getFachschluessel());
	assertEquals("BTNR", sui.getDtoPartnerParrolleIdentifikationPartner().getBkFachschluesselAngabe().getFachschluesselartKurz());

	assertEquals("GESVE", sui.getBeziehungsartKurz());
	assertEquals(ZPV_FALSE, sui.getBeziehungsartInversJN());
	assertEquals(ZPV_STATUS_KZ, sui.getBkStatusKZ().getStatusKZ());
	assertEquals(ZPV_TRUE, sui.getPartnerKurzJN());
	assertEquals(ZPV_FALSE, sui.getBearbeiterinfoJN());
	assertEquals(ZPV_TRUE, sui.getPartnerDiakritischJN());
	assertEquals(ZPV_TRUE, sui.getNamenszusammenfassungJN());
	assertEquals(ZPV_FALSE, sui.getNurBeziehungsdatenJN());
  }

  @Test
  void test_createDtoBeziehungSUIWithFachschluessel_NULL() {

	Mockito.when(mockedRequestHeadersCommons.getTransactionUUID()).thenReturn("A4I83NJDOI879GSO");
	Mockito.when(mockedRequestHeadersCommons.getOrgeinheitId()).thenReturn("ORGIT");
	Mockito.when(mockedRequestHeadersCommons.getBearbeiterID()).thenReturn("12FOCUS");
	Mockito.when(mockedRequestHeadersCommons.getMeldendeStelle()).thenReturn("12");

	Fachschluessel fachschluessel = Fachschluessel.of(null, null);

	DtoBeziehungSUI sui = factory.createDtoBeziehungSUIWithFachschluessel(fachschluessel);

	assertNotNull(sui);
	assertNull(sui.getDtoPartnerParrolleIdentifikationPartner().getBkFachschluesselAngabe().getFachschluessel());
	assertNull(sui.getDtoPartnerParrolleIdentifikationPartner().getBkFachschluesselAngabe().getFachschluesselartKurz());

	assertEquals("GESVE", sui.getBeziehungsartKurz());
	assertEquals(ZPV_FALSE, sui.getBeziehungsartInversJN());
	assertEquals(ZPV_STATUS_KZ, sui.getBkStatusKZ().getStatusKZ());
	assertEquals(ZPV_TRUE, sui.getPartnerKurzJN());
	assertEquals(ZPV_FALSE, sui.getBearbeiterinfoJN());
	assertEquals(ZPV_TRUE, sui.getPartnerDiakritischJN());
	assertEquals(ZPV_TRUE, sui.getNamenszusammenfassungJN());
	assertEquals(ZPV_FALSE, sui.getNurBeziehungsdatenJN());
  }

  @Test
  void test_createDtoBeziehungSUIWithFachschluessel_Vsnr() {

	Mockito.when(mockedRequestHeadersCommons.getTransactionUUID()).thenReturn("A4I83NJDOI879GSO");
	Mockito.when(mockedRequestHeadersCommons.getOrgeinheitId()).thenReturn("ORGIT");
	Mockito.when(mockedRequestHeadersCommons.getBearbeiterID()).thenReturn("12FOCUS");
	Mockito.when(mockedRequestHeadersCommons.getMeldendeStelle()).thenReturn("12");

	Fachschluessel fachschluessel = Fachschluessel.of("4107071288", "VSNR");

	DtoBeziehungSUI sui = factory.createDtoBeziehungSUIWithFachschluessel(fachschluessel);

	assertNotNull(sui);
	assertEquals("4107071288", sui.getDtoPartnerParrolleIdentifikationPartner().getBkFachschluesselAngabe().getFachschluessel());
	assertEquals("VSNR", sui.getDtoPartnerParrolleIdentifikationPartner().getBkFachschluesselAngabe().getFachschluesselartKurz());

	assertEquals("GESVE", sui.getBeziehungsartKurz());
	assertEquals(ZPV_FALSE, sui.getBeziehungsartInversJN());
	assertEquals(ZPV_STATUS_KZ, sui.getBkStatusKZ().getStatusKZ());
	assertEquals(ZPV_TRUE, sui.getPartnerKurzJN());
	assertEquals(ZPV_FALSE, sui.getBearbeiterinfoJN());
	assertEquals(ZPV_TRUE, sui.getPartnerDiakritischJN());
	assertEquals(ZPV_TRUE, sui.getNamenszusammenfassungJN());
	assertEquals(ZPV_FALSE, sui.getNurBeziehungsdatenJN());
  }
}
