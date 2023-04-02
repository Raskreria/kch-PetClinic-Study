package kr.co.kchpetclinicstudy.persistence.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "TBL_VISITS")
@ToString
@Getter
@Builder
//@AllArgsConstructor
@NoArgsConstructor
@AttributeOverride(
        name = "id",
        column = @Column(name = "visit_id", length = 4)
)
public class Visits extends BaseEntity {


    @Column(name="visit_Date",length = 40, nullable = false)
    private LocalDate visitDate;

    @Column(length = 40, nullable = false)
    private String description;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pets_id")
    private Pets pets;

    @Builder
    public Visits(LocalDate visitDate,
                  String description,
                  Pets pets) {
        this.visitDate = visitDate;
        this.description = description;
        this.pets = pets;
    }
}

