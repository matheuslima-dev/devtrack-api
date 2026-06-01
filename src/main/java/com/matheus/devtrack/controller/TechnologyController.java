package com.matheus.devtrack.controller;

import com.matheus.devtrack.dto.TechnologyRequestDTO;
import com.matheus.devtrack.dto.TechnologyResponseDTO;
import com.matheus.devtrack.entity.Technology;
import com.matheus.devtrack.service.TechnologyService;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;

import java.util.List;

@RestController
@RequestMapping("/technologies")
public class TechnologyController {

    private final TechnologyService service;

    public TechnologyController(TechnologyService service) {
        this.service = service;
    }

    @PostMapping
    public TechnologyResponseDTO create(@Valid @RequestBody TechnologyRequestDTO request) {
        return service.create(request);
    }

    @GetMapping
    public List<Technology> listAll() {
        return service.listAll();
    }
}
