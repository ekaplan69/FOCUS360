package at.sozvers.noegkk.focus.person;

import java.math.BigInteger;
import at.itsv.noegkk.commons.RequestHeadersCommons;
import at.sozialversicherung.schema.zpv.ibs.partnerlesenkurz_15_0.DtoPartnerLEKI;
import at.sozialversicherung.schema.zpv.ibs.partnerlesenkurz_15_0.DtoPartnerListeLEKI;
import at.sozvers.noegkk.focus.service.common.Fachschluessel;
import at.sozvers.noegkk.focus.service.zpv.person.DtoPartnerListeLEKIFactory;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

import static at.sozvers.noegkk.focus.service.zpv.infrastructure.ZpvConstants.ZPV_FALSE;
import static at.sozvers.noegkk.focus.service.zpv.infrastructure.ZpvConstants.ZPV_TRUE;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class DtoPartnerListeLEKIFactoryTest {

  @InjectMocks
  private DtoPartnerListeLEKIFactory factory;
  @Mock
  private RequestHeadersCommons      mockedRequestHeadersCommons;

  @Test
  void test_createDtoPartnerListeLEKIWithFachschluessel_BTNR() {

	Mockito.when(mockedRequestHeadersCommons.getTransactionUUID()).thenReturn("A4I83NJDOI879GSO");
	Mockito.when(mockedRequestHeadersCommons.getOrgeinheitId()).thenReturn("ORGIT");
	Mockito.when(mockedRequestHeadersCommons.getBearbeiterID()).thenReturn("12FOCUS");
	Mockito.when(mockedRequestHeadersCommons.getMeldendeStelle()).thenReturn("12");

	Fachschluessel fachschluessel = Fachschluessel.of("0123456789", "BTNR");

	DtoPartnerListeLEKI partnerListe = factory.createDtoPartnerListeLEKIWithFachschluessel(fachschluessel);

	assertNotNull(partnerListe);
	DtoPartnerLEKI partner = partnerListe.getDtoPartnerLEKIListe().get(0);

	assertEquals("0123456789", partner.getDtoPartnerParrolleIdentifikationPartner().getBkFachschluesselAngabe().getFachschluessel());
	assertEquals("BTNR", partner.getDtoPartnerParrolleIdentifikationPartner().getBkFachschluesselAngabe().getFachschluesselartKurz());

	assertEquals(ZPV_TRUE, partner.getPartnerDiakritischJN());
	assertEquals(ZPV_TRUE, partner.getNamenszusammenfassungJN());
	assertEquals(BigInteger.valueOf(70), partner.getLaengeZusammenfassung());
	assertEquals(ZPV_TRUE, partner.getAnschriftJN());
	assertEquals(ZPV_FALSE, partner.getGeldadresseJN());
	assertEquals(ZPV_TRUE, partner.getEinzelunternehmerschaftenJN());
  }

  @Test
  void test_createDtoPartnerListeLEKIWithFachschluessel_NULL() {

	Mockito.when(mockedRequestHeadersCommons.getTransactionUUID()).thenReturn("A4I83NJDOI879GSO");
	Mockito.when(mockedRequestHeadersCommons.getOrgeinheitId()).thenReturn("ORGIT");
	Mockito.when(mockedRequestHeadersCommons.getBearbeiterID()).thenReturn("12FOCUS");
	Mockito.when(mockedRequestHeadersCommons.getMeldendeStelle()).thenReturn("12");

	Fachschluessel fachschluessel = Fachschluessel.of(null, null);

	DtoPartnerListeLEKI partnerListe = factory.createDtoPartnerListeLEKIWithFachschluessel(fachschluessel);

	assertNotNull(partnerListe);
	DtoPartnerLEKI partner = partnerListe.getDtoPartnerLEKIListe().get(0);

	assertNull(partner.getDtoPartnerParrolleIdentifikationPartner().getBkFachschluesselAngabe().getFachschluessel());
	assertNull(partner.getDtoPartnerParrolleIdentifikationPartner().getBkFachschluesselAngabe().getFachschluesselartKurz());

	assertEquals(ZPV_TRUE, partner.getPartnerDiakritischJN());
	assertEquals(ZPV_TRUE, partner.getNamenszusammenfassungJN());
	assertEquals(BigInteger.valueOf(70), partner.getLaengeZusammenfassung());
	assertEquals(ZPV_TRUE, partner.getAnschriftJN());
	assertEquals(ZPV_FALSE, partner.getGeldadresseJN());
	assertEquals(ZPV_TRUE, partner.getEinzelunternehmerschaftenJN());
  }

  @Test
  void test_createDtoPartnerListeLEKIWithFachschluessel_Vsnr() {

	Mockito.when(mockedRequestHeadersCommons.getTransactionUUID()).thenReturn("A4I83NJDOI879GSO");
	Mockito.when(mockedRequestHeadersCommons.getOrgeinheitId()).thenReturn("ORGIT");
	Mockito.when(mockedRequestHeadersCommons.getBearbeiterID()).thenReturn("12FOCUS");
	Mockito.when(mockedRequestHeadersCommons.getMeldendeStelle()).thenReturn("12");

	Fachschluessel fachschluessel = Fachschluessel.of("4107071288", "VSNR");

	DtoPartnerListeLEKI partnerListe = factory.createDtoPartnerListeLEKIWithFachschluessel(fachschluessel);

	assertNotNull(partnerListe);
	DtoPartnerLEKI partner = partnerListe.getDtoPartnerLEKIListe().get(0);

	assertEquals("4107071288", partner.getDtoPartnerParrolleIdentifikationPartner().getBkFachschluesselAngabe().getFachschluessel());
	assertEquals("VSNR", partner.getDtoPartnerParrolleIdentifikationPartner().getBkFachschluesselAngabe().getFachschluesselartKurz());

	assertEquals(ZPV_TRUE, partner.getPartnerDiakritischJN());
	assertEquals(ZPV_TRUE, partner.getNamenszusammenfassungJN());
	assertEquals(BigInteger.valueOf(70), partner.getLaengeZusammenfassung());
	assertEquals(ZPV_TRUE, partner.getAnschriftJN());
	assertEquals(ZPV_FALSE, partner.getGeldadresseJN());
	assertEquals(ZPV_TRUE, partner.getEinzelunternehmerschaftenJN());
  }
}
