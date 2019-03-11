package com.crud.app.demo.model;

import java.util.List;

import javax.persistence.*;

import lombok.*;

@Data
@Entity
@Table
public class Employee {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "first_name")
    private String firstName;
    private String lastName;
    private String status;
}
