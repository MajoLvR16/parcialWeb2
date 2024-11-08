package co.edu.ufps.controller;

import co.edu.ufps.entity.Role;
import co.edu.ufps.repository.RoleRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/roles")
public class RoleController {

    @Autowired
    private RoleRepository roleRepository;

    // Obtener todos los roles
    @GetMapping
    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }

    // Obtener un rol por su ID
    @GetMapping("/{id}")
    public Role getRoleById(@PathVariable Integer id) {
        return roleRepository.findById(id).orElse(null);
    }

    // Crear un nuevo rol
    @PostMapping
    public Role createRole(@RequestBody Role role) {
        return roleRepository.save(role);
    }

    // Actualizar un rol
    @PutMapping("/{id}")
    public Role updateRole(@PathVariable Integer id, @RequestBody Role role) {
        role.setId(id);
        return roleRepository.save(role);
    }

    // Eliminar un rol
    @DeleteMapping("/{id}")
    public void deleteRole(@PathVariable Integer id) {
        roleRepository.deleteById(id);
    }
}
