package kr.co.kchpetclinicstudy.persistence.repository;

import kr.co.kchpetclinicstudy.persistence.entity.Visits;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VisitsRepository extends JpaRepository<Visits, Long> {
}
