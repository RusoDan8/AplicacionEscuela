package com.Escuela.Estudiantes.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name =  "Student_Table")
public class Student
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long StudentId;
    private String firstName;
    private String lastName;
    @Column(name = "email_Adress",unique = true)
    private String Email;


}
