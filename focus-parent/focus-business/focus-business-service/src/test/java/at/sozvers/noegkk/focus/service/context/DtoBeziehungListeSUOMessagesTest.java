package at.sozvers.noegkk.focus.service.context;

import java.lang.reflect.InvocationTargetException;
import at.sozialversicherung.schema.zpv.ibs.beziehungsuchen_11_0.*;
import at.sozvers.noegkk.focus.service.api.common.MeldungBTO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class DtoBeziehungListeSUOMessagesTest {

  private Messages messages;

  @BeforeEach
  public void setUp() {
	messages = new Messages();
  }

  @Test
  void test_addMessage_noMessages() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {

	DtoBeziehungListeSUO dto      = new DtoBeziehungListeSUO();
	ReturnInfo           returnVO = new ReturnInfo();
	returnVO.setIstOk("ok");
	dto.setFehlerpaket(returnVO);

	messages.addMessage(dto);

	assertEquals(0, messages.getMessages().size());
  }

  @Test
  void test_addMessage_null() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {

	DtoBeziehungListeSUO dto = null;
	assertThrows(NullPointerException.class, () -> messages.addMessage(dto));
  }

  @Test
  void test_addMessage_withMoreMessages() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {

	DtoBeziehungListeSUO dto      = new DtoBeziehungListeSUO();
	ReturnInfo           returnVO = new ReturnInfo();
	returnVO.setIstOk("ok");
	dto.setFehlerpaket(returnVO);
	Meldung meldungVO = new Meldung();
	meldungVO.setId("testid");
	meldungVO.setKategorie("testkategorie");
	meldungVO.setText("Das ist ein Test.");
	returnVO.getMeldungen().add(meldungVO);
	messages.addMessage(dto);

	dto = new DtoBeziehungListeSUO();
	returnVO = new ReturnInfo();
	returnVO.setIstOk("fail");
	dto.setFehlerpaket(returnVO);
	meldungVO = new Meldung();
	meldungVO.setId("fehlerid");
	meldungVO.setKategorie("fehlerkategorie");
	meldungVO.setText("Das ist ein zweiter Test");
	returnVO.getMeldungen().add(meldungVO);
	messages.addMessage(dto);

	assertEquals(2, messages.getMessages().size());

	MeldungBTO meldungBTO = messages.getMessages().get(0);
	assertEquals("testid", meldungBTO.getFehlerId());
	assertEquals("testkategorie", meldungBTO.getFehlerkategorie());
	assertEquals("Das ist ein Test.", meldungBTO.getMeldungstext());

	meldungBTO = messages.getMessages().get(1);
	assertEquals("fehlerid", meldungBTO.getFehlerId());
	assertEquals("fehlerkategorie", meldungBTO.getFehlerkategorie());
	assertEquals("Das ist ein zweiter Test", meldungBTO.getMeldungstext());
  }

  @Test
  void test_addMessage_withOneMessage() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {

	DtoBeziehungListeSUO dto      = new DtoBeziehungListeSUO();
	ReturnInfo           returnVO = new ReturnInfo();
	returnVO.setIstOk("ok");
	dto.setFehlerpaket(returnVO);
	Meldung meldungVO = new Meldung();
	meldungVO.setId("testid");
	meldungVO.setKategorie("testkategorie");
	meldungVO.setText("Das ist ein Test.");
	returnVO.getMeldungen().add(meldungVO);

	messages.addMessage(dto);

	assertEquals(1, messages.getMessages().size());
	MeldungBTO meldungBTO = messages.getMessages().get(0);

	assertEquals("testid", meldungBTO.getFehlerId());
	assertEquals("testkategorie", meldungBTO.getFehlerkategorie());
	assertEquals("Das ist ein Test.", meldungBTO.getMeldungstext());
  }
}
