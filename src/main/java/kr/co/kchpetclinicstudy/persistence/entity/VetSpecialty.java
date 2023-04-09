package kr.co.kchpetclinicstudy.persistence.entity;
import jakarta.persistence.*;
import kr.co.kchpetclinicstudy.persistence.BaseEntity;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tbl_vet_specialty")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@AttributeOverride(
        name = "id",
        column = @Column(name = "vet_specialty_id", length = 4)
)
public class    VetSpecialty extends BaseEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "vet_id")
    private Vet vet;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "specialty_id")
    private Specialty specialty;

    @Builder
    public VetSpecialty(Vet vet,
                        Specialty specialty) {

        this.vet = vet;
        this.specialty = specialty;
    }
}