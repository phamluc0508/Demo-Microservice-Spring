package net.javaguides.school.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.javaguides.share.dto.StudentDTO;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FullSchoolDTO {

    private String name;
    private String email;
    private List<StudentDTO> studentDTOS;
}
