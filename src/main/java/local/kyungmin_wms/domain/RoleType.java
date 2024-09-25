package local.kyungmin_wms.domain;

public enum RoleType {

  ADMIN("총 관리자") , WAREHOUSE_MANAGER("창고 관리자") , COMPANY("회사") , DELIVERY_MAN("배송기사");
  private final String description;

  RoleType(String description){
    this.description=description;
  }

  public String getDescription(){
    return description;
  }
}
