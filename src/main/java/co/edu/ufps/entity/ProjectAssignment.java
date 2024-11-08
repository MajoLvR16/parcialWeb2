package co.edu.ufps.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class ProjectAssignment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "project_id")
    private Project project;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;

    // Métodos para establecer las relaciones a través de los IDs

    // Establecer el projectId directamente
    public void setProjectId(Integer projectId) {
        this.project = new Project();
        this.project.setId(projectId);  // Asignamos el ID al objeto Project
    }

    // Establecer el employeeId directamente
    public void setEmployeeId(Integer employeeId) {
        this.employee = new Employee();
        this.employee.setId(employeeId);  // Asignamos el ID al objeto Employee
    }

    // Establecer el roleId directamente
    public void setRoleId(Integer roleId) {
        this.role = new Role();
        this.role.setId(roleId);  // Asignamos el ID al objeto Role
    }

    }
