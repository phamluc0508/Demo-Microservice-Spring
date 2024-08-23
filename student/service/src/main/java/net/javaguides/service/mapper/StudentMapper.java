package net.javaguides.service.mapper;

import net.javaguides.service.model.Student;
import net.javaguides.share.dto.StudentDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface StudentMapper {

    StudentDTO studentToStudentDTO(Student student);

    List<StudentDTO> studentsToStudentDTOs(List<Student> students);
}
