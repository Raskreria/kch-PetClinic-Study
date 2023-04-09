package kr.co.kchpetclinicstudy.persistence.repository;

import kr.co.kchpetclinicstudy.persistence.entity.Visit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VisitRepository extends JpaRepository<Visit, Long> {
}
