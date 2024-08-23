package net.javaguides.service.service;

import lombok.RequiredArgsConstructor;
import net.javaguides.service.mapper.StudentMapper;
import net.javaguides.service.model.Student;
import net.javaguides.service.repository.StudentRepository;
import net.javaguides.share.dto.StudentDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;
    private final StudentMapper studentMapper;

    public void saveStudent(Student student) {
        studentRepository.save(student);
    }

    public List<StudentDTO> findAllStudents(){
        return studentMapper.studentsToStudentDTOs(studentRepository.findAll());
    }

    public List<StudentDTO> findAllStudentsBySchool(Integer schoolId){
        return studentMapper.studentsToStudentDTOs(studentRepository.findALlBySchoolId(schoolId));
    }
}
