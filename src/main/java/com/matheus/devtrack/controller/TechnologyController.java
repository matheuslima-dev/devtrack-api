package com.matheus.devtrack.controller;

import com.matheus.devtrack.entity.Technology;
import com.matheus.devtrack.service.TechnologyService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/technologies")
public class TechnologyController {

    private final TechnologyService service;

    public TechnologyController(TechnologyService service) {
        this.service = service;
    }

    @PostMapping
    public Technology create(@RequestBody Technology technology) {
        return service.create(technology);
    }

    @GetMapping
    public List<Technology> listAll() {
        return service.listAll();
    }
}
