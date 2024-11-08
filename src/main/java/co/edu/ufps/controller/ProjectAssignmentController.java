package co.edu.ufps.controller;

import co.edu.ufps.entity.ProjectAssignment;
import co.edu.ufps.services.ProjectEmployeeRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/project-assignments")
public class ProjectAssignmentController {

    @Autowired
    private ProjectEmployeeRoleService projectEmployeeRoleService;

    // Listar los empleados de un proyecto con su respectivo rol
    @GetMapping("/project/{projectId}")
    public List<ProjectAssignment> listEmployeesByProject(@PathVariable Integer projectId) {
        return projectEmployeeRoleService.listEmployeesByProject(projectId);
    }

    // Puedes añadir otros métodos para manejar otros servicios según sea necesario
}
