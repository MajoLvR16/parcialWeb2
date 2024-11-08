package co.edu.ufps.entity;

import java.util.List;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Position {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private Double salary;

    @OneToMany(mappedBy = "position")
    private List<Employee> employees;
}
