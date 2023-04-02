package kr.co.kchpetclinicstudy.service.service.dto;

import kr.co.kchpetclinicstudy.persistence.entity.Owners;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class PetsDTO {
    private Long petId;
    private String name;
    private LocalDate birthDate;
    private int typeId;
    private Owners owners;
}
