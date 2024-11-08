package co.edu.ufps.controller;

import co.edu.ufps.entity.Visit;
import co.edu.ufps.repository.VisitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/visits")
public class VisitController {

    @Autowired
    private VisitRepository visitRepository;

    // Obtener todas las visitas
    @GetMapping
    public List<Visit> getAllVisits() {
        return visitRepository.findAll();
    }

    // Obtener una visita por su ID
    @GetMapping("/{id}")
    public Visit getVisitById(@PathVariable Integer id) {
        return visitRepository.findById(id).orElse(null);
    }

    // Crear una nueva visita
    @PostMapping
    public Visit createVisit(@RequestBody Visit visit) {
        return visitRepository.save(visit);
    }

    // Actualizar una visita
    @PutMapping("/{id}")
    public Visit updateVisit(@PathVariable Integer id, @RequestBody Visit visit) {
        visit.setId(id);
        return visitRepository.save(visit);
    }

    // Eliminar una visita
    @DeleteMapping("/{id}")
    public void deleteVisit(@PathVariable Integer id) {
        visitRepository.deleteById(id);
    }
}
