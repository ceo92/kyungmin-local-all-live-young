package local.kyungmin_wms.constant;

public enum AccountStatus {

  WAITING_APPROVAL("승인 대기") , ACTIVATION("활성") , WAITING_CANCEL("탈퇴 대기") , INACTIVATION("비활성");
  private final String description;

  AccountStatus(String description){
    this.description=description;
  }

  public String getDescription(){
    return description;
  }
}
