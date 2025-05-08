package at.sozvers.noegkk.focus.rest.api.lgkk;

import at.sozvers.noegkk.dda.service.complex.api.output.DDADocumentOutput;
import at.sozvers.noegkk.focus.rest.api.common.BaseDTO;

public class LgkDokumentDTO implements BaseDTO {
  private DDADocumentOutput document;

  public LgkDokumentDTO() {
  }

  public LgkDokumentDTO(DDADocumentOutput document) {
	this.document = document;
  }

  public DDADocumentOutput getDocument() {
	return document;
  }

  public void setDocument(DDADocumentOutput document) {
	this.document = document;
  }
}
