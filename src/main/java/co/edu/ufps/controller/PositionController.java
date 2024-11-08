package co.edu.ufps.controller;

import co.edu.ufps.entity.Position;
import co.edu.ufps.repository.PositionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/positions")
public class PositionController {

    @Autowired
    private PositionRepository positionRepository;

    // Obtener todas las posiciones
    @GetMapping
    public List<Position> getAllPositions() {
        return positionRepository.findAll();
    }

    // Obtener una posición por su ID
    @GetMapping("/{id}")
    public Position getPositionById(@PathVariable Integer id) {
        return positionRepository.findById(id).orElse(null);
    }

    // Crear una nueva posición
    @PostMapping
    public Position createPosition(@RequestBody Position position) {
        return positionRepository.save(position);
    }

    // Actualizar una posición
    @PutMapping("/{id}")
    public Position updatePosition(@PathVariable Integer id, @RequestBody Position position) {
        position.setId(id);
        return positionRepository.save(position);
    }

    // Eliminar una posición
    @DeleteMapping("/{id}")
    public void deletePosition(@PathVariable Integer id) {
        positionRepository.deleteById(id);
    }
}
