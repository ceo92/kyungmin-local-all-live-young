package local.kyungmin_wms.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class WarehouseUpdateDto {
  private String name;
  private String code;
  private String roadNameAddress;
  private String jibunAddress;
  private String detailsAddress;
  private String zipcode;
}
