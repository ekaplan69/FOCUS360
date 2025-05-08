package at.sozvers.noegkk.focus.service.kva.infrastructure;
/*
import at.itsv.kva.abzsuc.AbzsucRequest;
import at.itsv.kva.abzsuc.AbzsucResponse;
import at.sozvers.noegkk.focus.CdiExtension;
import at.sozvers.noegkk.focus.service.common.Fachschluessel;
import at.sozvers.noegkk.focus.ws.client.kva.abzsuc.AbzsucLesenRequestFactory;
import at.sozvers.noegkk.focus.ws.client.kva.abzsuc.KVAAbzsucService;
import at.sozvers.noegkk.focus.ws.client.kva.abzsuc.KvaAbzsucClient;
import org.jboss.weld.context.RequestContext;
import org.jboss.weld.context.unbound.Unbound;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import jakarta.inject.Inject;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(CdiExtension.class)
class KvaAbzsucClientIT {
    @Inject
    @Unbound
    private RequestContext requestContext;

    @BeforeEach
    public void activateRequestContext() {
        if (requestContext.isActive()) {
            requestContext.deactivate();
        }
        requestContext.activate();
    }

    @Inject
    @KVAAbzsucService
    private KvaAbzsucClient client;

    @Inject
    private AbzsucLesenRequestFactory abzsucLesenRequestFactory;

    @Test
    void smokeTest() throws Exception {
        Fachschluessel fachschluessel = Fachschluessel.of("4910040798", "VSNR");
        AbzsucRequest request = abzsucLesenRequestFactory.createAbzsucRequest(fachschluessel.getFachschluessel(), "180");
        AbzsucResponse response = client.sucheVersicherte_1_0(request);
        assertNotNull(response.getDataList());
        response = client.sucheAngehoerige_1_0(request);
        assertNotNull(response.getDataList());
    }

    @Test
    void test_KvaClient_Standardkonstruktor() {
        KvaAbzsucClient fakeclient = new KvaAbzsucClient();
        assertNotNull(fakeclient);
    }

    @Test
    void test_KvaClient_request_is_null(){
        AbzsucRequest request = null;
        assertThrows(NullPointerException.class, () -> client.sucheVersicherte_1_0(request));
    }
}
*/