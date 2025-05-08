package at.sozvers.noegkk.focus.service.zpv.adresse;

import java.math.BigInteger;
import at.itsv.noegkk.commons.RequestHeadersCommons;
import at.sozialversicherung.schema.zpv.ibs.adresszuordnungsuchen_10_0.*;
import at.sozvers.noegkk.focus.service.common.Fachschluessel;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

import static at.sozvers.noegkk.focus.service.zpv.infrastructure.ZpvConstants.*;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class DtoAdresszuordnungListeSUIFactoryTest {

  @InjectMocks
  private DtoAdresszuordnungListeSUIFactory factory;
  @Mock
  private RequestHeadersCommons             mockedRequestHeadersCommons;

  @Test
  void test_createDtoAdresszuordnungListeSUIWithFachschluessel_NULL() {

	Mockito.when(mockedRequestHeadersCommons.getTransactionUUID()).thenReturn("A4I83NJDOI879GSO");
	Mockito.when(mockedRequestHeadersCommons.getOrgeinheitId()).thenReturn("ORGIT");
	Mockito.when(mockedRequestHeadersCommons.getBearbeiterID()).thenReturn("12FOCUS");
	Mockito.when(mockedRequestHeadersCommons.getMeldendeStelle()).thenReturn("12");

	Fachschluessel vsnr = Fachschluessel.of(null, null);

	DtoAdresszuordnungListeSUI sui = factory.createDtoAdresszuordnungListeSUIWithFachschluessel(vsnr);

	assertNotNull(sui);
	assertNull(sui.getDtoAdresszuordnungSUIListe().get(0).getDtoPartnerParrolleIdentifikationPartner().getBkFachschluesselAngabe().getFachschluessel());
  }

  @Test
  void test_createDtoAdresszuordnungListeSUIWithFachschluessel_Vsnr() {

	Mockito.when(mockedRequestHeadersCommons.getTransactionUUID()).thenReturn("A4I83NJDOI879GSO");
	Mockito.when(mockedRequestHeadersCommons.getOrgeinheitId()).thenReturn("ORGIT");
	Mockito.when(mockedRequestHeadersCommons.getBearbeiterID()).thenReturn("12FOCUS");
	Mockito.when(mockedRequestHeadersCommons.getMeldendeStelle()).thenReturn("12");

	Fachschluessel vsnr = Fachschluessel.of("4107071288", "VSNR");

	DtoAdresszuordnungListeSUI zuordnungListe = factory.createDtoAdresszuordnungListeSUIWithFachschluessel(vsnr);

	assertNotNull(factory);

	DtoAdresszuordnungSUI zuordnung = zuordnungListe.getDtoAdresszuordnungSUIListe().get(0);
	assertEquals(ZPV_TRUE, zuordnung.getAnschriftszusammenfassungJN());
	assertEquals(BigInteger.valueOf(70), zuordnung.getLaengeZusammenfassung());
	assertEquals(ZPV_FALSE, zuordnung.getAnschriftVerwaltungsgliederungJN());
	assertEquals(ZPV_FALSE, zuordnung.getLandesgerichteJN());
	assertEquals(ZPV_FALSE, zuordnung.getBezirksgerichteJN());
	assertEquals(ZPV_FALSE, zuordnung.getArbeitsSozialGerichteJN());
	assertEquals(ZPV_TRUE, zuordnung.getGeldadressvereinbarungJN());
	assertEquals(ZPV_FALSE, zuordnung.getNutzungJN());
	assertEquals(ZPV_FALSE, zuordnung.getPartnerKurzJN());
	assertEquals(ZPV_FALSE, zuordnung.getBearbeiterinfoJN());

	assertEquals(ZPV_STATUS_KZ, zuordnung.getBkStatusKZ().getStatusKZ());

	BkFachschluesselAngabeVO fachschluesselAngabe = zuordnung.getDtoPartnerParrolleIdentifikationPartner().getBkFachschluesselAngabe();
	assertEquals("4107071288", fachschluesselAngabe.getFachschluessel());
	assertEquals("VSNR", fachschluesselAngabe.getFachschluesselartKurz());
	assertNull(fachschluesselAngabe.getFachschluesselGueltigDat());
  }
}
