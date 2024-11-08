package co.edu.ufps.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Visit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;
}
