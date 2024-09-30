package local.kyungmin_wms.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter(AccessLevel.PRIVATE)
@AllArgsConstructor
@EqualsAndHashCode
  public class Address {
    private String roadNameAddress;
    private String jibunAddress;
    private String detailsAddress;
    private String zipcode;



}
