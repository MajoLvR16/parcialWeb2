package co.edu.ufps.services;

import co.edu.ufps.entity.Employee;
import co.edu.ufps.entity.Department;
import co.edu.ufps.repository.EmployeeRepository;
import co.edu.ufps.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeDepartmentService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private DepartmentRepository departmentRepository;

    // Agregar un departamento a un empleado
    public Employee addDepartmentToEmployee(Integer employeeId, Integer departmentId) {
        Employee employee = employeeRepository.findById(employeeId).orElse(null);
        Department department = departmentRepository.findById(departmentId).orElse(null);

        if (employee != null && department != null) {
            employee.setDepartment(department);
            return employeeRepository.save(employee);
        }
        return null;
    }
}
