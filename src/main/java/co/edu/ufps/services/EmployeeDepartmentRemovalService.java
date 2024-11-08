package co.edu.ufps.services;

import co.edu.ufps.entity.Employee;
import co.edu.ufps.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeDepartmentRemovalService {

    @Autowired
    private EmployeeRepository employeeRepository;

    // Desasociar un departamento de un empleado
    public Employee removeDepartmentFromEmployee(Integer employeeId) {
        Employee employee = employeeRepository.findById(employeeId).orElse(null);
        if (employee != null) {
            employee.setDepartment(null);  // Desasocia el departamento
            return employeeRepository.save(employee);
        }
        return null;
    }
}
