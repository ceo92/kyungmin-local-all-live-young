package local.kyungmin_wms.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter(AccessLevel.PRIVATE)
public class Company extends Member{
  private String businessNumber;

}
