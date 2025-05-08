package at.sozvers.noegkk.focus.rest.api.common;

import java.util.List;
import at.sozvers.noegkk.architektur.zup.Zugriffsprotokollierbar;
import at.sozvers.noegkk.architektur.zup.model.ProtokollEintrag;

public class BaseResponseDTO<T extends BaseDTO> extends MetainformationBaseDTO implements Zugriffsprotokollierbar {

  private T          response;
  private ZupInfoDTO zupInfoDto;

  public BaseResponseDTO() {
	//Set StandardConstructor public for ExceptionMeldungsMapperInterceptor
  }

  public static <T extends BaseDTO> BaseResponseDTO<T> of(T response, MetainformationDTO metainformationDTO) {
	BaseResponseDTO<T> baseResponseDTO = new BaseResponseDTO<>();
	baseResponseDTO.setResponse(response);
	baseResponseDTO.setMetainformation(metainformationDTO);
	baseResponseDTO.setZupInfoDto(null);
	return baseResponseDTO;
  }

  public static <T extends BaseDTO> BaseResponseDTO<T> of(T response, MetainformationDTO metainformationDTO, ZupInfoDTO zupInfoDto) {
	BaseResponseDTO<T> baseResponseDTO = new BaseResponseDTO<>();
	baseResponseDTO.setResponse(response);
	baseResponseDTO.setMetainformation(metainformationDTO);
	baseResponseDTO.setZupInfoDto(zupInfoDto);
	return baseResponseDTO;
  }

  @Override
  public List<ProtokollEintrag> getProtokollEintraege() {
	return ProtokollEintragUtil.getProtokollEintraege(zupInfoDto);
  }

  public T getResponse() {
	return response;
  }

  public void setResponse(T response) {
	this.response = response;
  }

  public ZupInfoDTO getZupInfoDto() {
	return zupInfoDto;
  }

  public void setZupInfoDto(ZupInfoDTO zupInfoDto) {
	this.zupInfoDto = zupInfoDto;
  }
}
