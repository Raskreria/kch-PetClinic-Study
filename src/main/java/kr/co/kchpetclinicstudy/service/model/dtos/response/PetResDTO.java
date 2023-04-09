package kr.co.kchpetclinicstudy.service.model.dtos.response;


import kr.co.kchpetclinicstudy.service.model.enums.PetType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

public class PetResDTO {

    @Builder
    @Getter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class READ {

        private String name;

        private PetType petType;

        private String ownerName;

        private LocalDate birthDate;
    }
}