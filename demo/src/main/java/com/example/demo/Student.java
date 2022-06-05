package com.example.demo;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String course;
    private String fee;
}
