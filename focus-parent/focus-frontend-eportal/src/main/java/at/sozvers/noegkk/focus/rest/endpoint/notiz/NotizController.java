package at.sozvers.noegkk.focus.rest.endpoint.notiz;

import at.sozvers.noegkk.focus.rest.api.notiz.NotizDTO;
import at.sozvers.noegkk.focus.service.api.notiz.NotizBTO;
import at.sozvers.noegkk.focus.service.common.Fachschluessel;
import at.sozvers.noegkk.focus.service.common.FachschluesselValidator;
import at.sozvers.noegkk.focus.service.notiz.NotizService;
import jakarta.inject.Inject;

public class NotizController {

  @Inject
  NotizBusinessRestMapper notizBusinessRestMapper;
  @Inject
  private FachschluesselValidator fachschluesselValidator;
  @Inject
  private NotizService            notizService;

  public Long createNotiz(NotizDTO notizDTO) {
	Fachschluessel fachschluessel = notizDTO.getFachschluessel();
	fachschluesselValidator.validate(fachschluessel);
	return notizService.createNotizForFachschluessel(notizDTO.getFachschluessel(), notizDTO.getText());
  }

  public NotizDTO searchNotiz(Fachschluessel fachschluessel) {
	fachschluesselValidator.validate(fachschluessel);
	NotizBTO notizBTO = notizService.readNotizByFachschluessel(fachschluessel);

	return notizBusinessRestMapper.map(notizBTO);
  }

  public Long updateNotiz(NotizDTO dto) {
	Fachschluessel fachschluessel = dto.getFachschluessel();
	fachschluesselValidator.validate(fachschluessel);
	return notizService.updateNotizForFachschluessel(dto.getFachschluessel(), dto.getText(), dto.getUpdateCount());
  }
}
