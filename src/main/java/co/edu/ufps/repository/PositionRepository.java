package co.edu.ufps.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.edu.ufps.entity.Position;

@Repository
public interface PositionRepository extends JpaRepository<Position, Integer> {

}
