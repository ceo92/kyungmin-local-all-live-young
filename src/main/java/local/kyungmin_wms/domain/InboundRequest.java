package local.kyungmin_wms.domain;

import java.time.LocalDateTime;
import local.kyungmin_wms.constant.RequestStatus;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter(AccessLevel.PRIVATE)
public class InboundRequest {

  private Long id;
  private String inboundRequestCode;
  private Company company;
  private Warehouse warehouse;
  private RequestStatus requestStatus;
  private LocalDateTime regDate;
  private LocalDateTime modDate;


}
