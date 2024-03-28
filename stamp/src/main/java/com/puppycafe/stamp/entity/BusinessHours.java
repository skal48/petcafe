package com.puppycafe.stamp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Table(name = "businiss_hour", schema = "pet_db")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class BusinessHours {

    @Id
    @Column(name = "business_hour_no")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long businessHourNo;

    @ManyToOne
    @JoinColumn(name = "cafe_no")
    private Cafe cafeNo;

    @Column(name = "monday")
    private String monday;

    @Column(name = "tuesday")
    private String tuesday;

    @Column(name = "wednesday")
    private String wednesday;

    @Column(name = "thureday")
    private String thursday;

    @Column(name = "friday")
    private String friday;

    @Column(name = "saturday")
    private String saturday;

    @Column(name = "sunday")
    private String sunday;

    @Column(name = "ect")
    private String ect;

}
