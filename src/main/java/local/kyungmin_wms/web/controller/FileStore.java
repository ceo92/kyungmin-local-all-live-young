package local.kyungmin_wms.web.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import local.kyungmin_wms.domain.ImageFile;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

/**
 * multipart 파일을 저장하는 역할을 함
 */
@Component
@Slf4j
public class FileStore {

  @Value("${file.dir}")
  private String fileDir; //이 경로에 사용자가 첨부한 파일들 저장


  public String getFullPath(String filename){
    return fileDir + filename+".png"; //파일 경로 + 파일명
  }

}
