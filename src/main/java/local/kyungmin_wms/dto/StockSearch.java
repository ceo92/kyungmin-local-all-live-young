package local.kyungmin_wms.dto;

import java.time.LocalDateTime;
import java.util.List;
import local.kyungmin_wms.constant.ProductType;
import local.kyungmin_wms.constant.StoreTemperature;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//검색 조건
@Data
@AllArgsConstructor @NoArgsConstructor
public class StockSearch {


  private String warehouseName; //총관리자의 재고 조회
  private String warehouseCode; //총관리자의 재고 조회

  private String stockCode;
  private List<StoreTemperature> storeTemperatures; //보관 온도(상온 , 냉동 , 냉장) 별 조회 체크박스 검색
  private List<ProductType> productTypes; //상품 종류(마약 , 폭발물 , 생물학적제제 , 일반) 체크박스 검색
  private String productName; //LIKE 조건
  private String companyName; //LIKE 조건
  private LocalDateTime expirationDate; //유효기간 애초에 임박한 것만 알면 되지 않나 ? , 임박 시 빨간색으로 표시 !

}
