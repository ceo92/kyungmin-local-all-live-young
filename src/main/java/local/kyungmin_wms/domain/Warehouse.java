package local.kyungmin_wms.domain;


import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter(AccessLevel.PRIVATE)
public class Warehouse {

  private Long id;
  private String name;
  private Address address;
  private String code;


}
