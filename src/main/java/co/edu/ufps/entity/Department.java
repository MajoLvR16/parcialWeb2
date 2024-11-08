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

    // Esto indica la relación con los empleados que visitan este departamento
    @OneToMany(mappedBy = "department")
    private List<Visit> visits;
}
