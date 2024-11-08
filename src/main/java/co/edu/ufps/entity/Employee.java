package co.edu.ufps.entity;

import java.util.List;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String firstName;
    private String lastName;
    private String birthdate;

    @ManyToOne
    @JoinColumn(name = "dep_id")
    private Department department;

    @ManyToOne
    @JoinColumn(name = "pos_id")
    private Position position;

    private String entryDate;

    // Relación con la tabla Visit
    @OneToMany(mappedBy = "employee")
    private List<Visit> visits;

    // Relación con la tabla ProjectAssignment
    @OneToMany(mappedBy = "employee")
    private List<ProjectAssignment> projectAssignments;
}
