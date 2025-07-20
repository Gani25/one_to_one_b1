package com.sprk.one_to_one.entity;

import jakarta.persistence.*;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rollNo;

    private String firstName;

    private String lastName;

    private String phone;

    // Aggregation
    @OneToOne
    @JoinColumn(name ="student_detail_id" )
    private StudentDetail studentDetail;
}
