package com.Escuela.Estudiantes.controller;

import com.Escuela.Estudiantes.Entity.Student;
import com.Escuela.Estudiantes.Entity.Teacher;
import com.Escuela.Estudiantes.Repository.TeacherRepository;
import com.Escuela.Estudiantes.StudentService.StudentService;
import com.Escuela.Estudiantes.StudentService.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/teachers")
public class TeacherController
{
    @Autowired
    private TeacherService teacherService;

    @GetMapping
    public List<Teacher> getAll() //trae todos los estudiantes
    {
        return teacherService.getTeacher();
    }
    @GetMapping("/{teacherId}")
    public Optional<Teacher> getById(@PathVariable("teacherId") Long teacherId) //trae todos los maestros
    {
        return teacherService.getTeacher(teacherId);
    }
    @PostMapping
    public void SaveUpdate(@RequestBody Teacher teacher) //guarda a 1 estudiantes
    {
        teacherService.SaverUpdateTeacher(teacher);
    }
    @DeleteMapping("/{teacherId}")
    public void Delete(@PathVariable("teacherId") Long teacherId) //borra a 1 estudiantes
    {
        teacherService.deleteteacher(teacherId);
    }

}
