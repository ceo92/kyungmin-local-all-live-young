package local.kyungmin_wms.domain;

import java.time.LocalDateTime;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

@Getter @Setter
@NoArgsConstructor
public class InboundRequestProduct {

  private Long id;
  @NumberFormat(pattern = "#,###")
  private Integer palletQuantity;

  @NumberFormat(pattern = "#,###")
  private Integer boxQuantity;
  private String manufactureNumber;


  @DateTimeFormat(pattern = "yyyy. MM. dd. a hh:mm")
  private LocalDateTime expirationDate;

  private InboundRequest inboundRequest;
  private Product product;

  public void updateTotalQuantity(Integer palletQuantity , Integer boxQuantity){
    this.palletQuantity = palletQuantity;
    this.boxQuantity = boxQuantity;
  }


}
