package com.matheus.devtrack.service;

import com.matheus.devtrack.dto.TechnologyRequestDTO;
import com.matheus.devtrack.dto.TechnologyResponseDTO;
import com.matheus.devtrack.entity.Technology;
import com.matheus.devtrack.repository.TechnologyRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TechnologyService {

    private final TechnologyRepository repository;

    public TechnologyService(TechnologyRepository repository) {
        this.repository = repository;
    }

    public TechnologyResponseDTO create(TechnologyRequestDTO request) {

        Technology technology = new Technology();

        technology.setName(request.name());
        technology.setTargetHours(request.targetHours());
        technology.setStudiedHours(request.studiedHours());

        Technology saved = repository.save(technology);

        return new TechnologyResponseDTO(
                saved.getId(),
                saved.getName(),
                saved.getTargetHours(),
                saved.getStudiedHours()
        );
    }

    public List<Technology> listAll() {
        return repository.findAll();
    }
}
