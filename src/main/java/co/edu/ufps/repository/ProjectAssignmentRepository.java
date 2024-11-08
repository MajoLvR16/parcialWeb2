package co.edu.ufps.repository;

import co.edu.ufps.entity.ProjectAssignment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProjectAssignmentRepository extends JpaRepository<ProjectAssignment, Integer> {

    // Buscar por ID del proyecto (project_id) de la relación
    List<ProjectAssignment> findByProject_Id(Integer projectId);

}
