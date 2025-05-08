package at.sozvers.noegkk.focus.rest.endpoint.leistungen.mapper;
/*
import at.sozvers.noegkk.focus.CdiExtension;
import at.sozvers.noegkk.focus.rest.api.lgkk.LeistungenDTO;
import at.sozvers.noegkk.focus.rest.api.lgkk.UnfallerhDTO;
import at.sozvers.noegkk.focus.rest.api.lgkk.VwstDTO;
import at.sozvers.noegkk.focus.service.api.lgkk.HbHmBTO;
import at.sozvers.noegkk.focus.service.api.lgkk.LeistungenBTO;
import at.sozvers.noegkk.focus.service.api.lgkk.UnfallerhBTO;
import at.sozvers.noegkk.focus.service.api.lgkk.VwstBTO;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.inject.Inject;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

@ExtendWith(CdiExtension.class)
class LeistungenBusinessRestMapperTest {

    @Inject
    private LeistungenBusinessRestMapper leistungenBusinessRestMapper;

    @Test
    void testNullMapping() {
        LeistungenBTO bto = null;

        LeistungenDTO dto = leistungenBusinessRestMapper.map(bto);

        assertNull(dto);
    }

    @Test
    void testHbHmMapping() {
        LeistungenBTO leistungenBTO = new LeistungenBTO();

        HbHmBTO hbhmBTO = new HbHmBTO();
        hbhmBTO.setVerordnungsDat(LocalDate.now());
        leistungenBTO.setHbhm(hbhmBTO);

        LeistungenDTO dto = leistungenBusinessRestMapper.map(leistungenBTO);

        assertEquals(hbhmBTO.getVerordnungsDat(), dto.getHbhm().getVerordnungsDat());
    }

    @Test
    void testVwstMapping() {
        LeistungenBTO leistungenBTO = new LeistungenBTO();

        List<VwstBTO> vwstBTOList = new LinkedList<>();
        VwstBTO vwstBTO = new VwstBTO();
        vwstBTO.setLeistungsType("Leistungstype");
        vwstBTO.setGueltigBisDat(LocalDate.now());
        vwstBTOList.add(vwstBTO);
        leistungenBTO.setVwst(vwstBTOList);

        LeistungenDTO leistungenDTO = leistungenBusinessRestMapper.map(leistungenBTO);

        assertEquals(vwstBTOList.size(), leistungenDTO.getVwst().size());
        VwstDTO vwstDTO = leistungenDTO.getVwst().get(0);
        assertEquals(vwstBTO.getLeistungsType(), vwstDTO.getLeistungsType());
        assertEquals(vwstBTO.getGueltigBisDat(), vwstDTO.getGueltigBisDat());
    }

    @Test
    void testUnfallerhMapping() {
        LeistungenBTO leistungenBTO = new LeistungenBTO();

        UnfallerhBTO unfallerhBTO = new UnfallerhBTO();
        unfallerhBTO.setEingelagtDat(LocalDate.now().minusDays(10));
        unfallerhBTO.setErstellDat(LocalDate.now().minusDays(8));
        unfallerhBTO.setUrgenz1Dat(LocalDate.now().minusDays(6));
        unfallerhBTO.setUrgenz2Dat(LocalDate.now().minusDays(4));
        leistungenBTO.setUnfallerh(unfallerhBTO);

        LeistungenDTO leistungenDTO = leistungenBusinessRestMapper.map(leistungenBTO);

        assertNotNull(leistungenDTO.getUnfallerh());
        UnfallerhDTO unfallerhDTO = leistungenDTO.getUnfallerh();
        assertEquals(unfallerhBTO.getEingelagtDat(), unfallerhDTO.getEingelangtDat());
        assertEquals(unfallerhBTO.getErstellDat(), unfallerhDTO.getErstellDat());
        assertEquals(unfallerhBTO.getUrgenz1Dat(), unfallerhDTO.getUrgenz1Dat());
        assertEquals(unfallerhBTO.getUrgenz2Dat(), unfallerhDTO.getUrgenz2Dat());
    }
}
*/