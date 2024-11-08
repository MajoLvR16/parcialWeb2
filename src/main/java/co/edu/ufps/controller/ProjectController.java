package co.edu.ufps.controller;

import co.edu.ufps.entity.Project;
import co.edu.ufps.repository.ProjectRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/projects")
public class ProjectController {

    @Autowired
    private ProjectRepository projectRepository;

    // Obtener todos los proyectos
    @GetMapping
    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }

    // Obtener un proyecto por su ID
    @GetMapping("/{id}")
    public Project getProjectById(@PathVariable Integer id) {
        return projectRepository.findById(id).orElse(null);
    }

    // Crear un nuevo proyecto
    @PostMapping
    public Project createProject(@RequestBody Project project) {
        return projectRepository.save(project);
    }

    // Actualizar un proyecto
    @PutMapping("/{id}")
    public Project updateProject(@PathVariable Integer id, @RequestBody Project project) {
        project.setId(id);
        return projectRepository.save(project);
    }

    // Eliminar un proyecto
    @DeleteMapping("/{id}")
    public void deleteProject(@PathVariable Integer id) {
        projectRepository.deleteById(id);
    }
}
