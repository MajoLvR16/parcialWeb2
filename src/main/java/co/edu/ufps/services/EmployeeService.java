package co.edu.ufps.services;

import co.edu.ufps.entity.Employee;
import co.edu.ufps.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    // Listar todos los empleados
    public List<Employee> listEmployees() {
        return employeeRepository.findAll();
    }
}
