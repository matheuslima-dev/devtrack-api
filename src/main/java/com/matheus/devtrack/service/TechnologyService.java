package com.matheus.devtrack.service;

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

    public Technology create(Technology technology) {
        return repository.save(technology);
    }

    public List<Technology> listAll() {
        return repository.findAll();
    }
}
