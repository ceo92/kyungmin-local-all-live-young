package local.kyungmin_wms.domain;

import java.time.LocalDateTime;
import local.kyungmin_wms.constant.ProductType;
import local.kyungmin_wms.constant.StoreTemperature;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {
  private Long id;
  private String productName;
  private String storeTemperature; //StoreTemperature
  private String productType; //ProductType

  @DateTimeFormat(pattern = "yyyy. MM. dd. a hh:mm")
  private LocalDateTime productLicenseDate;
  private Integer productLicenseNum;
  private Member member;

}
