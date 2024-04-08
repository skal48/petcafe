package com.puppycafe.stamp.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;

@Table(name = "user", schema = "pet_db")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {

    @Id
    @Column(name = "user_no")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userNo;

    @Column(name = "user_name", nullable = false)
    private String userName;

    @Column(name = "nickname", nullable = false, unique = true)
    private String nickname;

    @Column(name = "user_phone", nullable = false, unique = true)
    private String userPhone;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "user_type", nullable = false)
    private Integer userType; // 1: 일반 2: 사업자

    @Column(name = "token", nullable = false)
    private String token;

    @Column(name = "business_registration", unique = true)
    private String businessRegistration; //사업자 등록번호

    @Column(name = "joined_date", nullable = false)
    private LocalDate joinedDate;

    @Column(name = "agree", nullable = false)
    private Integer agree;

}
