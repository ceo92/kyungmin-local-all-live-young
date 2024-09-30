package local.kyungmin_wms.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor @NoArgsConstructor
public class WarehouseSearch {
  private String warehouseCode;
  private String warehouseName;
}
