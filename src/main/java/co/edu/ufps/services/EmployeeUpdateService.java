package co.edu.ufps.services;

import co.edu.ufps.entity.Employee;
import co.edu.ufps.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeUpdateService {

    @Autowired
    private EmployeeRepository employeeRepository;

    // Actualizar un empleado
    public Employee updateEmployee(Integer id, Employee employee) {
        if (employeeRepository.existsById(id)) {
            employee.setId(id);
            return employeeRepository.save(employee);
        }
        return null;
    }
}
