package com.example.demodocker.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "student")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @Id
//    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_seq_gen")
//    @SequenceGenerator(name = "student_seq_gen", sequenceName = "student_seq_gen", allocationSize = 1)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "birth_year")
    private Integer birthYear;

}
