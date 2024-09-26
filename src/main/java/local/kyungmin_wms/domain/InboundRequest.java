package local.kyungmin_wms.domain;

import java.time.LocalDateTime;
import local.kyungmin_wms.constant.RequestStatus;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

@Getter @Setter(AccessLevel.PRIVATE)
public class InboundRequest {

  private Long id;
  private String inboundRequestCode;
  private Company company;
  private Warehouse warehouse;
  private RequestStatus requestStatus;

  @DateTimeFormat(pattern =  "yyyy-MM-dd hh:mm")
  private LocalDateTime regDate;

  @DateTimeFormat(pattern =  "yyyy-MM-dd hh:mm")
  private LocalDateTime modDate;


}
