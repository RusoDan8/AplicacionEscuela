package com.Escuela.Estudiantes.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name =  "Teacher_Table")
public class Teacher
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long TeacherId;
    private String firstName;
    private String lastName;
    private Float salary;
    private String Subject;
    @Column(name = "email_Adress",unique = true)
    private String Email;


}

