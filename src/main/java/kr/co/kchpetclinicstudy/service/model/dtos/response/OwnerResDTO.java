package kr.co.kchpetclinicstudy.service.model.dtos.response;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

public class OwnerResDTO {

    @NoArgsConstructor
    @Getter
    @AllArgsConstructor
    @Builder
    public class Read {
        @NotBlank(message = "need a first name")
        private String firstName;

        @NotBlank(message = "need a last name")
        private String lastName;

        @NotBlank(message = "need a address")
        private String address;

        @NotBlank(message = "need a city")
        private String city;

        @NotBlank(message = "need a telephone")
        private String telephone;
    }


}
