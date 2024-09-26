package local.kyungmin_wms.domain;

import java.time.LocalDateTime;
import local.kyungmin_wms.constant.AccountStatus;
import local.kyungmin_wms.constant.RoleType;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

@Getter @Setter(AccessLevel.PRIVATE)
public class Member {
  private Long id;
  private String name;
  private String email;
  private String password;
  private String phoneNumber;
  private Address address;
  private AccountStatus accountStatus;

  @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
  private LocalDateTime joinDate;

  @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
  private LocalDateTime lastLoginDate;
  private RoleType roleType;
}
