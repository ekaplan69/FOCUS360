package at.sozvers.noegkk.focus.person;

import javax.xml.datatype.*;
import java.math.BigInteger;
import java.time.LocalDate;
import java.util.*;
import at.sozialversicherung.schema.zpv.ibs.partnerlesenkurz_15_0.*;
import at.sozvers.noegkk.focus.service.api.zpv.person.StammdatenBTO;
import at.sozvers.noegkk.focus.service.zpv.person.StammdatenBTOExternalServiceMapper;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.Assert.*;

@ExtendWith(MockitoExtension.class)
public class StammdatenBTOExternalServiceMapperTest {

  @Spy
  private StammdatenBTOExternalServiceMapper mapper = new StammdatenBTOExternalServiceMapper();

  @BeforeEach
  public void setUp() {
	MockitoAnnotations.initMocks(this);
  }

  @Test
  public void test_map_AuskunftssperreGueltig_GrenzwertBis() throws DatatypeConfigurationException {
	DtoPartnerLEKO partner       = new DtoPartnerLEKO();
	DtoPersonKurz  personKurzSpy = Mockito.spy(DtoPersonKurz.class);
	personKurzSpy.setBestaetigtesGeburtsDAT(createXmlCalendar(2019, 1, 1));

	List<DtoAuskunftssperreKurz> auskunftssperreList = new ArrayList<>();
	DtoAuskunftssperreKurz       auskunftssperre     = new DtoAuskunftssperreKurz();
	auskunftssperre.setAuskunftssperregrund("Wichtiger Grund!");
	auskunftssperre.setAuskunftssperreID(BigInteger.valueOf(127L));
	auskunftssperre.setStornoJN("N");
	BkGueltigkeitszeitraumVO zeitraum = new BkGueltigkeitszeitraumVO();
	zeitraum.setGueltigVonDAT(createXmlCalendarWithOffset(-1)); // gestern
	zeitraum.setGueltigBisDAT(createXmlCalendarWithOffset(0)); // heute
	auskunftssperre.setBkGueltigkeitszeitraum(zeitraum);
	auskunftssperreList.add(auskunftssperre);
	Mockito.when(personKurzSpy.getDtoAuskunftssperreKurzListe()).thenReturn(auskunftssperreList);

	DtoNamenszusammenfassungDiakritisch namenszusammenfassung = new DtoNamenszusammenfassungDiakritisch();
	namenszusammenfassung.setNamenzeileDiakritisch1("Frau");
	namenszusammenfassung.setNamenzeileDiakritisch2("Maxime Musterfrau");
	personKurzSpy.setDtoNamenszusammenfassungDiakritisch(namenszusammenfassung);
	partner.setDtoPartnerKurz(personKurzSpy);

	StammdatenBTO stammdatenBto = mapper.map(partner);

	assertNotNull(stammdatenBto);
	assertEquals("Frau Maxime Musterfrau", stammdatenBto.getName());
	assertEquals(LocalDate.of(2019, 1, 1), stammdatenBto.getGeburtsDatum());
	assertEquals(1, stammdatenBto.getAuskunftsSperreGruende().size());
	assertEquals("Wichtiger Grund!", stammdatenBto.getAuskunftsSperreGruende().get(0));
	assertTrue(stammdatenBto.isAuskunftsSperre());
  }

  private XMLGregorianCalendar createXmlCalendar(int year, int month, int day) throws DatatypeConfigurationException {
	return DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar(year, month - 1, day));
  }

  private XMLGregorianCalendar createXmlCalendarWithOffset(int offsetFromToday) throws DatatypeConfigurationException {
	GregorianCalendar calendar = new GregorianCalendar();
	calendar.setTime(new Date());
	calendar.add(Calendar.DATE, offsetFromToday);
	return DatatypeFactory.newInstance().newXMLGregorianCalendar(calendar);
  }

  @Test
  public void test_map_AuskunftssperreGueltig_GrenzwertVon() throws DatatypeConfigurationException {
	DtoPartnerLEKO partner       = new DtoPartnerLEKO();
	DtoPersonKurz  personKurzSpy = Mockito.spy(DtoPersonKurz.class);
	personKurzSpy.setBestaetigtesGeburtsDAT(createXmlCalendar(2019, 1, 1));
	personKurzSpy.setGeschlecht("weiblich");
	personKurzSpy.setGeschlechtKZ("W");

	List<DtoAuskunftssperreKurz> auskunftssperreList = new ArrayList<>();
	DtoAuskunftssperreKurz       auskunftssperre     = new DtoAuskunftssperreKurz();
	auskunftssperre.setAuskunftssperregrund("Wichtiger Grund!");
	auskunftssperre.setAuskunftssperreID(BigInteger.valueOf(127L));
	auskunftssperre.setStornoJN("N");
	BkGueltigkeitszeitraumVO zeitraum = new BkGueltigkeitszeitraumVO();
	zeitraum.setGueltigVonDAT(createXmlCalendarWithOffset(0)); // heute
	zeitraum.setGueltigBisDAT(null); // unbegrenzt
	auskunftssperre.setBkGueltigkeitszeitraum(zeitraum);
	auskunftssperreList.add(auskunftssperre);
	Mockito.when(personKurzSpy.getDtoAuskunftssperreKurzListe()).thenReturn(auskunftssperreList);

	DtoNamenszusammenfassungDiakritisch namenszusammenfassung = new DtoNamenszusammenfassungDiakritisch();
	namenszusammenfassung.setNamenzeileDiakritisch1("Frau");
	namenszusammenfassung.setNamenzeileDiakritisch2("Maxime Musterfrau");
	personKurzSpy.setDtoNamenszusammenfassungDiakritisch(namenszusammenfassung);
	partner.setDtoPartnerKurz(personKurzSpy);

	StammdatenBTO stammdatenBto = mapper.map(partner);

	assertNotNull(stammdatenBto);
	assertEquals("Frau Maxime Musterfrau", stammdatenBto.getName());
	assertEquals(LocalDate.of(2019, 1, 1), stammdatenBto.getGeburtsDatum());
	assertEquals(1, stammdatenBto.getAuskunftsSperreGruende().size());
	assertEquals("Wichtiger Grund!", stammdatenBto.getAuskunftsSperreGruende().get(0));
	assertTrue(stammdatenBto.isAuskunftsSperre());
  }

  @Test
  public void test_map_AuskunftssperreNichtGueltig_Storno() throws DatatypeConfigurationException {
	DtoPartnerLEKO partner       = new DtoPartnerLEKO();
	DtoPersonKurz  personKurzSpy = Mockito.spy(DtoPersonKurz.class);
	personKurzSpy.setBestaetigtesGeburtsDAT(createXmlCalendar(2019, 1, 1));

	List<DtoAuskunftssperreKurz> auskunftssperreList = new ArrayList<>();
	DtoAuskunftssperreKurz       auskunftssperre     = new DtoAuskunftssperreKurz();
	auskunftssperre.setAuskunftssperregrund("Wichtiger Grund!");
	auskunftssperre.setAuskunftssperreID(BigInteger.valueOf(127L));
	auskunftssperre.setStornoJN("J");
	BkGueltigkeitszeitraumVO zeitraum = new BkGueltigkeitszeitraumVO();
	zeitraum.setGueltigVonDAT(createXmlCalendarWithOffset(-1)); // gestern
	zeitraum.setGueltigBisDAT(createXmlCalendarWithOffset(1)); // morgen
	auskunftssperre.setBkGueltigkeitszeitraum(zeitraum);
	auskunftssperreList.add(auskunftssperre);
	Mockito.when(personKurzSpy.getDtoAuskunftssperreKurzListe()).thenReturn(auskunftssperreList);

	DtoNamenszusammenfassungDiakritisch namenszusammenfassung = new DtoNamenszusammenfassungDiakritisch();
	namenszusammenfassung.setNamenzeileDiakritisch1("Frau");
	namenszusammenfassung.setNamenzeileDiakritisch2("Maxime Musterfrau");
	personKurzSpy.setDtoNamenszusammenfassungDiakritisch(namenszusammenfassung);
	partner.setDtoPartnerKurz(personKurzSpy);

	StammdatenBTO stammdatenBto = mapper.map(partner);

	assertNotNull(stammdatenBto);
	assertEquals("Frau Maxime Musterfrau", stammdatenBto.getName());
	assertEquals(LocalDate.of(2019, 1, 1), stammdatenBto.getGeburtsDatum());
	assertEquals(0, stammdatenBto.getAuskunftsSperreGruende().size());
	assertFalse(stammdatenBto.isAuskunftsSperre());
  }

  @Test
  public void test_map_AuskunftssperreNichtMehrGueltig_GrenzwertBis() throws DatatypeConfigurationException {
	DtoPartnerLEKO partner       = new DtoPartnerLEKO();
	DtoPersonKurz  personKurzSpy = Mockito.spy(DtoPersonKurz.class);
	personKurzSpy.setBestaetigtesGeburtsDAT(createXmlCalendar(2019, 1, 1));

	List<DtoAuskunftssperreKurz> auskunftssperreList = new ArrayList<>();
	DtoAuskunftssperreKurz       auskunftssperre     = new DtoAuskunftssperreKurz();
	auskunftssperre.setAuskunftssperregrund("Wichtiger Grund!");
	auskunftssperre.setAuskunftssperreID(BigInteger.valueOf(127L));
	auskunftssperre.setStornoJN("N");
	BkGueltigkeitszeitraumVO zeitraum = new BkGueltigkeitszeitraumVO();
	zeitraum.setGueltigVonDAT(createXmlCalendarWithOffset(-1)); // gestern
	zeitraum.setGueltigBisDAT(createXmlCalendarWithOffset(-1)); // gestern
	auskunftssperre.setBkGueltigkeitszeitraum(zeitraum);
	auskunftssperreList.add(auskunftssperre);
	Mockito.when(personKurzSpy.getDtoAuskunftssperreKurzListe()).thenReturn(auskunftssperreList);

	DtoNamenszusammenfassungDiakritisch namenszusammenfassung = new DtoNamenszusammenfassungDiakritisch();
	namenszusammenfassung.setNamenzeileDiakritisch1("Frau");
	namenszusammenfassung.setNamenzeileDiakritisch2("Maxime Musterfrau");
	personKurzSpy.setDtoNamenszusammenfassungDiakritisch(namenszusammenfassung);
	partner.setDtoPartnerKurz(personKurzSpy);

	StammdatenBTO stammdatenBto = mapper.map(partner);

	assertNotNull(stammdatenBto);
	assertEquals("Frau Maxime Musterfrau", stammdatenBto.getName());
	assertEquals(LocalDate.of(2019, 1, 1), stammdatenBto.getGeburtsDatum());
	assertEquals(0, stammdatenBto.getAuskunftsSperreGruende().size());
	assertFalse(stammdatenBto.isAuskunftsSperre());
  }

  @Test
  public void test_map_AuskunftssperreNochNichtGueltig_GrenzwertVon() throws DatatypeConfigurationException {
	DtoPartnerLEKO partner       = new DtoPartnerLEKO();
	DtoPersonKurz  personKurzSpy = Mockito.spy(DtoPersonKurz.class);
	personKurzSpy.setBestaetigtesGeburtsDAT(createXmlCalendar(2019, 1, 1));

	List<DtoAuskunftssperreKurz> auskunftssperreList = new ArrayList<>();
	DtoAuskunftssperreKurz       auskunftssperre     = new DtoAuskunftssperreKurz();
	auskunftssperre.setAuskunftssperregrund("Wichtiger Grund!");
	auskunftssperre.setAuskunftssperreID(BigInteger.valueOf(127L));
	auskunftssperre.setStornoJN("N");
	BkGueltigkeitszeitraumVO zeitraum = new BkGueltigkeitszeitraumVO();
	zeitraum.setGueltigVonDAT(createXmlCalendarWithOffset(1)); // morgen
	zeitraum.setGueltigBisDAT(null); // unbegrenzt
	auskunftssperre.setBkGueltigkeitszeitraum(zeitraum);
	auskunftssperreList.add(auskunftssperre);
	Mockito.when(personKurzSpy.getDtoAuskunftssperreKurzListe()).thenReturn(auskunftssperreList);

	DtoNamenszusammenfassungDiakritisch namenszusammenfassung = new DtoNamenszusammenfassungDiakritisch();
	namenszusammenfassung.setNamenzeileDiakritisch1("Frau");
	namenszusammenfassung.setNamenzeileDiakritisch2("Maxime Musterfrau");
	personKurzSpy.setDtoNamenszusammenfassungDiakritisch(namenszusammenfassung);
	partner.setDtoPartnerKurz(personKurzSpy);

	StammdatenBTO stammdatenBto = mapper.map(partner);

	assertNotNull(stammdatenBto);
	assertEquals("Frau Maxime Musterfrau", stammdatenBto.getName());
	assertEquals(LocalDate.of(2019, 1, 1), stammdatenBto.getGeburtsDatum());
	assertEquals(0, stammdatenBto.getAuskunftsSperreGruende().size());
	assertFalse(stammdatenBto.isAuskunftsSperre());
  }

  @Test
  public void test_map_Geburstdatum_NULL() {
	DtoPartnerLEKO partner    = new DtoPartnerLEKO();
	DtoPersonKurz  personKurz = new DtoPersonKurz();
	personKurz.setGeschlecht("weiblich");
	personKurz.setGeschlechtKZ("W");
	personKurz.setBestaetigtesGeburtsDAT(null);
	DtoNamenszusammenfassungDiakritisch namenszusammenfassung = new DtoNamenszusammenfassungDiakritisch();
	namenszusammenfassung.setNamenzeileDiakritisch1("Frau");
	namenszusammenfassung.setNamenzeileDiakritisch2("Maxime Musterfrau");
	personKurz.setDtoNamenszusammenfassungDiakritisch(namenszusammenfassung);
	partner.setDtoPartnerKurz(personKurz);

	StammdatenBTO bto = mapper.map(partner);
	assertNull(bto.getGeburtsDatum());
  }

  @Test
  public void test_map_dtoAuskunftssperreKurzListe_Empty() throws DatatypeConfigurationException {
	DtoPartnerLEKO partner       = new DtoPartnerLEKO();
	DtoPersonKurz  personKurzSpy = Mockito.spy(DtoPersonKurz.class);
	personKurzSpy.setBestaetigtesGeburtsDAT(createXmlCalendar(2019, 1, 1));

	List<DtoAuskunftssperreKurz> auskunftssperreList = new ArrayList<>();
	Mockito.when(personKurzSpy.getDtoAuskunftssperreKurzListe()).thenReturn(auskunftssperreList);

	DtoNamenszusammenfassungDiakritisch namenszusammenfassung = new DtoNamenszusammenfassungDiakritisch();
	namenszusammenfassung.setNamenzeileDiakritisch1("Frau");
	namenszusammenfassung.setNamenzeileDiakritisch2("Maxime Musterfrau");
	personKurzSpy.setDtoNamenszusammenfassungDiakritisch(namenszusammenfassung);
	partner.setDtoPartnerKurz(personKurzSpy);

	StammdatenBTO stammdatenBto = mapper.map(partner);

	assertNotNull(stammdatenBto);
	assertEquals("Frau Maxime Musterfrau", stammdatenBto.getName());
	assertEquals(LocalDate.of(2019, 1, 1), stammdatenBto.getGeburtsDatum());
	assertEquals(0, stammdatenBto.getAuskunftsSperreGruende().size());
  }

  @Test
  public void test_map_dtoPartnerKurz_NULL() {
	DtoPartnerLEKO partner = new DtoPartnerLEKO();
	partner.setDtoPartnerKurz(null);

	StammdatenBTO stammdatenBto = mapper.map(partner);

	assertNotNull(stammdatenBto);

	assertNull(stammdatenBto.getGeburtsDatum());
	assertNull(stammdatenBto.getGeschlecht());
	assertNull(stammdatenBto.getName());
	assertNull(stammdatenBto.getPartnerVersicherterRolleId());
	assertNull(stammdatenBto.getAdresse());
	assertEquals(0, stammdatenBto.getAuskunftsSperreGruende().size());
	assertEquals(0, stammdatenBto.getGeldAdressen().size());
	assertNull(stammdatenBto.getKontaktEmail());
	assertNull(stammdatenBto.getKontaktTelefon());
	assertFalse(stammdatenBto.isAuskunftsSperre());
	assertFalse(stammdatenBto.isGesetzlichVertreten());
	assertFalse(stammdatenBto.isZustimmungSuen());
  }

  @Test
  public void test_map_dtoPartnerKurz_namenszeile2_NULL() throws DatatypeConfigurationException {
	DtoPartnerLEKO partner       = new DtoPartnerLEKO();
	DtoPersonKurz  dtoPersonKurz = new DtoPersonKurz();

	DtoNamenszusammenfassungDiakritisch dtoNamenszusammenfassung = new DtoNamenszusammenfassungDiakritisch();
	dtoNamenszusammenfassung.setNamenzeileDiakritisch1("Dr. Hans Maier");
	dtoNamenszusammenfassung.setNamenzeileDiakritisch2(null);

	dtoPersonKurz.setBestaetigtesGeburtsDAT(createXmlCalendar(2019, 1, 1));
	dtoPersonKurz.setDtoNamenszusammenfassungDiakritisch(dtoNamenszusammenfassung);
	partner.setDtoPartnerKurz(dtoPersonKurz);

	StammdatenBTO stammdatenBto = mapper.map(partner);

	assertNotNull(stammdatenBto);
	assertEquals("Dr. Hans Maier", stammdatenBto.getName());
  }

  @Test
  public void test_map_dtoPartnerKurz_namenszeilen_gesetzt() throws DatatypeConfigurationException {
	DtoPartnerLEKO partner       = new DtoPartnerLEKO();
	DtoPersonKurz  dtoPersonKurz = new DtoPersonKurz();

	DtoNamenszusammenfassungDiakritisch dtoNamenszusammenfassung = new DtoNamenszusammenfassungDiakritisch();
	dtoNamenszusammenfassung.setNamenzeileDiakritisch1("Herr");
	dtoNamenszusammenfassung.setNamenzeileDiakritisch2("Dr. Hans Maier");

	dtoPersonKurz.setBestaetigtesGeburtsDAT(createXmlCalendar(2019, 1, 1));
	dtoPersonKurz.setDtoNamenszusammenfassungDiakritisch(dtoNamenszusammenfassung);
	partner.setDtoPartnerKurz(dtoPersonKurz);

	StammdatenBTO stammdatenBto = mapper.map(partner);

	assertNotNull(stammdatenBto);
	assertEquals("Herr Dr. Hans Maier", stammdatenBto.getName());
  }

  @Test
  public void test_map_dtoPartnerLEKO_NULL() {
	DtoPartnerLEKO partner = null;

	StammdatenBTO stammdatenBto = mapper.map(partner);

	assertNotNull(stammdatenBto);

	assertNull(stammdatenBto.getGeburtsDatum());
	assertNull(stammdatenBto.getGeschlecht());
	assertNull(stammdatenBto.getName());
	assertNull(stammdatenBto.getPartnerVersicherterRolleId());
	assertNull(stammdatenBto.getAdresse());
	assertEquals(0, stammdatenBto.getAuskunftsSperreGruende().size());
	assertEquals(0, stammdatenBto.getGeldAdressen().size());
	assertNull(stammdatenBto.getKontaktEmail());
	assertNull(stammdatenBto.getKontaktTelefon());
	assertFalse(stammdatenBto.isAuskunftsSperre());
	assertFalse(stammdatenBto.isGesetzlichVertreten());
	assertFalse(stammdatenBto.isZustimmungSuen());
  }

  @Test
  public void test_map_dtoPartnerrolleKurz_NULL() throws DatatypeConfigurationException {
	DtoPartnerLEKO partner    = new DtoPartnerLEKO();
	DtoPersonKurz  personKurz = new DtoPersonKurz();
	personKurz.setBestaetigtesGeburtsDAT(createXmlCalendar(2019, 1, 1));
	DtoNamenszusammenfassungDiakritisch namenszusammenfassung = new DtoNamenszusammenfassungDiakritisch();
	namenszusammenfassung.setNamenzeileDiakritisch1("Frau");
	namenszusammenfassung.setNamenzeileDiakritisch2("Maxime Musterfrau");
	personKurz.setDtoNamenszusammenfassungDiakritisch(namenszusammenfassung);
	partner.setDtoPartnerKurz(personKurz);
	partner.setDtoPartnerrolleKurz(null);

	StammdatenBTO stammdatenBto = mapper.map(partner);

	assertNotNull(stammdatenBto);
	assertEquals("Frau Maxime Musterfrau", stammdatenBto.getName());
	assertEquals(LocalDate.of(2019, 1, 1), stammdatenBto.getGeburtsDatum());
	assertNull(stammdatenBto.getGeschlecht());
	assertNull(stammdatenBto.getAdresse());
	assertEquals(0, stammdatenBto.getAuskunftsSperreGruende().size());
	assertEquals(0, stammdatenBto.getGeldAdressen().size());
	assertNull(stammdatenBto.getKontaktEmail());
	assertNull(stammdatenBto.getKontaktTelefon());
	assertFalse(stammdatenBto.isAuskunftsSperre());
	assertFalse(stammdatenBto.isGesetzlichVertreten());
	assertFalse(stammdatenBto.isZustimmungSuen());
  }

  @Test
  public void test_map_fachschluesselartKurzbez_BTNR() throws DatatypeConfigurationException {
	DtoPartnerLEKO partner    = new DtoPartnerLEKO();
	DtoPersonKurz  personKurz = new DtoPersonKurz();
	personKurz.setBestaetigtesGeburtsDAT(createXmlCalendar(2019, 1, 1));
	DtoNamenszusammenfassungDiakritisch namenszusammenfassung = new DtoNamenszusammenfassungDiakritisch();
	namenszusammenfassung.setNamenzeileDiakritisch1("Frau");
	namenszusammenfassung.setNamenzeileDiakritisch2("Maxime Musterfrau");
	personKurz.setDtoNamenszusammenfassungDiakritisch(namenszusammenfassung);
	partner.setDtoPartnerKurz(personKurz);

	DtoPartnerrolleKurz partnerrolleKurz = new DtoPartnerrolleKurz();
	partnerrolleKurz.setFachschluesselartKurzbez("BTNR");
	partner.setDtoPartnerrolleKurz(partnerrolleKurz);

	StammdatenBTO stammdatenBto = mapper.map(partner);

	assertNotNull(stammdatenBto);
	assertEquals("Frau Maxime Musterfrau", stammdatenBto.getName());
	assertEquals(LocalDate.of(2019, 1, 1), stammdatenBto.getGeburtsDatum());
	assertNull(stammdatenBto.getPartnerVersicherterRolleId());
	assertNull(stammdatenBto.getGeschlecht());
	assertNull(stammdatenBto.getAdresse());
	assertEquals(0, stammdatenBto.getAuskunftsSperreGruende().size());
	assertEquals(0, stammdatenBto.getGeldAdressen().size());
	assertNull(stammdatenBto.getKontaktEmail());
	assertNull(stammdatenBto.getKontaktTelefon());
	assertFalse(stammdatenBto.isAuskunftsSperre());
	assertFalse(stammdatenBto.isGesetzlichVertreten());
	assertFalse(stammdatenBto.isZustimmungSuen());
  }

  @Test
  public void test_map_mitDaten() throws DatatypeConfigurationException {
	DtoPartnerLEKO partner    = new DtoPartnerLEKO();
	DtoPersonKurz  personKurz = new DtoPersonKurz();
	personKurz.setGeschlecht("weiblich");
	personKurz.setGeschlechtKZ("W");
	personKurz.setBestaetigtesGeburtsDAT(createXmlCalendar(1967, 5, 17));
	DtoNamenszusammenfassungDiakritisch namenszusammenfassung = new DtoNamenszusammenfassungDiakritisch();
	namenszusammenfassung.setNamenzeileDiakritisch1("Frau");
	namenszusammenfassung.setNamenzeileDiakritisch2("Maxime Musterfrau");
	personKurz.setDtoNamenszusammenfassungDiakritisch(namenszusammenfassung);
	partner.setDtoPartnerKurz(personKurz);
	partner.getDtoPartnerKurz().setParParrolleIDPartner(BigInteger.valueOf(55));

	DtoPartnerrolleKurz partnerrolleKurz = new DtoPartnerrolleKurz();
	partnerrolleKurz.setFachschluesselartKurzbez("VSNR");
	partnerrolleKurz.setParParrolleIDPartnerrolle(BigInteger.valueOf(55));
	partner.setDtoPartnerrolleKurz(partnerrolleKurz);

	StammdatenBTO stammdatenBto = mapper.map(partner);

	assertNotNull(stammdatenBto);
	assertEquals("Frau Maxime Musterfrau", stammdatenBto.getName());
	assertEquals(BigInteger.valueOf(55), stammdatenBto.getPartnerVersicherterRolleId());
	assertEquals("W", stammdatenBto.getGeschlecht());
	assertEquals(LocalDate.of(1967, 5, 17), stammdatenBto.getGeburtsDatum());
	assertNull(stammdatenBto.getAdresse());
	assertEquals(0, stammdatenBto.getAuskunftsSperreGruende().size());
	assertEquals(0, stammdatenBto.getGeldAdressen().size());
	assertNull(stammdatenBto.getKontaktEmail());
	assertNull(stammdatenBto.getKontaktTelefon());
	assertFalse(stammdatenBto.isAuskunftsSperre());
	assertFalse(stammdatenBto.isGesetzlichVertreten());
	assertFalse(stammdatenBto.isZustimmungSuen());
  }

  @Test
  public void test_map_not_instance_of_DtoPersonKurz() {
	DtoPartnerLEKO                      partner               = new DtoPartnerLEKO();
	DtoPartnerKurz                      partnerKurz           = new DtoPartnerKurz();
	DtoNamenszusammenfassungDiakritisch namenszusammenfassung = new DtoNamenszusammenfassungDiakritisch();
	namenszusammenfassung.setNamenzeileDiakritisch1("Frau");
	namenszusammenfassung.setNamenzeileDiakritisch2("Maxime Musterfrau");
	partnerKurz.setDtoNamenszusammenfassungDiakritisch(namenszusammenfassung);
	partner.setDtoPartnerKurz(partnerKurz);

	StammdatenBTO stammdatenBto = mapper.map(partner);

	assertNotNull(stammdatenBto);
	assertEquals("Frau Maxime Musterfrau", stammdatenBto.getName());
	assertNull(stammdatenBto.getGeburtsDatum());
	assertNull(stammdatenBto.getGeschlecht());
	assertNull(stammdatenBto.getPartnerVersicherterRolleId());
	assertNull(stammdatenBto.getAdresse());
	assertEquals(0, stammdatenBto.getAuskunftsSperreGruende().size());
	assertEquals(0, stammdatenBto.getGeldAdressen().size());
	assertNull(stammdatenBto.getKontaktEmail());
	assertNull(stammdatenBto.getKontaktTelefon());
	assertFalse(stammdatenBto.isAuskunftsSperre());
	assertFalse(stammdatenBto.isGesetzlichVertreten());
	assertFalse(stammdatenBto.isZustimmungSuen());
  }
}
