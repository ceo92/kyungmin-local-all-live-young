package local.kyungmin_wms.domain;

import local.kyungmin_wms.constant.ProductType;
import local.kyungmin_wms.constant.StoreTemperature;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter(AccessLevel.PRIVATE)
public class Section {
  private StoreTemperature storeTemperature;
  private ProductType productType;
  private Integer sectionCapacity;
  //private String blockNumber , 이건 인덱스로 처리할거라 정의 ㄴㄴ

}
