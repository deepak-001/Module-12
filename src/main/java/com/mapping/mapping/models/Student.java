package com.mapping.mapping.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String psp;

//    @OneToOne(mappedBy = "student")
//    Laptop laptop;

    @OneToMany
    List<Laptop> laptops;

}
