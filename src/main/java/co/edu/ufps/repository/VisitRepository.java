package co.edu.ufps.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.edu.ufps.entity.Visit;

@Repository
public interface VisitRepository extends JpaRepository<Visit, Integer> {
}
