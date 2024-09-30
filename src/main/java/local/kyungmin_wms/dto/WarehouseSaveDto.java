package local.kyungmin_wms.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class WarehouseSaveDto {
  @NotNull
  private String name;

  @NotNull
  private String roadNameAddress;

  @NotNull
  private String jibunAddress;

  @NotNull
  private String detailsAddress;

  @NotNull
  private String zipcode;
}
