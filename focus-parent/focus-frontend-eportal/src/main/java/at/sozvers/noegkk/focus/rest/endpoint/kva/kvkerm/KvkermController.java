package at.sozvers.noegkk.focus.rest.endpoint.kva.kvkerm;

import javax.xml.datatype.DatatypeConfigurationException;
import at.sozvers.noegkk.focus.rest.api.kva.kvkerm.KvkermDTO;
import at.sozvers.noegkk.focus.service.common.FachschluesselValidator;
import at.sozvers.noegkk.focus.service.kva.kvkerm.KvkermService;
import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class KvkermController {

  @Inject
  private FachschluesselValidator  fachschluesselValidator;
  @Inject
  private KvkermBusinessRestMapper kvkermBusinessRestMapper;
  @Inject
  private KvkermService            kvkermService;

  public KvkermDTO krankenanspruchErmitteln(String vsnr) throws DatatypeConfigurationException {
	return kvkermBusinessRestMapper.map(kvkermService.ermittleKrankenanspruch(vsnr));
  }
}
