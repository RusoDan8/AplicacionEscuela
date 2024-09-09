package com.Escuela.Estudiantes.StudentService;

import com.Escuela.Estudiantes.Entity.Student;
import com.Escuela.Estudiantes.Entity.Teacher;
import com.Escuela.Estudiantes.Repository.StudentRepository;
import com.Escuela.Estudiantes.Repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeacherService
{
    @Autowired
    TeacherRepository teacherRepository;
    public List<Teacher> getTeacher()
    {
        return teacherRepository.findAll();
    }
    public Optional<Teacher> getTeacher(Long id)
    {
        return teacherRepository.findById(id);
    }
    public void SaverUpdateTeacher(Teacher teacher)
    {
        teacherRepository.save(teacher);
    }
    public void deleteteacher(Long id)
    {
        teacherRepository.deleteById(id);
    }



}
