package com.Escuela.Estudiantes.Repository;

import com.Escuela.Estudiantes.Entity.Student;
import com.Escuela.Estudiantes.Entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher,Long> {
}
