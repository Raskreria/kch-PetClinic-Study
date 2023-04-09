package kr.co.kchpetclinicstudy.persistence.repository;

import kr.co.kchpetclinicstudy.persistence.entity.Pet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetRepository extends JpaRepository<Pet, Long> {
}
