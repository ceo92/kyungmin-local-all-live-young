package local.kyungmin_wms.constant;

public enum ProductType {
  DRUG("마약 및 항정신") , EXPLOSIVE("인화성 폭발물") , BIOLOGICAL("생물학적제제") , NORMAL("일반");
  private final String description;

  ProductType(String description){
    this.description=description;
  }

  public String getDescription(){
    return description;
  }


}
