package local.kyungmin_wms.web.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * multipart 파일을 저장하는 역할을 함 , 여기선 이미지 출력만 할 것이므로 파일 경로 및 확장자를 지정해주는 역할만 수행 ! , 하지만 추후 저장소로서 리팩토링 할 것임
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
