package local.kyungmin_wms.domain;


import java.time.LocalDateTime;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter(AccessLevel.PRIVATE)
public class Stock {

  private Long id;
  private String stockCode; //재고 로트 번호
  private int quantity; //총 박스 수량
  private LocalDateTime regDate;
  private LocalDateTime modDate;

  private Product product;
  private Warehouse warehouse;
  private Palette palette;




}
