package com.works.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long nid;

    @Column(length = 150)
    private String title;

    private Integer days;

    private String category; // okul, is, ev
}
