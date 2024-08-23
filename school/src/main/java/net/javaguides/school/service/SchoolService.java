package net.javaguides.school.service;

import lombok.RequiredArgsConstructor;
import net.javaguides.school.openFeignApiClient.StudentClient;
import net.javaguides.school.dto.FullSchoolDTO;
import net.javaguides.school.model.School;
import net.javaguides.school.repository.SchoolRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SchoolService {

    private final SchoolRepository schoolRepository;
    private final StudentClient studentClient;

    public void saveSchool(School school) {
        schoolRepository.save(school);
    }

    public List<School> findAllSchools() {
        return schoolRepository.findAll();
    }

    public FullSchoolDTO findSchoolsWithStudents(Integer schoolId) {
        var school = schoolRepository.findById(schoolId)
                .orElse(
                        School.builder()
                                .name("NOT_FOUND")
                                .email("NOT_FOUND")
                                .build()
                );

        var studentDTOS = studentClient.findAllStudentsBySchool(schoolId);

        return FullSchoolDTO.builder()
                .name(school.getName())
                .email(school.getEmail())
                .studentDTOS(studentDTOS)
                .build();
    }
}
