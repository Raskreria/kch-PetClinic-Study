package kr.co.kchpetclinicstudy.persistence.repository;

import kr.co.kchpetclinicstudy.persistence.entity.Pets;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetsRepository extends JpaRepository<Pets, Long> {
}
