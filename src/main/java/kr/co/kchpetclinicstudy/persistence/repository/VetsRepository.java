package kr.co.kchpetclinicstudy.persistence.repository;

import kr.co.kchpetclinicstudy.persistence.entity.Vets;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VetsRepository extends JpaRepository<Vets, Long> {
}
