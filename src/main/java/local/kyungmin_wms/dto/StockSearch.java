package local.kyungmin_wms.dto;

import java.time.LocalDateTime;
import local.kyungmin_wms.domain.ProductType;
import local.kyungmin_wms.domain.StoreTemperature;
import lombok.Data;

@Data
public class StockSearch {
  private String stockCode;
  private StoreTemperature storeTemperature; //보관 온도(상온 , 냉동 , 냉장) 별 조회
  private ProductType productType; //상품 종류(마약 , 폭발물 , 생물학적제제 , 일반)
  private String productName;
  private String companyName;
  private LocalDateTime regDate;
  private LocalDateTime modDate;
  private Integer quantity;

}
