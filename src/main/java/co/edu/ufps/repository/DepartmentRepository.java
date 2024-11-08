package co.edu.ufps.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.edu.ufps.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {
  
}
