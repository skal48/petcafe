package com.puppycafe.stamp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Clob;
import java.time.LocalDate;

@Table(name = "cafe", schema = "pet_db")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Cafe {

    @Id
    @Column(name = "cafe_no")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long CafeNo;

    @Column(name = "cafe_name", nullable = false)
    private String cafeName;

    @Column(name = "cafe_phone", nullable = false)
    private String cafePhone;

    @Column(name = "address", nullable = false)
    private String address;

    @Column(name = "cafe_content")
    @Lob
    private String cafeContent;

    @Column(name = "heart", nullable = false)
    private Integer heart; // 1: 일반 2: 사업자


}
