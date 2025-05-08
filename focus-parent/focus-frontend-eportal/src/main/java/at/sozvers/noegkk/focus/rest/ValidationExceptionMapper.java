package at.sozvers.noegkk.focus.rest;

import java.util.ArrayList;
import java.util.List;
import at.sozvers.noegkk.focus.rest.api.common.*;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.ConstraintViolationException;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;

import static at.sozvers.noegkk.focus.rest.endpoint.constants.RestPaths.APPLICATION_JSON_CHARSET_UTF_8;

@Provider
public class ValidationExceptionMapper implements ExceptionMapper<ConstraintViolationException> {

  @Override
  public Response toResponse(ConstraintViolationException exception) {
	BaseResponseDTO response = new BaseResponseDTO();

	MetainformationDTO meta = new MetainformationDTO();
	meta.setStatus("F");
	meta.setMeldungen(prepareMessage(exception));

	response.setMetainformation(meta);

	return Response.status(Response.Status.BAD_REQUEST).entity(response).type(APPLICATION_JSON_CHARSET_UTF_8).build();
  }

  private List<MeldungDTO> prepareMessage(ConstraintViolationException exception) {
	List<MeldungDTO> meldungen = new ArrayList<>();

	for(ConstraintViolation<?> cv : exception.getConstraintViolations()) {
	  meldungen.add(MeldungDTO.of("V", "Validierungsfehler", cv.getPropertyPath() + " " + cv.getMessage()));
	}

	return meldungen;
  }
}
