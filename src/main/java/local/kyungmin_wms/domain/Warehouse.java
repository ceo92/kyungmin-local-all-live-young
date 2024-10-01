package local.kyungmin_wms.domain;


import java.util.Random;
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


  //code 제외 , code는 시스템이 만들어줌 ㅇㅇ
  public void changeWarehouse(String name , String roadNameAddress , String jibunAddress , String detailsAddress ,String zipcode){
    this.name = name;
    this.address = new Address(roadNameAddress, jibunAddress, detailsAddress, zipcode);
  }


}
