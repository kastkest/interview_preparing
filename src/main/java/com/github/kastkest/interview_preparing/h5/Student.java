package com.github.kastkest.interview_preparing.h5;

import jakarta.persistence.*;
import sun.util.resources.Bundles;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "mark")
    private String mark;

}
