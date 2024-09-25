package local.kyungmin_wms.domain;

import java.time.LocalDateTime;

public class Member {
  private Long id;
  private String name;
  private String email;
  private String password;
  private String phoneNumber;
  private Address address;
  private AccountStatus accountStatus;
  private LocalDateTime joinDate;
  private LocalDateTime lastLoginDate;
  private RoleType roleType;
}
