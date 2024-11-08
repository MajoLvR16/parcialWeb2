package co.edu.ufps.services;

import co.edu.ufps.entity.Employee;
import co.edu.ufps.entity.ProjectAssignment;
import co.edu.ufps.repository.ProjectAssignmentRepository;
import co.edu.ufps.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectEmployeeRoleService {

    @Autowired
    private ProjectAssignmentRepository projectAssignmentRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    // Listar los empleados de un proyecto con su respectivo rol
    public List<ProjectAssignment> listEmployeesByProject(Integer projectId) {
        return projectAssignmentRepository.findByProject_Id(projectId);
    }

}
