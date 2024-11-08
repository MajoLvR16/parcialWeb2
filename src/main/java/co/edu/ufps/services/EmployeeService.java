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

    // Obtener todos los empleados
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    // Obtener un empleado por ID
    public Employee getEmployeeById(Integer id) {
        return employeeRepository.findById(id).orElseThrow(() -> new RuntimeException("Empleado no encontrado"));
    }

    // Crear un nuevo empleado
    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    // Actualizar un empleado
    public Employee updateEmployee(Integer id, Employee updatedEmployee) {
        Employee employee = getEmployeeById(id);
        employee.setFirstName(updatedEmployee.getFirstName());
        employee.setLastName(updatedEmployee.getLastName());
        employee.setBirthdate(updatedEmployee.getBirthdate());
        employee.setDepartment(updatedEmployee.getDepartment());
        employee.setPosition(updatedEmployee.getPosition());
        employee.setEntryDate(updatedEmployee.getEntryDate());
        return employeeRepository.save(employee);
    }

    // Eliminar un empleado
    public void deleteEmployee(Integer id) {
        employeeRepository.deleteById(id);
    }
}
