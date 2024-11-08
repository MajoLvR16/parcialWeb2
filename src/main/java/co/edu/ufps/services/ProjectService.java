package co.edu.ufps.services;

import co.edu.ufps.entity.Project;
import co.edu.ufps.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    // Crear un nuevo proyecto
    public Project createProject(Project project) {
        return projectRepository.save(project);
    }
}
