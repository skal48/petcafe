package com.puppycafe.stamp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
  private int userNo;
  private String userName;
  private String nickName;
  private String email;
  private String password;
  private int userType;
  private String token;
  private String userPhone;
  private String businessRegistration;
  private LocalDate joinedDate;
  private int agree;
}
