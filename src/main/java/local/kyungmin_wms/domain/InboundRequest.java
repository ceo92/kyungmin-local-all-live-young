package local.kyungmin_wms.domain;

import java.time.LocalDateTime;
import local.kyungmin_wms.constant.RequestStatus;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
public class InboundRequest {

  private Long id;
  private String inboundRequestCode;
  private Member member;
  private Warehouse warehouse;
  private RequestStatus requestStatus;

  private LocalDateTime regDate;

  private LocalDateTime modDate;


}
