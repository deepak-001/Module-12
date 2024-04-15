package com.mapping.mapping.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Entity
@Getter
@Setter
public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String psp;

//    @OneToOne
//    Student student;

    @OneToMany
    List<Student> student;
}
