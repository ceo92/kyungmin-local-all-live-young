package local.kyungmin_wms.domain;

import java.time.LocalDateTime;
import local.kyungmin_wms.constant.ProductType;
import local.kyungmin_wms.constant.StoreTemperature;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter(AccessLevel.PRIVATE)
public class Product {
  private Long id;
  private String productName;
  private StoreTemperature storeTemperature;
  private ProductType productType;
  private LocalDateTime productLicenseDate;
  private Integer productLicenseNum;
  private Company company;

}
