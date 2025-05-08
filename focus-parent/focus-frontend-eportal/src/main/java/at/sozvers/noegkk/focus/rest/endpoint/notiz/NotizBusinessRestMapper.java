package at.sozvers.noegkk.focus.rest.endpoint.notiz;

import at.sozvers.noegkk.focus.rest.api.notiz.NotizDTO;
import at.sozvers.noegkk.focus.rest.mapping.BusinessRestMapper;
import at.sozvers.noegkk.focus.service.api.notiz.NotizBTO;
import at.sozvers.noegkk.focus.service.common.Fachschluessel;

public class NotizBusinessRestMapper extends BusinessRestMapper<NotizDTO, NotizBTO> {

  @Override
  public NotizDTO map(NotizBTO notizBTO) {
	NotizDTO notizDTO = new NotizDTO();

	notizDTO.setId(notizBTO.getId());
	notizDTO.setText(notizBTO.getText());
	notizDTO.setUpdateCount(notizBTO.getUpdateCount());
	notizDTO.setFachschluessel(Fachschluessel.of(notizBTO.getFachSchluessel(), notizBTO.getFachschluesselArt()));
	return notizDTO;
  }
}
