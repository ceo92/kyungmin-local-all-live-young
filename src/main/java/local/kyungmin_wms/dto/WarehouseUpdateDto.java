package local.kyungmin_wms.dto;

import lombok.Data;

@Data
public class WarehouseUpdateDto {
  private String name;
  private String code;
  private String roadNameAddress;
  private String jibunAddress;
  private String detailsAddress;
  private String zipcode;
}
