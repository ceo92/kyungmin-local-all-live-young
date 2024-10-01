package local.kyungmin_wms.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ImageFile {
  private String uploadFileName;
  private String storeFileName;

}
