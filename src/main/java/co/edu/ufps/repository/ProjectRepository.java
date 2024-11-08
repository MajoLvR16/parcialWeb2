package co.edu.ufps.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.edu.ufps.entity.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Integer> {

}
