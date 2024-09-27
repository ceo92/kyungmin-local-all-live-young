package local.kyungmin_wms.domain;


import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Warehouse {

  private Long id;
  private String name;
  private Address address;
  private String code;


}
