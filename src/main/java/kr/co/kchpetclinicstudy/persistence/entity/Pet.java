package kr.co.kchpetclinicstudy.persistence.entity;
// 펫 클래스
import jakarta.persistence.*;
import kr.co.kchpetclinicstudy.persistence.BaseEntity;
import kr.co.kchpetclinicstudy.service.model.dtos.request.PetReqDTO;
import kr.co.kchpetclinicstudy.service.model.dtos.response.PetResDTO;
import kr.co.kchpetclinicstudy.service.model.enums.PetType;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "tbl_pet")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@AttributeOverride(
        name = "id",
        column = @Column(name = "pet_id", length = 4)
)
public class Pet extends BaseEntity {

    @Column(name = "name", length = 30)
    private String name;

    @Column(name = "birth_date")
    private LocalDate birthDate;

    @Column(name = "pet_type", nullable = false)
    @Enumerated(EnumType.STRING)
    private PetType petType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "owner_id")
    private Owner owner;

    @Builder
    public Pet(String name,
               LocalDate birthDate,
               PetType petType,
               Owner owners) {

        this.name = name;
        this.birthDate = birthDate;
        this.petType = petType;
        this.owner = owner;
    }

    public static Pet dtoToEntity(PetReqDTO.CREATE create,
                                  Owner owner){

        return Pet.builder()
                .name(create.getName())
                .birthDate(create.getBirthDate())
                .petType(PetType.of(create.getPetType()))
                .owners(owner)
                .build();
    }

    public static PetResDTO.READ entityToDto(Pet pet){

        return PetResDTO.READ.builder()
                .name(pet.getName())
                .ownerName(pet.getOwner().getFirstName() + pet.getOwner().getLastName())
                .birthDate(pet.birthDate)
                .petType(pet.petType)
                .build();
    }

    public void updatePetInfo(PetReqDTO.UPDATE update) {

        this.name = update.getName();
        this.birthDate = update.getBirthDate();
        this.petType = PetType.of(update.getPetType());
    }
}