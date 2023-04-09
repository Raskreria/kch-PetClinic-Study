package kr.co.kchpetclinicstudy.persistence.repository;

import kr.co.kchpetclinicstudy.persistence.entity.Vet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VetRepository extends JpaRepository<Vet, Long> {
}
