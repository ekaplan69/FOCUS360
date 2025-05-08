package at.sozvers.noegkk.focus.rest.api.common;

import java.util.Collection;
import java.util.List;
import at.sozvers.noegkk.architektur.zup.Zugriffsprotokollierbar;
import at.sozvers.noegkk.architektur.zup.model.ProtokollEintrag;

public class BaseResponseCollectionDTO<T extends Collection<? extends BaseDTO>> extends MetainformationBaseDTO implements Zugriffsprotokollierbar {

  private T          response;
  private ZupInfoDTO zupInfoDto;

  public BaseResponseCollectionDTO() {
	//Set StandardConstructor public for ExceptionMeldungsMapperInterceptor
  }

  private BaseResponseCollectionDTO(T response) {
	this.response = response;
  }

  public static <T extends Collection<? extends BaseDTO>> BaseResponseCollectionDTO<T> of(T response, MetainformationDTO metainformationDTO) {
	BaseResponseCollectionDTO<T> baseResponseDTO = new BaseResponseCollectionDTO<>(response);
	baseResponseDTO.setMetainformation(metainformationDTO);
	baseResponseDTO.setZupInfoDto(null);
	return baseResponseDTO;
  }

  public static <T extends Collection<? extends BaseDTO>> BaseResponseCollectionDTO<T> of(T response, MetainformationDTO metainformationDTO, ZupInfoDTO zupInfoDto) {
	BaseResponseCollectionDTO<T> baseResponseDTO = new BaseResponseCollectionDTO<>(response);
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
