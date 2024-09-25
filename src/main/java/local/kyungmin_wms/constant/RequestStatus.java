package local.kyungmin_wms.constant;

public enum RequestStatus {
  WAITING_REQUEST("요청 대기") , REJECT_REQUEST("요청 반려") , INSPECTING("검수중") , INSPECT_COMPLETE("검수 완료") , INSPECT_FAIL("검수 불합");
  private final String description;

  RequestStatus(String description){
    this.description=description;
  }

  public String getDescription(){
    return description;
  }
}
