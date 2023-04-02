package kr.co.kchpetclinicstudy.service.service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class OwnersDTO {
    private Long ownerId;
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String telephone;
}
