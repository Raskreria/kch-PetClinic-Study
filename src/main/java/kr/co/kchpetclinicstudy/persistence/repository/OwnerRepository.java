package kr.co.kchpetclinicstudy.persistence.repository;

import kr.co.kchpetclinicstudy.persistence.entity.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OwnerRepository extends JpaRepository<Owner, Long> {
}
