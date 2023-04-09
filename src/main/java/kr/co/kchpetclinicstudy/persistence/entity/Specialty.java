package kr.co.kchpetclinicstudy.persistence.entity;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import kr.co.kchpetclinicstudy.persistence.BaseEntity;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tbl_specialty")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@AttributeOverride(
        name = "id",
        column = @Column(name = "specialty_id", length = 4)
)
public class Specialty extends BaseEntity {

    @Column(name = "name", length = 80)
    private String name;

    @Builder
    public Specialty(String name) {

        this.name = name;
    }

    public static Specialty paramToEntity(String name){

        return Specialty.builder()
                .name(name)
                .build();
    }
}