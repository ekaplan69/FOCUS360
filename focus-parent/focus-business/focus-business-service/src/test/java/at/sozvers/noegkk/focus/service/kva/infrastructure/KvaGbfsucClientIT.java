package at.sozvers.noegkk.focus.service.kva.infrastructure;
/*
import at.itsv.kva.gbfsuc.GbfsucRequest;
import at.itsv.kva.gbfsuc.GbfsucResponse;
import at.sozvers.noegkk.focus.CdiExtension;
import at.sozvers.noegkk.focus.service.common.Fachschluessel;
import at.sozvers.noegkk.focus.ws.client.kva.gbfsuc.GebuehrenbefreiungLesenRequestFactory;
import at.sozvers.noegkk.focus.ws.client.kva.gbfsuc.KVAGbfsucService;
import at.sozvers.noegkk.focus.ws.client.kva.gbfsuc.KvaGbfsucClient;
import org.jboss.weld.context.RequestContext;
import org.jboss.weld.context.unbound.Unbound;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import jakarta.inject.Inject;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;


@ExtendWith(CdiExtension.class)
class KvaGbfsucClientIT {
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
    @KVAGbfsucService
    private KvaGbfsucClient kvaGbfsucClient;

    @Inject
    private GebuehrenbefreiungLesenRequestFactory gebuehrenbefreiungLesenRequestFactory;

    @Test
    void smokeTest() throws Exception {
        Fachschluessel fachschluessel = Fachschluessel.of("4910040798", "VSNR");
        GbfsucRequest request = gebuehrenbefreiungLesenRequestFactory.createGbfsucRequest(fachschluessel.getFachschluessel(), "180");
        GbfsucResponse response = kvaGbfsucClient.sucheGebuehrenbefreiungen_1_0(request);
        assertNotNull(response.getGebuehrenbefreiungen());
    }

    @Test
    void test_KvaClient_request_is_null() {
        GbfsucRequest request = null;
        assertThrows(NullPointerException.class, () -> kvaGbfsucClient.sucheGebuehrenbefreiungen_1_0(request));
    }
}
*/