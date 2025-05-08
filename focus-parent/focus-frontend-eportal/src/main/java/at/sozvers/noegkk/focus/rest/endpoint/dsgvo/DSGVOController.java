package at.sozvers.noegkk.focus.rest.endpoint.dsgvo;

import javax.xml.transform.TransformerException;
import java.io.IOException;
import java.util.List;
import at.sozvers.noegkk.focus.service.dsgvo.DSGVOService;
import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;
import jakarta.xml.bind.JAXBException;
import org.apache.avalon.framework.configuration.ConfigurationException;
import org.xml.sax.SAXException;

@Dependent
public class DSGVOController {

  @Inject
  private DSGVOService dsgvoService;

  public byte[] createPdf(String fs, String fsArt, Double personPid, List<Integer> landesStellen) throws ConfigurationException, IOException, SAXException, TransformerException, JAXBException {
	return dsgvoService.createPdf(fs, fsArt, personPid, landesStellen);
  }
}
