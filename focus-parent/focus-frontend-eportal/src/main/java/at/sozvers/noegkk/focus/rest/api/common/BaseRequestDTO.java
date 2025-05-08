package at.sozvers.noegkk.focus.rest.api.common;

public class BaseRequestDTO<T extends BaseDTO> {
  private MetainformationDTO metainformationDTO;
  private T                  request;

  public BaseRequestDTO() {
	//Set StandardConstructor public for ExceptionMeldungsMapperInterceptor
  }

  public static <T extends BaseDTO> BaseRequestDTO<T> of(T request, MetainformationDTO metainformationDTO) {
	BaseRequestDTO<T> baseRequestDTO = new BaseRequestDTO<>();
	baseRequestDTO.setRequest(request);
	baseRequestDTO.setMetainformationDTO(metainformationDTO);
	return baseRequestDTO;
  }

  public MetainformationDTO getMetainformationDTO() {
	return metainformationDTO;
  }

  public void setMetainformationDTO(MetainformationDTO metainformationDTO) {
	this.metainformationDTO = metainformationDTO;
  }

  public T getRequest() {
	return request;
  }

  public void setRequest(T request) {
	this.request = request;
  }
}
