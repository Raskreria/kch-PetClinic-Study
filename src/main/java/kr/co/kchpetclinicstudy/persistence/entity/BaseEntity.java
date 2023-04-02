package kr.co.kchpetclinicstudy.persistence.entity;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@MappedSuperclass   // 뭐지?
@EqualsAndHashCode(of = "id", callSuper = false) // 뭐지?
@Getter
public abstract class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;
}