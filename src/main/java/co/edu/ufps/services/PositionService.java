package co.edu.ufps.services;

import co.edu.ufps.entity.Position;
import co.edu.ufps.repository.PositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PositionService {

    @Autowired
    private PositionRepository positionRepository;

    // Buscar posición por ID
    public Position findPositionById(Integer id) {
        Optional<Position> position = positionRepository.findById(id);
        return position.orElse(null);
    }
}
