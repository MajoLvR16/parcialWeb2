package co.edu.ufps.services;

import co.edu.ufps.entity.ProjectAssignment;
import co.edu.ufps.repository.ProjectAssignmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectAssignmentService {

    @Autowired
    private ProjectAssignmentRepository projectAssignmentRepository;

    // Agregar un empleado a un proyecto con un rol específico
    public ProjectAssignment assignEmployeeToProject(Integer employeeId, Integer projectId, Integer roleId) {
        ProjectAssignment assignment = new ProjectAssignment();
        assignment.setEmployeeId(employeeId);
        assignment.setProjectId(projectId);
        assignment.setRoleId(roleId);
        return projectAssignmentRepository.save(assignment);
    }
}
