package at.sozvers.noegkk.focus.rest.mapping;

import java.util.*;
import java.util.stream.Collectors;
import at.sozvers.noegkk.focus.rest.api.common.BaseDTO;
import at.sozvers.noegkk.focus.service.api.common.BaseBTO;
import at.sozvers.noegkk.focus.service.interceptors.NullObjectHandling;
import org.apache.commons.lang3.NotImplementedException;

@NullObjectHandling
public abstract class BusinessRestMapper<DTO extends BaseDTO, BTO extends BaseBTO> {

  public List<BTO> mapToBtoList(List<DTO> dtoList) {
	if(dtoList == null) {
	  return Collections.emptyList();
	}

	return dtoList.stream().filter(Objects::nonNull).map(this::map).filter(Objects::nonNull).collect(Collectors.toList());
  }

  public BTO map(DTO dto) {
	throw new NotImplementedException("Not yet implemented.");
  }

  public List<DTO> mapToDtoList(List<BTO> btoList) {
	if(btoList == null) {
	  return Collections.emptyList();
	}
	return btoList.stream().filter(Objects::nonNull).map(this::map).filter(Objects::nonNull).collect(Collectors.toList());
  }

  public DTO map(BTO bto) {
	throw new NotImplementedException("Not yet implemented.");
  }
}
