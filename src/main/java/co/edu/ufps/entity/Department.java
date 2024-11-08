package co.edu.ufps.entity;

import java.util.List;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "chief_id")
    private Employee chief;

    // Relación con los empleados que visitan este departamento
    @OneToMany(mappedBy = "department")
    private List<Visit> visits;

    // Relación con los empleados en este departamento
    @OneToMany(mappedBy = "department")
    private List<Employee> employees;

    // Relación con los proyectos en este departamento (si es aplicable)
    @OneToMany(mappedBy = "department")
    private List<Project> projects;
}
