package local.kyungmin_wms.domain;

import local.kyungmin_wms.constant.ProductType;
import local.kyungmin_wms.constant.StoreTemperature;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.NumberFormat;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Section {
  private StoreTemperature storeTemperature;
  private ProductType productType;

  @NumberFormat(pattern = "#,###")
  private Integer sectionCapacity;
  //private String blockNumber , 이건 인덱스로 처리할거라 정의 ㄴㄴ

}
