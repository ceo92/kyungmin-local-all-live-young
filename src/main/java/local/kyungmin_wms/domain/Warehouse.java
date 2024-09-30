package local.kyungmin_wms.domain;


import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @Builder
@AllArgsConstructor
@NoArgsConstructor
public class Warehouse {

  private Long id;
  private String name;
  private Address address;
  private String code;


  public void changeWarehouse(String name , String code , String roadNameAddress , String jibunAddress , String detailsAddress ,String zipcode){
    this.name = name;
    this.code =code;
    this.address = new Address(roadNameAddress, jibunAddress, detailsAddress, zipcode);
  }


}
