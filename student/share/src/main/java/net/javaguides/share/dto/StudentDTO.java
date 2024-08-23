package net.javaguides.share.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudentDTO {
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private Integer schoolId;
}
