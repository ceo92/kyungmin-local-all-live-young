package local.kyungmin_wms.dto;

import java.time.LocalDateTime;
import java.util.List;
import local.kyungmin_wms.constant.ProductType;
import local.kyungmin_wms.constant.StoreTemperature;
import lombok.Data;

//검색 조건
@Data
public class StockSearch {

  /**
   * 권한 : 총 관리자의 재고 조회
   */
  private String warehouseCode; //총관리자의 재고 조회
  private String warehouseName; //총관리자의 재고 조회

  /**
   * 권한 : 창고 관리자 , 사업자의 재고 조회
   */
  private String stockCode;
  private List<StoreTemperature> storeTemperature; //보관 온도(상온 , 냉동 , 냉장) 별 조회 체크박스 검색
  private List<ProductType> productType; //상품 종류(마약 , 폭발물 , 생물학적제제 , 일반) 체크박스 검색
  private String productName; //LIKE 조건
  private String companyName; //LIKE 조건
  private String manufactureNumber;
  private LocalDateTime minExpirationDate; //유효기간 범위(최소 설정)
  private LocalDateTime maxExpirationDate; //유효기간 범위(최대 설정)
  private LocalDateTime minRegDate; // 등록일자 범위(최소 설정)
  private LocalDateTime maxRegDate; // 등록일자 범위(최대 설정)
  private LocalDateTime minModDate; // 수정일자 범위(최소 설정)
  private LocalDateTime maxModDate; // 수정일자 범위(최대 설정)
  private Integer minQuantity; //입고 시 박스 수량
  private Integer maxQuantity; //입고 시 박스 수량

}
