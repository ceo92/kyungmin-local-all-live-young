package local.kyungmin_wms.domain;

import java.time.LocalDateTime;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter(AccessLevel.PRIVATE)
public class InboundRequestProduct {

  private Long id;
  private Integer palletQuantity;
  private Integer boxQuantity;
  private String manufactureNumber;
  private LocalDateTime expirationDate;
  private InboundRequest inboundRequest;
  private Product product;
}
