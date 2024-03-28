package com.puppycafe.stamp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Clob;
import java.time.LocalDate;

@Table(name = "reply", schema = "pet_db")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Reply {

    @Id
    @Column(name = "reply_no")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long replyNo;

    @ManyToOne
    @JoinColumn(name = "user_no")
    private User userNo;

    @ManyToOne
    @JoinColumn(name = "cafe_no")
    private Cafe cafeNo;

    @Column(name = "reply_content")
    @Lob
    private String replyContent;

    @Column(name = "reply_date", nullable = false)
    private LocalDate replyDate;

    @Column(name = "depth", nullable = false, scale = 2)
    private Integer depth;

    @Column(name = "reply_order", nullable = false)
    private Integer replyOrder;

}
