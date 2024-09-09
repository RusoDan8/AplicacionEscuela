package com.Escuela.Estudiantes.controller;

import com.Escuela.Estudiantes.Entity.Student;
import com.Escuela.Estudiantes.StudentService.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/students")
public class StudentController
{
    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<Student> getAll() //trae todos los estudiantes
    {
       return studentService.getStudents();
    }
    @GetMapping("/{studentId}")
    public Optional<Student> getById(@PathVariable("studentId") Long studentId) //trae todos los estudiantes
    {
        return studentService.getStudent(studentId);
    }
    @PostMapping
    public void SaveUpdate(@RequestBody Student student) //guarda a 1 estudiantes
    {
         studentService.SaverUpdate(student);
    }
    @DeleteMapping("/{studentId}")
    public void Delete(@PathVariable("StudentId") Long studentId) //borra a 1 estudiantes
    {
        studentService.delete(studentId);
    }

}
