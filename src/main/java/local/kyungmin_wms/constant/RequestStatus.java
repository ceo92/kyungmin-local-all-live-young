package local.kyungmin_wms.constant;

public enum RequestStatus {
  WAITING_REQUEST("요청 대기") , REJECT_REQUEST("요청 반려") , INSPECT_COMPLETE("완료") , ;
  private final String description;

  RequestStatus(String description){
    this.description=description;
  }

  public String getDescription(){
    return description;
  }
}
