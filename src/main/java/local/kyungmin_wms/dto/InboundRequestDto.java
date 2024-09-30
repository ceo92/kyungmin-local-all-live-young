package local.kyungmin_wms.dto;

import java.util.ArrayList;
import java.util.List;
import lombok.Data;

@Data
public class InboundRequestDto {

  private String inboundRequestCode;
  private List<String> palletQuantitys = new ArrayList<>();
  private List<String> boxQuantitys = new ArrayList<>();

}
