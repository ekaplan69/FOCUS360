package at.sozvers.noegkk.focus.service.mapping;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import at.sozvers.noegkk.focus.service.api.common.BaseBTO;
import at.sozvers.noegkk.focus.service.interceptors.NullObjectHandling;
import org.apache.commons.lang3.NotImplementedException;

@NullObjectHandling
public abstract class BTOExternalServiceMapper<BTO extends BaseBTO, DTO> {

  public List<BTO> mapToBtoList(List<DTO> dtoList) {
	return dtoList.stream().filter(Objects::nonNull).map(this::map).filter(Objects::nonNull).collect(Collectors.toList());
  }

  public BTO map(DTO dto) {
	throw new NotImplementedException("Not yet implemented.");
  }

  public List<DTO> mapToDtoList(List<BTO> btoList) {
	return btoList.stream().filter(Objects::nonNull).map(this::map).filter(Objects::nonNull).collect(Collectors.toList());
  }

  public DTO map(BTO bto) {
	throw new NotImplementedException("Not yet implemented.");
  }
}
