package co.edu.ufps.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.edu.ufps.entity.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
}
