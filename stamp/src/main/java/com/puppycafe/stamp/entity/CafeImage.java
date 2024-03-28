package com.puppycafe.stamp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "reply_image", schema = "pet_db")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class CafeImage {

    @Id
    @Column(name = "cafe_image_no")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cafeImageNo;

    @ManyToOne
    @JoinColumn(name = "cafe_no")
    private Cafe cafeNo;

    @Column(name = "cafe_image_name", nullable = false)
    private String cafeImageName;

    @Column(name = "cafe_image_path)", nullable = false)
    private String cafeImagePath;

}
