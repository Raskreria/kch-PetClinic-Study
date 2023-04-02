package kr.co.kchpetclinicstudy.service.service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class VetDTO {
    private Long vetId;
    private String firstName;
    private String lastName;

}
