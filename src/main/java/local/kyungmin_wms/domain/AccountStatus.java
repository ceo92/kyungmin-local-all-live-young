package local.kyungmin_wms.domain;

public enum AccountStatus {


  ("승인 대기") , EXPLOSIVE("활성") , BIOLOGICAL("탈퇴 대기") , NORMAL("비활성");
  private final String description;

  AccountStatus(String description){
    this.description=description;
  }

  public String getDescription(){
    return description;
  }
}
