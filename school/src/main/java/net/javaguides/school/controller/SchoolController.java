package net.javaguides.school.controller;

import lombok.RequiredArgsConstructor;
import net.javaguides.school.dto.FullSchoolDTO;
import net.javaguides.school.model.School;
import net.javaguides.school.service.SchoolService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/schools")
@RequiredArgsConstructor
public class SchoolController {

    private final SchoolService schoolService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void save(
            @RequestBody School school
    ) {
        schoolService.saveSchool(school);
    }

    @GetMapping
    public ResponseEntity<List<School>> findAllSchools() {
        return ResponseEntity.ok(schoolService.findAllSchools());
    }

    @GetMapping("/with-students/{school-id}")
    public ResponseEntity<FullSchoolDTO> findAllStudentsBySchoolId(
            @PathVariable("school-id") Integer schoolId
    ) {
        return ResponseEntity.ok(schoolService.findSchoolsWithStudents(schoolId));
    }
}
