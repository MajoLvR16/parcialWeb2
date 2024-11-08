package co.edu.ufps.entity;


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
}
