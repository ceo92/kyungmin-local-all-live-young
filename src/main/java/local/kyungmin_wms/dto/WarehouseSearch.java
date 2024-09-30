package local.kyungmin_wms.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor @NoArgsConstructor
public class WarehouseSearch {
  private String warehouseName;
  private String warehouseRoadAddress;
}
