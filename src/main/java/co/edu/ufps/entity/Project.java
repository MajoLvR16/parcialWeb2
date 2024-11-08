package co.edu.ufps.entity;

import java.util.List;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String description;

    private String startDate;
    private String endDate;

    @OneToMany(mappedBy = "project")
    private List<ProjectAssignment> projectAssignments;
}
