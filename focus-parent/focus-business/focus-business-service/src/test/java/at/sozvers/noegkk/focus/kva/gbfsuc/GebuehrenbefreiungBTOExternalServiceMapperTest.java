package at.sozvers.noegkk.focus.kva.gbfsuc;
/*
import at.itsv.kva.gbfsuc.Gebuehrenbefreiung;
import at.sozvers.noegkk.focus.CdiExtension;
import at.sozvers.noegkk.focus.service.api.kva.gbfsuc.GebuehrenbefreiungBTO;
import at.sozvers.noegkk.focus.service.kva.gbfsuc.GebuehrenbefreiungBTOExternalServiceMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import jakarta.inject.Inject;
import javax.xml.datatype.DatatypeConfigurationException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(CdiExtension.class)
class GebuehrenbefreiungBTOExternalServiceMapperTest {

    @Inject
    GebuehrenbefreiungBTOExternalServiceMapper gebuehrenbefreiungBTOExternalServiceMapper;

    @Test
    void test_map_gebuehrenbefreiung_allesGesetzt() throws DatatypeConfigurationException {
        Gebuehrenbefreiung dto = new Gebuehrenbefreiung();
        dto.setGbfTypBez("Testtypbezeichnung");
        dto.setGbfGrundbez("Testgrundbezeichnung");

        GebuehrenbefreiungBTO bto = gebuehrenbefreiungBTOExternalServiceMapper.map(dto);

        assertThat(bto).isNotNull();
        assertEquals("Testtypbezeichnung", bto.getBefreiung());
        assertEquals("Testgrundbezeichnung", bto.getBefreiungsgrund());
    }

    @Test
    void test_map_gebuehrenbefreiung_null() {
        Gebuehrenbefreiung dto = null;
        GebuehrenbefreiungBTO bto = gebuehrenbefreiungBTOExternalServiceMapper.map(dto);
        assertThat(bto).isNull();
    }
}*/
