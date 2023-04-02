package kr.co.kchpetclinicstudy.service.service.dto;

import kr.co.kchpetclinicstudy.persistence.entity.Pets;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class VisitsDTO {
    private Long visitId;
    private LocalDate visitDate;
    private String description;
    private Pets pets;
}
