package kr.co.kchpetclinicstudy.persistence.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "TBL_VETS")
@ToString
@Getter
@Builder
//@AllArgsConstructor
@NoArgsConstructor
@AttributeOverride(
        name = "id",
        column = @Column(name = "vet_id", length = 4)
)
public class Vets extends BaseEntity {


    @Column(name="first_name", length = 40, nullable = false)
    private String firstName;

    @Column(name="last_name", length = 40, nullable = false)
    private String lastName;




    @Builder
    public Vets(String firstName,
                String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

}
