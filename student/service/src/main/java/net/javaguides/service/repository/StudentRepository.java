package net.javaguides.service.repository;

import net.javaguides.service.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    List<Student> findALlBySchoolId(Integer id);
}
