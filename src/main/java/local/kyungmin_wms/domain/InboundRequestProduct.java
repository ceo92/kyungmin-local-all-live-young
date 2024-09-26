package local.kyungmin_wms.domain;

import java.time.LocalDateTime;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

@Getter @Setter(AccessLevel.PRIVATE)
public class InboundRequestProduct {

  private Long id;
  @NumberFormat(pattern = "#,###")
  private Integer palletQuantity;

  @NumberFormat(pattern = "#,###")
  private Integer boxQuantity;
  private String manufactureNumber;

  @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
  private LocalDateTime expirationDate;
  private InboundRequest inboundRequest;
  private Product product;
}
