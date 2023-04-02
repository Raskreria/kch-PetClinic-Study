package kr.co.kchpetclinicstudy.persistence.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "TBL_PETS")
@ToString
@Getter
@Builder
//@AllArgsConstructor
@NoArgsConstructor
@AttributeOverride(
        name = "id",
        column = @Column(name = "pet_id", length = 4)
)
public class Pets extends BaseEntity {


    @Column(length = 40, nullable = false)
    private String name;
    @Column(length = 40, nullable = false)
    private LocalDate birthDate;
    @Column(length = 40, nullable = false)
    private int typeId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "owner_id")
    private Owners owners;

    @Builder
    public Pets(String name,
                LocalDate birthDate,
                int typeId,
                Owners city) {
        this.name = name;
        this.birthDate = birthDate;
        this.typeId = typeId;
        this.owners = owners;
    }



}
