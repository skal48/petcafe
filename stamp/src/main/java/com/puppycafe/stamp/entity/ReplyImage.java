package com.puppycafe.stamp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Table(name = "reply_image", schema = "pet_db")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ReplyImage {

    @Id
    @Column(name = "reply_image_no")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long replyImageNo;

    @ManyToOne
    @JoinColumn(name = "reply_no")
    private Reply replyNo;

    @Column(name = "reply_image_name", nullable = false)
    private String replyImageName;

    @Column(name = "reply_image_path)", nullable = false)
    private String replyImagePath;

}
