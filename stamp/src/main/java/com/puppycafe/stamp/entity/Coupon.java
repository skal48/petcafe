package com.puppycafe.stamp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Table(name = "coupon", schema = "pet_db")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Coupon {

    @Id
    @Column(name = "coupon_no")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long couponNo;

    @ManyToOne
    @JoinColumn(name = "user_no")
    private User userNo;

    @ManyToOne
    @JoinColumn(name = "cafe_no")
    private Cafe cafeNo;

    @Column(name = "save_date", nullable = false)
    private LocalDate saveDate;

    @Column(name = "use_date", nullable = false)
    private LocalDate useDate;

    @Column(name = "use-state", nullable = false)
    private LocalDate useState;

    @Column(name = "exp_date", nullable = false)
    private LocalDate expDate;


}
