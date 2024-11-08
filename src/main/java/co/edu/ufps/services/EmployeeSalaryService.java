package co.edu.ufps.services;

import co.edu.ufps.entity.Employee;
import co.edu.ufps.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeSalaryService {

    @Autowired
    private EmployeeRepository employeeRepository;

    // Buscar empleado e incluir su salario
    public Employee findEmployeeAndIncludeSalary(Integer id) {
        Optional<Employee> employee = employeeRepository.findById(id);
        if (employee.isPresent()) {
            Employee emp = employee.get();
            // Suponiendo que el salario es un atributo calculado o asignado de alguna forma
            // Aquí puedes agregar lógica para establecer el salario, si es necesario.
            return emp;
        }
        return null;
    }
}
