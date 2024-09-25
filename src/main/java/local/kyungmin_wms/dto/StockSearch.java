package local.kyungmin_wms.dto;

import local.kyungmin_wms.domain.ProductType;
import local.kyungmin_wms.domain.StoreTemperature;
import lombok.Data;

@Data
public class StockSearch {
  private StoreTemperature storeTemperature; //보관 온도(상온 , 냉동 , 냉장) 별 조회
  private ProductType productType; //종류()
}
